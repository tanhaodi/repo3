package com.fly.vo.bean;

import java.util.Date;

public class RefundOrderLogBean {
  private String refundOrderLogId;
  private String orderId;
  private Integer refundStatus;
  private String operator;
  private String operateContent;
  private Date createDate;
  private Date updateDate;
  private Long deleteFlag;

  public String getRefundOrderLogId() {
    return refundOrderLogId;
  }

  public void setRefundOrderLogId(String refundOrderLogId) {
    this.refundOrderLogId = refundOrderLogId;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Integer getRefundStatus() {
    return refundStatus;
  }

  public void setRefundStatus(Integer refundStatus) {
    this.refundStatus = refundStatus;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public String getOperateContent() {
    return operateContent;
  }

  public void setOperateContent(String operateContent) {
    this.operateContent = operateContent;
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

  public Long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }
}
