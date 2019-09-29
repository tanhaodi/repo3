package com.fly.vo.bean;

import java.util.Date;

/**
 * @Author: dlz
 * @Date: 2019/3/21 19:32
 * @Version 1.0
 */
public class OrderSetBean {
    private String orderSetId;
    private int purchase = 0;
    private int wait = 0;
    private int ship = 0;
    private int receipt = 0;
    private int complete = 0;
    private int comment = 0;
    private int refundCheck = 0;
    private int groupCheck = 0;
    private int merCheck = 0;
    private int isBuy = 0;
    private String operator;
    private Date createDate;
    private Date updateDate;
    private int deleteFlag;

    public String getOrderSetId() {
        return orderSetId;
    }

    public void setOrderSetId(String orderSetId) {
        this.orderSetId = orderSetId;
    }

    public int getPurchase() {
        return purchase;
    }

    public void setPurchase(int purchase) {
        this.purchase = purchase;
    }

    public int getWait() {
        return wait;
    }

    public void setWait(int wait) {
        this.wait = wait;
    }

    public int getShip() {
        return ship;
    }

    public void setShip(int ship) {
        this.ship = ship;
    }

    public int getReceipt() {
        return receipt;
    }

    public void setReceipt(int receipt) {
        this.receipt = receipt;
    }

    public int getComplete() {
        return complete;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public int getGroupCheck() {
        return groupCheck;
    }

    public void setGroupCheck(int groupCheck) {
        this.groupCheck = groupCheck;
    }

    public int getMerCheck() {
        return merCheck;
    }

    public void setMerCheck(int merCheck) {
        this.merCheck = merCheck;
    }

    public int getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(int isBuy) {
        this.isBuy = isBuy;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public int getRefundCheck() {
        return refundCheck;
    }

    public void setRefundCheck(int refundCheck) {
        this.refundCheck = refundCheck;
    }
}
