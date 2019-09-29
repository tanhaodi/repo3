package com.fly.vo.enums;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.enums
 * @company: Kanger
 * @Description: 退单状态
 * @Date: 2017/2/16 11:24
 */
public enum  RefundStatusEnums {
    //'0,用户申请，1，商家同意退货，2，买家上传退货物流信息，3，商家确认收货，4，商家确认退款，5退款收益计算完成'
    ApplyRefund(0,"申请中"),
    SellerAgree(1,"商家确认"),
    UpLoadEvidence(2,"上传凭证"),
    SellerReceiving(3,"商家确认收货"),
    SellerRefundMoney(4,"商家确认退款"),
    Profit(5,"退单收益计算完成"),
    Cancel(-1,"取消申请"),
    UnKnow(100,"未知状态");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private RefundStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static RefundStatusEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return ApplyRefund;
            case 1:
                return SellerAgree;
            case 2:
                return UpLoadEvidence;
            case 3:
                return SellerReceiving;
            case 4:
                return SellerRefundMoney;
            case 5:
                return Profit;
            case -1:
                return Cancel;
            default:
                return UnKnow;
        }
    }
}
