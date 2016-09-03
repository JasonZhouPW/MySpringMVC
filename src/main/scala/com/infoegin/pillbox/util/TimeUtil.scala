package com.infoegin.pillbox.util

import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by Yeah-1 on 2016/8/27.
  */
object TimeUtil extends App{

  val sdf:SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")


  def getHexString(num:String) = if(Integer.parseInt(num,16) <= 15) "0" + num else num

  def getTimeHex(date:Date):String = {

    val defaultDate = sdf.parse("2000-01-01 00:00:00")
    val gap = (date.getTime - defaultDate.getTime)/1000
    val list:List[String] = List(getHexString((gap & 0xFF).toHexString),
      getHexString((gap >> 8 & 0xFF).toHexString),
      getHexString((gap >> 16  & 0xFF).toHexString),
      getHexString((gap >> 24  & 0xFF).toHexString))

    list.mkString("")
  }

  def getTimeFromHexStr(fromDate:String,timeHexStr:String):Date = {


    val time1 = Integer.parseInt(timeHexStr.substring(0, 2), 16)
    val time2 = Integer.parseInt(timeHexStr.substring(2, 4), 16)
    val time3 = Integer.parseInt(timeHexStr.substring(4, 6), 16)
    val time4 = Integer.parseInt(timeHexStr.substring(6, 8), 16)

    val space:Long = (time1) + (time2 << 8) + (time3 << 16) + (time4 << 24)

    val defaultTime = sdf.parse(fromDate)
    val defaultInterval = defaultTime.getTime()

    val intervalCount = space*1000 + defaultInterval
    val date = new Date(intervalCount)
    date
  }

  val now = new Date
  val str = getTimeHex(now)
  println("hexstr:" + str)
  println(getTimeFromHexStr("2000-01-01 00:00:00",str))

}
