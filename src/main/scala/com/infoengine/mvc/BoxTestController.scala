package com.infoengine.mvc

import com.infoegin.pillbox.util.DataParser
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
    val commandsData = data.substring(6, data.length)

    val sb = new StringBuffer

    (0 to cmdCount).foreach({
      val command = new CommandPack
      val header = new CommandHeader

      println
    })


    return s"$data" + ":11121"
  }
}
