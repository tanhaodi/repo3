package com.fly.vo.bean;

import java.util.Date;

/**
 * @author dlz
 */
public class MemberTypeChangeLogBean {
  private String memberId;
  private int oldMemberType;
  private String oldMemberTypeName;
  private int newMemberType;
  private String newMemberTypeName;
  private int type;
  private String typeName;
  private String remark;
  private Date createDate;

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public int getOldMemberType() {
    return oldMemberType;
  }

  public void setOldMemberType(int oldMemberType) {
  if(oldMemberType==0){
		oldMemberTypeName="普通用户";
	}else if(oldMemberType==1){
		oldMemberTypeName="团长";
	}else if(oldMemberType==2){
		oldMemberTypeName="联创团长";
	}
    this.oldMemberType = oldMemberType;
  }

  public int getNewMemberType() {
    return newMemberType;
  }

  public void setNewMemberType(int newMemberType) {
  if(newMemberType==0){
	  newMemberTypeName="普通用户";
	}else if(newMemberType==1){
		newMemberTypeName="团长";
	}else if(newMemberType==2){
		newMemberTypeName="联创团长";
	}
    this.newMemberType = newMemberType;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
	if(type==0){
		typeName="升级";
	}else if(type==1){
		typeName="管理员调整";
	}  
    this.type = type;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

	public String getOldMemberTypeName() {
		return oldMemberTypeName;
	}
	
	public String getNewMemberTypeName() {
		return newMemberTypeName;
	}
	
	public String getTypeName() {
		return typeName;
	}
  
}
