package com.infoengine.mvc;

/**
 * Created by Yeah-1 on 2016-10-04.
 */
public enum MedStatus {

    UNOPEN(0,"未打开药盒(1小时之内)"),
    OPEN_TIMEOUT1(1,"打开药盒超时未按下按键(1小时之内)"),
    OPEN_TIMEOUT2(2,"未按下按键后超时未检测到药落下(1小时之内)"),
    GET_PILL_TIMEOUT(3,"检测到药落下后超时没有打开取药(1小时之内)"),
    NORMAL(4,"正常服药"),
    EARLY(5,"早服"),
    LATE(6,"晚服"),
    MISS(7,"错过"),
    MISSTAKEN(8,"错服");



    private int status;
    private String description;

    // 构造方法
    private MedStatus(int status,String description) {
        this.description = description;
        this.status = status;
    }

    // 普通方法
    public static String getDescription(int status) {
        for (MedStatus c : MedStatus.values()) {
            if (c.getStatus() == status) {
                return c.description;
            }
        }
        return null;
    }

    // get set 方法
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
