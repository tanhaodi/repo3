package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class MemberBean extends MemberBeanRedis implements Serializable {
    private static final long serialVersionUID = -627467419050144511L;

    private long incId;
    private String email;
    private String referrerMemberId;
    private String password;
    private String salt;
    private Integer freezeType=0;
    private Date freezeDate;
    private String freezeReason;
    @JsonIgnore
    private Date updateDate;
    @JsonIgnore
    private Integer deleteFlag;
    
    private String openId;

    public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public long getIncId() {
        return incId;
    }

    public void setIncId(long incId) {
        this.incId = incId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReferrerMemberId() {
        return referrerMemberId;
    }

    public void setReferrerMemberId(String referrerMemberId) {
        this.referrerMemberId = referrerMemberId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getFreezeType() {
        return freezeType;
    }

    public void setFreezeType(Integer freezeType) {
        this.freezeType = freezeType;
    }

    public Date getFreezeDate() {
        return freezeDate;
    }

    public void setFreezeDate(Date freezeDate) {
        this.freezeDate = freezeDate;
    }

    public String getFreezeReason() {
        return freezeReason;
    }

    public void setFreezeReason(String freezeReason) {
        this.freezeReason = freezeReason;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @JsonIgnore()
    public String getCredentialsSalt() {
        return phone + salt;
    }

	@Override
	public String toString() {
		return "MemberBean [incId=" + incId + ", email=" + email + ", referrerMemberId=" + referrerMemberId
				+ ", password=" + password + ", salt=" + salt + ", freezeType=" + freezeType + ", freezeDate="
				+ freezeDate + ", freezeReason=" + freezeReason + ", updateDate=" + updateDate + ", deleteFlag="
				+ deleteFlag + "]";
	}


}
