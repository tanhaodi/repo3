package com.fly.vo.bean;

import java.util.Date;

public class APICalcSkuDetailBeanExt {

	private String storeId;
	protected String productId;
    private Integer isShippingFree=0;//是否包邮
    private Integer freeQuantity=0;//包邮数量
    private Integer weight=0;
    private long retailPrice;//会员价
    private long marketPrice;//市场价
    private long totalRetailPrice;
    private long totalMarketPrice;	
    private Integer totalWeight=0;
    private Integer totalQuantity=0;//购买数量
    private int community;//是否社群团购产品 0 否 1 是
    private long communityPrice;//社群团购产品价格
    private Date communityStart;//社群团购有效开始时间
    private Date communityEnd;//社群团购有效结束时间
    
    
	public int getCommunity() {
		return community;
	}
	public void setCommunity(int community) {
		this.community = community;
	}
	public long getCommunityPrice() {
		return communityPrice;
	}
	public void setCommunityPrice(long communityPrice) {
		this.communityPrice = communityPrice;
	}
	public Date getCommunityStart() {
		return communityStart;
	}
	public void setCommunityStart(Date communityStart) {
		this.communityStart = communityStart;
	}
	public Date getCommunityEnd() {
		return communityEnd;
	}
	public void setCommunityEnd(Date communityEnd) {
		this.communityEnd = communityEnd;
	}
	public Integer getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public Integer getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Integer totalWeight) {
		this.totalWeight = totalWeight;
	}
	public long getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(long retailPrice) {
		this.retailPrice = retailPrice;
	}
	public long getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(long marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Integer getIsShippingFree() {
		return isShippingFree;
	}
	public void setIsShippingFree(Integer isShippingFree) {
		this.isShippingFree = isShippingFree;
	}
	public Integer getFreeQuantity() {
		return freeQuantity;
	}
	public void setFreeQuantity(Integer freeQuantity) {
		this.freeQuantity = freeQuantity;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public long getTotalRetailPrice() {
		return totalRetailPrice;
	}
	public void setTotalRetailPrice(long totalRetailPrice) {
		this.totalRetailPrice = totalRetailPrice;
	}
	public long getTotalMarketPrice() {
		return totalMarketPrice;
	}
	public void setTotalMarketPrice(long totalMarketPrice) {
		this.totalMarketPrice = totalMarketPrice;
	}
}
