package com.fly.vo.bean;

import scala.Int;

import java.util.Date;
import java.util.List;

public class SkuBean {
	private String skuId;
	private String productId;
	private String skuCode;
	private String barCode;
	private String skuName;
	private String thumbUrl;
	private String bannerImage;
	private long weight;
	private Integer unitType;
	private Long costPrice;
	private Long marketPrice;
	private Long salePrice;
	private Long groupPrice;
	private Long lcPrice;
	private Long platformProfit;
	private long firstProfit;
	private long secondProfit;
	private Integer saleCount;
	private Integer status;
	private Integer stock;
	private Integer syncStatus;
	private Integer defaultProduct;
	private Date createDate;
	private Date updateDate;
	private long deleteFlag;

	private String storeId;
	private Integer productType;
	private String productName;
	private Integer isLimit;
	private Integer limitMinCount;
	private Integer limitMaxCount;
	private Date limitBegin;
	private Date limitEnd;
	
	private String storeName;
	
	private Integer isShippingFree; 
	private Integer freeQuantity;

	private List<APISpecInfoBean> specNames;

	public List<APISpecInfoBean> getSpecNames() {
		return specNames;
	}

	public void setSpecNames(List<APISpecInfoBean> specNames) {
		this.specNames = specNames;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public Integer getUnitType() {
		return unitType;
	}

	public void setUnitType(Integer unitType) {
		this.unitType = unitType;
	}

	public Long getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Long costPrice) {
		this.costPrice = costPrice;
	}

	public Long getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Long marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Long getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public Long getGroupPrice() {
		return groupPrice;
	}

	public void setGroupPrice(Long groupPrice) {
		this.groupPrice = groupPrice;
	}


	public Long getLcPrice() {
		return lcPrice;
	}

	public void setLcPrice(Long lcPrice) {
		this.lcPrice = lcPrice;
	}

	public Long getPlatformProfit() {
		return platformProfit;
	}

	public void setPlatformProfit(Long platformProfit) {
		this.platformProfit = platformProfit;
	}

	public long getFirstProfit() {
		return firstProfit;
	}

	public void setFirstProfit(long firstProfit) {
		this.firstProfit = firstProfit;
	}

	public long getSecondProfit() {
		return secondProfit;
	}

	public void setSecondProfit(long secondProfit) {
		this.secondProfit = secondProfit;
	}

	public Integer getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getSyncStatus() {
		return syncStatus;
	}

	public void setSyncStatus(Integer syncStatus) {
		this.syncStatus = syncStatus;
	}

	public Integer getDefaultProduct() {
		return defaultProduct;
	}

	public void setDefaultProduct(Integer defaultProduct) {
		this.defaultProduct = defaultProduct;
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

	public long getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(long deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getIsLimit() {
		return isLimit;
	}

	public void setIsLimit(Integer isLimit) {
		this.isLimit = isLimit;
	}

	public Integer getLimitMinCount() {
		return limitMinCount;
	}

	public void setLimitMinCount(Integer limitMinCount) {
		this.limitMinCount = limitMinCount;
	}

	public Integer getLimitMaxCount() {
		return limitMaxCount;
	}

	public void setLimitMaxCount(Integer limitMaxCount) {
		this.limitMaxCount = limitMaxCount;
	}

	public Date getLimitBegin() {
		return limitBegin;
	}

	public void setLimitBegin(Date limitBegin) {
		this.limitBegin = limitBegin;
	}

	public Date getLimitEnd() {
		return limitEnd;
	}

	public void setLimitEnd(Date limitEnd) {
		this.limitEnd = limitEnd;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
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
}
