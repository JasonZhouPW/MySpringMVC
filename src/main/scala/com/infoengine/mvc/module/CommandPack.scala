package com.infoengine.mvc.module

import com.infoegin.pillbox.util.RespondUtil
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

  def this(head:CommandHeader ) = {
    this
    this.header = head
    header.commandID match {
      case 0x20 => respond = RespondUtil.respondWithTime
      case 0x24 =>
      // 药盒查询是否有未同步的提醒信息
      case 0xe4 =>
      // 收到药盒服药记录
      case _@id =>respond = RespondUtil.getRespond23(id.toHexString, "00")
    }
  }

  def setData(data:String) = {
    this.data = data
    this.itemCount = Integer.parseInt(data.substring(0,2))
    val leftData = data.substring(2,data.length)
    val perLen = leftData.length / itemCount

    items = (0 to itemCount).toList.map(i =>{
                              if(header.commandID ==0xbf){
                                logger.info("得到序列号: ", leftData.substring(4, leftData.length))
                                //save to db?
                              }
                              new CommandItem(leftData.substring(i * perLen,i * perLen* 2))})

  }


}
