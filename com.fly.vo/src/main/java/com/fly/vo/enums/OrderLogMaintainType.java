package com.fly.vo.enums;

/**
 * Created by itc on 2017-7-8.
 */
public enum OrderLogMaintainType {
    OrderStatus(0,"订单状态"),
    MessMatin(1,"地址"),
    FreezeMember(2,"快递单号"),
    EditShopDay(3,"套餐产品"),
    EditPlaceMember(5,"付款"),
    EditMemberType(6,"发货"),
    PayStstusSynchronizate(7,"支付状态同步"),
    RepatePayRefund(8,"重复支付退款"),
    RefundStstusSynchronizate(9,"退款状态同步"),;

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private OrderLogMaintainType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static OrderLogMaintainType valueOf(int value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return OrderStatus;
            case 1:
                return MessMatin;
            case 2:
                return FreezeMember;
            case 3:
                return EditShopDay;
            case 5:
                return EditPlaceMember;
            case 6:
                return EditMemberType;
            case 7:
                return PayStstusSynchronizate;
            case 8:
                return RepatePayRefund;
            case 9:
                return RefundStstusSynchronizate;
            default:
                return MessMatin;
        }
    }
}
