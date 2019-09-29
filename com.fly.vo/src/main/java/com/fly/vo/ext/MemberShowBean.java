package com.fly.vo.ext;

import com.fly.vo.bean.MemberBean;
import com.fly.vo.enums.FreezeTypeEnums;
import com.fly.vo.enums.MemberTypeEnums;

/**
 * @Author: dlz
 * @Date: 2019/3/23 14:57
 * @Version 1.0
 */
public class MemberShowBean extends MemberBean {
    private String freezeTypeStr;
    private String memberTypeStr;
    protected String nickNameRef;
    protected String phoneRef;
    protected Long inviteCodeRef;
    protected String identityCardRef;
    protected String userNameRef;
    protected long changeMoney;//可提现余额
    protected long rechargeMoney;//可用充值零钱
    protected long availableMoney;//可用总余额

    public long getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(long rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public long getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(long availableMoney) {
        this.availableMoney = availableMoney;
    }

    public long getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(long changeMoney) {
        this.changeMoney = changeMoney;
    }

    public String getFreezeTypeStr() {
        return FreezeTypeEnums.valueOf(getFreezeType()).getMsg();
    }

    public void setFreezeTypeStr(String freezeTypeStr) {
        this.freezeTypeStr = freezeTypeStr;
    }

    public String getMemberTypeStr() {
        return MemberTypeEnums.valueOf(getMemberType()).getMsg();
    }

    public void setMemberTypeStr(String memberTypeStr) {
        this.memberTypeStr = memberTypeStr;
    }

    public String getNickNameRef() {
        return nickNameRef;
    }

    public void setNickNameRef(String nickNameRef) {
        this.nickNameRef = nickNameRef;
    }

    public String getPhoneRef() {
        return phoneRef;
    }

    public void setPhoneRef(String phoneRef) {
        this.phoneRef = phoneRef;
    }

    public Long getInviteCodeRef() {
        return inviteCodeRef;
    }

    public void setInviteCodeRef(Long inviteCodeRef) {
        this.inviteCodeRef = inviteCodeRef;
    }

    public String getIdentityCardRef() {
        return identityCardRef;
    }

    public void setIdentityCardRef(String identityCardRef) {
        this.identityCardRef = identityCardRef;
    }

    public String getUserNameRef() {
        return userNameRef;
    }

    public void setUserNameRef(String userNameRef) {
        this.userNameRef = userNameRef;
    }
}
