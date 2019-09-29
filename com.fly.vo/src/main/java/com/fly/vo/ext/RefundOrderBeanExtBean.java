package com.fly.vo.ext;

import com.fly.vo.bean.MemberBean;
import com.fly.vo.bean.RefundOrderBean;

/**
 * Created by lenovo on 2017/3/10.
 */
public class RefundOrderBeanExtBean extends RefundOrderBean {
    private String storeName;

    private Integer isProfit;

    private String isProfitStr;

    private Integer orderType;

    private String orderTypeStr;

    private long payMoney;

    private String refundTypeStr;

    private String refundStatusStr;

    private String orderStatusStr;

    private MemberBean memberBean;

    public long getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(long payMoney) {
        this.payMoney = payMoney;
    }

    public MemberBean getMemberBean() {
        return memberBean;
    }

    public void setMemberBean(MemberBean memberBean) {
        this.memberBean = memberBean;
    }

    public Integer getIsProfit() {
        return isProfit;
    }

    public void setIsProfit(Integer isProfit) {
        this.isProfit = isProfit;
    }

    public String getIsProfitStr() {
        return isProfitStr;
    }

    public void setIsProfitStr(String isProfitStr) {
        this.isProfitStr = isProfitStr;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getOrderTypeStr() {
        return orderTypeStr;
    }

    public void setOrderTypeStr(String orderTypeStr) {
        this.orderTypeStr = orderTypeStr;
    }

    @Override
    public String getRefundTypeStr() {
        return refundTypeStr;
    }

    @Override
    public void setRefundTypeStr(String refundTypeStr) {
        this.refundTypeStr = refundTypeStr;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public String getRefundStatusStr() {
        return refundStatusStr;
    }

    @Override
    public void setRefundStatusStr(String refundStatusStr) {
        this.refundStatusStr = refundStatusStr;
    }

    public String getOrderStatusStr() {
        return orderStatusStr;
    }

    public void setOrderStatusStr(String orderStatusStr) {
        this.orderStatusStr = orderStatusStr;
    }
}
