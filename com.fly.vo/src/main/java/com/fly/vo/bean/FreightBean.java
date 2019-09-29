package com.fly.vo.bean;

import java.util.Date;

public class FreightBean {
    private String freightId;

    private Integer freightNo;

    private String freightName;

    private Integer type;

    private Integer status;

    private Date  createDate;

    private Date updateDate;

    private int deleteFlag;


    public Integer getFreightNo() {
		return freightNo;
	}

	public void setFreightNo(Integer freightNo) {
		this.freightNo = freightNo;
	}

	public String getFreightId() {
        return freightId;
    }

    public void setFreightId(String freightId) {
        this.freightId = freightId;
    }


    public String getFreightName() {
        return freightName;
    }

    public void setFreightName(String freightName) {
        this.freightName = freightName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public int getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(int deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
