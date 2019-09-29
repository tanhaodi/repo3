package com.fly.vo.bean;

import java.util.Date;

public class ExpressBean {
  private Integer expressId;
  private String expressName;
  private String expressNo;
  private String erpExpressNo;
  private Integer status;
  private String remark;
  private Date createDate;
  private Date updateDate;
  private Integer deleteFlag;

  public Integer getExpressId() {
    return expressId;
  }

  public void setExpressId(Integer expressId) {
    this.expressId = expressId;
  }

  public String getExpressName() {
    return expressName;
  }

  public void setExpressName(String expressName) {
    this.expressName = expressName;
  }

  public String getExpressNo() {
    return expressNo;
  }

  public void setExpressNo(String expressNo) {
    this.expressNo = expressNo;
  }

  public String getErpExpressNo() {
    return erpExpressNo;
  }

  public void setErpExpressNo(String erpExpressNo) {
    this.erpExpressNo = erpExpressNo;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
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
