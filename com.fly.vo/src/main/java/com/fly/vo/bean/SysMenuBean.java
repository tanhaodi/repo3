package com.fly.vo.bean;


import java.util.Date;

public class SysMenuBean {
  private Integer menuId;
  private Integer parentMenuId;
  private String menuName;
  private String menuUrl;
  private Integer menuSort;
  private Integer status;
  private String operator;
  private Date createDate;
  private Date updateDate;
  private Integer deleteFlag;

  private Integer type;

  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public Integer getParentMenuId() {
    return parentMenuId;
  }

  public void setParentMenuId(Integer parentMenuId) {
    this.parentMenuId = parentMenuId;
  }

  public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }

  public String getMenuUrl() {
    return menuUrl;
  }

  public void setMenuUrl(String menuUrl) {
    this.menuUrl = menuUrl;
  }

  public Integer getMenuSort() {
    return menuSort;
  }

  public void setMenuSort(Integer menuSort) {
    this.menuSort = menuSort;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
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

  public Integer getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(Integer deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }
}
