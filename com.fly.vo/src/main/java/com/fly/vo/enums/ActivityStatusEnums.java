package com.fly.vo.enums;

/**
 * Created by wangyun on 2016/1/15.
 */
public enum ActivityStatusEnums {
    //0下单创团，1支付开团，2人满成团，3不满散团
    WaitPay(0, "拼团中-W"),
    WaitComplete(1, "拼团中"),
    Success(2, "拼团成功"),
    Fail(3, "拼团失败"),
    UnKnow(99, "未知");

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ActivityStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ActivityStatusEnums valueOf(int value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return WaitPay;
            case 1:
                return WaitComplete;
            case 2:
                return Success;
            case 3:
                return Fail;
            default:
                return UnKnow;
        }
    }
}
