package com.fly.vo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/02/04
 */
public class APIBatchAddOrderBean {
	
    private List<APIAddOrderProductBean> products;
    private Integer orderFrom;
    private String remark;
    private int orderType=0;
    private String activityId;//团购ID
    
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public List<APIAddOrderProductBean> getProducts() {
		return products;
	}
	public void setProducts(List<APIAddOrderProductBean> products) {
		this.products = products;
	}
	public Integer getOrderFrom() {
		return orderFrom;
	}
	public void setOrderFrom(Integer orderFrom) {
		this.orderFrom = orderFrom;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

   
}