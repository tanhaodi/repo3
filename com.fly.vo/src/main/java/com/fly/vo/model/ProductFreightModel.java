package com.fly.vo.model;

public class ProductFreightModel {

	private String storeId;//店铺ID
	private String productId;//产品ID
	private String freightId;//运费模板ID
	private int freeQuantity;//包邮数量
	private long totalPrice;//产品总价格
	private long totalWeight;//产品总重量
	private long totalQuantity;//产品总数量
	private Integer isShippingFree;
	
	public Integer getIsShippingFree() {
		return isShippingFree;
	}
	public void setIsShippingFree(Integer isShippingFree) {
		this.isShippingFree = isShippingFree;
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
	public String getFreightId() {
		return freightId;
	}
	public void setFreightId(String freightId) {
		this.freightId = freightId;
	}
	public int getFreeQuantity() {
		return freeQuantity;
	}
	public void setFreeQuantity(int freeQuantity) {
		this.freeQuantity = freeQuantity;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	public long getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(long totalWeight) {
		this.totalWeight = totalWeight;
	}
	public long getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
}
