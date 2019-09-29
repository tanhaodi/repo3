package com.fly.vo.enums;

/**
 * 订单平台
 * Created by Administrator on 2015/10/22.
 */
public enum OrderFromEnums {
    UnKnow(0,"暂无"),
    Android(1, "安卓"),
    Apple(2, "苹果"),
    Wechat(3,"微信"),
    Weapp(4,"小程序"),
    Offline(5,"线下订单");

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private OrderFromEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static OrderFromEnums valueOf(int value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return UnKnow;
            case 1:
                return Android;
            case 2:
                return Apple;
            case 3:
                return Wechat;
            case 4:
                return Weapp;
            default:
                return UnKnow;
        }
    }
}
