package com.fly.vo.bean;

import java.util.Date;


/**
 * @author Administrator
 */
public class PageConfigBean {
  private String pageId;
  private String configId;
  private String page;
  /**
   * 备注
   */
  private String remarks;
  /**
   * 页面显示开始时间
   */
  private Date startDate;
  /**
   * 页面显示结束时间
   */
  private Date endDate;
  /**
   *是否应用（0、否，1、是）
   */
  private int status;
  /**
   *操作人
   */
  private String operator;
  /**
   *
   */
  private Date createDate;
  private Date updateDate;
  private int deleteFlag;

  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  public String getConfigId() {
    return configId;
  }

  public void setConfigId(String configId) {
    this.configId = configId;
  }

  public String getPage() {
    return page;
  }

  public void setPage(String page) {
    this.page = page;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
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

  public int getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
  }
}
