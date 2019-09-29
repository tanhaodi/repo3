package com.fly.vo.bean;

import java.util.Date;

public class DealSetBean {
  /**
   *
   */
  private int dealSetId;
  /**
   * 如果是定额手续费，则是金额，如果是百分比手续费，则为百分率 如为0则费率失效
   */
  private String rate;
  /**
   *  0 不启用 1 启用
   */
  private int status;
  /**
   * 0 定额 1 百分率
   */
  private int type;
  /**
   * 两次申请提现相隔天数
   */
  private int separateDay;
  /**
   * 最小提现金额
   */
  private long minMoney;
  private String remark;
  private Date createDate;
  private Date updateDate;

  public int getDealSetId() {
    return dealSetId;
  }

  public void setDealSetId(int dealSetId) {
    this.dealSetId = dealSetId;
  }

  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getSeparateDay() {
    return separateDay;
  }

  public void setSeparateDay(int separateDay) {
    this.separateDay = separateDay;
  }

  public long getMinMoney() {
    return minMoney;
  }

  public void setMinMoney(long minMoney) {
    this.minMoney = minMoney;
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
}
