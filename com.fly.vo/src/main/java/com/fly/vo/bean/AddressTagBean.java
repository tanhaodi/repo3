package com.fly.vo.bean;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class AddressTagBean {

	private String addressTagId;
	private String tagName;
	private String memberId;
	@JsonIgnore
	private Date createDate;
	@JsonIgnore
	private Date updateDate;
	@JsonIgnore
	private int deleteFlag;
	
	public String getAddressTagId() {
		return addressTagId;
	}
	public void setAddressTagId(String addressTagId) {
		this.addressTagId = addressTagId;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
