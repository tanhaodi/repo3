package com.fly.vo.bean;

/**
 * @Author: Geoffrey
 * @Packager: com.sky.dao.vo
 * @company: SIBU Kanger
 * @Description: 下单返回订单号对象
 * @Date: 2016/9/28 10:01
 */
public class APIOrderIdBean {
    private String orderId;
    private String orderCode;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
}
