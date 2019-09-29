package com.fly.vo.bean;

import com.fly.vo.enums.ClientEnums;
import com.fly.vo.enums.TerminalTypeEnums;

import java.util.Date;

/**
 * @author dlz
 */
public class TerminalSwitchBean {
  private int terminalSwitchId;
  private int terminal;
  private String terminalStr;
  private int switchType;
  private String switchTypeStr;
  private String remark;
  private int status;
  private String operator;
  private Date createDate;
  private Date updateDate;

  public int getTerminalSwitchId() {
    return terminalSwitchId;
  }

  public void setTerminalSwitchId(int terminalSwitchId) {
    this.terminalSwitchId = terminalSwitchId;
  }

  public int getTerminal() {
    return terminal;
  }

  public void setTerminal(int terminal) {
    this.terminal = terminal;
  }

  public int getSwitchType() {
    return switchType;
  }

  public void setSwitchType(int switchType) {
    this.switchType = switchType;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
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

  public String getSwitchTypeStr() {
    return TerminalTypeEnums.valueOf(getSwitchType()).getMsg();
  }

  public void setSwitchTypeStr(String switchTypeStr) {
    this.switchTypeStr = switchTypeStr;
  }

  public String getTerminalStr() {
    return ClientEnums.valueOf(getTerminal()).getMsg();
  }

  public void setTerminalStr(String terminalStr) {
    this.terminalStr = terminalStr;
  }
}
