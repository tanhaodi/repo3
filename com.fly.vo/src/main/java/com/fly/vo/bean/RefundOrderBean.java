package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * RefundOrder00Bean
 * @version 1.0
 * @author Geoffrey
 */ 
public class RefundOrderBean implements Serializable{
	private static final long serialVersionUID = 1L;

	
	private String refundId;
	private String refundCode;
	private Integer refundType=0;
	private Integer refundStatus=0;
	private String refundResult;
	private String memberId;
	private String orderId;
	private String orderCode;
	private Integer totalMoney=0;
	private Integer freight=0;
	private String refundReason;
	private String refundImage;
	private Date refundDate;
	private String refundExpressName;
	private String refundExpressCode;
	private Date receivedRefundDate;
	private Integer refundMoneyType=0;
	private Integer applyRefundMoney=0;
	private Integer refundMoney=0;
	private Date refundMoneyDate;
	private String uniqueRefundNo;
	private String refundRemark;
	private Date createDate;
	private Date updateDate;
	private Integer deleteFlag=0;

	private String refundStatusStr;

	private String RefundTypeStr;

	public String getRefundStatusStr() {
		return refundStatusStr;
	}

	public void setRefundStatusStr(String refundStatusStr) {
		this.refundStatusStr = refundStatusStr;
	}

	public String getRefundTypeStr() {
		return RefundTypeStr;
	}

	public void setRefundTypeStr(String refundTypeStr) {
		RefundTypeStr = refundTypeStr;
	}

	public String getRefundId(){
		return refundId;
	}
	public void setRefundId(String refundId){
		this.refundId = refundId;
	}
	public String getRefundCode(){
		return refundCode;
	}
	public void setRefundCode(String refundCode){
		this.refundCode = refundCode;
	}
	public Integer getRefundType(){
		return refundType;
	}
	public void setRefundType(Integer refundType){
		this.refundType = refundType;
	}
	public Integer getRefundStatus(){
		return refundStatus;
	}
	public void setRefundStatus(Integer refundStatus){
		this.refundStatus = refundStatus;
	}
	public String getRefundResult(){
		return refundResult;
	}

	public Date getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public String getRefundExpressName() {
		return refundExpressName;
	}

	public void setRefundExpressName(String refundExpressName) {
		this.refundExpressName = refundExpressName;
	}

	public String getRefundExpressCode() {
		return refundExpressCode;
	}

	public void setRefundExpressCode(String refundExpressCode) {
		this.refundExpressCode = refundExpressCode;
	}

	public Date getReceivedRefundDate() {
		return receivedRefundDate;
	}

	public void setReceivedRefundDate(Date receivedRefundDate) {
		this.receivedRefundDate = receivedRefundDate;
	}

	public void setRefundResult(String refundResult){
		this.refundResult = refundResult;
	}
	public String getMemberId(){
		return memberId;
	}
	public void setMemberId(String memberId){
		this.memberId = memberId;
	}
	public String getOrderId(){
		return orderId;
	}
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	public String getOrderCode(){
		return orderCode;
	}
	public void setOrderCode(String orderCode){
		this.orderCode = orderCode;
	}
	public Integer getTotalMoney(){
		return totalMoney;
	}
	public void setTotalMoney(Integer totalMoney){
		this.totalMoney = totalMoney;
	}
	public Integer getFreight(){
		return freight;
	}
	public void setFreight(Integer freight){
		this.freight = freight;
	}
	public String getRefundReason(){
		return refundReason;
	}
	public void setRefundReason(String refundReason){
		this.refundReason = refundReason;
	}

	public String getRefundImage() {
		return refundImage;
	}

	public void setRefundImage(String refundImage) {
		this.refundImage = refundImage;
	}



	public Integer getRefundMoneyType(){
		return refundMoneyType;
	}
	public void setRefundMoneyType(Integer refundMoneyType){
		this.refundMoneyType = refundMoneyType;
	}
	public Integer getApplyRefundMoney(){
		return applyRefundMoney;
	}
	public void setApplyRefundMoney(Integer applyRefundMoney){
		this.applyRefundMoney = applyRefundMoney;
	}
	public Integer getRefundMoney(){
		return refundMoney;
	}
	public void setRefundMoney(Integer refundMoney){
		this.refundMoney = refundMoney;
	}
	public Date getRefundMoneyDate(){
		return refundMoneyDate;
	}
	public void setRefundMoneyDate(Date refundMoneyDate){
		this.refundMoneyDate = refundMoneyDate;
	}
	public String getRefundRemark(){
		return refundRemark;
	}
	public void setRefundRemark(String refundRemark){
		this.refundRemark = refundRemark;
	}
	public Date getCreateDate(){
		return createDate;
	}
	public void setCreateDate(Date createDate){
		this.createDate = createDate;
	}
	public Date getUpdateDate(){
		return updateDate;
	}
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}
	public Integer getDeleteFlag(){
		return deleteFlag;
	}
	public void setDeleteFlag(Integer deleteFlag){
		this.deleteFlag = deleteFlag;
	}

}

