package com.fly.vo.enums;

/**
 * dlz
 */
public enum ControlPayType {
    Change(0, "零钱支付"),
    CheckFail(2, "官方支付宝支付"),
    YibaoChatPay(3, "易宝快捷支付"),
    YiBaoAlipay(4, "易宝微信支付"),
    yibaoApay(5, "易宝支付宝支付");

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ControlPayType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ControlPayType valueOf(int value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return Change;
            case 2:
                return CheckFail;
            case 3:
                return YibaoChatPay;
            case 4:
                return YiBaoAlipay;
            case 5:
                return yibaoApay;
            default:
                return Change;
        }
    }
}
