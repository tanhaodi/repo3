package com.fly.vo.enums;

/**
 * describe 描述：订单状态
 * @author 作者 liguan 
 * @date 创建时间：2019年3月12日 下午8:59:52
 */
public enum OrderStatusEnums {
    HasClose(0, "已关闭"),
    WaitPay(1, "待支付"),
    WaitShip(2, "待发货"),
    HasShip(3, "已发货"),
    HasReceived(4, "已收货"),
    ReturnMoneying(5, "退款处理中"),//退款中
    ReturnGooding(6, "退货处理中"),//退货中
    ReturnMoneyClose(7, "退款完成"),
    ReturnGoodClose(8, "退款完成"),//退货完成
    DealOver(9, "完成交易"),//退货完成
    ErrorOrder(99, "异常订单");


    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private OrderStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static OrderStatusEnums valueOf(int value) {   
        switch (value) {
            case 0:
                return HasClose;
            case 1:
                return WaitPay;
            case 2:
                return WaitShip;
            case 3:
                return HasShip;
            case 4:
                return HasReceived;
            case 5:
                return ReturnMoneying;
            case 6:
                return ReturnGooding;
            case 7:
                return ReturnMoneyClose;
            case 8:
                return ReturnGoodClose;
            case 9:
                return DealOver;
            case 99:
                return ErrorOrder;
            default:
                return HasClose;
        }
    }
}
