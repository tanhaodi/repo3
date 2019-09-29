package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * describe 描述：订单BEAN
 * @author 作者 liguan 
 * @date 创建时间：2019年3月12日 下午9:03:32
 */
public class OrderMainBean implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 订单id
	 */
	protected String orderId;
	/**
	 * 下单人id
	 */
	protected String memberId;
	/**
	 * 订单号
	 */
	protected String orderCode;
	/**
	 *
	 */
	protected Integer isSplit;
	protected String parentOrderCode;
	protected Integer isMain;
	protected Integer orderStatus;
	protected String contact;
	protected String phone;
	protected String province;
	protected String city;
	protected String district;
	protected String detail;
	protected long totalMoney;
	protected int totalWeight;
	protected long freight=0;
	@JsonIgnore
	protected String couponId;
	protected long discountCoupon;
	protected Integer payType;
	protected long payMoney;
	protected Date payDate;
	protected String payRemark;
	protected Date receivedDate;
	protected Integer orderFrom;
	protected String buyerRemark;
	protected String sellerRemark;
	protected Integer expressId=0;
	protected Integer expressStatus;
	protected Double expressWeight;
	protected String expressName;
	protected String expressCode;
	protected String expressNo;


	private Integer isProfit;
	protected Date shipDate;
	@JsonIgnore
	private String proxyMemberId;
	@JsonIgnore
	private Date pushDate;
	@JsonIgnore
	private String pushResult;
	private String paymentNumber;
	@JsonIgnore
	protected Integer refundType;
	protected Date createDate;
	@JsonIgnore
	private Date updateDate;
	protected Integer deleteFlag;
	protected String storeId;
	protected Integer orderType=0;
	protected Integer typeOrderStatus=0;
	protected long integral=0;
	protected Integer isFine=0;
	protected Integer memberType=0;

	protected long rebateMoney;


	protected String identityCard;
	
	private String activityId;//团购ID
	private String skuId;
	private Integer quantity;
	private String productId;
	private String orderDetailId;
	private String properties;
	private String nickName;
/*	private String userName;*/

	/*public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}*/

	@JsonIgnore
	private String payId;
	
	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Integer getMemberType() {
		return memberType;
	}

	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}

	public Integer getExpressStatus() {
		return expressStatus;
	}

	public void setExpressStatus(Integer expressStatus) {
		this.expressStatus = expressStatus;
	}

	public Double getExpressWeight() {
		return expressWeight;
	}

	public void setExpressWeight(Double expressWeight) {
		this.expressWeight = expressWeight;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	@JsonIgnore
    private String referrerMemberId;

    public String getReferrerMemberId() {
		return referrerMemberId;
	}

	public void setReferrerMemberId(String referrerMemberId) {
		this.referrerMemberId = referrerMemberId;
	}

	
	public long getIntegral() {
		return integral;
	}

	public void setIntegral(long integral) {
		this.integral = integral;
	}

	public Integer getIsFine() {
		return isFine;
	}

	public void setIsFine(Integer isFine) {
		this.isFine = isFine;
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

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	public Integer getIsSplit() {
		return isSplit;
	}

	public void setIsSplit(Integer isSplit) {
		this.isSplit = isSplit;
	}

	public String getParentOrderCode() {
		return parentOrderCode;
	}

	public void setParentOrderCode(String parentOrderCode) {
		this.parentOrderCode = parentOrderCode;
	}

	public Integer getIsMain() {
		return isMain;
	}

	public void setIsMain(Integer isMain) {
		this.isMain = isMain;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
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

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public long getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(long totalMoney) {
		this.totalMoney = totalMoney;
	}

	public long getFreight() {
		return freight;
	}

	public void setFreight(long freight) {
		this.freight = freight;
	}

	public String getCouponId() {
		return couponId;
	}

	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public long getDiscountCoupon() {
		return discountCoupon;
	}

	public void setDiscountCoupon(long discountCoupon) {
		this.discountCoupon = discountCoupon;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public long getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(long payMoney) {
		this.payMoney = payMoney;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public String getPayRemark() {
		return payRemark;
	}

	public void setPayRemark(String payRemark) {
		this.payRemark = payRemark;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public Integer getOrderFrom() {
		return orderFrom;
	}

	public void setOrderFrom(Integer orderFrom) {
		this.orderFrom = orderFrom;
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

	public Integer getExpressId() {
		return expressId;
	}

	public void setExpressId(Integer expressId) {
		this.expressId = expressId;
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

	public Integer getIsProfit() {
		return isProfit;
	}

	public void setIsProfit(Integer isProfit) {
		this.isProfit = isProfit;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public String getProxyMemberId() {
		return proxyMemberId;
	}

	public void setProxyMemberId(String proxyMemberId) {
		this.proxyMemberId = proxyMemberId;
	}

	public Date getPushDate() {
		return pushDate;
	}

	public void setPushDate(Date pushDate) {
		this.pushDate = pushDate;
	}

	public String getPushResult() {
		return pushResult;
	}

	public void setPushResult(String pushResult) {
		this.pushResult = pushResult;
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	public Integer getRefundType() {
		return refundType;
	}

	public void setRefundType(Integer refundType) {
		this.refundType = refundType;
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

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public long getRebateMoney() {
		return rebateMoney;
	}

	public void setRebateMoney(long rebateMoney) {
		this.rebateMoney = rebateMoney;
	}
}

