package com.fly.vo.ext;

import com.fly.vo.bean.MemberBean;

public class MemberExtBean  extends MemberBean{
    private long yibaoPaymentMoney;//易宝货款

    private long changePaymentMoney;//零钱货款

    private long monthPerformanceMoney;//月业绩

    private long teamPerformanceMoney;//团队业绩

    private int inviteCount;//邀请资格数量

    private int groupCount;//已邀请团长人数

    private String memberTypeStr;

    public int getInviteCount() {
        return inviteCount;
    }

    public void setInviteCount(int inviteCount) {
        this.inviteCount = inviteCount;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    public String getMemberTypeStr() {
        return memberTypeStr;
    }

    public void setMemberTypeStr(String memberTypeStr) {
        this.memberTypeStr = memberTypeStr;
    }

    public long getMonthPerformanceMoney() {
        return monthPerformanceMoney;
    }

    public void setMonthPerformanceMoney(long monthPerformanceMoney) {
        this.monthPerformanceMoney = monthPerformanceMoney;
    }

    public long getTeamPerformanceMoney() {
        return teamPerformanceMoney;
    }

    public void setTeamPerformanceMoney(long teamPerformanceMoney) {
        this.teamPerformanceMoney = teamPerformanceMoney;
    }

    public long getYibaoPaymentMoney() {
        return yibaoPaymentMoney;
    }

    public void setYibaoPaymentMoney(long yibaoPaymentMoney) {
        this.yibaoPaymentMoney = yibaoPaymentMoney;
    }

    public long getChangePaymentMoney() {
        return changePaymentMoney;
    }

    public void setChangePaymentMoney(long changePaymentMoney) {
        this.changePaymentMoney = changePaymentMoney;
    }
}
