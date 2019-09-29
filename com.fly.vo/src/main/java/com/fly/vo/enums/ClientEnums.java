package com.fly.vo.enums;

/**
 * dlz
 */
public enum ClientEnums {
    android(1, "安卓"),
    ios(2, "苹果"),
    weixin(3, "微信"),
    h5(4, "h5");

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ClientEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ClientEnums valueOf(int value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return android;
            case 2:
                return ios;
            case 3:
                return weixin;
            case 4:
                return h5;
            default:
                return android;
        }
    }
}
