package com.fly.vo.bean;

import javax.xml.crypto.Data;
import java.util.Date;

public class ActivityProductLogBean {
  private Integer activityId;
  private String productId;
  private Integer oldMaxAmount;
  private Integer newMaxAmount;
  private Integer oldSales;
  private Integer newSales;
  private Integer isDelete;
  private String operator;
  private Date createDate;



  private String productName;

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

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

  public Integer getOldMaxAmount() {
    return oldMaxAmount;
  }

  public void setOldMaxAmount(Integer oldMaxAmount) {
    this.oldMaxAmount = oldMaxAmount;
  }

  public Integer getNewMaxAmount() {
    return newMaxAmount;
  }

  public void setNewMaxAmount(Integer newMaxAmount) {
    this.newMaxAmount = newMaxAmount;
  }

  public Integer getOldSales() {
    return oldSales;
  }

  public void setOldSales(Integer oldSales) {
    this.oldSales = oldSales;
  }

  public Integer getNewSales() {
    return newSales;
  }

  public void setNewSales(Integer newSales) {
    this.newSales = newSales;
  }

  public Integer getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Integer isDelete) {
    this.isDelete = isDelete;
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
}
