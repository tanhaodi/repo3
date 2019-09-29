package com.fly.vo.bean;

public class MemberProfitTotalBean {
  private String memberId;
  private Long profitSumMoney;
  private Long freezeSumMoney;
  private Long indexNumber;
  private long inviteCode;
  private String phone;
  private Integer memberType=0;
  private String memberTypeStr;
  private String nickName;


  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public Long getProfitSumMoney() {
    return profitSumMoney;
  }

  public void setProfitSumMoney(Long profitSumMoney) {
    this.profitSumMoney = profitSumMoney;
  }

  public Long getFreezeSumMoney() {
    return freezeSumMoney;
  }

  public void setFreezeSumMoney(Long freezeSumMoney) {
    this.freezeSumMoney = freezeSumMoney;
  }

  public Long getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(Long indexNumber) {
    this.indexNumber = indexNumber;
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
