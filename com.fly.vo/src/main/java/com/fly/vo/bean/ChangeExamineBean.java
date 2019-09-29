package com.fly.vo.bean;


import java.util.Date;

public class ChangeExamineBean {
  private String changeExamineId;
  private String memberId;
  private int type;
  private long changeMoney;
  private int status;
  private String operator;
  private String remark;
  private Date createDate;
  private Date updateDate;

  public String getChangeExamineId() {
    return changeExamineId;
  }

  public void setChangeExamineId(String changeExamineId) {
    this.changeExamineId = changeExamineId;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public long getChangeMoney() {
    return changeMoney;
  }

  public void setChangeMoney(long changeMoney) {
    this.changeMoney = changeMoney;
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
}
