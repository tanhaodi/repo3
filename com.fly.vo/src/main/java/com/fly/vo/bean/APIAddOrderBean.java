package com.fly.vo.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/02/04
 */
public class APIAddOrderBean {
    private String addressId;
    private List<APIAddOrderProductBean> products;
    private Integer orderFrom;
    private String remark;
    private String memberId;
    private String couponId;
    private String activityId;//团购ID
    private int orderType=0;

    public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public String getAddressId() {
        return addressId;
    }
    public void setAddressId(String addressId) {
        this.addressId = addressId;
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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
}