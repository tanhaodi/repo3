package com.fly.vo.enums;

/**
 * @Author: dlz
 * @Date: 2019/3/11 15:02
 * @Version 1.0
 */
public enum MemberTypeEnums {
    ORDINARY(0, "普通用户"),
    REGIMENTAL_COMMANDER(1, "团长"),
    //ADVANCE_REGIMENTAL_COMMANDER(2, "高级团长"),
    LIANCHUANG_REGIMENTAL_COMMANDER(2, "联创团长");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private MemberTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MemberTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return ORDINARY;
            case 1:
                return REGIMENTAL_COMMANDER;
            case 2:
                return LIANCHUANG_REGIMENTAL_COMMANDER;
            default:
                return ORDINARY;
        }
    }
}
