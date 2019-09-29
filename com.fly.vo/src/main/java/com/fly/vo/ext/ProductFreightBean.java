package com.fly.vo.ext;

public class ProductFreightBean {
	private String storeId;
	private String productId;
	private String freightId;//运费模板ID
    private Integer isShippingFree=0;//是否包邮
    private Integer freeQuantity=0;//包邮数量
    private Integer weight=0;
    private long marketPrice;//市场价
    private long salePrice;//销售价格
    private long groupPrice;//团长价
    private long lcPrice;//联创团长价
    
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
	public String getFreightId() {
		return freightId;
	}
	public void setFreightId(String freightId) {
		this.freightId = freightId;
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
	public long getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(long marketPrice) {
		this.marketPrice = marketPrice;
	}
	public long getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(long salePrice) {
		this.salePrice = salePrice;
	}
	public long getGroupPrice() {
		return groupPrice;
	}
	public void setGroupPrice(long groupPrice) {
		this.groupPrice = groupPrice;
	}
	public long getLcPrice() {
		return lcPrice;
	}
	public void setLcPrice(long lcPrice) {
		this.lcPrice = lcPrice;
	}
	
}
