package com.infoengine.mvc.module

/**
  * Created by Yeah-1 on 2016/8/27.
  */
class CommandHeader {

  var commandID:Int = _
  var len:Int = _
  var checkSum:Int = _
  var receiveData:String = _
/*

 def this(data:String) = {
    this
    parse(data)

  }
*/

  def parse(data:String):Unit = {
    this.receiveData = data
    val idGet = data.substring(0,2)
    this.commandID = Integer.parseInt(idGet,16)
    val lenGet0 = data.substring(2, 4)
    val lenGet1 = data.substring(4, 6)
    len = Integer.parseInt(lenGet1+lenGet0, 16)
    val checkGet = data.substring(6, 8)
    checkSum = Integer.parseInt(checkGet, 16)
  }

  override def toString = s"{commandID:$commandID,len:$len,checkSum:$checkSum,receiveData:$receiveData}"


}
