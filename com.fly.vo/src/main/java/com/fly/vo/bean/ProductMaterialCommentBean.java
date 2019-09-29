package com.fly.vo.bean;

import java.util.Date;

public class ProductMaterialCommentBean {
  private String productMaterialCommentId;
  private String parentProductMaterialCommentId;
  private String memberId;
  private String commentMemberId;
  private String content;
  private String productMaterialId;
  private String productId;
  private Date createDate;
  private Date updateDate;
  private Integer deleteFlag;

  public String getParentProductMaterialCommentId() {
    return parentProductMaterialCommentId;
  }

  public void setParentProductMaterialCommentId(String parentProductMaterialCommentId) {
    this.parentProductMaterialCommentId = parentProductMaterialCommentId;
  }

  public String getProductMaterialCommentId() {
    return productMaterialCommentId;
  }

  public void setProductMaterialCommentId(String productMaterialCommentId) {
    this.productMaterialCommentId = productMaterialCommentId;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public String getCommentMemberId() {
    return commentMemberId;
  }

  public void setCommentMemberId(String commentMemberId) {
    this.commentMemberId = commentMemberId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getProductMaterialId() {
    return productMaterialId;
  }

  public void setProductMaterialId(String productMaterialId) {
    this.productMaterialId = productMaterialId;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
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
}
