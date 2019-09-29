package com.fly.vo.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

public class CommonProblemExtBean{

	private String commonProblemId;
	private String title;
	private String content;
	private int solve; //是否解决 0 否 1 是
	private String sobotId;
	@JsonIgnore
	private String customerName;
	@JsonIgnore
	private String customerId;
	List<Map<String,Object>> customerIdList = new ArrayList<>();

	public String getSobotId() {
		return sobotId;
	}
	public void setSobotId(String sobotId) {
		this.sobotId = sobotId;
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
	public String getCommonProblemId() {
		return commonProblemId;
	}
	public void setCommonProblemId(String commonProblemId) {
		this.commonProblemId = commonProblemId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSolve() {
		return solve;
	}
	public void setSolve(int solve) {
		this.solve = solve;
	}
}
