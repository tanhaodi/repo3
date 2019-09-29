package com.fly.vo.model;

/**
 * Created by lenovo on 2017/5/18.
 */
public class OrderMainForShipBatch {
    /**
     *
     * 订单号
     */
    private String orderCode;
    /**
     * 快递名称
     */
    private String expressName;
    /**
     * 快递单号
     */
    private String expressCode;
    /**
     * 快递编号
     */
    private String expressNo;

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }
}
