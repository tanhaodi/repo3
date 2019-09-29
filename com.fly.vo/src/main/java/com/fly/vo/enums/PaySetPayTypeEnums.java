package com.fly.vo.enums;

/**
 * describe 描述：支付类型
 * @author 作者 dlz
 * @date 创建时间：2019年3月12日 下午9:00:39
 */
public enum PaySetPayTypeEnums {
    moneyPay(0, "零钱支付"),
    hkWechatpay(1, "微信支付"),
    Alipay(2, "支付宝"),
    yibaoNCPay(3,"快捷支付"),//易宝快捷支付
    yibaoWechatPay(4,"微信支付"),//易宝微信支付
    yibaoAliPay(5,"支付宝支付");//易宝支付宝支付

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private PaySetPayTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static PaySetPayTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return moneyPay;
            case 1:
                return hkWechatpay;
            case 2:
                return Alipay;
            case 3:
                return yibaoNCPay;
            case 4:
                return yibaoWechatPay;
            case 5:
                return yibaoAliPay;
            default:
                return moneyPay;
        }
    }
}
