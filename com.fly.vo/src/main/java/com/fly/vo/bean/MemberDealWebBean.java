package com.fly.vo.bean;

import java.util.Date;

public class MemberDealWebBean {
  private String dealId;
  private String dealCode;
  private Integer sortIndex;
  private Integer status;
  private String memberId;
  private String accountId;
  private long applyMoney;
  private long applyMonth;
  private Date applyDate;
  private long serviceChargeMoney;
  private long giveMoney;
  private long remainderMoney;
  private String checkUserId;
  private Date checkDate;
  private String giveUserId;
  private Date giveDate;
  private String giveInvoice;
  private Date createDate;
  private Date updateDate;
  private Integer deleteFlag;
  private String statusStr;

  private String userName;
  private String cardAccount;//卡号

  public String getStatusStr() {
    return statusStr;
  }

  public void setStatusStr(String statusStr) {
    this.statusStr = statusStr;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getCardAccount() {
    return cardAccount;
  }

  public void setCardAccount(String cardAccount) {
    this.cardAccount = cardAccount;
  }

  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }

  public String getDealCode() {
    return dealCode;
  }

  public void setDealCode(String dealCode) {
    this.dealCode = dealCode;
  }

  public Integer getSortIndex() {
    return sortIndex;
  }

  public void setSortIndex(Integer sortIndex) {
    this.sortIndex = sortIndex;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public long getApplyMoney() {
    return applyMoney;
  }

  public void setApplyMoney(long applyMoney) {
    this.applyMoney = applyMoney;
  }

  public long getApplyMonth() {
    return applyMonth;
  }

  public void setApplyMonth(long applyMonth) {
    this.applyMonth = applyMonth;
  }

  public Date getApplyDate() {
    return applyDate;
  }

  public void setApplyDate(Date applyDate) {
    this.applyDate = applyDate;
  }

  public long getServiceChargeMoney() {
    return serviceChargeMoney;
  }

  public void setServiceChargeMoney(long serviceChargeMoney) {
    this.serviceChargeMoney = serviceChargeMoney;
  }

  public long getGiveMoney() {
    return giveMoney;
  }

  public void setGiveMoney(long giveMoney) {
    this.giveMoney = giveMoney;
  }

  public long getRemainderMoney() {
    return remainderMoney;
  }

  public void setRemainderMoney(long remainderMoney) {
    this.remainderMoney = remainderMoney;
  }

  public String getCheckUserId() {
    return checkUserId;
  }

  public void setCheckUserId(String checkUserId) {
    this.checkUserId = checkUserId;
  }

  public String getGiveUserId() {
    return giveUserId;
  }

  public void setGiveUserId(String giveUserId) {
    this.giveUserId = giveUserId;
  }

  public Date getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(Date checkDate) {
    this.checkDate = checkDate;
  }



  public Date getGiveDate() {
    return giveDate;
  }

  public void setGiveDate(Date giveDate) {
    this.giveDate = giveDate;
  }

  public String getGiveInvoice() {
    return giveInvoice;
  }

  public void setGiveInvoice(String giveInvoice) {
    this.giveInvoice = giveInvoice;
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
