package com.fly.vo.enums;

public enum StoreDiscountEnums {

	FullSub(0,"满减"),
    FullGive(1, "满赠券"),
    Discount(2, "满额包邮"),
	salesPromotion(3, "满送"),
	FullAmount(4,"满件包邮");

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private StoreDiscountEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static StoreDiscountEnums valueOf(int value) { 
        switch (value) {
            case 0:
                return FullSub;
            case 1:
                return FullGive;
            case 2:
                return Discount;
            case 3:
                return salesPromotion;
            case 4:
                return FullAmount;
            default:
                return FullSub;
        }
    }
}
