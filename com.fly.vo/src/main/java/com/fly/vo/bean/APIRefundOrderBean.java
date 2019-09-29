package com.fly.vo.bean;

import java.util.*;

import com.fly.vo.enums.RefundStatusEnums;
import com.fly.vo.enums.RefundTypeEnums;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: api返回的退单实体
 * @Date: 2017/2/18 15:43
 */
public class APIRefundOrderBean {

    private String refundId;
    private String refundCode;
    private Integer refundType=0;
    private Integer refundStatus=0;
    private String refundResult;
    private String refundReason;
    private String refundRemark;
    private List<String> refundGoodsImage;
    private String refundGoodsExpressName;
    private String refundGoodsExpressCode;
    private long applyRefundMoney;
    private long refundMoney;
    private String refundTypeStr;
    private String refundStatusStr;

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getRefundCode() {
        return refundCode;
    }

    public void setRefundCode(String refundCode) {
        this.refundCode = refundCode;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getRefundResult() {
        return refundResult;
    }

    public void setRefundResult(String refundResult) {
        this.refundResult = refundResult;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRefundRemark() {
        return refundRemark;
    }

    public void setRefundRemark(String refundRemark) {
        this.refundRemark = refundRemark;
    }

    public List<String> getRefundGoodsImage() {
        return refundGoodsImage;
    }

    public void setRefundGoodsImage(List<String> refundGoodsImage) {
        this.refundGoodsImage = refundGoodsImage;
    }

    public String getRefundGoodsExpressName() {
        return refundGoodsExpressName;
    }

    public void setRefundGoodsExpressName(String refundGoodsExpressName) {
        this.refundGoodsExpressName = refundGoodsExpressName;
    }

    public String getRefundGoodsExpressCode() {
        return refundGoodsExpressCode;
    }

    public void setRefundGoodsExpressCode(String refundGoodsExpressCode) {
        this.refundGoodsExpressCode = refundGoodsExpressCode;
    }

    public long getApplyRefundMoney() {
        return applyRefundMoney;
    }

    public void setApplyRefundMoney(long applyRefundMoney) {
        this.applyRefundMoney = applyRefundMoney;
    }

    public long getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(long refundMoney) {
        this.refundMoney = refundMoney;
    }

    public String getRefundTypeStr() {
        return RefundTypeEnums.valueOf(refundType).getMsg();
    }

    public void setRefundTypeStr(String refundTypeStr) {
        this.refundTypeStr = refundTypeStr;
    }

    public String getRefundStatusStr() {
        return RefundStatusEnums.valueOf(refundStatus).getMsg();
    }

    public void setRefundStatusStr(String refundStatusStr) {
        this.refundStatusStr = refundStatusStr;
    }
}
