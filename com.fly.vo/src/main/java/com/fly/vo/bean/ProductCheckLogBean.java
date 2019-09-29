package com.fly.vo.bean;

import java.util.Date;

public class ProductCheckLogBean {
  private String productId;
  private Integer checkStatus;
  private String remark;
  private String operator;
  private Date createDate;

  private String checkStatusStr;

  public String getCheckStatusStr() {
    return checkStatusStr;
  }

  public void setCheckStatusStr(String checkStatusStr) {
    this.checkStatusStr = checkStatusStr;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Integer getCheckStatus() {
    return checkStatus;
  }

  public void setCheckStatus(Integer checkStatus) {
    this.checkStatus = checkStatus;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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
