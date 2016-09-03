package com.infoengine.mvc.module

/**
  * Created by Yeah-1 on 2016/8/27.
  */
class CommandHeader {

  var commandID:Int = _
  var len:Int = _
  var checkSum:Int = _

  def this(data:String) = {
    this
    val idGet = data.substring(0,2);
    commandID = Integer.parseInt(idGet, 16);
    val lenGet0 = data.substring(2, 2);
    val lenGet1 = data.substring(4, 2);
    len = Integer.parseInt(lenGet1+lenGet0, 16);
    val checkGet = data.substring(6, 2);
    checkSum = Integer.parseInt(checkGet, 16);
  }




}
