package com.fly.vo.bean;

import com.fly.vo.enums.MemberProfitLevelEnums;
import com.fly.vo.enums.MemberProfitTypeEnums;

import java.util.Date;

/**
 * @author dlz
 */
public class MemberProfitBean {
  private String profitId;
  private String memberId;
  private int sortIndex;
  private int type;
  private String typeStr;
  private String orderId;
  private String orderMemberId;
  private String orderCode;
  private long orderMoney;
  private long profitMoney;
  private long unfreezeSumMoney;
  private long availableMoney;
  private long yibaoPaymentMney;
  private long changePaymentMoney;
  private long sumPaymentMoney;
  private long NoSettlementMoney; //未結算
  private Integer settlement;
  private String operator;
  private String remark;
  private int level;
  private String levelStr;
  private Date createDate;

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public long getNoSettlementMoney() {
    return NoSettlementMoney;
  }

  public void setNoSettlementMoney(long noSettlementMoney) {
    NoSettlementMoney = noSettlementMoney;
  }

  public long getYibaoPaymentMney() {
    return yibaoPaymentMney;
  }

  public void setYibaoPaymentMney(long yibaoPaymentMney) {
    this.yibaoPaymentMney = yibaoPaymentMney;
  }

  public long getChangePaymentMoney() {
    return changePaymentMoney;
  }

  public void setChangePaymentMoney(long changePaymentMoney) {
    this.changePaymentMoney = changePaymentMoney;
  }

  public long getSumPaymentMoney() {
    return sumPaymentMoney;
  }

  public void setSumPaymentMoney(long sumPaymentMoney) {
    this.sumPaymentMoney = sumPaymentMoney;
  }

  public Integer getSettlement() {
    return settlement;
  }

  public void setSettlement(Integer settlement) {
    this.settlement = settlement;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public String getProfitId() {
    return profitId;
  }

  public void setProfitId(String profitId) {
    this.profitId = profitId;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public int getSortIndex() {
    return sortIndex;
  }

  public void setSortIndex(int sortIndex) {
    this.sortIndex = sortIndex;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public String getTypeStr() {
    return MemberProfitTypeEnums.valueOf(getType()).getMsg();
  }

  public void setTypeStr(String typeStr) {
    this.typeStr = typeStr;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getOrderMemberId() {
    return orderMemberId;
  }

  public void setOrderMemberId(String orderMemberId) {
    this.orderMemberId = orderMemberId;
  }

  public String getOrderCode() {
    return orderCode;
  }

  public void setOrderCode(String orderCode) {
    this.orderCode = orderCode;
  }

  public long getOrderMoney() {
    return orderMoney;
  }

  public void setOrderMoney(long orderMoney) {
    this.orderMoney = orderMoney;
  }

  public long getProfitMoney() {
    return profitMoney;
  }

  public void setProfitMoney(long profitMoney) {
    this.profitMoney = profitMoney;
  }

  public long getUnfreezeSumMoney() {
    return unfreezeSumMoney;
  }

  public void setUnfreezeSumMoney(long unfreezeSumMoney) {
    this.unfreezeSumMoney = unfreezeSumMoney;
  }

  public long getAvailableMoney() {
    return availableMoney;
  }

  public void setAvailableMoney(long availableMoney) {
    this.availableMoney = availableMoney;
  }


  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public String getLevelStr() {
    return MemberProfitLevelEnums.valueOf(getLevel()).getMsg();
  }

  public void setLevelStr(String levelStr) {
    this.levelStr = levelStr;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }
}
