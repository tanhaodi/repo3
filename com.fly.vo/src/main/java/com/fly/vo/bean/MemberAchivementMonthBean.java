package com.fly.vo.bean;

import java.util.Date;

/**
 * @author dlz
 */
public class MemberAchivementMonthBean {
  private String memberId;
  private long month;
  private long monthTotalRetailMoney;
  private long monthMeSumMoney;
  private Date createDate;

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public long getMonth() {
    return month;
  }

  public void setMonth(long month) {
    this.month = month;
  }

  public long getMonthTotalRetailMoney() {
    return monthTotalRetailMoney;
  }

  public void setMonthTotalRetailMoney(long monthTotalRetailMoney) {
    this.monthTotalRetailMoney = monthTotalRetailMoney;
  }

  public long getMonthMeSumMoney() {
    return monthMeSumMoney;
  }

  public void setMonthMeSumMoney(long monthMeSumMoney) {
    this.monthMeSumMoney = monthMeSumMoney;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
}
