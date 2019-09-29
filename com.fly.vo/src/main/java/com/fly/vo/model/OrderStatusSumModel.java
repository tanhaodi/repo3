package com.fly.vo.model;

public class OrderStatusSumModel {

    private int sum;//全部订单

    private int noPaySum;//待支付订单

    private int noShipSum;//待发货订单

    private int shipSum;//已发货订单

    private int receivedSum;//已收货订单

    private int closeSum;//已关闭订单

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getNoPaySum() {
        return noPaySum;
    }

    public void setNoPaySum(int noPaySum) {
        this.noPaySum = noPaySum;
    }

    public int getNoShipSum() {
        return noShipSum;
    }

    public void setNoShipSum(int noShipSum) {
        this.noShipSum = noShipSum;
    }

    public int getShipSum() {
        return shipSum;
    }

    public void setShipSum(int shipSum) {
        this.shipSum = shipSum;
    }

    public int getReceivedSum() {
        return receivedSum;
    }

    public void setReceivedSum(int receivedSum) {
        this.receivedSum = receivedSum;
    }

    public int getCloseSum() {
        return closeSum;
    }

    public void setCloseSum(int closeSum) {
        this.closeSum = closeSum;
    }
}
