package com.fly.vo.model;

import com.fly.vo.bean.MemberDealBean;
import com.fly.vo.bean.MemberDealWebBean;

import java.util.List;

/**
 * Created by lenovo on 2017/3/18.
 */
public class MemberDealInfoVo extends MemberDealWebBean {
    private String userName;
    private String phone;
    private String nickName;
    private String inviteCode;
    private String identityCard;

    private String bankAccount;//银行卡
    private String bankUserName;//持卡人
    private String bankPhone;//持卡人号码
    private String bankName;//银行名称


    private String bankcardArea;
    private String bankcardAddress;
    private String bankcardProvince;
    private String bankcardCity;




    private String checkUserName;//审核人
    private String giveUserName;//打款人

    
    /**
     * 月累计提现金额
     */
    private long monthApplyMoney;

    /**
     * 本次打款金额
     */
    private long thisGiveMoney;


    private List<MemberDealInfoVo>  list ;

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public List<MemberDealInfoVo> getList() {
        return list;
    }

    public void setList(List<MemberDealInfoVo> list) {
        this.list = list;
    }

    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }




    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    public String getGiveUserName() {
        return giveUserName;
    }

    public void setGiveUserName(String giveUserName) {
        this.giveUserName = giveUserName;
    }


    /**
     * 本次查询打款总金额
     */
    private long queryGiveMoney = 0;

    /**
     * 本页查询打款总金额
     */
    private long pageGiveMoney = 0;


    public String getUserName() {
        return userName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getBankcardArea() {
        return bankcardArea;
    }

    public void setBankcardArea(String bankcardArea) {
        this.bankcardArea = bankcardArea;
    }

    public String getBankcardAddress() {
        return bankcardAddress;
    }

    public void setBankcardAddress(String bankcardAddress) {
        this.bankcardAddress = bankcardAddress;
    }

    public String getBankcardProvince() {
        return bankcardProvince;
    }

    public void setBankcardProvince(String bankcardProvince) {
        this.bankcardProvince = bankcardProvince;
    }

    public String getBankcardCity() {
        return bankcardCity;
    }

    public void setBankcardCity(String bankcardCity) {
        this.bankcardCity = bankcardCity;
    }

    public long getMonthApplyMoney() {
        return monthApplyMoney;
    }

    public void setMonthApplyMoney(long monthApplyMoney) {
        this.monthApplyMoney = monthApplyMoney;
    }

    public long getThisGiveMoney() {
        return thisGiveMoney;
    }

    public void setThisGiveMoney(long thisGiveMoney) {
        this.thisGiveMoney = thisGiveMoney;
    }

    public long getQueryGiveMoney() {
        return queryGiveMoney;
    }

    public void setQueryGiveMoney(long queryGiveMoney) {
        this.queryGiveMoney = queryGiveMoney;
    }

    public long getPageGiveMoney() {
        return pageGiveMoney;
    }

    public void setPageGiveMoney(long pageGiveMoney) {
        this.pageGiveMoney = pageGiveMoney;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }
}
