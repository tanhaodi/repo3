package com.fly.vo.model;

import java.lang.reflect.Member;

public class MemberModel {

    private String memberId;

    private String inviteCode;

    private String phone;

    private Integer score;//积分

    private long profitMoney;//一级分销 二级分销

    private long achivementMonwey;//业绩

    private long hierarchyMoney;//成绩差价

    private MemberModel upOneLevel;//上级

    private MemberModel upTwoLevel;//上上级

    private MemberModel groupModel;//团长

    private MemberModel lcModel;//联创团长


    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public long getProfitMoney() {
        return profitMoney;
    }

    public void setProfitMoney(long profitMoney) {
        this.profitMoney = profitMoney;
    }

    public long getAchivementMonwey() {
        return achivementMonwey;
    }

    public void setAchivementMonwey(long achivementMonwey) {
        this.achivementMonwey = achivementMonwey;
    }

    public long getHierarchyMoney() {
        return hierarchyMoney;
    }

    public void setHierarchyMoney(long hierarchyMoney) {
        this.hierarchyMoney = hierarchyMoney;
    }

    public MemberModel getUpOneLevel() {
        return upOneLevel;
    }

    public void setUpOneLevel(MemberModel upOneLevel) {
        this.upOneLevel = upOneLevel;
    }

    public MemberModel getUpTwoLevel() {
        return upTwoLevel;
    }

    public void setUpTwoLevel(MemberModel upTwoLevel) {
        this.upTwoLevel = upTwoLevel;
    }

    public MemberModel getGroupModel() {
        return groupModel;
    }

    public void setGroupModel(MemberModel groupModel) {
        this.groupModel = groupModel;
    }

    public MemberModel getLcModel() {
        return lcModel;
    }

    public void setLcModel(MemberModel lcModel) {
        this.lcModel = lcModel;
    }
}
