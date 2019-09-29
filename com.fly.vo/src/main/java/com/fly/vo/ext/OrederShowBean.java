package com.fly.vo.ext;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @Author: dlz
 * @Date: 2019/3/22 15:16
 * @Version 1.0
 */
public class OrederShowBean {
    protected String orderDetailId;
    protected String orderId;
    protected String productId;
    protected String productname;
    protected String storeId;
    protected String storeName;
    protected String skuId;
    protected Integer productType = 0;
    protected String skuCode;
    protected long quantity;
    protected long price;
    protected long weight;
    protected long costPrice;
    protected String productImage;
    protected Integer marketPrice;
    protected Integer salePrice;
    protected Integer groupPrice;
    protected Integer lcPrice;
    protected long platformProfit;
    protected Integer commentStatus=0;
    protected String properties;
    protected  String storeMemberId;
    protected  String specValues;
    protected  Integer freezeType;
    protected  String freezeTypeStr;


    public Integer getFreezeType() {
        return freezeType;
    }

    public void setFreezeType(Integer freezeType) {
        this.freezeType = freezeType;
    }

    public String getFreezeTypeStr() {
        return freezeTypeStr;
    }

    public void setFreezeTypeStr(String freezeTypeStr) {
        this.freezeTypeStr = freezeTypeStr;
    }

    public String getStoreMemberId() {
        return storeMemberId;
    }

    public void setStoreMemberId(String storeMemberId) {
        this.storeMemberId = storeMemberId;
    }

    public String getSpecValues() {
        return specValues;
    }

    public void setSpecValues(String specValues) {
        this.specValues = specValues;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(long costPrice) {
        this.costPrice = costPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Integer getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getGroupPrice() {
        return groupPrice;
    }

    public void setGroupPrice(Integer groupPrice) {
        this.groupPrice = groupPrice;
    }


    public Integer getLcPrice() {
        return lcPrice;
    }

    public void setLcPrice(Integer lcPrice) {
        this.lcPrice = lcPrice;
    }

    public long getPlatformProfit() {
        return platformProfit;
    }

    public void setPlatformProfit(long platformProfit) {
        this.platformProfit = platformProfit;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
}
