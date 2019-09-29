package com.fly.vo.guanyi;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/5/4 19:34
 */
public class GY_Get_Order_Model extends GY_Sys_Params {

    private Integer page_no = 1;
    private Integer page_size = 10;
    private String start_date;
    private String end_date;
    private Integer date_type = 0;
    private Integer order_state = 0;
    private String warehouse_code;
    private String shop_code;
    private String vip_name;
    private String platform_code;
    private String receiver_mobile;
    private String code;

    public Integer getPage_no() {
        return page_no;
    }

    public void setPage_no(Integer page_no) {
        this.page_no = page_no;
    }

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Integer getDate_type() {
        return date_type;
    }

    public void setDate_type(Integer date_type) {
        this.date_type = date_type;
    }

    public Integer getOrder_state() {
        return order_state;
    }

    public void setOrder_state(Integer order_state) {
        this.order_state = order_state;
    }

    public String getWarehouse_code() {
        return warehouse_code;
    }

    public void setWarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public String getShop_code() {
        return shop_code;
    }

    public void setShop_code(String shop_code) {
        this.shop_code = shop_code;
    }

    public String getVip_name() {
        return vip_name;
    }

    public void setVip_name(String vip_name) {
        this.vip_name = vip_name;
    }

    public String getPlatform_code() {
        return platform_code;
    }

    public void setPlatform_code(String platform_code) {
        this.platform_code = platform_code;
    }

    public String getReceiver_mobile() {
        return receiver_mobile;
    }

    public void setReceiver_mobile(String receiver_mobile) {
        this.receiver_mobile = receiver_mobile;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
