package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class APISkuCodeBean implements Serializable{
	
	private static final long serialVersionUID = -6693857433239357496L;
	
	private String productId;
	private String productName;
	private String skuId;
	private String skuCode;
	private Integer buyCount;//购买数量
	private String phone;
	private String contact;
	private String provinceId;
	private String province;
	private String cityId;
	private String city;
	private String areaId;
	private String area;
	private String detail;
	private Integer stock;
	private String addressId;
	private String thumbUrl;
	
	private Integer isLimit; // '是否限购 0 否 1 是'
	private Date limitBegin; // '限购开始时间'
	private Date limitEnd; // '限购结束时间'
	private int limitMinCount;
	private int limitMaxCount;
	
	public Integer getIsLimit() {
		return isLimit;
	}
	public void setIsLimit(Integer isLimit) {
		this.isLimit = isLimit;
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
	public int getLimitMinCount() {
		return limitMinCount;
	}
	public void setLimitMinCount(int limitMinCount) {
		this.limitMinCount = limitMinCount;
	}
	public int getLimitMaxCount() {
		return limitMaxCount;
	}
	public void setLimitMaxCount(int limitMaxCount) {
		this.limitMaxCount = limitMaxCount;
	}
	private List<APISpecInfoBean> specNames;
	
	public List<APISpecInfoBean> getSpecNames() {
		return specNames;
	}
	public void setSpecNames(List<APISpecInfoBean> specNames) {
		this.specNames = specNames;
	}
	public String getThumbUrl() {
		return thumbUrl;
	}
	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public Integer getBuyCount() {
		return buyCount;
	}
	public void setBuyCount(Integer buyCount) {
		this.buyCount = buyCount;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
