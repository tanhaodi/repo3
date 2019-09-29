package com.fly.vo.model;

import java.io.Serializable;
import java.util.Date;

/**
 * StoreFreightModel 店铺运费实体
 *
 * @author Geoffrey
 * @version 1.0
 */
public class StoreFreightModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String storeId;
    private String provinceId;
    private String province;
    private Integer initFreight = 600;
    private Integer addFreight = 300;
    private Date createDate;
    private Date updateDate;
    private Integer deleteFlag = 0;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Integer getInitFreight() {
        return initFreight;
    }

    public void setInitFreight(Integer initFreight) {
        this.initFreight = initFreight;
    }

    public Integer getAddFreight() {
        return addFreight;
    }

    public void setAddFreight(Integer addFreight) {
        this.addFreight = addFreight;
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

