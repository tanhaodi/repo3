package com.fly.vo.bean;

public class OrderProfitMemberBean {
  private String orderId;
  private String orderCode;
  private long orderMoney;
  private String memberId;
  private Integer type;
  private long profitMoney;
  private Integer level;

  public long getOrderMoney() {
    return orderMoney;
  }

  public void setOrderMoney(long orderMoney) {
    this.orderMoney = orderMoney;
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

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public long getProfitMoney() {
    return profitMoney;
  }

  public void setProfitMoney(long profitMoney) {
    this.profitMoney = profitMoney;
  }

  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }
}
