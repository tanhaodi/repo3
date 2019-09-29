package com.fly.vo.enums;

/**
 * Created by Administrator on 2015/10/22.
 */
public enum PayTypeEnums {
    Unknow(0, "未支付"),
    Wechatpay(1, "微信支付"),
    Alipay(2, "支付宝"),
    offinePay(3, "线下付款"),
    systemPay(4, "系统代付"),
    moneyPay(5, "零钱支付"),
    WechatPay_YIBAO(6, "微信支付(易宝)"),
    yibaoAliPay(7, "支付宝支付(易宝)"),
    yibaoNetPay(8, "网银支付(易宝)"),//易宝网银支付
    yibaoNCPay(9, "快捷支付(易宝)"),//易宝快捷支付
    yibaoCFLPay(10, "分期支付(易宝)");//易宝 马上金融


    ;
//
//    Unknow(0, "未支付"),
//    Wechatpay(1, "微信支付"),
//    Alipay(2, "支付宝"),
//    offinePay(3, "线下付款"),
//    systemPay(4, "系统代付"),
//    moneyPay(5, "零钱支付"),
//    WechatAppPay(6,"微信支付"),//微信app支付
//    HiCardPay(7,"微信支付"),//汇卡支付
//    ghtWechatPay(8,"微信支付"),//高汇通微信支付
//    ghtQuickPay(9,"快捷支付"),//高汇通快捷支付
//    newAliPay(10,"支付宝"),
//    scorePay(88,"积分兑换"),
//    Lucky(66,"积分抽奖");


    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private PayTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static PayTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
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
                return WechatPay_YIBAO;
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
