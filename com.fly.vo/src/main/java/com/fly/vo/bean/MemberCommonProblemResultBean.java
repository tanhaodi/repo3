package com.fly.vo.bean;

import java.util.Date;

public class MemberCommonProblemResultBean {

	private String memberId;
	private String commonProblemId;
	private int type;
	private Date createDate;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getCommonProblemId() {
		return commonProblemId;
	}
	public void setCommonProblemId(String commonProblemId) {
		this.commonProblemId = commonProblemId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
