package com.fly.vo.enums;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.enums
 * @company: Kanger
 * @Description: 退单类型
 * @Date: 2017/2/16 11:24
 */
public enum RefundTypeEnums {
    UnKnow(0,"未知申请"),
    RefundGoods(1,"申请退货"),
    RefundMoney(2,"申请退款");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private RefundTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static RefundTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return RefundGoods;
            case 2:
                return RefundMoney;
            default:
                return UnKnow;
        }
    }
}
