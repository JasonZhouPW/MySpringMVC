package com.infoengine.mvc.module

import java.util.Date

import com.infoegin.pillbox.util.{RespondUtil, TimeUtil}
import org.slf4j.LoggerFactory

/**
  * Created by Yeah-1 on 2016/8/27.
  */
class CommandPack {
  private[this] val logger = LoggerFactory.getLogger(classOf[CommandPack])
  var header:CommandHeader = _
  var data:String = _
  var itemCount:Int = _
  var items:List[CommandItem] = _
  var respond:String = _


  def setHeader(head:CommandHeader) = {
    this.header = head
    header.commandID match {
      case 0x20 =>
        //同步时间
        respond = RespondUtil.respondWithTime
      case 0x24 =>
      // 药盒查询是否有未同步的提醒信息
        //test for no plan
        //todo get the new plan from db
        //if yes "E3" else "23"
        respond = "230900" + "8A" + "01" + "24" + TimeUtil.getTimeHex(new Date) + "010000"
      case 0xbf =>
      //设备识别号应答
//        respond = RespondUtil.getDeviceSycnRespond
        respond = RespondUtil.getCommonRespond("23","E9","00")
      case 0xe4 =>
      // 收到药盒服药记录
        respond = RespondUtil.getCommonRespond("23","E4","00")
      case 0xe9 =>
        //电池电量
        respond = RespondUtil.getCommonRespond("23","BF","00")
      case _@id =>respond = RespondUtil.getRespond23(id.toHexString, "00")
    }
  }


  def setData(data:String):String = {
    logger.info(s"data:$data")
    this.data = data
    var seqNo:String = null
    if(data.length > 0){
      this.itemCount = Integer.parseInt(data.substring(0,2))
      logger.info(s"itemCount=$itemCount")
      val leftData = data.substring(2,data.length)
      val perLen = leftData.length / itemCount

      logger.info(s"leftData:$leftData,perLen:$perLen")
      items = (0 until itemCount).toList.map(i =>{
        header.commandID match {
          case 0xbf =>  seqNo = leftData.substring(4, leftData.length)
                      logger.info(s"得到序列号: $seqNo")
                      //todo save to db?

          case 0xe4 => val record = new Record
                      record.parseData(data)
                      //todo record items save to db
                      logger.info("log:"+record.logs)
          case 0xe9 =>

          case m@_ => logger.error(s"can not recongnize $m")

        }
        new CommandItem(leftData.substring(i * perLen, perLen*(i+1) ))})
    }
    seqNo
  }

  override def toString: String = s"{header:$header,data=$data,itemCount=$itemCount,items=$items,respond=$respond}"

}
