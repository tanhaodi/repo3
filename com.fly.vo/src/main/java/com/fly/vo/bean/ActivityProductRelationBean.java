package com.fly.vo.bean;

import java.util.Date;

public class ActivityProductRelationBean {
  private Integer activityId;
  private String productId;
  private Integer maxAmount;
  private Integer sales;
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

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Integer getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Integer maxAmount) {
    this.maxAmount = maxAmount;
  }

  public Integer getSales() {
    return sales;
  }

  public void setSales(Integer sales) {
    this.sales = sales;
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
