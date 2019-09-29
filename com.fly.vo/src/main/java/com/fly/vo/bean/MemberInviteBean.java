package com.fly.vo.bean;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;

public class MemberInviteBean implements Serializable{
	
	private static final long serialVersionUID = -5553930864760516117L;
	
	private String memberInviteId;
	private String memberId;
	private String inviteNo;
	private long addInvite;
	private long meRetailMoney;
	private long useRetailMoney;
	private Integer status;
	private String createDate;
	private String updateDate;
	@JsonIgnore
	private Integer deleteFlag;
	
	private Integer inviteCount = 0;
	private Integer inviteCountLog = 0;

	public long getUseRetailMoney() {
		return useRetailMoney;
	}

	public void setUseRetailMoney(long useRetailMoney) {
		this.useRetailMoney = useRetailMoney;
	}

	public long getAddInvite() {
		return addInvite;
	}

	public void setAddInvite(long addInvite) {
		this.addInvite = addInvite;
	}

	public long getMeRetailMoney() {
		return meRetailMoney;
	}

	public void setMeRetailMoney(long meRetailMoney) {
		this.meRetailMoney = meRetailMoney;
	}

	public Integer getInviteCount() {
		return inviteCount;
	}
	public void setInviteCount(Integer inviteCount) {
		this.inviteCount = inviteCount;
	}
	public Integer getInviteCountLog() {
		return inviteCountLog;
	}
	public void setInviteCountLog(Integer inviteCountLog) {
		this.inviteCountLog = inviteCountLog;
	}
	public String getMemberInviteId() {
		return memberInviteId;
	}
	public void setMemberInviteId(String memberInviteId) {
		this.memberInviteId = memberInviteId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getInviteNo() {
		return inviteNo;
	}
	public void setInviteNo(String inviteNo) {
		this.inviteNo = inviteNo;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
