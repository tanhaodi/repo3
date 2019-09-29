package com.fly.vo.enums;


public enum ProfitTypeEnums {

    none(0, "未知收益类型"),
    SecondLevel(1, "二级分销"),
    SameLevel(2,"同级奖"),
    Cultivate(3, "培育奖"),
    Hierarchy(4, "层级差价"),
    Management(5, "管理奖"),
    CICostMoneyRepair (6,"供货收益"), 
    CICRefundostMoneyRepair( 7,"供货收益退款"),
    SysIncrease(8,"系统增加货款"),
    SysDeductions (9,"系统扣减货款"),
    Change(10,"打款(零钱货款)"),
    YiBao(11,"打款(易宝货款)");


    private int code; //代码
    private String msg; //消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ProfitTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ProfitTypeEnums valueOf(int value) {
        switch (value) {
            case 0:
                return none;
            case 1:
                return SecondLevel;
            case 2:
                return SameLevel;
            case 3:
                return Cultivate;
            case 4:
                return Hierarchy;
            case 5:
                return Management;
            case 6:
                return CICostMoneyRepair;
            case 7:
                return CICRefundostMoneyRepair;
            case 8:
                return SysIncrease;
            case 9:
                return SysDeductions;
            case 10:
                return Change;
            case 11:
                return YiBao;
            default:
                return none;
        }
    }
}
