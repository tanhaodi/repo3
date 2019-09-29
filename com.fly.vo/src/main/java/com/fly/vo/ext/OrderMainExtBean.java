package com.fly.vo.ext;


import com.fly.vo.bean.MemberBean;
import com.fly.vo.bean.OrderMainBean;

import java.util.Date;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.vo
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/2/6 20:50
 */
public class OrderMainExtBean extends OrderMainBean {
    private String orderStatusStr;
    private String isSplitStr;
    private String isProfitStr;
    private String orderFromStr;
    private MemberBean memberBean;
    private String payTypeStr;
    private String ic;
	private String memberName;
	private String refundId;
	private String refundCode;
	private int refundStatus;
	private int refundMoney;
	private String storeName;

	private String orderTypeStr;
	//操作人
	private String operator;
	//操作时间
	private Date logDate;

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getOrderTypeStr() {
		return orderTypeStr;
	}

	public void setOrderTypeStr(String orderTypeStr) {
		this.orderTypeStr = orderTypeStr;
	}

	public String getOrderStatusStr() {
		return orderStatusStr;
	}

	public void setOrderStatusStr(String orderStatusStr) {
		this.orderStatusStr = orderStatusStr;
	}

	public String getIsSplitStr() {
		return isSplitStr;
	}

	public void setIsSplitStr(String isSplitStr) {
		this.isSplitStr = isSplitStr;
	}

	public String getIsProfitStr() {
		return isProfitStr;
	}

	public void setIsProfitStr(String isProfitStr) {
		this.isProfitStr = isProfitStr;
	}

	public String getOrderFromStr() {
		return orderFromStr;
	}

	public void setOrderFromStr(String orderFromStr) {
		this.orderFromStr = orderFromStr;
	}

	public MemberBean getMemberBean() {
		return memberBean;
	}

	public void setMemberBean(MemberBean memberBean) {
		this.memberBean = memberBean;
	}

	public String getPayTypeStr() {
		return payTypeStr;
	}

	public void setPayTypeStr(String payTypeStr) {
		this.payTypeStr = payTypeStr;
	}

	public String getIc() {
		return ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getRefundId() {
		return refundId;
	}

	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}

	public String getRefundCode() {
		return refundCode;
	}

	public void setRefundCode(String refundCode) {
		this.refundCode = refundCode;
	}

	public int getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(int refundStatus) {
		this.refundStatus = refundStatus;
	}

	public int getRefundMoney() {
		return refundMoney;
	}

	public void setRefundMoney(int refundMoney) {
		this.refundMoney = refundMoney;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getLogDate() {
		return logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}


}
