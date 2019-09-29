package com.fly.vo.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fly.vo.enums.ScoreTypeEnums;

public class MemberScoreLogBean {

    @JsonIgnore
    private String memberId;
    private Integer totalScore;
    private Integer score;
    private Integer type=0;
    private String typeStr;
    private String orderCode;
    private String operator;
    private String remark;
    private Date createDate;
    private Date updateDate;
    private Integer deleteFlag;
    private String nickName;

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

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeStr() {
        return ScoreTypeEnums.valueOf(getType()).getMsg();
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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


}
