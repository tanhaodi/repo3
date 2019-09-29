package com.fly.vo.bean;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class YibaoHandFeeBean {

    @JsonIgnore
    private int handFeeId;
    private String rate;
    @JsonIgnore
    private int status;
    private int feeType;
    @JsonIgnore
    private int merType;
    private int dealNum;
    @JsonIgnore
    private Date createDate;
    @JsonIgnore
    private Date updateDate;
    @JsonIgnore
    private int deleteFlag;
    private long minDealMoney=0;//最小提现金额


    public long getMinDealMoney() {
        return minDealMoney;
    }

    public void setMinDealMoney(long minDealMoney) {
        this.minDealMoney = minDealMoney;
    }

    public int getHandFeeId() {
        return handFeeId;
    }

    public void setHandFeeId(int handFeeId) {
        this.handFeeId = handFeeId;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getFeeType() {
        return feeType;
    }

    public void setFeeType(int feeType) {
        this.feeType = feeType;
    }

    public int getDealNum() {
        return dealNum;
    }

    public void setDealNum(int dealNum) {
        this.dealNum = dealNum;
    }

    public int getMerType() {
        return merType;
    }

    public void setMerType(int merType) {
        this.merType = merType;
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
}
