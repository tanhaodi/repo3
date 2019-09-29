package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @author: dlz
 * @Date: 2019/4/1 15:56
 * @Version 1.0
 */
public class MemberMoneyTotalBean {
  private String memberId;
  private Long availableMoney;
  @JsonIgnore
  private Long rechargeMoney;
  @JsonIgnore
  private Long yibaoPaymentMoney;
  @JsonIgnore
  private Long changePaymentMoney;
  @JsonIgnore
  private Long unfreezeMoney;

  private long sumPaymentMoney;
  @JsonIgnore
  private Long dealSumMoney;
  @JsonIgnore
  private Long paySumMoney;
  @JsonIgnore
  private Long trsinSumMoney;
  @JsonIgnore
  private Long trsoutSumMoney;
  private long inviteCode;
  private String phone;
  private Integer memberType=0;
  private String memberTypeStr;
  private String nickName;


  public long getSumPaymentMoney() {
    return sumPaymentMoney;
  }

  public void setSumPaymentMoney(long sumPaymentMoney) {
    this.sumPaymentMoney = sumPaymentMoney;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public Long getAvailableMoney() {
    return availableMoney;
  }

  public void setAvailableMoney(Long availableMoney) {
    this.availableMoney = availableMoney;
  }

  public Long getRechargeMoney() {
    return rechargeMoney;
  }

  public void setRechargeMoney(Long rechargeMoney) {
    this.rechargeMoney = rechargeMoney;
  }

  public Long getYibaoPaymentMoney() {
    return yibaoPaymentMoney;
  }

  public void setYibaoPaymentMoney(Long yibaoPaymentMoney) {
    this.yibaoPaymentMoney = yibaoPaymentMoney;
  }

  public Long getChangePaymentMoney() {
    return changePaymentMoney;
  }

  public void setChangePaymentMoney(Long changePaymentMoney) {
    this.changePaymentMoney = changePaymentMoney;
  }

  public Long getUnfreezeMoney() {
    return unfreezeMoney;
  }

  public void setUnfreezeMoney(Long unfreezeMoney) {
    this.unfreezeMoney = unfreezeMoney;
  }

  public Long getDealSumMoney() {
    return dealSumMoney;
  }

  public void setDealSumMoney(Long dealSumMoney) {
    this.dealSumMoney = dealSumMoney;
  }

  public Long getPaySumMoney() {
    return paySumMoney;
  }

  public void setPaySumMoney(Long paySumMoney) {
    this.paySumMoney = paySumMoney;
  }

  public Long getTrsinSumMoney() {
    return trsinSumMoney;
  }

  public void setTrsinSumMoney(Long trsinSumMoney) {
    this.trsinSumMoney = trsinSumMoney;
  }

  public Long getTrsoutSumMoney() {
    return trsoutSumMoney;
  }

  public void setTrsoutSumMoney(Long trsoutSumMoney) {
    this.trsoutSumMoney = trsoutSumMoney;
  }

  public long getInviteCode() {
    return inviteCode;
  }

  public void setInviteCode(long inviteCode) {
    this.inviteCode = inviteCode;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getMemberType() {
    return memberType;
  }

  public void setMemberType(Integer memberType) {
    this.memberType = memberType;
  }

  public String getMemberTypeStr() {
    return memberTypeStr;
  }

  public void setMemberTypeStr(String memberTypeStr) {
    this.memberTypeStr = memberTypeStr;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }
}
