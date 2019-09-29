package com.fly.vo.model;

import java.util.Date;

/**
 * Created by lenovo on 2017/4/11.
 */
public class BalanceChangeDetail {
    private String id;
    private String memberId;
    private Integer type;
    private String peerNickName;
    private String peerUserName;
    private String peerUserPhone;
    private long tradeMoney;
    private long availableMoney;
    private long rechargeMoney;
    private long changeMoney;
    private String orderCode;
    private long orderMoney;
    private Date createDate;
    private long sortIndex;

    private String typeStr;
    private Integer tableName;//0零钱流水,1支付流水表,2用户收益解冻表，3转账表（转入），4转账表（转出）

    private String remark;

    public long getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(long changeMoney) {
        this.changeMoney = changeMoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public long getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(long rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
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

    public long getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(long tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public long getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(long availableMoney) {
        this.availableMoney = availableMoney;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public long getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(long orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(long sortIndex) {
        this.sortIndex = sortIndex;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    public Integer getTableName() {
        return tableName;
    }

    public void setTableName(Integer tableName) {
        this.tableName = tableName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
