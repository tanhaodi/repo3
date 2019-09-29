package com.fly.vo.bean;

import com.fly.vo.enums.MemberProfitLevelEnums;
import com.fly.vo.enums.MemberProfitTypeEnums;

import java.util.Date;

/**
 * @author dlz
 */
public class MemberFreezeBean {
  private String freezeId;
  private String memberId;
  private int sortIndex;
  private int type;
  private String typeStr;
  private String orderId;
  private String orderMemberId;
  private String orderCode;
  private long orderMoney;
  private long freezeProfitMoney;
  private long freezeSumMoney;
  private long profitSumMoney;
  private Date profitTime;
  private int status;
  private int level;
  private String levelStr;
  private Date createDate;
  private long profitMoney;

  public long getProfitMoney() {
	return profitMoney;
}

public void setProfitMoney(long profitMoney) {
	this.profitMoney = profitMoney;
}

public String getFreezeId() {
    return freezeId;
  }

  public void setFreezeId(String freezeId) {
    this.freezeId = freezeId;
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

  public long getFreezeProfitMoney() {
    return freezeProfitMoney;
  }

  public void setFreezeProfitMoney(long freezeProfitMoney) {
    this.freezeProfitMoney = freezeProfitMoney;
  }

  public long getFreezeSumMoney() {
    return freezeSumMoney;
  }

  public void setFreezeSumMoney(long freezeSumMoney) {
    this.freezeSumMoney = freezeSumMoney;
  }

  public long getProfitSumMoney() {
    return profitSumMoney;
  }

  public void setProfitSumMoney(long profitSumMoney) {
    this.profitSumMoney = profitSumMoney;
  }

  public Date getProfitTime() {
    return profitTime;
  }

  public void setProfitTime(Date profitTime) {
    this.profitTime = profitTime;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
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
