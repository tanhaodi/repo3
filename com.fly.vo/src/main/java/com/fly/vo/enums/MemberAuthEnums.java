package com.fly.vo.enums;

/**
 * @Author: Geoffrey
 * @Packager: com.xwsplus.dao.enums
 * @company: SIBU Kanger
 * @Description: 描述
 * @Date: 2016/8/22 9:31
 */
public enum MemberAuthEnums {
    NotAuth(0,"未认证"),
    Apply(1,"认证申请"),
    AuthSuccess(2,"认证成功"),
    RejectApply(3,"驳回重申"),
    RefuseApply(4,"拒绝申请");

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private MemberAuthEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MemberAuthEnums valueOf(int value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return NotAuth;
            case 1:
                return Apply;
            case 2:
                return AuthSuccess;
            case 3:
                return RejectApply;
            case 4:
                return RefuseApply;
            default:
                return NotAuth;
        }
    }
}
