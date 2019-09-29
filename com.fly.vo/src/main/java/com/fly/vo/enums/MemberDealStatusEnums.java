package com.fly.vo.enums;

/**
 * Created by Administrator on 2015/10/22.
 */
public enum MemberDealStatusEnums {
    UNKNOW(0, "状态异常"),
    TO_AUDIT(1, "等待审核"),
    AUDIT_SUCCESS(2, "审核成功（等待打款）"),
    AUDIT_NOT_THROUGH(3, "审核不通过"),
    YB_PLAY_GAME(4, "打款中（易宝打款中）"),
    YB_PLAY_WITH(5,"打款中（易宝打款失败，可银行卡打款）"),
    PLAY_SUCCESS(6,"打款成功"),
    PLAY_WITH(7,"打款失败退回余额");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private MemberDealStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MemberDealStatusEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return TO_AUDIT;
            case 2:
                return AUDIT_SUCCESS;
            case 3:
                return AUDIT_NOT_THROUGH;
            case 4:
            	return YB_PLAY_GAME;
            case 5:
            	return YB_PLAY_WITH;
            case 6:
                return PLAY_SUCCESS;
            case 7:
                return PLAY_WITH;
            default:
                return UNKNOW;
        }
    }
}
