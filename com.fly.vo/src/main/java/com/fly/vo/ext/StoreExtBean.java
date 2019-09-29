package com.fly.vo.ext;

import com.fly.vo.bean.RefundAddressBean;
import com.fly.vo.bean.StoreBean;

import java.util.List;

public class StoreExtBean extends StoreBean {

    private Integer erpStatus;//店铺是否关联erp

    private String categoryId;//类目id

    private String categoryName;//类目名称

    private String account;

    private String password;

    private String followUpId;

    private String followUpName;//跟进人账号

    private String followUpPhone;//跟进人电话

    private String memberName; //会员名字

    private String memberPhone;//会员电话

    private String memberIdentityCard;//会员身份证

    private long sumPaymentMoney;//总货款

    private String userId;

    private  Integer ybType;

    private Integer ybStatus;

    public Integer getYbStatus() {
        return ybStatus;
    }

    public void setYbStatus(Integer ybStatus) {
        this.ybStatus = ybStatus;
    }

    public Integer getYbType() {
        return ybType;
    }

    public void setYbType(Integer ybType) {
        this.ybType = ybType;
    }

    public long getSumPaymentMoney() {
        return sumPaymentMoney;
    }

    public void setSumPaymentMoney(long sumPaymentMoney) {
        this.sumPaymentMoney = sumPaymentMoney;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberIdentityCard() {
        return memberIdentityCard;
    }

    public void setMemberIdentityCard(String memberIdentityCard) {
        this.memberIdentityCard = memberIdentityCard;
    }

    public String getFollowUpPhone() {
        return followUpPhone;
    }

    public void setFollowUpPhone(String followUpPhone) {
        this.followUpPhone = followUpPhone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private List<RefundAddressBean>  list ;

    public List<RefundAddressBean> getList() {
        return list;
    }

    public void setList(List<RefundAddressBean> list) {
        this.list = list;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getErpStatus() {
        return erpStatus;
    }

    public void setErpStatus(Integer erpStatus) {
        this.erpStatus = erpStatus;
    }

    public String getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId;
    }

    public String getFollowUpName() {
        return followUpName;
    }

    public void setFollowUpName(String followUpName) {
        this.followUpName = followUpName;
    }
}
