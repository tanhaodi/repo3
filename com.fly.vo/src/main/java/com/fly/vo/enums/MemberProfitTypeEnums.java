package com.fly.vo.enums;

/**
 * Created by Administrator on 2015/10/22.
 */
public enum MemberProfitTypeEnums {
    level(1, "二级分销"),
    equative(2, "同级奖"),
    cultivate(3, "培育奖"),
    hierarchy(4, "层级差价"),
    manag(5, "管理奖"),
    supplier(6, "供货收益"),
    REFUND_SUPPLIER(7, "供货收益退款"),
    SYS_ADD(8, "系统增加货款"),
    SYS_DELET(9, "系统扣减货款"),
    CHANGE_REMIT(10, "打款（零钱货款）"),
    YIBAO_REMIT(11, "打款（易宝货款）");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private MemberProfitTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MemberProfitTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return level;
            case 2:
                return equative;
            case 3:
                return cultivate;
            case 4:
                return hierarchy;
            case 5:
                return manag;
            case 6:
                return supplier;
            case 7:
                return REFUND_SUPPLIER;
            case 8:
                return SYS_ADD;
            case 9:
                return SYS_DELET;
            case 10:
                return CHANGE_REMIT;
            case 11:
                return YIBAO_REMIT;
            default:
                return level;
        }
    }
}
