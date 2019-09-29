package com.fly.vo.enums;

/**
 * describe 描述：订单状态
 * @author 作者 liguan 
 * @date 创建时间：2019年3月12日 下午8:59:52
 */
public enum ProductStatusEnums {
    TheShelves(0, "下架"),
    Shelves(1, "上架");


    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ProductStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ProductStatusEnums valueOf(int value) {
        switch (value) {
            case 0:
                return TheShelves;
            case 1:
                return Shelves;
            default:
                return TheShelves;
        }
    }
}
