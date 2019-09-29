package com.fly.vo.bean;

import java.util.Date;

public class ApplicationPayTypeBean {
    protected String applicationPayModeId;        //支付方式ID
    protected String applicationTypeId;            //应用Id
    protected Integer payType;                      //应用类型
    protected String payTypeStr;
    protected Integer type;                        //应用类型
    protected String typeStr;
    protected Integer status;                            //状态
    protected Date createDate;                        //创建时间
    protected Date updateDate;                        //修改时间

    public String getApplicationPayModeId() {
        return applicationPayModeId;
    }

    public void setApplicationPayModeId(String applicationPayModeId) {
        this.applicationPayModeId = applicationPayModeId;
    }

    public String getApplicationTypeId() {
        return applicationTypeId;
    }

    public void setApplicationTypeId(String applicationTypeId) {
        this.applicationTypeId = applicationTypeId;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayTypeStr() {
        return payTypeStr;
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
