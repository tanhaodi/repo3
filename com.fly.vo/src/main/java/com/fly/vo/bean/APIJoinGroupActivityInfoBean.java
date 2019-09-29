package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.fly.vo.enums.ActivityStatusEnums;

import java.util.Date;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: 微炬信息科技
 * @Description: 开团信息
 * @Date: 2017/10/31 18:01
 */
public class APIJoinGroupActivityInfoBean {
    private String orderId;
    private String memberId;
    private String headImage;
    private String nickName;
    private String activityId;
    private Integer activityStatus;
    private String activityStatusStr;
    private String groupCode;
    private String productId;
    private Long groupLeaderReturn;
    @JsonIgnore
    private Integer orderLifeCycle = 0;
    private Date expiresDate;
    private Integer joinMemberNum;
    private Integer createOrderNum;
    private Integer payOrderNum;
    private Date payDate;
    @JsonIgnore
    private Date createDate;
    @JsonIgnore
    private Date updateDate;
    @JsonIgnore
    private Integer deleteFlag = 0;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getActivityStatusStr() {
        return ActivityStatusEnums.valueOf(activityStatus).getMsg();
    }

    public void setActivityStatusStr(String activityStatusStr) {
        this.activityStatusStr = activityStatusStr;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Date getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(Date expiresDate) {
        this.expiresDate = expiresDate;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Long getGroupLeaderReturn() {
        return groupLeaderReturn;
    }

    public void setGroupLeaderReturn(Long groupLeaderReturn) {
        this.groupLeaderReturn = groupLeaderReturn;
    }

    public Integer getOrderLifeCycle() {
        return orderLifeCycle;
    }

    public void setOrderLifeCycle(Integer orderLifeCycle) {
        this.orderLifeCycle = orderLifeCycle;
    }

    public Integer getJoinMemberNum() {
        return joinMemberNum;
    }

    public void setJoinMemberNum(Integer joinMemberNum) {
        this.joinMemberNum = joinMemberNum;
    }

    public Integer getCreateOrderNum() {
        return createOrderNum;
    }

    public void setCreateOrderNum(Integer createOrderNum) {
        this.createOrderNum = createOrderNum;
    }

    public Integer getPayOrderNum() {
        return payOrderNum;
    }

    public void setPayOrderNum(Integer payOrderNum) {
        this.payOrderNum = payOrderNum;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
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
