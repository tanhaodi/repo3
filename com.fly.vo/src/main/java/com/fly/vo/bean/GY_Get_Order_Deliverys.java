package com.fly.vo.bean;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/5/4 19:51
 */
public class GY_Get_Order_Deliverys {

    private String delivery;
    private String code;
    private Object printExpress;
    private Object printDeliveryList;
    private Object scan;
    private Object weight;
    private String warehouse_name;
    private String warehouse_code;
    private String express_name;
    private String express_code;
    private String mail_no;

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getPrintExpress() {
        return printExpress;
    }

    public void setPrintExpress(Object printExpress) {
        this.printExpress = printExpress;
    }

    public Object getPrintDeliveryList() {
        return printDeliveryList;
    }

    public void setPrintDeliveryList(Object printDeliveryList) {
        this.printDeliveryList = printDeliveryList;
    }

    public Object getScan() {
        return scan;
    }

    public void setScan(Object scan) {
        this.scan = scan;
    }

    public Object getWeight() {
        return weight;
    }

    public void setWeight(Object weight) {
        this.weight = weight;
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

    public String getMail_no() {
        return mail_no;
    }

    public void setMail_no(String mail_no) {
        this.mail_no = mail_no;
    }
}
