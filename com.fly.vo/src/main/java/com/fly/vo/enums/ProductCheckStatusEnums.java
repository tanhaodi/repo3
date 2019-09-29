package com.fly.vo.enums;

/**
 * describe 描述：订单状态
 * @author 作者 liguan 
 * @date 创建时间：2019年3月12日 下午8:59:52
 */
public enum ProductCheckStatusEnums {
    //0 审核中 1 审核通过 2 审核不通过',
    InTheReview(0, "审核中"),
    Approved(1, "审核通过"),
    Rejected(2,"审核不通过");


    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ProductCheckStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ProductCheckStatusEnums valueOf(int value) {
        switch (value) {
            case 0:
                return InTheReview;
            case 1:
                return Approved;
            case 2:
                return Rejected;
            default:
                return InTheReview;
        }
    }
}
