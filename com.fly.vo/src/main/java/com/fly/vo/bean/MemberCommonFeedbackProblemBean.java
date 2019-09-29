package com.fly.vo.bean;

import java.util.Date;

public class MemberCommonFeedbackProblemBean {

	private String memberFeedbackId;
	private String memberId;
	private String title;
	private String content;
	private String phone;
	private String img;
	private int feedbackType;
	private String identification;
	private int status;
	private String remark;
	private Date createDate;
	private Date updateDate;
	private int deleteFlag;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
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
	public String getMemberFeedbackId() {
		return memberFeedbackId;
	}
	public void setMemberFeedbackId(String memberFeedbackId) {
		this.memberFeedbackId = memberFeedbackId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getFeedbackType() {
		return feedbackType;
	}
	public void setFeedbackType(int feedbackType) {
		this.feedbackType = feedbackType;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
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
}
