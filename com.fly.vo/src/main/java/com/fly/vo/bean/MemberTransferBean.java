package com.fly.vo.bean;

import com.fly.vo.enums.MemberTransferStatus;
import com.fly.vo.enums.MemberTransferType;

import java.util.Date;

/**
 * @author dlz
 */
public class MemberTransferBean {
  private String transferId;
  private String transferCode;
  private int terminal;
  private String memberId;
  private String outMemberId;
  private String inMemberId;
  private int transferType;
  private long transferMoney;
  private int status;
  private String remark;
  private long indexNumber;
  private long availableMoney;
  private long rechargeMoney;
  private Date createDate;
  private Date updateDate;
  private int deleteFlag;

  private String nickName;
  private String phone;
  private String inviteCode;
  private String transFerTypeStr;
  private String statusStr;


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getInviteCode() {
    return inviteCode;
  }

  public void setInviteCode(String inviteCode) {
    this.inviteCode = inviteCode;
  }

  public long getRechargeMoney() {
    return rechargeMoney;
  }

  public void setRechargeMoney(long rechargeMoney) {
    this.rechargeMoney = rechargeMoney;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getTransFerTypeStr() {
    return MemberTransferType.valueOf(transferType).getMsg();
  }

  public void setTransFerTypeStr(String transFerTypeStr) {
    this.transFerTypeStr = transFerTypeStr;
  }

  public String getStatusStr() {
    return MemberTransferStatus.valueOf(status).getMsg();
  }

  public void setStatusStr(String statusStr) {
    this.statusStr = statusStr;
  }

  public String getTransferId() {
    return transferId;
  }

  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }

  public String getTransferCode() {
    return transferCode;
  }

  public void setTransferCode(String transferCode) {
    this.transferCode = transferCode;
  }

  public int getTerminal() {
    return terminal;
  }

  public void setTerminal(int terminal) {
    this.terminal = terminal;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public String getOutMemberId() {
    return outMemberId;
  }

  public void setOutMemberId(String outMemberId) {
    this.outMemberId = outMemberId;
  }

  public String getInMemberId() {
    return inMemberId;
  }

  public void setInMemberId(String inMemberId) {
    this.inMemberId = inMemberId;
  }

  public int getTransferType() {
    return transferType;
  }

  public void setTransferType(int transferType) {
    this.transferType = transferType;
  }

  public long getTransferMoney() {
    return transferMoney;
  }

  public void setTransferMoney(long transferMoney) {
    this.transferMoney = transferMoney;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public long getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(long indexNumber) {
    this.indexNumber = indexNumber;
  }

  public long getAvailableMoney() {
    return availableMoney;
  }

  public void setAvailableMoney(long availableMoney) {
    this.availableMoney = availableMoney;
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
