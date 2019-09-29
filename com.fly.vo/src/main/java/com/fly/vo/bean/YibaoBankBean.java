package com.fly.vo.bean;

/**
 * @author dlz
 */
public class YibaoBankBean {
  private Long bankId;
  private String bankName;
  private String bankCode;
  private Long deleteFlag;

  public Long getBankId() {
    return bankId;
  }

  public void setBankId(Long bankId) {
    this.bankId = bankId;
  }

  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public Long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }
}
