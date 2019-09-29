package com.fly.vo.bean;

import java.util.Date;

public class SkuLogBean {
  private String productId;
  private String skuId;
  private Integer weight;
  private Integer unitType;
  private long costPrice;
  private long marketPrice;
  private long salePrice;
  private long groupPrice;
  private long lcPrice;
  private long platformProfit;
  private long firstProfit;
  private long secondProfit;
  private long saleCount;
  private Integer status;
  private String statusStr;
  private Integer stock;
  private String properties;
  private long deleteFlag;
  private String remark;
  private String operator;
  private Date createDate;


  public long getFirstProfit() {
    return firstProfit;
  }

  public void setFirstProfit(long firstProfit) {
    this.firstProfit = firstProfit;
  }

  public long getSecondProfit() {
    return secondProfit;
  }

  public void setSecondProfit(long secondProfit) {
    this.secondProfit = secondProfit;
  }

  public String getStatusStr() {
    return statusStr;
  }

  public void setStatusStr(String statusStr) {
    this.statusStr = statusStr;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public Integer getUnitType() {
    return unitType;
  }

  public void setUnitType(Integer unitType) {
    this.unitType = unitType;
  }

  public long getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(long costPrice) {
    this.costPrice = costPrice;
  }

  public long getMarketPrice() {
    return marketPrice;
  }

  public void setMarketPrice(long marketPrice) {
    this.marketPrice = marketPrice;
  }

  public long getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(long salePrice) {
    this.salePrice = salePrice;
  }

  public long getGroupPrice() {
    return groupPrice;
  }

  public void setGroupPrice(long groupPrice) {
    this.groupPrice = groupPrice;
  }



  public long getLcPrice() {
    return lcPrice;
  }

  public void setLcPrice(long lcPrice) {
    this.lcPrice = lcPrice;
  }

  public long getPlatformProfit() {
    return platformProfit;
  }

  public void setPlatformProfit(long platformProfit) {
    this.platformProfit = platformProfit;
  }

  public long getSaleCount() {
    return saleCount;
  }

  public void setSaleCount(long saleCount) {
    this.saleCount = saleCount;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

  public long getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(long deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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
}
