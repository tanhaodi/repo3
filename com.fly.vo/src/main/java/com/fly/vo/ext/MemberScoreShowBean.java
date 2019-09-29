package com.fly.vo.ext;

import com.fly.vo.bean.MemberScoreBean;
import com.fly.vo.enums.MemberTypeEnums;

/**
 * @Author: dlz
 * @Date: 2019/3/23 17:02
 * @Version 1.0
 */
public class MemberScoreShowBean  extends MemberScoreBean {
    private long inviteCode;
    private String phone;
    private int memberType=0;
    private String memberTypeStr;
    private String nickName;

    public long getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(long inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMemberType() {
        return memberType;
    }

    public void setMemberType(int memberType) {
        this.memberType = memberType;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMemberTypeStr() {
       return MemberTypeEnums.valueOf(getMemberType()).getMsg();
    }

    public void setMemberTypeStr(String memberTypeStr) {
        this.memberTypeStr = memberTypeStr;
    }
}
