package com.fly.vo.bean;

import com.fly.vo.enums.PayTypeEnums;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/2/9 15:20
 */
public class APIOrderMainBean extends OrderMainBean {
    private String orderStatusStr;
    private String payTypeStr;
    protected String memberTypeStr;
    protected String orderTypeStr;
    protected String refundTypeStr;
    protected String expressStatusStr;
    protected  String orderFromStr;
    protected String provinceId;
    protected String cityId;
    protected String districtId;
    protected  String isProfitStr;

    protected  String refPhone;

    public String getRefPhone() {
        return refPhone;
    }

    public void setRefPhone(String refPhone) {
        this.refPhone = refPhone;
    }

    public String getIsProfitStr() {
        return isProfitStr;
    }

    public void setIsProfitStr(String isProfitStr) {
        this.isProfitStr = isProfitStr;
    }

    public String getOrderFromStr() {
        return orderFromStr;
    }

    public void setOrderFromStr(String orderFromStr) {
        this.orderFromStr = orderFromStr;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getOrderStatusStr() {
        return orderStatusStr;//OrderStatusEnums.valueOf(orderStatus).getMsg();
    }


    public void setOrderStatusStr(String orderStatusStr) {
        this.orderStatusStr = orderStatusStr;
    }


    public String getPayTypeStr() {
        return PayTypeEnums.valueOf(payType).getMsg();
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public String getMemberTypeStr() {
        return memberTypeStr;
    }

    public void setMemberTypeStr(String memberTypeStr) {
        this.memberTypeStr = memberTypeStr;
    }

    public String getOrderTypeStr() {
        return orderTypeStr;
    }

    public void setOrderTypeStr(String orderTypeStr) {
        this.orderTypeStr = orderTypeStr;
    }

    public String getRefundTypeStr() {
        return refundTypeStr;
    }

    public void setRefundTypeStr(String refundTypeStr) {
        this.refundTypeStr = refundTypeStr;
    }

    public String getExpressStatusStr() {
        return expressStatusStr;
    }

    public void setExpressStatusStr(String expressStatusStr) {
        this.expressStatusStr = expressStatusStr;
    }
}
