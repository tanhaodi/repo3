package com.fly.vo.bean;

/**
 * dlz
 * 易宝退款
 */
public class YibaoRefundBean {
    private String parentMerchantNo;
    private String merchantNo;
    private String orderId;
    private String uniqueOrderNo;
    private String refundRequestId;
    private String refundAmount;
    private String description;
    private String memo;
    private String notifyUrl;
    private String accountDivided;
    private String refundStrategy;

    public String getParentMerchantNo() {
        return parentMerchantNo;
    }

    public void setParentMerchantNo(String parentMerchantNo) {
        this.parentMerchantNo = parentMerchantNo;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUniqueOrderNo() {
        return uniqueOrderNo;
    }

    public void setUniqueOrderNo(String uniqueOrderNo) {
        this.uniqueOrderNo = uniqueOrderNo;
    }

    public String getRefundRequestId() {
        return refundRequestId;
    }

    public void setRefundRequestId(String refundRequestId) {
        this.refundRequestId = refundRequestId;
    }

    public String getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getAccountDivided() {
        return accountDivided;
    }

    public void setAccountDivided(String accountDivided) {
        this.accountDivided = accountDivided;
    }

    public String getRefundStrategy() {
        return refundStrategy;
    }

    public void setRefundStrategy(String refundStrategy) {
        this.refundStrategy = refundStrategy;
    }
}
