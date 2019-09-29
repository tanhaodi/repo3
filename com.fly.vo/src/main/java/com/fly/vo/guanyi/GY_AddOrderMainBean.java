package com.fly.vo.guanyi;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 订单同步
 * @Date: 2017/4/29 16:04
 */
public class GY_AddOrderMainBean extends GY_Sys_Params{
    private String order_type_code;
    private Integer refund=0;
    private boolean cod=false;
    private String platform_code;
    private String shop_code;
    private String express_code="HTKY";
    private String warehouse_code;
    private String vip_code;
    private String vip_name;
    private String receiver_name;
    private String receiver_address;
    private String receiver_zip;
    private String receiver_mobile;
    private String receiver_phone;
    private String receiver_province;
    private String receiver_city;
    private String receiver_district;
    private String tag_code;
    private String deal_datetime;
    private String pay_datetime;
    private String business_man_code;
    private String post_fee;
    private String cod_fee;
    private String plan_delivery_date;
    private String buyer_memo;
    private String seller_memo;
    private String vipIdCard;
    private String vipRealName;
    private String vipEmail;
    private List<GY_AddOrderDetailBean> details;
    private List<GY_Payment_Info> payments=new ArrayList<>();
    private List<String> invoices=new ArrayList<>();

    public String getOrder_type_code() {
        return order_type_code;
    }

    public void setOrder_type_code(String order_type_code) {
        this.order_type_code = order_type_code;
    }

    public Integer getRefund() {
        return refund;
    }

    public void setRefund(Integer refund) {
        this.refund = refund;
    }

    public boolean isCod() {
        return cod;
    }

    public void setCod(boolean cod) {
        this.cod = cod;
    }

    public String getPlatform_code() {
        return platform_code;
    }

    public void setPlatform_code(String platform_code) {
        this.platform_code = platform_code;
    }

    public String getShop_code() {
        return shop_code;
    }

    public void setShop_code(String shop_code) {
        this.shop_code = shop_code;
    }

    public String getExpress_code() {
        return express_code;
    }

    public void setExpress_code(String express_code) {
        this.express_code = express_code;
    }

    public String getWarehouse_code() {
        return warehouse_code;
    }

    public void setWarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public String getVip_code() {
        return vip_code;
    }

    public void setVip_code(String vip_code) {
        this.vip_code = vip_code;
    }

    public String getVip_name() {
        return vip_name;
    }

    public void setVip_name(String vip_name) {
        this.vip_name = vip_name;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    public String getReceiver_zip() {
        return receiver_zip;
    }

    public void setReceiver_zip(String receiver_zip) {
        this.receiver_zip = receiver_zip;
    }

    public String getReceiver_mobile() {
        return receiver_mobile;
    }

    public void setReceiver_mobile(String receiver_mobile) {
        this.receiver_mobile = receiver_mobile;
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    public String getReceiver_province() {
        return receiver_province;
    }

    public void setReceiver_province(String receiver_province) {
        this.receiver_province = receiver_province;
    }

    public String getReceiver_city() {
        return receiver_city;
    }

    public void setReceiver_city(String receiver_city) {
        this.receiver_city = receiver_city;
    }

    public String getReceiver_district() {
        return receiver_district;
    }

    public void setReceiver_district(String receiver_district) {
        this.receiver_district = receiver_district;
    }

    public String getTag_code() {
        return tag_code;
    }

    public void setTag_code(String tag_code) {
        this.tag_code = tag_code;
    }

    public String getDeal_datetime() {
        return deal_datetime;
    }

    public void setDeal_datetime(String deal_datetime) {
        this.deal_datetime = deal_datetime;
    }

    public String getPay_datetime() {
        return pay_datetime;
    }

    public void setPay_datetime(String pay_datetime) {
        this.pay_datetime = pay_datetime;
    }

    public String getBusiness_man_code() {
        return business_man_code;
    }

    public void setBusiness_man_code(String business_man_code) {
        this.business_man_code = business_man_code;
    }

    public String getPost_fee() {
        return post_fee;
    }

    public void setPost_fee(String post_fee) {
        this.post_fee = post_fee;
    }

    public String getCod_fee() {
        return cod_fee;
    }

    public void setCod_fee(String cod_fee) {
        this.cod_fee = cod_fee;
    }

    public String getPlan_delivery_date() {
        return plan_delivery_date;
    }

    public void setPlan_delivery_date(String plan_delivery_date) {
        this.plan_delivery_date = plan_delivery_date;
    }

    public String getBuyer_memo() {
        return buyer_memo;
    }

    public void setBuyer_memo(String buyer_memo) {
        this.buyer_memo = buyer_memo;
    }

    public String getSeller_memo() {
        return seller_memo;
    }

    public void setSeller_memo(String seller_memo) {
        this.seller_memo = seller_memo;
    }

    public String getVipIdCard() {
        return vipIdCard;
    }

    public void setVipIdCard(String vipIdCard) {
        this.vipIdCard = vipIdCard;
    }

    public String getVipRealName() {
        return vipRealName;
    }

    public void setVipRealName(String vipRealName) {
        this.vipRealName = vipRealName;
    }

    public String getVipEmail() {
        return vipEmail;
    }

    public void setVipEmail(String vipEmail) {
        this.vipEmail = vipEmail;
    }

    public List<GY_AddOrderDetailBean> getDetails() {
        return details;
    }

    public void setDetails(List<GY_AddOrderDetailBean> details) {
        this.details = details;
    }

    public List<GY_Payment_Info> getPayments() {
        return payments;
    }

    public void setPayments(List<GY_Payment_Info> payments) {
        this.payments = payments;
    }

    public List<String> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<String> invoices) {
        this.invoices = invoices;
    }
}
