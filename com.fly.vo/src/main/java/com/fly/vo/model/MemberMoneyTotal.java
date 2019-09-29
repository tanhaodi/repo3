package com.fly.vo.model;

/**
 * Created by lenovo on 2017/3/12.
 */
public class MemberMoneyTotal {
    private String memberId;
    private long availableMoney=0;
    private long unfreezeMoney=0;
    private long dealSumMoney=0;
    private long paySumMoney=0;
    private long trsinSumMoney=0;
    private long trsoutSumMoney=0;
    private int indexNumber;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public long getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(long availableMoney) {
        this.availableMoney = availableMoney;
    }

    public long getUnfreezeMoney() {
        return unfreezeMoney;
    }

    public void setUnfreezeMoney(long unfreezeMoney) {
        this.unfreezeMoney = unfreezeMoney;
    }

    public long getDealSumMoney() {
        return dealSumMoney;
    }

    public void setDealSumMoney(long dealSumMoney) {
        this.dealSumMoney = dealSumMoney;
    }

    public long getPaySumMoney() {
        return paySumMoney;
    }

    public void setPaySumMoney(long paySumMoney) {
        this.paySumMoney = paySumMoney;
    }

    public long getTrsinSumMoney() {
        return trsinSumMoney;
    }

    public void setTrsinSumMoney(long trsinSumMoney) {
        this.trsinSumMoney = trsinSumMoney;
    }

    public long getTrsoutSumMoney() {
        return trsoutSumMoney;
    }

    public void setTrsoutSumMoney(long trsoutSumMoney) {
        this.trsoutSumMoney = trsoutSumMoney;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}
