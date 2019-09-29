package com.fly.vo.enums;

/**
 * dlz
 */
public enum TerminalTypeEnums {
    group(0, "团长晋级"),
    integral(1, "积分页面"),
    detail(2, "收益明细");

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private TerminalTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static TerminalTypeEnums valueOf(int value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return group;
            case 2:
                return integral;
            case 0:
                return detail;
            default:
                return group;
        }
    }
}
