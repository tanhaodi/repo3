package com.fly.vo.ext;

import com.fly.vo.bean.OrderDetailBean;

/**
 * Created by lenovo on 2017/2/21.
 */
public class OrderDetailBeanExt extends OrderDetailBean {
    private String productName;
    private String skuName;
    private String storeName;
    private String storeMemberId;
    private int virtual;

    public int getVirtual() {
        return virtual;
    }

    public void setVirtual(int virtual) {
        this.virtual = virtual;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreMemberId() {
        return storeMemberId;
    }

    public void setStoreMemberId(String storeMemberId) {
        this.storeMemberId = storeMemberId;
    }

}
