package com.fly.vo.bean;

import java.util.Date;

public class MaintainMemberLogBean {
  private String logId;
  private String phone;
  private long maintainType;
  private String oldContent;
  private String newContent;
  private String reason;
  private String opreation;
  private Date opreationDate;



  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public long getMaintainType() {
    return maintainType;
  }

  public void setMaintainType(long maintainType) {
    this.maintainType = maintainType;
  }

  public String getOldContent() {
    return oldContent;
  }

  public void setOldContent(String oldContent) {
    this.oldContent = oldContent;
  }

  public String getNewContent() {
    return newContent;
  }

  public void setNewContent(String newContent) {
    this.newContent = newContent;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public String getOpreation() {
    return opreation;
  }

  public void setOpreation(String opreation) {
    this.opreation = opreation;
  }

  public Date getOpreationDate() {
    return opreationDate;
  }

  public void setOpreationDate(Date opreationDate) {
    this.opreationDate = opreationDate;
  }
}
