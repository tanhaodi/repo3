package com.fly.vo.bean;

import java.util.Date;

/**
 * Created by 李冠 on 2018/7/24 15:56
 */
public class EnjoyMoneyScrenBean {

    private String did;
    private int enjoyType;
    private int typeId;
    private String code;
    private String inviteCode;
    private String nickName;
    private String phone;
    private long orderMoney;
    private long profitMoney;
    private Date createDate;
    private String typeName;
    private int status;
    private String statusStr;
    private String memberId;

  
	public int getEnjoyType() {
		return enjoyType;
	}

	public void setEnjoyType(int enjoyType) {
		this.enjoyType = enjoyType;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        if(phone!=null&&phone!=""&&phone.length()>7){
            phone=phone.substring(0, 3)+"****"+phone.substring(7);
        }
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(long orderMoney) {
        this.orderMoney = orderMoney;
    }

    public long getProfitMoney() {
        return profitMoney;
    }

    public void setProfitMoney(long profitMoney) {
        this.profitMoney = profitMoney;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
