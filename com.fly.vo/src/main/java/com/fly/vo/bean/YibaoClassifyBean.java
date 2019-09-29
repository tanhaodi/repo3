package com.fly.vo.bean;

import java.util.Date;

/**
 * @author dlz
 */
public class YibaoClassifyBean {
  private String classifyNo;
  private String classifyName;
  private String parentClassifyNo;
  private Date createDate;
  private Date updateDate;
  private int deleteFlag;

  public String getClassifyNo() {
    return classifyNo;
  }

  public void setClassifyNo(String classifyNo) {
    this.classifyNo = classifyNo;
  }

  public String getClassifyName() {
    return classifyName;
  }

  public void setClassifyName(String classifyName) {
    this.classifyName = classifyName;
  }

  public String getParentClassifyNo() {
    return parentClassifyNo;
  }

  public void setParentClassifyNo(String parentClassifyNo) {
    this.parentClassifyNo = parentClassifyNo;
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
