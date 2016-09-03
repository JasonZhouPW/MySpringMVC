package com.infoegin.pillbox.util

/**
  * Created by Yeah-1 on 2016/8/27.
  */
object DataParser extends App{

  def packHeader(data:String):(Int,Int) = {
    val count = data.substring(0,2).toInt
    val dataLen =
      if(data.substring(2,2).toUpperCase == "0X") Integer.parseInt(data.substring(2,4),16)  else 0
    (count,dataLen.toInt)
  }
}
