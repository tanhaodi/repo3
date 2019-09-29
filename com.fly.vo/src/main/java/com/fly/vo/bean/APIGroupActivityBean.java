package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.Date;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.Initmodel
 * @company: 微炬信息科技
 * @Description: 团购活动控制表
 * @Date: 2017/10/31 10:02
 */
public class APIGroupActivityBean {
    private String activityId;
    private String title;
    private String rule;
    private Integer status = 0;
    private Integer orderLifeCycle = 24;
    private Integer joinCount = 0;
    private Integer joinMemberNum = 0;
    private Date startDate;
    private Date endDate;
    private Date memberCreteDate;
    @JsonIgnore
    private Date createDate;
    @JsonIgnore
    private Date updateDate;
    @JsonIgnore
    private Integer deleteFlag = 0;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderLifeCycle() {
        return orderLifeCycle;
    }

    public void setOrderLifeCycle(Integer orderLifeCycle) {
        this.orderLifeCycle = orderLifeCycle;
    }

    public Integer getJoinCount() {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount) {
        this.joinCount = joinCount;
    }

    public Integer getJoinMemberNum() {
        return joinMemberNum;
    }

    public void setJoinMemberNum(Integer joinMemberNum) {
        this.joinMemberNum = joinMemberNum;
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

    public Date getMemberCreteDate() {
        return memberCreteDate;
    }

    public void setMemberCreteDate(Date memberCreteDate) {
        this.memberCreteDate = memberCreteDate;
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
