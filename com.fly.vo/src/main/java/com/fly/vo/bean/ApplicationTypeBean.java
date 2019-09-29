package com.fly.vo.bean;

import java.util.Date;

public class ApplicationTypeBean {
    protected String applicationTypeId;        //应用Id
    protected Integer type;                            //应用类型
    protected String typeStr;
    protected Integer status;                        //状态
    protected Date createDate;                    //创建时间
    protected Date updateDate;                    //修改时间

    public String getApplicationTypeId() {
        return applicationTypeId;
    }

    public void setApplicationTypeId(String applicationTypeId) {
        this.applicationTypeId = applicationTypeId;
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
