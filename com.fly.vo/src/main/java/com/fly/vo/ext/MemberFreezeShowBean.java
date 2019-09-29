package com.fly.vo.ext;

import java.util.Date;

public class MemberFreezeShowBean {
    private String memberId;
    private String phone;
    private String inviteCode;
    private String nickName;
    private Date createDate;
    private Integer memberType;
    private String memberTypeStr;
    private String headImage;
    private Integer freezeType;
    private String freezeTypeStr;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getMemberType() {
		return memberType;
	}
	public void setMemberType(Integer memberType) {
		if(memberType==0){
			setMemberTypeStr("普通用户");
		}else if(memberType==1){
			setMemberTypeStr("团长");
		}else if(memberType==2){
			setMemberTypeStr("联创团长");
		}
		this.memberType = memberType;
	}
	public String getMemberTypeStr() {
		return memberTypeStr;
	}
	public void setMemberTypeStr(String memberTypeStr) {
		this.memberTypeStr = memberTypeStr;
	}
	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	public Integer getFreezeType() {
		return freezeType;
	}
	public void setFreezeType(Integer freezeType) {
		if(freezeType==0){
			setFreezeTypeStr("未冻结");
		}else if(freezeType==1){
			setFreezeTypeStr("冻结账户");
		}else if(freezeType==2){
			setFreezeTypeStr("冻结收益余额");
		}else if(freezeType==3){
			setFreezeTypeStr("冻结收益");
		}else if(freezeType==4){
			setFreezeTypeStr("冻结余额");
		}
		this.freezeType = freezeType;
	}
	public String getFreezeTypeStr() {
		return freezeTypeStr;
	}
	public void setFreezeTypeStr(String freezeTypeStr) {
		this.freezeTypeStr = freezeTypeStr;
	}
	
}
