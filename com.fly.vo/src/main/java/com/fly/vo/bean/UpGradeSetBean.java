package com.fly.vo.bean;

import java.util.Date;

/**
 * @author dlz
 */
public class UpGradeSetBean {

	private int addInvite;
	private int upGradeSetId;
	private int upGroupMoney;
	private int upLcScore;
	private int status;
	private String operator;
	private Date createDate;
	private Date updateDate;
	private int deleteFlag;

	private int totalScore = 0;
	private int meRetailMoney = 0;
	
	private int memberType;

	public int getMemberType() {
		return memberType;
	}

	public void setMemberType(int memberType) {
		this.memberType = memberType;
	}

	public int getAddInvite() {
		return addInvite;
	}

	public void setAddInvite(int addInvite) {
		this.addInvite = addInvite;
	}

	public int getUpGradeSetId() {
		return upGradeSetId;
	}

	public void setUpGradeSetId(int upGradeSetId) {
		this.upGradeSetId = upGradeSetId;
	}

	public int getUpGroupMoney() {
		return upGroupMoney;
	}

	public void setUpGroupMoney(int upGroupMoney) {
		this.upGroupMoney = upGroupMoney;
	}


	public int getUpLcScore() {
		return upLcScore;
	}

	public void setUpLcScore(int upLcScore) {
		this.upLcScore = upLcScore;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getMeRetailMoney() {
		return meRetailMoney;
	}

	public void setMeRetailMoney(int meRetailMoney) {
		this.meRetailMoney = meRetailMoney;
	}

}
