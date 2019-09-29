package com.fly.vo.bean;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description:
 * @Date: 2017/5/9 17:22
 */
public class GY_Update_Order_Status extends GY_Sys_Params {
    private String tid;
    private String oid;
    private Integer refund_state=1;//0、取消退款 1、标识退款

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Integer getRefund_state() {
        return refund_state;
    }

    public void setRefund_state(Integer refund_state) {
        this.refund_state = refund_state;
    }
}
