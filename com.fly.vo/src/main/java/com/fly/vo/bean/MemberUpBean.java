package com.fly.vo.bean;

public class MemberUpBean {

	private String memberId;
	private String referrerMemberId;
	private int memberType;
	private int type=0;//结算类型 0 上级 1 上级利益链
	private int level;
	private String phone;
	private String nickName;
	private String headImage;
	private String wechat;
	private String inviteCode;

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getReferrerMemberId() {
		return referrerMemberId;
	}
	public void setReferrerMemberId(String referrerMemberId) {
		this.referrerMemberId = referrerMemberId;
	}
	public int getMemberType() {
		return memberType;
	}
	public void setMemberType(int memberType) {
		this.memberType = memberType;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "MemberUpBean [memberId=" + memberId + ", referrerMemberId=" + referrerMemberId + ", memberType="
				+ memberType + ", type=" + type + ", level=" + level + ", phone=" + phone + "]";
	}
}
