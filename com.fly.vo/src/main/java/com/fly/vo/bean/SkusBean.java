package com.fly.vo.bean;

import java.io.Serializable;

public class SkusBean implements Serializable{
	
	private static final long serialVersionUID = -4057184949013587539L;
	
	private String skuId;
    private Integer quantity=0;
    
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

}
