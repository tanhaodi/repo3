package com.fly.vo.model;

/**
 * Created by lenovo on 2017/2/21.
 */
public class OrderMainParam {
    /**
     * 订单号
     */
    private String orderCode;
    /**
     * 会员ID
     */
    private String memberId;

    /**
     *0.近三月的订单
     * 1.三个月之前
     *
     */
    private Integer falg;
    /**
     * 会员电话
     */
    private String memberPhone;
    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 收益计算状态
     */
    private Integer orderProfitStatus;
    /**
     * 支付方式
     */
    private Integer payType;
    /**
     * 收件人
     */
    private String contact;
    /**
     * 收件人电话
     */
    private String phone;
    /**
     * 快递单号
     */
    private String expressCode;

    /**
     * 快递名称
     */
    private String expressName;

    /**
     * 快递编码
     */
    private String expressNo;

    /**
     * 买家备注
     */
    private String buyerRemark;
    /**
     * 卖家备注
     */
    private String sellerRemark;
    /**
     * 支付备注
     */
    private String payRemark;

    /**
     * 支付金额
     */
    private long payMoney;
    /**
     * 支付时间
     */
    private String payDate;
    /**
     * 发货时间
     */
    private String shipDate;
    /**
     * 修改时间
     * */
    private String updateDate;
    private String storeId;
    private Integer isStore=0;
    private String storeName;
    private Integer orderType;
    private Integer typeOrderStatus;

    private String startDate;

    private String endDate;
    /**
     * 是否是海外购(0否，1是)
     */
    private Integer overseas;//

    private String productName;

    private String skuId;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getFalg() {
        return falg;
    }

    public void setFalg(Integer falg) {
        this.falg = falg;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getTypeOrderStatus() {
        return typeOrderStatus;
    }

    public void setTypeOrderStatus(Integer typeOrderStatus) {
        this.typeOrderStatus = typeOrderStatus;
    }

    public Integer getIsStore() {
		return isStore;
	}

	public void setIsStore(Integer isStore) {
		this.isStore = isStore;
	}

    public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	private String paymentNumber;

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
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

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderProfitStatus() {
        return orderProfitStatus;
    }

    public void setOrderProfitStatus(Integer orderProfitStatus) {
        this.orderProfitStatus = orderProfitStatus;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getBuyerRemark() {
        return buyerRemark;
    }

    public void setBuyerRemark(String buyerRemark) {
        this.buyerRemark = buyerRemark;
    }

    public String getSellerRemark() {
        return sellerRemark;
    }

    public void setSellerRemark(String sellerRemark) {
        this.sellerRemark = sellerRemark;
    }

    public long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(long payMoney) {
        this.payMoney = payMoney;
    }

    public String getPayRemark() {
        return payRemark;
    }

    public void setPayRemark(String payRemark) {
        this.payRemark = payRemark;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public Integer getOverseas() {
        return overseas;
    }

    public void setOverseas(Integer overseas) {
        this.overseas = overseas;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
