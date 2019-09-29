package com.fly.vo.model;

/**
 * Created by lenovo on 2017/3/10.
 */
public class RefundOrderParam {
    /**
     * 订单号
     */
    private String orderCode;
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 会员电话
     */
    private String memberPhone;
    /**
     * 会员ID
     */
    private String memberId;
    /**
     * 退单号
     */
    private String refundCode;
    /**
     * 退单类型
     */
    private Integer refundType;

    /**
     * 退单状态
     */
    private Integer refundStatus;

    private String refundExpressName;

    private String refundExpressCode;
    /**
     * 1代表核实退货，2代表待退款，3代表已退款
     */
    private Integer refundTypeForList;

    private String storeId;

    private String sellerRemark;

    //0,未收货，1已收货
    private Integer isReceived;

    public Integer getIsReceived() {
        return isReceived;
    }

    public void setIsReceived(Integer isReceived) {
        this.isReceived = isReceived;
    }

    public String getSellerRemark() {
        return sellerRemark;
    }

    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getRefundCode() {
        return refundCode;
    }

    public void setRefundCode(String refundCode) {
        this.refundCode = refundCode;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getRefundTypeForList() {
        return refundTypeForList;
    }

    public void setRefundTypeForList(Integer refundTypeForList) {
        this.refundTypeForList = refundTypeForList;
    }

    public String getRefundExpressName() {
        return refundExpressName;
    }

    public void setRefundExpressName(String refundExpressName) {
        this.refundExpressName = refundExpressName;
    }

    public String getRefundExpressCode() {
        return refundExpressCode;
    }

    public void setRefundExpressCode(String refundExpressCode) {
        this.refundExpressCode = refundExpressCode;
    }
}
