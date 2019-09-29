package com.fly.vo.bean;

import com.fly.vo.enums.ClientEnums;
import com.fly.vo.enums.PaySetPayTypeEnums;

import java.util.Date;

/**
 * @Author: dlz
 * @Date: 2019/3/28 19:44
 * @Version 1.0
 */
public class PaySetBean {
    private int paySetId;
    /**
     * 1 安卓 2 苹果 3 微信
     */
    private int terminal;
    private String terminalStr;

    /**
     * 0 零钱支付 1 汇卡微信支付 2 官方支付宝支付 3 易宝快捷支付 4 易宝微信支付 5 易宝支付宝支付'
     */
    private int payType;

    private String payTypeStr;
    /**
     * 折扣 为0表示不折扣 为1表示折扣1% 最高为100%
     */
    private int discount;
    private String remark;
    /**
     * 是否启用 0 否 1是
     */
    private int status;
    private Date createDate;
    private Date updateDate;

    public int getPaySetId() {
        return paySetId;
    }

    public void setPaySetId(int paySetId) {
        this.paySetId = paySetId;
    }

    public int getTerminal() {
        return terminal;
    }

    public void setTerminal(int terminal) {
        this.terminal = terminal;
    }

    public String getTerminalStr() {
        return ClientEnums.valueOf(getTerminal()).getMsg();
    }

    public void setTerminalStr(String terminalStr) {
        this.terminalStr = terminalStr;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public String getPayTypeStr() {
        return PaySetPayTypeEnums.valueOf(getPayType()).getMsg();
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
