package com.infoegin.pillbox.util

import java.util.Date

/**
  * Created by Yeah-1 on 2016/8/27.
  */
object RespondUtil {

  def respondWithTime = "a1"+"05000001"+ TimeUtil.getTimeHex(new Date)
  def getRespond23(commandId:String,status:String) =
    "2309000001" + commandId + TimeUtil.getTimeHex(new Date) + status + "0000"

}

