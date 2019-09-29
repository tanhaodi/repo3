package com.fly.vo.bean;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class ProductSpecBean {

  private  String parentName;

  private String specId;
  private String specName;
  private String parentSpecId;
  private String storeId;
  @JsonIgnore
  private Date createDate;
  @JsonIgnore
  private Date updateDate;
  @JsonIgnore
  private int deleteFlag;

  private Integer type;//1 一级父规格 2 二级父规格

  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public String getSpecId() {
    return specId;
  }

  public void setSpecId(String specId) {
    this.specId = specId;
  }

  public String getSpecName() {
    return specName;
  }

  public void setSpecName(String specName) {
    this.specName = specName;
  }

  public String getParentSpecId() {
    return parentSpecId;
  }

  public void setParentSpecId(String parentSpecId) {
    this.parentSpecId = parentSpecId;
  }

  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
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

  public int getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
  }
}
