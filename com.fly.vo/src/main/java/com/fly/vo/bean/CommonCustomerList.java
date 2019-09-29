package com.fly.vo.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

public class CommonCustomerList {

	@JsonIgnore
	private String customerName;
	@JsonIgnore
	private String customerId;
	List<Map<String,Object>> customerIdList = new ArrayList<>();
	
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
