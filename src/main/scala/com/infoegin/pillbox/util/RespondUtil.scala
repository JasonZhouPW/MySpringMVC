package com.infoegin.pillbox.util

import java.util.Date

import scala.util.Random

/**
  * Created by Yeah-1 on 2016/8/27.
  */
object RespondUtil {

  def respondWithTime = "a1"+"05000001"+ TimeUtil.getTimeHex(new Date)
  def getRespond23(commandId:String,status:String) =
    "2309000001" + commandId + TimeUtil.getTimeHex(new Date) + status + "0000"
  def getCommonRespond(cmdPrefix:String,cmdName:String,status:String) = {
//    "230900C2" + "01" + "E9" + TimeUtil.getTimeHex(new Date) + "000000"
    val count = 1
    val cmdBody = TimeUtil.getHexString(count.toString) + cmdName + TimeUtil.getTimeHex(new Date) + status + "0000"
    val len = revers((cmdBody.length/2).toLong.toHexString)
    val checkSum = getRandomCheckSum //todo decide the method
    cmdPrefix + len + checkSum + cmdBody
  }

  def revers(s:String):String = {
    s.length match {
      case 1 => "0"+ s + "00"
      case 2 => s + "00"
      case 3 => s.substring(1,3) + "0" + s.substring(0,1)
      case 4 => s.substring(2,4) + s.substring(0,2)
      case _ => revers(s.substring(0,4))
    }
  }

  def getDeviceSycnRespond = "23090098" + "01" + "BF" + TimeUtil.getTimeHex(new Date) + "000000"

  def getRandomCheckSum:String = {
    val r = new Random()
    val ret = r.nextInt(255).toLong.toHexString
    if(ret.length > 2) ret.substring(0,2) else ret
  }
}

