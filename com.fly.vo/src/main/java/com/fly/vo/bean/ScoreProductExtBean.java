package com.fly.vo.bean;

import java.util.Date;

public class ScoreProductExtBean {
  private String exchangeId;
  private String productId;
  private int exchangeSale;
  private int exchangeNumber;
  private int isShippingFree;
  private String  productName;
  private String  thumbUrl;
  private Date createDate;
  private Date updateDate;
  private int isDelete;
  private int status;
  private int rank;
  private int putaway;
  private String skuId;
  private  int consumeexp;
  private  int inventory;
  private int countInventory;//此商品的总库存

  public String getExchangeId() {
    return exchangeId;
  }

  public void setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
  }

  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public int getExchangeSale() {
    return exchangeSale;
  }

  public void setExchangeSale(int exchangeSale) {
    this.exchangeSale = exchangeSale;
  }

  public int getExchangeNumber() {
    return exchangeNumber;
  }

  public void setExchangeNumber(int exchangeNumber) {
    this.exchangeNumber = exchangeNumber;
  }

  public int getIsShippingFree() {
    return isShippingFree;
  }

  public void setIsShippingFree(int isShippingFree) {
    this.isShippingFree = isShippingFree;
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

  public int getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(int isDelete) {
    this.isDelete = isDelete;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getThumbUrl() {
    return thumbUrl;
  }

  public void setThumbUrl(String thumbUrl) {
    this.thumbUrl = thumbUrl;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public int getPutaway() {
    return putaway;
  }

  public void setPutaway(int putaway) {
    this.putaway = putaway;
  }

  public String getSkuId() {
    return skuId;
  }

  public void setSkuId(String skuId) {
    this.skuId = skuId;
  }

  public int getConsumeexp() {
    return consumeexp;
  }

  public void setConsumeexp(int consumeexp) {
    this.consumeexp = consumeexp;
  }

  public int getCountInventory() {
    return countInventory;
  }

  public void setCountInventory(int countInventory) {
    this.countInventory = countInventory;
  }

  public int getInventory() {
    return inventory;
  }

  public void setInventory(int inventory) {
    this.inventory = inventory;
  }
}
