package com.fly.vo.bean;

import com.fly.vo.ext.CategoryBrandRelationBean;

import java.util.Date;
import java.util.List;

/**
 * @Author: dlz
 * @Date: 2019/3/13 10:18
 * @Version 1.0
 */
public class BrandBean {
  private String brandId;
  private String brandName;
  private String logoUrl;
  /**
   *  待审核 1 审核通过 2 审核不通过
   */
  private int status;
  private List<CategoryBrandRelationBean> categoryBrandRelationBeans;
  private String brandApplyId;
  private String sortIndex;
  private int isView;
  private String storeId;
  private String remark;
  private Date createDate;
  private Date updateDate;
  private int deleteFlag;

  public String getBrandId() {
    return brandId;
  }

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getBrandApplyId() {
    return brandApplyId;
  }

  public void setBrandApplyId(String brandApplyId) {
    this.brandApplyId = brandApplyId;
  }

  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
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

  public int getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

  public List<CategoryBrandRelationBean> getCategoryBrandRelationBeans() {
    return categoryBrandRelationBeans;
  }

  public void setCategoryBrandRelationBeans(List<CategoryBrandRelationBean> categoryBrandRelationBeans) {
    this.categoryBrandRelationBeans = categoryBrandRelationBeans;
  }

  public String getSortIndex() {
    return sortIndex;
  }

  public void setSortIndex(String sortIndex) {
    this.sortIndex = sortIndex;
  }

  public int getIsView() {
    return isView;
  }

  public void setIsView(int isView) {
    this.isView = isView;
  }
}
