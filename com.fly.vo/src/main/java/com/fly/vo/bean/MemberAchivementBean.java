package com.fly.vo.bean;

import com.fly.vo.enums.MemberTypeEnums;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @author dlz
 * 总业绩
 */
public class MemberAchivementBean {
  private String memberId;
  /**
   * 我的销售金额
   */
  @JsonIgnore
  private long meRetailMoney;
  /**
   * 团队零售金额
   */
  @JsonIgnore
  private long totalRetailMoney;
  private long inviteCode;
  private String phone;
  private int memberType=0;
  private String memberTypeStr;
  private String nickName;
  /**
   * meRetailMoney+totalRetailMoney
   */
  private long totalCount;

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public long getMeRetailMoney() {
    return meRetailMoney;
  }

  public void setMeRetailMoney(long meRetailMoney) {
    this.meRetailMoney = meRetailMoney;
  }

  public long getTotalRetailMoney() {
    return totalRetailMoney;
  }

  public void setTotalRetailMoney(long totalRetailMoney) {
    this.totalRetailMoney = totalRetailMoney;
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

  public int getMemberType() {
    return memberType;
  }

  public void setMemberType(int memberType) {
    this.memberType = memberType;
  }

  public String getMemberTypeStr() {
    return MemberTypeEnums.valueOf(memberType).getMsg();
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

  public long getTotalCount() {
    return getMeRetailMoney()+getTotalRetailMoney();
  }

  public void setTotalCount(long totalCount) {
    this.totalCount = totalCount;
  }
}
