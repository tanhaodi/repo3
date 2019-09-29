package com.fly.vo.bean;

import java.util.Date;

/**
 * @Author: dlz
 * @Date: 2019/3/13 10:39
 * @Version 1.0
 */
public class CategoryBrandBean {
  private String categoryBrandId;
  private String categoryId;
  private String brandId;
  private int deleteFlag;
  private Date createDate;
  private Date updateDate;

  public String getCategoryBrandId() {
    return categoryBrandId;
  }

  public void setCategoryBrandId(String categoryBrandId) {
    this.categoryBrandId = categoryBrandId;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public int getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
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
