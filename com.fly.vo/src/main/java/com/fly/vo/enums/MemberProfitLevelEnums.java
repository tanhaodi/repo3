package com.fly.vo.enums;

/**
 * C
 * @author dlz
 */
public enum MemberProfitLevelEnums {
    lower(1,"直属下级订单"),
    interestsChain (2,"利益链收益");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private MemberProfitLevelEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MemberProfitLevelEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return lower;
            case 2:
                return interestsChain;
            default:
                return lower;
        }
    }
}
