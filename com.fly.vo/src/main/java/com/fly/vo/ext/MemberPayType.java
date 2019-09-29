package com.fly.vo.ext;

/**
 * Created by lenovo on 2017/4/11.
 */
public enum MemberPayType {
    Unknow(0, "未知"),
    PayOrder(1, "支付订单"),
    PayOrderRefund(2, "零钱支付退款"),
    HkPayOrder(4, "HK微信支付退款到零钱"),
    yibaoWechatPay(11,"微信支付"),//易宝微信支付
    yibaoAliPay(12,"支付宝支付"),//易宝支付宝支付
    yibaoNetPay(13,"网银支付"),//易宝网银支付
    yibaoNCPay(14,"快捷支付"),//易宝快捷支付
    yibaoCFLPay(15,"分期支付");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private MemberPayType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MemberPayType valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return Unknow;
            case 1:
                return PayOrder;
            case 2:
                return PayOrderRefund;
            case 4:
                return HkPayOrder;
            case 11:
                return yibaoWechatPay;
            case 12:
                return yibaoAliPay;
            case 13:
                return yibaoNetPay;
            case 14:
                return yibaoNCPay;
            case 15:
                return yibaoCFLPay;
            default:
                return PayOrder;
        }
    }
}
