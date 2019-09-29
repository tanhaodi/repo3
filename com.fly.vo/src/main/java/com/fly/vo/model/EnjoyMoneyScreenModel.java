package com.fly.vo.model;

/**
 * Created by 李冠 on 2018/7/23 15:15
 */
public class  EnjoyMoneyScreenModel {

    private boolean all=false;//全部
    private boolean luckDraw=false;//抽奖
    private boolean refund=false;//退款
    private boolean putForward=false;//提出
    private boolean transfer=false;//转赠
    private boolean recharge=false;//充值
    private boolean pay=false;//支付
    private boolean harvest=false;//收获
    private boolean unharvest=false;//待收获
    private boolean other=false;//其他
    
    private boolean day;//日
    private boolean week;//周
    private boolean month;//月
    private String startDate;//开始时间
    private String endDate;//结束时间

	public boolean isDay() {
		return day;
	}

	public void setDay(boolean day) {
		this.day = day;
	}

	public boolean isWeek() {
		return week;
	}

	public void setWeek(boolean week) {
		this.week = week;
	}

	public boolean isMonth() {
		return month;
	}

	public void setMonth(boolean month) {
		this.month = month;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public boolean isUnharvest() {
		return unharvest;
	}

	public void setUnharvest(boolean unharvest) {
		this.unharvest = unharvest;
	}

	public boolean isAll() {
        return all;
    }

    public void setAll(boolean all) {
        this.all = all;
    }

    public boolean isLuckDraw() {
        return luckDraw;
    }

    public void setLuckDraw(boolean luckDraw) {
        this.luckDraw = luckDraw;
    }

    public boolean isRefund() {
        return refund;
    }

    public void setRefund(boolean refund) {
        this.refund = refund;
    }

    public boolean isPutForward() {
        return putForward;
    }

    public void setPutForward(boolean putForward) {
        this.putForward = putForward;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public boolean isRecharge() {
        return recharge;
    }

    public void setRecharge(boolean recharge) {
        this.recharge = recharge;
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    public boolean isHarvest() {
        return harvest;
    }

    public void setHarvest(boolean harvest) {
        this.harvest = harvest;
    }
    public boolean isOther() {
        return other;
    }

    public void setOther(boolean other) {
        this.other = other;
    }
}
