package com.fly.vo.guanyi;


/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 支付信息
 * @Date: 2017/5/8 16:57
 */
public class GY_Payment_Info {
    private String pay_type_code;
    private  String paytime;
    private String payment;
    private String pay_code;
    private String account;

    public String getPay_type_code() {
        return pay_type_code;
    }

    public void setPay_type_code(String pay_type_code) {
        this.pay_type_code = pay_type_code;
    }


    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPay_code() {
        return pay_code;
    }

    public void setPay_code(String pay_code) {
        this.pay_code = pay_code;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
