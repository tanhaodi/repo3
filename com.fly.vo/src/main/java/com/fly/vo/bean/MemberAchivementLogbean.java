package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.Date;

/**
 * @author dlz
 */
public class MemberAchivementLogbean {
  private String memberId;
  @JsonIgnore
  private long orderMonth;
  private String orderId;
  private String orderCode;
  private String orderMemberId;
  private long orderMoney;
  private int type;
  private int level;
  private String levelStr;
  @JsonIgnore
  private long totalRetailMoney;
  @JsonIgnore
  private long meRetailMoney;


  /**
   * meRetailMoney+totalRetailMoney
   */
  private Long countRetail;
  @JsonIgnore
  private long monthTotalSumMoney;
  @JsonIgnore
  private long monthMeSumMoney;
  private Date createDate;
  private String remark;

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public long getOrderMonth() {
    return orderMonth;
  }

  public void setOrderMonth(long orderMonth) {
    this.orderMonth = orderMonth;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getOrderCode() {
    return orderCode;
  }

  public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
  }

  public String getOrderMemberId() {
    return orderMemberId;
  }

  public void setOrderMemberId(String orderMemberId) {
    this.orderMemberId = orderMemberId;
  }

  public long getOrderMoney() {
    return orderMoney;
  }

  public void setOrderMoney(long orderMoney) {
    this.orderMoney = orderMoney;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public long getTotalRetailMoney() {
    return totalRetailMoney;
  }

  public void setTotalRetailMoney(long totalRetailMoney) {
    this.totalRetailMoney = totalRetailMoney;
  }

  public long getMeRetailMoney() {
    return meRetailMoney;
  }

  public void setMeRetailMoney(long meRetailMoney) {
    this.meRetailMoney = meRetailMoney;
  }

  public long getMonthTotalSumMoney() {
    return monthTotalSumMoney;
  }

  public void setMonthTotalSumMoney(long monthTotalSumMoney) {
    this.monthTotalSumMoney = monthTotalSumMoney;
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

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getLevelStr() {
    return levelStr;
  }

  public void setLevelStr(String levelStr) {
    this.levelStr = levelStr;
  }

  public Long getCountRetail() {
    return countRetail;
  }

  public void setCountRetail(Long countRetail) {
    this.countRetail = countRetail;
  }
}
