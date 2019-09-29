package com.fly.vo.ext;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.google.common.collect.Lists;

public class SysUserInfoBean implements Serializable{

	private static long serialVersionUID = 2202752014307578407L;
	
	private String userId;
	private String account;
	private String email;
	private String userName;
	private String qq;
	private String phone;
	private int userType;
	private int status;
	private long roleId;
	private List<MenuRuleBean> ruleList = Lists.newArrayList();
	private Date createDate;
	private int deleteFlag;

	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public List<MenuRuleBean> getRuleList() {
		return ruleList;
	}
	public void setRuleList(List<MenuRuleBean> ruleList) {
		this.ruleList = ruleList;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
}
