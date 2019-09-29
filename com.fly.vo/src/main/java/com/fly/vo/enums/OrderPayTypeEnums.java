package com.fly.vo.enums;

/**
 * @Author: dlz
 * @Date: 2019/3/11 15:02
 * @Version 1.0
 */
public enum OrderPayTypeEnums {
    Unknow(0, "未支付"),
    Wechatpay(1, "微信支付"),
    Alipay(2, "支付宝"),
    offinePay(3, "线下支付"),
    systemPay(4, "系统代付"),
    moneyPay(5, "零钱支付"),
    yibaoWechatPay(6, "微信支付（易宝）"),
    yibaoAliPay(7, "支付宝支付（易宝）"),
    yibaoNetPay(8, "网银支付（易宝）"),
    yibaoNCPay(9, "快捷支付（易宝）"),
    yibaoCFLPay(10, "分期支付（易宝马上金融");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private OrderPayTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static OrderPayTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return Unknow;
            case 1:
                return Wechatpay;
            case 2:
                return Alipay;
            case 3:
                return offinePay;
            case 4:
                return systemPay;
            case 5:
                return moneyPay;
            case 6:
                return yibaoWechatPay;
            case 7:
                return yibaoAliPay;
            case 8:
                return yibaoNetPay;
            case 9:
                return yibaoNCPay;
            case 10:
                return yibaoCFLPay;
            default:
                return Unknow;
        }
    }
}
