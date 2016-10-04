package com.infoengine.mvc

import com.infoegin.pillbox.util.{DataParser, TimeUtil}
import com.infoengine.mvc.module.{CommandHeader, CommandPack}
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation._

import scala.collection.mutable.ListBuffer

/**
  * Created by Yeah-1 on 2016/8/1.
  */
@Controller
@RequestMapping(Array("/"))
class BoxTestController {

  private[this] val logger = LoggerFactory.getLogger(classOf[RestController])

  @ResponseBody
  @RequestMapping(value = Array("/pillbox"),method = Array(RequestMethod.GET))
  def getGData(@RequestParam("data")  data:String):String = {
    logger.info(s"pillbox :$data")
    val (cmdCount,dataLen) = DataParser.packHeader(data)
    logger.info(s"cmdCount=$cmdCount,dataLen=$dataLen")
    val commandsData = data.substring(6, data.length)
    logger.info(s"commandsData=$commandsData")
    var respond = new StringBuffer

    val commands = new Array[CommandPack](cmdCount)
    var index = 0
    var boxSeqNo:String = null

    (0 until cmdCount).foreach{ i:Int =>

      val command = new CommandPack
      val header = new CommandHeader

      val tmpData = commandsData.substring(index,commandsData.length)
      logger.info(s"tmpData:$tmpData")
      header.parse(tmpData.substring(0,8))
      logger.info(s"header:$header")

//      if(header.commandID != 36){
        command.setHeader(header)
        boxSeqNo = command.setData(tmpData.substring(8,8+header.len*2))
        respond.append(command.respond)
//      }else{
//
//        needCallBack = true
//      }
      commands(i) = command
      logger.info(command.toString)
      index += 8 + header.len*2

    }
/*    if(needCallBack){
      val nb = new StringBuffer().append(TimeUtil.getHexString(cmdCount.toString) + TimeUtil.getHexString((respond.length/2).toLong.toHexString))
      respond = nb.append("00").append(respond)
    }else{*/

      val nb = new StringBuffer().append(TimeUtil.getHexString(cmdCount.toString) + TimeUtil.getHexString((respond.length/2).toLong.toHexString))
      respond = nb.append("00").append(respond)
      //todo save db
//    }

    logger.info(commands.toString)

    return respond.toString
  }
}
