package com.fly.vo.ext;

import java.io.Serializable;
import java.util.List;
/**
 * describe 描述：订单运费bean
 * @author 作者 liguan 
 * @date 创建时间：2019年3月18日 下午2:34:59
 */
public class CalcFreightBean implements Serializable{
	private static final long serialVersionUID = -6509047909011208862L;
	private String addressId;
	private String provinceId;
	private int type=0;//是否采购订单 0 否 1 是
	private List<OrderSkuBean> skus;
	
	public String getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public List<OrderSkuBean> getSkus() {
		return skus;
	}
	public void setSkus(List<OrderSkuBean> skus) {
		this.skus = skus;
	}
}
