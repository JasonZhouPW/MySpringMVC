package com.infoengine.mvc.module

import java.util.Date
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory

import com.infoegin.pillbox.util.TimeUtil
import com.infoengine.mvc.MedStatus
import org.slf4j.LoggerFactory

import scala.collection.mutable.ListBuffer

/**
  * Created by Yeah-1 on 2016-10-04.
  */

class RecordItem(val remindTime:Date,
                 val rtype:String,
                 val medLeftCount:String,
                 val cellState:String,
                 val minuteOffset:String,
                 val medKinds:String,
                 val medIDs:Array[String]
          )

class Record {
  private[this] val logger = LoggerFactory.getLogger(classOf[Record])
  var count:Int = _
  val items = new ListBuffer[RecordItem]
  val logs =  new ListBuffer[String]

  def parseData(data:String):Unit = {
    logger.info("******************************解析记录*******************************")
    logger.info("服药记录数据: " + data)
    var dataIndex = 0
    count = Integer.parseInt(data.substring(0, 2))
    logger.info(s"count is $count")
    dataIndex += 2
    (0 until count).foreach( i =>{
      val timeHex = TimeUtil.getTimeFromHexStr("2000-01-01 00:00:00",data.substring(dataIndex, dataIndex+ 4*2))
      dataIndex += 4*2
      logger.info("服药时间: " + timeHex)
      val rtype = Integer.parseInt(data.substring(dataIndex,dataIndex+2)).toLong.toHexString
      dataIndex += 2
      logger.info(s"服药状态是:$rtype:${MedStatus.getDescription(Integer.parseInt(rtype,16))}")
      dataIndex += 2
      // 取药口剩余药物个数
      val medOutLeftCount = Integer.parseInt(data.substring(dataIndex, dataIndex+2)).toLong.toHexString
      logger.info(s"取药口剩余药物个数: $medOutLeftCount")
      dataIndex += 2
      // 服药后药仓状态标志位
      val cellState = Integer.parseInt(data.substring(dataIndex, dataIndex+4)).toLong.toHexString
      dataIndex += 4
      val hStr = cellState.substring(0, 2)
      val lStr = cellState.substring(2, 4)
      val newStateStr = lStr + hStr

      logger.info("服药后药仓状态标志位: " +Integer.parseInt(newStateStr,16).toLong.toBinaryString)

      // 相对服药时间点偏离时间(分钟)
      val  minOffset = Integer.parseInt(data.substring(dataIndex, dataIndex+4)).toLong.toHexString
      dataIndex += 4

      val offsetH = minOffset.substring(0, 2)
      val offsetL = minOffset.substring(2, 4)
      val newOffset = offsetL + offsetH

      logger.info("相对服药时间点偏离时间(分钟):" + Integer.parseInt(newOffset,16) + "," + newOffset)

      // 服用药品种数
      var medTypeCount =  Integer.parseInt(data.substring(dataIndex, dataIndex+2)).toLong.toHexString
      dataIndex += 2
      logger.info(s"服用药品种数:$medTypeCount")
      // 每一个药品的id
      val medIDs = (0 until Integer.parseInt(medTypeCount,16)).toList.map( i => {
        val medID = data.substring(dataIndex,dataIndex+2)
        dataIndex += 2
        medID
      })

      logger.info(s"每一个药品的id:$medIDs")

      items.append(new RecordItem(timeHex,rtype,medOutLeftCount,cellState,minOffset,medTypeCount,medIDs.toArray))
      val itemJson =
        s"""{"服药时间":${timeHex},
           |"服药状态":${MedStatus.getDescription(Integer.parseInt(rtype,16))},
           |"取药口剩余药物个数": $medOutLeftCount,
           |"服药后药仓状态标志位": ${Integer.parseInt(newStateStr,16).toLong.toBinaryString},
           |"相对服药时间点偏离时间(分钟)": ${newOffset},
           |"服用药品种数": $medTypeCount,
           |"每一个药品的id" : ${medIDs.toArray}}
         """.stripMargin

      logs.append(itemJson)
    }
    )
  }

}
