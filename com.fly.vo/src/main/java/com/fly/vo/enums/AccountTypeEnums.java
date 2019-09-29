package com.fly.vo.enums;

/**
 * Created by Administrator on 2015/11/12.
 */
public enum  AccountTypeEnums {
    Unkonw(0,"未知"),
   Bank (1,"银行卡"),
   Alipay (2,"支付宝"),
   Wechat(3,"微信");

    private int code; //错误代码
    private String msg; //错误消息
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private AccountTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static AccountTypeEnums valueOf(int code){
        switch (code){
            case 1:
                return Bank;
            case 2:
                return Alipay;
            case 3:
                return Wechat;
            default:
                return Unkonw;
        }
    }
}
