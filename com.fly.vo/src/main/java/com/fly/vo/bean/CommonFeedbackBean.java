package com.fly.vo.bean;

import java.util.Date;

public class CommonFeedbackBean {

	private String commonFeedbackId;
	private String feedbackName;
	private Integer status;
	private Integer sortIndex;
	private String operator;
	private Date createDate;
	private Date updateDate;
	
	public String getCommonFeedbackId() {
		return commonFeedbackId;
	}
	public void setCommonFeedbackId(String commonFeedbackId) {
		this.commonFeedbackId = commonFeedbackId;
	}
	public String getFeedbackName() {
		return feedbackName;
	}
	public void setFeedbackName(String feedbackName) {
		this.feedbackName = feedbackName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getSortIndex() {
		return sortIndex;
	}
	public void setSortIndex(Integer sortIndex) {
		this.sortIndex = sortIndex;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
