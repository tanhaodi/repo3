package com.fly.vo.bean;

import java.util.List;

/**
 * 
* @ClassName: APIAddOrderProductBean
* @Description: TODO
* @author xupp
* @date 2019年3月27日
*
 */
public class APIAddOrderProductBean {
	
	private String skuId;
    private Integer quantity=0;
    private String addressId;
	
    private String phone;
	private String contact;
	private String provinceId;
	private String province;
	private String cityId;
	private String city;
	private String areaId;
	private String area;
	private String detail;
	private String buyerRemark;
	
	private List<SkusBean> skus;

	public String getBuyerRemark() {
		return buyerRemark;
	}
	public void setBuyerRemark(String buyerRemark) {
		this.buyerRemark = buyerRemark;
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
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public List<SkusBean> getSkus() {
		return skus;
	}
	public void setSkus(List<SkusBean> skus) {
		this.skus = skus;
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
}