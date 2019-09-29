package com.fly.vo.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/2/9 15:16
 */
public class APIOrderDetailProductBean extends OrderDetailBean {
    private String productName;
    private String storeId;
    private String storeName;
    private String sobotId;
    private String qq;
    private Integer storeType;
    private String Phone;
    private List<Map<String,Object>> customerIdList = new ArrayList<>();
    private List<APISpecInfoBean> specNames = new ArrayList<>();
    private String thumbUrl;


    public List<APISpecInfoBean> getSpecNames() {
		return specNames;
	}

	public void setSpecNames(List<APISpecInfoBean> specNames) {
		this.specNames = specNames;
	}

	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public String getSobotId() {
        return sobotId;
    }

    public void setSobotId(String sobotId) {
        this.sobotId = sobotId;
    }

    //赠品列表
    private List<APISkuPresentBean> presents=new ArrayList<>();
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String getStoreId() {
        return storeId;
    }

    @Override
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<APISkuPresentBean> getPresents() {
        return presents;
    }

    public void setPresents(List<APISkuPresentBean> presents) {
        this.presents = presents;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public List<Map<String,Object>> getCustomerIdList() {
        return customerIdList;
    }

    public void setCustomerIdList(List<Map<String,Object>> customerIdList) {
        this.customerIdList = customerIdList;
    }

}
