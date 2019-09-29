package com.fly.vo.enums;

/**
 * @Author: dlz
 * @Date: 2019/3/11 15:02
 * @Version 1.0
 */
public enum OrderTypeEnums {
    ordinary(0, "普通订单"),
    up(1, "升级订单"),
    buyer(2, "采购订单");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private OrderTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static OrderTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return ordinary;
            case 1:
                return up;
            case 2:
                return buyer;
            default:
                return ordinary;
        }
    }
}
