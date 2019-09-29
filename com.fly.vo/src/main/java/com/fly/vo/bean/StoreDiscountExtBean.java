package com.fly.vo.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.fly.vo.enums.StoreDiscountEnums;
import com.google.common.collect.Sets;

public class StoreDiscountExtBean  implements Serializable{
	private static final long serialVersionUID = -7730258262725510262L;
	private String discountId;
	private int type;
	private String typeStr;
	private String storeId;
	private String title;
	private long cost;
	private long minOrderMoney;
	private Date limitStartDate;
	private Date limitEndDate;
	private long amount;
	private String remark;
	@JsonIgnore
	private int terminal;
	private Set<Integer> terminals=Sets.newHashSetWithExpectedSize(3);
	private int frequency;//参与次数

	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public Set<Integer> getTerminals() {
		return terminals;
	}
	public void setTerminals(Set<Integer> terminals) {
		this.terminals = terminals;
	}
	public int getTerminal() {
		return terminal;
	}
	public void setTerminal(int terminal) {
		this.terminal = terminal;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getDiscountId() {
		return discountId;
	}
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTypeStr() {
		return StoreDiscountEnums.valueOf(type).getMsg();
	}
	public void setTypeStr(String typeStr) {
		this.typeStr = typeStr;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public long getMinOrderMoney() {
		return minOrderMoney;
	}
	public void setMinOrderMoney(long minOrderMoney) {
		this.minOrderMoney = minOrderMoney;
	}
	public Date getLimitStartDate() {
		return limitStartDate;
	}
	public void setLimitStartDate(Date limitStartDate) {
		this.limitStartDate = limitStartDate;
	}
	public Date getLimitEndDate() {
		return limitEndDate;
	}
	public void setLimitEndDate(Date limitEndDate) {
		this.limitEndDate = limitEndDate;
	}
}
