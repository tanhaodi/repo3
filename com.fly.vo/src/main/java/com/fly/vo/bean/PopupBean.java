package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.*;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.Initmodel
 * @company: Kanger
 * @Description: 弹窗广告
 * @Date: 2017/6/9 16:17
 */
public class PopupBean {
    @JsonIgnore
    private String id;
    private String name;
    private String backUrl;
    private String target;
    private String event;
    private String memberTypeList;
    @JsonIgnore
    private Integer type = 0;
    @JsonIgnore
    private Integer status;
    @JsonIgnore
    private Date startDate;
    @JsonIgnore
    private Date endDate;

    private String operator;
    @JsonIgnore
    private Date createDate;
    @JsonIgnore
    private Date updateDate;
    @JsonIgnore
    private Integer deleteFlag = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getMemberTypeList() {
		return memberTypeList;
	}

	public void setMemberTypeList(String memberTypeList) {
		this.memberTypeList = memberTypeList;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
