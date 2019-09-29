package com.fly.vo.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

public class APIOrderStoreAndSkuExtBean {

	private String skuId;
	private String skuCode;
	private String skuName;
    private String storeId;
    private String storeName;
    private String sobotId;
    private String qq;
    private Integer storeType;
    private String Phone;
    @JsonIgnore
	private String customerName;
	@JsonIgnore
	private String customerId;
	private List<Map<String,Object>> customerIdList = new ArrayList<>();
	
	private String thumbUrl;
	private String productName;

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public String getThumbUrl() {
		return thumbUrl;
	}
	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getSobotId() {
		return sobotId;
	}
	public void setSobotId(String sobotId) {
		this.sobotId = sobotId;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public Integer getStoreType() {
		return storeType;
	}
	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public List<Map<String, Object>> getCustomerIdList() {
		return customerIdList;
	}
	public void setCustomerIdList(List<Map<String, Object>> customerIdList) {
		this.customerIdList = customerIdList;
	}
	
}
