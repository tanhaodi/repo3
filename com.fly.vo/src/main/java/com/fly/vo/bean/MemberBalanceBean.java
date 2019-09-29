package com.fly.vo.bean;

import java.util.Date;

/**
 * @author dlz
 */
public class MemberBalanceBean {
  private String balanceId;
  private String balanceCode;
  private String memberId;
  private int type;
  private long money;
  private long availableMoney;
  private Date createDate;
  private String remark;

  public String getBalanceId() {
    return balanceId;
  }

  public void setBalanceId(String balanceId) {
    this.balanceId = balanceId;
  }

  public String getBalanceCode() {
    return balanceCode;
  }

  public void setBalanceCode(String balanceCode) {
    this.balanceCode = balanceCode;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
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

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
}
