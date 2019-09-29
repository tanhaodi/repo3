package com.fly.vo.ext;

import java.util.Date;

/**
 * Created by lenovo on 2017/4/11.
 */
public class BalanceChangeDetail {
    private Integer type;
    private String peerNickName;
    private String peerUserName;
    private String peerUserPhone;
    private Long tradeMoney;
    private Long availableMoney;
    private String orderCode;
    private Long orderMoney;
    private Date createDate;
    private Long sortIndex;
    private String typeStr;
    private Integer tableName;//0零钱流水,1支付流水表,2用户收益解冻表，3转账表（转入），4转账表（转出）

    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Long sortIndex) {
        this.sortIndex = sortIndex;
    }

    public Integer getTableName() {
        return tableName;
    }

    public void setTableName(Integer tableName) {
        this.tableName = tableName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPeerNickName() {
        return peerNickName;
    }

    public void setPeerNickName(String peerNickName) {
        this.peerNickName = peerNickName;
    }

    public String getPeerUserName() {
        return peerUserName;
    }

    public void setPeerUserName(String peerUserName) {
        this.peerUserName = peerUserName;
    }

    public String getPeerUserPhone() {
        return peerUserPhone;
    }

    public void setPeerUserPhone(String peerUserPhone) {
        this.peerUserPhone = peerUserPhone;
    }

    public Long getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(Long tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public Long getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(Long availableMoney) {
        this.availableMoney = availableMoney;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Long orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }
}
