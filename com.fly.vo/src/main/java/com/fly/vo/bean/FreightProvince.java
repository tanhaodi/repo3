package com.fly.vo.bean;

import java.util.Date;

public class FreightProvince {

    private String freightProvinceId;

    private String freightId;

    private String provinceId ;

    private Integer firstCondition;
    private String firstConditionStr;

    private long firstFreight;

    private String firstFreightStr;

    private Integer continueCondition;
    private String continueConditionStr;

    private long continueFreight;

    private String continueFreightStr;

    private Date createDate;

    private Date updateDate;

    private int deleteFlag;

    public String getFirstConditionStr() {
        return firstConditionStr;
    }

    public void setFirstConditionStr(String firstConditionStr) {
        this.firstConditionStr = firstConditionStr;
    }

    public String getContinueConditionStr() {
        return continueConditionStr;
    }

    public void setContinueConditionStr(String continueConditionStr) {
        this.continueConditionStr = continueConditionStr;
    }

    public String getFirstFreightStr() {
        return firstFreightStr;
    }

    public void setFirstFreightStr(String firstFreightStr) {
        this.firstFreightStr = firstFreightStr;
    }

    public String getContinueFreightStr() {
        return continueFreightStr;
    }

    public void setContinueFreightStr(String continueFreightStr) {
        this.continueFreightStr = continueFreightStr;
    }

    public String getFreightProvinceId() {
        return freightProvinceId;
    }

    public void setFreightProvinceId(String freightProvinceId) {
        this.freightProvinceId = freightProvinceId;
    }

    public String getFreightId() {
        return freightId;
    }

    public void setFreightId(String freightId) {
        this.freightId = freightId;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getFirstCondition() {
        return firstCondition;
    }

    public void setFirstCondition(Integer firstCondition) {
        this.firstCondition = firstCondition;
    }

    public long getFirstFreight() {
        return firstFreight;
    }

    public void setFirstFreight(long firstFreight) {
        this.firstFreight = firstFreight;
    }

    public Integer getContinueCondition() {
        return continueCondition;
    }

    public void setContinueCondition(Integer continueCondition) {
        this.continueCondition = continueCondition;
    }

    public long getContinueFreight() {
        return continueFreight;
    }

    public void setContinueFreight(long continueFreight) {
        this.continueFreight = continueFreight;
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
}
