package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class ApplicationPayModeBean implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private String paySetId;
	@JsonIgnore
	private String terminal;
	private int payType;
	private int discount;
	@JsonIgnore
	private int status;
	@JsonIgnore
	private Date createDate;
	@JsonIgnore
	private Date updateDate;
	@JsonIgnore
	private int deleteFlag;
	
	public String getPaySetId() {
		return paySetId;
	}
	public void setPaySetId(String paySetId) {
		this.paySetId = paySetId;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	public int getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	
}
