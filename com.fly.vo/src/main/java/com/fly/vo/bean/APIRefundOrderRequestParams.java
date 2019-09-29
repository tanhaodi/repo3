package com.fly.vo.bean;
import java.util.*;
/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: 退单申请传入的参数
 * @Date: 2017/2/18 10:59
 */
public class APIRefundOrderRequestParams {
    private String orderCode;
    private Integer refundType;
    private String refundReason;
    private String remark;
    private long refundMoney;
    private List<String> images=new ArrayList<>();

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(long refundMoney) {
        this.refundMoney = refundMoney;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
