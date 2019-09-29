package com.fly.vo.enums;

public enum MemberInviteLogStatusEnums {

    CHECK_PENDING(0, "待审核"),
    CONSENT(1, "同意"),
    REFUSE(2, "拒绝");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private MemberInviteLogStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MemberInviteLogStatusEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return CHECK_PENDING;
            case 2:
                return CONSENT;
            case 3:
                return REFUSE;
            default:
                return CHECK_PENDING;
        }
    }
}
