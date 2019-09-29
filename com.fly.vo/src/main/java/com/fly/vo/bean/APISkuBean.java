package com.fly.vo.bean;

import java.io.Serializable;

public class APISkuBean implements Serializable{
	
	private static final long serialVersionUID = 2652746046147180342L;
	
	private String skuId;
	private String productId;
	private String thumbUrl;
	private Integer marketPrice;
	private Integer salePrice;
	private Integer groupPrice;
	private Integer lcPrice;
	private Integer stock;
	private Integer weight;
	
	private String productName;
	private String specName;
	private Integer count;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(Integer marketPrice) {
		this.marketPrice = marketPrice;
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
	public String getThumbUrl() {
		return thumbUrl;
	}
	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}
	public Integer getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}
	public Integer getGroupPrice() {
		return groupPrice;
	}
	public void setGroupPrice(Integer groupPrice) {
		this.groupPrice = groupPrice;
	}
	public Integer getLcPrice() {
		return lcPrice;
	}
	public void setLcPrice(Integer lcPrice) {
		this.lcPrice = lcPrice;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSpecName() {
		return specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}
	
}
