package com.fly.vo.enums;

public enum PageStatusEnums {
    Putaway(1, "上架"),
    SoldOut(0, "下架");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private PageStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static PageStatusEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return Putaway;
            case 1:
                return SoldOut;
            default:
                return SoldOut;
        }
    }
}
