package com.fly.vo.bean;

import java.util.Date;

public class PopupWebBean {
  private Integer id;
  private String backUrl;
  private String name;
  private String target;
  private String event;
  private Integer type;
  private String memberTypeList;
  private Integer status;
  private Date startDate;
  private Date endDate;
  private String operator;
  private Date createDate;
  private Date updateDate;
  private Integer deleteFlag;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBackUrl() {
    return backUrl;
  }

  public void setBackUrl(String backUrl) {
    this.backUrl = backUrl;
  }

  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getMemberTypeList() {
    return memberTypeList;
  }

  public void setMemberTypeList(String memberTypeList) {
    this.memberTypeList = memberTypeList;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
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
