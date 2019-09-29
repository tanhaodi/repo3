package com.fly.vo.model;

/**
 * @Author: Geoffrey
 * @Packager: com.sibu.dao.directsale.express.yongjun.model
 * @company: SIBU Kanger
 * @Description: 描述
 * @Date: 2016/5/16 17:08
 */
public class ExpressModel {
    //快递单号
    private String expressCode;
    //快递名称
    private String expressName;
    //快递编号
    private String expressNo;

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }
}
