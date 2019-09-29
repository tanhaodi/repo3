package com.fly.vo.guanyi;

import java.util.List;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/5/4 19:49
 */
public class GY_Get_Oder_Detail {

    private String code;//单据编号
    private String qty;//商品数量
    private String amount;//订单金额
    private String payment;//支付金额
    private String approve;//是否审核
    private String cod;//是否货到付款
    private String cancle;//是否取消
    private String vipIdCard;//身份证号;
    private String vipEmail;//电子邮箱
    private String vipRealName;//真实姓名
    private String accountStatus;//到账状态
    private String accountAmount;//到账金额
    private String assignState;//配货状态
    private String platform_code;//平台单号
    private String createtime;//创建时间
    private String modifytime;//修改时间
    private String dealtime;//拍单时间
    private String paytime;//支付时间
    private String shop_name;//店铺名称
    private String shop_code;//店铺代码
    private String warehouse_name;//仓库名称
    private String warehouse_code;//仓库代码
    private String express_name;//快递公司名称
    private String express_code;//快递公司代码
    private String vip_name;//会员名称
    private String vip_code;//会员代码
    private String receiver_name;//收货人姓名
    private String receiver_phone;//收货人电话
    private String receiver_mobile;//收货人手机
    private String receiver_zip;//收货邮编
    private String receiver_address;//收货地址
    private String receiver_area;//地区信息
    private String buyer_memo;//买家留言
    private String seller_memo;//卖家备注
    private String seller_memo_late;//二次备注
    private String post_fee;//物流费用
    private String cod_fee;//货到付款服务费
    private String discount_fee;//让利金额
    private String post_cost;//物流成本
    private String weight_origin;//标准重量
    private String payment_amount;//货款金额
    private String delivery_state;//发货状态 0-未发货1-部分发货2-全部发货
    private String order_type_name;//订单类型
    private String business_man;//业务员
    private String hold_info;//拦截信息
    private String platform_flag;//平台旗帜
    private String platform_trading_state;
    private String tax_amount;
    private String approveDate;//审核时间
    private String accountDate;//到账时间
    private String trade_tag_code;//订单标记代码
    private String trade_tag_name;//订单标记名称
    private String plan_delivery_date;//预计发货时间
    private Object details;//detail
    private Object payments;
    private Object invoices;
    private List<GY_Get_Order_Deliverys> deliverys;
    private String substitut_order;
    private String extend_memo;

    public String getExtend_memo() {
        return extend_memo;
    }

    public void setExtend_memo(String extend_memo) {
        this.extend_memo = extend_memo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCancle() {
        return cancle;
    }

    public void setCancle(String cancle) {
        this.cancle = cancle;
    }

    public String getVipIdCard() {
        return vipIdCard;
    }

    public void setVipIdCard(String vipIdCard) {
        this.vipIdCard = vipIdCard;
    }

    public String getVipEmail() {
        return vipEmail;
    }

    public void setVipEmail(String vipEmail) {
        this.vipEmail = vipEmail;
    }

    public String getVipRealName() {
        return vipRealName;
    }

    public void setVipRealName(String vipRealName) {
        this.vipRealName = vipRealName;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(String accountAmount) {
        this.accountAmount = accountAmount;
    }

    public String getAssignState() {
        return assignState;
    }

    public void setAssignState(String assignState) {
        this.assignState = assignState;
    }

    public String getPlatform_code() {
        return platform_code;
    }

    public void setPlatform_code(String platform_code) {
        this.platform_code = platform_code;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime;
    }

    public String getDealtime() {
        return dealtime;
    }

    public void setDealtime(String dealtime) {
        this.dealtime = dealtime;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_code() {
        return shop_code;
    }

    public void setShop_code(String shop_code) {
        this.shop_code = shop_code;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getWarehouse_code() {
        return warehouse_code;
    }

    public void setWarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public String getExpress_name() {
        return express_name;
    }

    public void setExpress_name(String express_name) {
        this.express_name = express_name;
    }

    public String getExpress_code() {
        return express_code;
    }

    public void setExpress_code(String express_code) {
        this.express_code = express_code;
    }

    public String getVip_name() {
        return vip_name;
    }

    public void setVip_name(String vip_name) {
        this.vip_name = vip_name;
    }

    public String getVip_code() {
        return vip_code;
    }

    public void setVip_code(String vip_code) {
        this.vip_code = vip_code;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_phone() {
        return receiver_phone;
    }

    public void setReceiver_phone(String receiver_phone) {
        this.receiver_phone = receiver_phone;
    }

    public String getReceiver_mobile() {
        return receiver_mobile;
    }

    public void setReceiver_mobile(String receiver_mobile) {
        this.receiver_mobile = receiver_mobile;
    }

    public String getReceiver_zip() {
        return receiver_zip;
    }

    public void setReceiver_zip(String receiver_zip) {
        this.receiver_zip = receiver_zip;
    }

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    public String getReceiver_area() {
        return receiver_area;
    }

    public void setReceiver_area(String receiver_area) {
        this.receiver_area = receiver_area;
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

    public String getSeller_memo_late() {
        return seller_memo_late;
    }

    public void setSeller_memo_late(String seller_memo_late) {
        this.seller_memo_late = seller_memo_late;
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

    public String getDiscount_fee() {
        return discount_fee;
    }

    public void setDiscount_fee(String discount_fee) {
        this.discount_fee = discount_fee;
    }

    public String getPost_cost() {
        return post_cost;
    }

    public void setPost_cost(String post_cost) {
        this.post_cost = post_cost;
    }

    public String getWeight_origin() {
        return weight_origin;
    }

    public void setWeight_origin(String weight_origin) {
        this.weight_origin = weight_origin;
    }

    public String getPayment_amount() {
        return payment_amount;
    }

    public void setPayment_amount(String payment_amount) {
        this.payment_amount = payment_amount;
    }

    public String getDelivery_state() {
        return delivery_state;
    }

    public void setDelivery_state(String delivery_state) {
        this.delivery_state = delivery_state;
    }

    public String getOrder_type_name() {
        return order_type_name;
    }

    public void setOrder_type_name(String order_type_name) {
        this.order_type_name = order_type_name;
    }

    public String getBusiness_man() {
        return business_man;
    }

    public void setBusiness_man(String business_man) {
        this.business_man = business_man;
    }

    public String getHold_info() {
        return hold_info;
    }

    public void setHold_info(String hold_info) {
        this.hold_info = hold_info;
    }

    public String getPlatform_flag() {
        return platform_flag;
    }

    public void setPlatform_flag(String platform_flag) {
        this.platform_flag = platform_flag;
    }

    public String getPlatform_trading_state() {
        return platform_trading_state;
    }

    public void setPlatform_trading_state(String platform_trading_state) {
        this.platform_trading_state = platform_trading_state;
    }

    public String getTax_amount() {
        return tax_amount;
    }

    public void setTax_amount(String tax_amount) {
        this.tax_amount = tax_amount;
    }

    public String getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getTrade_tag_code() {
        return trade_tag_code;
    }

    public void setTrade_tag_code(String trade_tag_code) {
        this.trade_tag_code = trade_tag_code;
    }

    public String getTrade_tag_name() {
        return trade_tag_name;
    }

    public void setTrade_tag_name(String trade_tag_name) {
        this.trade_tag_name = trade_tag_name;
    }

    public String getPlan_delivery_date() {
        return plan_delivery_date;
    }

    public void setPlan_delivery_date(String plan_delivery_date) {
        this.plan_delivery_date = plan_delivery_date;
    }

    public Object getDetails() {
        return details;
    }

    public void setDetails(Object details) {
        this.details = details;
    }

    public Object getPayments() {
        return payments;
    }

    public void setPayments(Object payments) {
        this.payments = payments;
    }

    public Object getInvoices() {
        return invoices;
    }

    public void setInvoices(Object invoices) {
        this.invoices = invoices;
    }

    public List<GY_Get_Order_Deliverys> getDeliverys() {
        return deliverys;
    }

    public void setDeliverys(List<GY_Get_Order_Deliverys> deliverys) {
        this.deliverys = deliverys;
    }

    public String getSubstitut_order() {
        return substitut_order;
    }

    public void setSubstitut_order(String substitut_order) {
        this.substitut_order = substitut_order;
    }
}
