package com.fly.vo.bean;

import java.util.Date;

public class ActivityBean {
  private Integer activityId;
  private String actName;
  private Integer status;
  private Integer type;
  private Date startDate;
  private Date endDate;
  private String operator;
  private Date createDate;
  private Date updateDate;
  private Integer deleteFlag;

  public Integer getActivityId() {
    return activityId;
  }

  public void setActivityId(Integer activityId) {
    this.activityId = activityId;
  }

  public String getActName() {
    return actName;
  }

  public void setActName(String actName) {
    this.actName = actName;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
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

  public Integer getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
  }
}
