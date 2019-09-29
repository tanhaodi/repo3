package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: 用户零钱+用户总收益
 * @Date: 2017/2/14 14:47
 */
public class APIMemberMoneyBean {
    private long yesterdayProfitMoney;
    private long profitSumMoney;
    private long freezeSumMoney;
    private long availableMoney;
    private long paymentMoney;
    private long currMonthPayMoney;
    private long currMonthProfitMoney;
    @JsonIgnore
    private long yibaoPaymentMoney;
    @JsonIgnore
    private long changePaymentMoney;

    public long getYibaoPaymentMoney() {
		return yibaoPaymentMoney;
	}

	public void setYibaoPaymentMoney(long yibaoPaymentMoney) {
		this.yibaoPaymentMoney = yibaoPaymentMoney;
	}

	public long getChangePaymentMoney() {
		return changePaymentMoney;
	}

	public void setChangePaymentMoney(long changePaymentMoney) {
		this.changePaymentMoney = changePaymentMoney;
	}

	public long getPaymentMoney() {
		return paymentMoney;
	}

	public void setPaymentMoney(long paymentMoney) {
		this.paymentMoney = paymentMoney;
	}

	public long getYesterdayProfitMoney() {
        return yesterdayProfitMoney;
    }

    public void setYesterdayProfitMoney(long yesterdayProfitMoney) {
        this.yesterdayProfitMoney = yesterdayProfitMoney;
    }

    public long getProfitSumMoney() {
        return profitSumMoney;
    }

    public void setProfitSumMoney(long profitSumMoney) {
        this.profitSumMoney = profitSumMoney;
    }

    public long getFreezeSumMoney() {
        return freezeSumMoney;
    }

    public void setFreezeSumMoney(long freezeSumMoney) {
        this.freezeSumMoney = freezeSumMoney;
    }

    public long getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(long availableMoney) {
        this.availableMoney = availableMoney;
    }

	public long getCurrMonthPayMoney() {
		return currMonthPayMoney;
	}

	public void setCurrMonthPayMoney(long currMonthPayMoney) {
		this.currMonthPayMoney = currMonthPayMoney;
	}

	public long getCurrMonthProfitMoney() {
		return currMonthProfitMoney;
	}

	public void setCurrMonthProfitMoney(long currMonthProfitMoney) {
		this.currMonthProfitMoney = currMonthProfitMoney;
	}
}
