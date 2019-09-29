package com.fly.vo.bean;

import java.util.List;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 退款单新增
 * @Date: 2017/5/9 14:19
 */
public class GY_Add_RefundOrder extends GY_Sys_Params {

    public String refund_code;
    public Integer refund_type=0;
    public String refund_reason;
    public String payment_type_code;
    public String amount;

    private String type_code;
    private String shop_code;
    private String vip_code;
    private String note;
    private String trade_code;
    private String trade_platform_code;
    private List<GY_Refund_Order_Detail> Item_detail;

    public String getRefund_code() {
        return refund_code;
    }

    public void setRefund_code(String refund_code) {
        this.refund_code = refund_code;
    }

    public Integer getRefund_type() {
        return refund_type;
    }

    public void setRefund_type(Integer refund_type) {
        this.refund_type = refund_type;
    }

    public String getRefund_reason() {
        return refund_reason;
    }

    public void setRefund_reason(String refund_reason) {
        this.refund_reason = refund_reason;
    }

    public String getPayment_type_code() {
        return payment_type_code;
    }

    public void setPayment_type_code(String payment_type_code) {
        this.payment_type_code = payment_type_code;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType_code() {
        return type_code;
    }

    public void setType_code(String type_code) {
        this.type_code = type_code;
    }

    public String getShop_code() {
        return shop_code;
    }

    public void setShop_code(String shop_code) {
        this.shop_code = shop_code;
    }

    public String getVip_code() {
        return vip_code;
    }

    public void setVip_code(String vip_code) {
        this.vip_code = vip_code;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTrade_code() {
        return trade_code;
    }

    public void setTrade_code(String trade_code) {
        this.trade_code = trade_code;
    }

    public String getTrade_platform_code() {
        return trade_platform_code;
    }

    public void setTrade_platform_code(String trade_platform_code) {
        this.trade_platform_code = trade_platform_code;
    }

    public List<GY_Refund_Order_Detail> getItem_detail() {
        return Item_detail;
    }

    public void setItem_detail(List<GY_Refund_Order_Detail> item_detail) {
        Item_detail = item_detail;
    }
}
