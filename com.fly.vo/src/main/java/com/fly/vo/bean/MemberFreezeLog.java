package com.fly.vo.bean;

import java.util.Date;

public class MemberFreezeLog {
	private String memberFreezeLogId;
	private String freezeReason;
	private String operator;
	private Date createDate;
	private Integer freezeType;
	private String freezeTypeStr;
	private Date freezeDate;
	public String getMemberFreezeLogId() {
		return memberFreezeLogId;
	}
	public void setMemberFreezeLogId(String memberFreezeLogId) {
		this.memberFreezeLogId = memberFreezeLogId;
	}
	public String getFreezeReason() {
		return freezeReason;
	}
	public void setFreezeReason(String freezeReason) {
		this.freezeReason = freezeReason;
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
	public Integer getFreezeType() {
		return freezeType;
	}
	public void setFreezeType(Integer freezeType) {
		this.freezeType = freezeType;
	}
	public String getFreezeTypeStr() {
		return freezeTypeStr;
	}
	public void setFreezeTypeStr(String freezeTypeStr) {
		this.freezeTypeStr = freezeTypeStr;
	}
	public Date getFreezeDate() {
		return freezeDate;
	}
	public void setFreezeDate(Date freezeDate) {
		this.freezeDate = freezeDate;
	}
	
}
