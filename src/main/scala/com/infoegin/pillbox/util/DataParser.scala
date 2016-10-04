package com.infoegin.pillbox.util

/**
  * Created by Yeah-1 on 2016/8/27.
  */
object DataParser{
/*
  val str = "042600"
  println(str.substring(2,4))
  println(str.substring(4,6))
  println(packHeader(str))*/

  def packHeader(data:String):(Int,Int) = {
    val count = data.substring(0,2).toInt
    val dataLen =data.substring(4,6) + data.substring(2,4)
    (count,Integer.parseInt(dataLen,16))
  }
}
