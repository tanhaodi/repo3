package com.fly.vo.ext;

public class FreightExtBean {
	
	 private int type;//类型 0 按件计算 1 按重量计算
     private long firstCondition;//首重或首件
     private long firstFreight;//首费
     private long continueCondition;//续重或续件
     private long continueFreight;//续费
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getFirstCondition() {
		return firstCondition;
	}
	public void setFirstCondition(long firstCondition) {
		this.firstCondition = firstCondition;
	}
	public long getFirstFreight() {
		return firstFreight;
	}
	public void setFirstFreight(long firstFreight) {
		this.firstFreight = firstFreight;
	}
	public long getContinueCondition() {
		return continueCondition;
	}
	public void setContinueCondition(long continueCondition) {
		this.continueCondition = continueCondition;
	}
	public long getContinueFreight() {
		return continueFreight;
	}
	public void setContinueFreight(long continueFreight) {
		this.continueFreight = continueFreight;
	}
}
