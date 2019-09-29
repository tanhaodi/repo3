package com.fly.vo.ext;

import java.util.Date;

/**
 * @Author: dlz
 * @Date: 2019/3/20 11:09
 * @Version 1.0
 */
public class OrederParam {
    /**
     *  0 关闭 1 待付款 2 待发货 3 已发货 4 已收货 5 退款中 6 退货中 7 退款完成 8 退货完成
     */
    Integer status;

    String orderCode;
    /**
     * 下单人手机号，下单人id
     */
        String keys;

    /**
     * 订单类型 0 普通订单 1 升级订单 2 采购订单
     */
    Integer orderType;
    /**
     * 店铺id
     */
    String storeId;
    /**
     * 收货人名称或收货人手机
     */
    String namePhone;
    /**
     * 快递号
     */
    String expressCode;
    /**
     * 支付类型
     *
     * 0 未支付 1 微信支付 2 支付宝 3 线下支付 4 系统代付 5 零钱支付 6 微信支付（易宝）7 支付宝支付（易宝）8 网银支付（易宝）9 快捷支付（易宝）10 分期支付（易宝马上金融）
     */
    Integer payType;

    String skuId;

    /**
     * 是否是店铺
     */
    Integer isStoer;

    /**
     * 订单开始时间
     */
    String startDate;

    /**
     * 订单结束时间
     */
    String endDate;

    /**
     * 是否大于三个月
     */
    Integer greaterTrimestral;

    String memberId;

    String phone;
    String contact;


    public Integer getStatus() {
        return status;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getIsStoer() {
        return isStoer;
    }

    public void setIsStoer(Integer isStoer) {
        this.isStoer = isStoer;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getGreaterTrimestral() {
        return greaterTrimestral;
    }

    public void setGreaterTrimestral(Integer greaterTrimestral) {
        this.greaterTrimestral = greaterTrimestral;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
