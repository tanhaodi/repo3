package com.fly.vo.enums;

/**
 * 退款或退货的状态
 * Created by Administrator on 2015/10/22.
 */
public enum RefundStatus {
    GiveUPRefundGoods(-2, "取消申请退货"),
    GiveUPRefundMoney(-1, "取消申请退款"),
    Apply(0, "用户申请"),
    AllowRefundGoods(1, "商家同意退货"),
    UploadMsg(2,"买家上传退货物流信息"),
    SureRefundGoods(3, "商家确认收货"),
    SureRefundMoney(4, "商家确认退款"),
    Over(5,"退款收益计算完成"),
    Refundof(6,"退款订单处理中"),
    ReturnGoods(7,"已收货退货"),
    AllowRefundGoodsTwo(8,"已收货商家同意退货"),
    UploadMsgTwo(9,"已收货买家上传退货物流信息"),
    SureRefundGoodTwo(10,"已收货退货商家确定收货");


    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private RefundStatus(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static RefundStatus valueOf(int value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case -2:
                return GiveUPRefundGoods;
            case -1:
                return GiveUPRefundMoney;
            case 0:
                return Apply;
            case 1:
                return AllowRefundGoods;
            case 2:
                return UploadMsg;
            case 3:
                return SureRefundGoods;
            case 4:
                return SureRefundMoney;
            case 5:
                return Over;
            case 6:
                return Refundof;
            case 7:
                return ReturnGoods;
            case 8:
                return AllowRefundGoodsTwo;
            case 9:
                return UploadMsgTwo;
            case 10:
                return SureRefundGoodTwo;
            default:
                return Apply;
        }
    }
}
