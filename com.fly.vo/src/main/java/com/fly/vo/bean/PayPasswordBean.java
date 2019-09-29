package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * 支付密码BEAN
 * @author liguan
 * @date 2017年10月19日
 */
public class PayPasswordBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String payId;
	private String payPwd;
	private String salt;
	private String memberId;
	private Date createDate;
	private Date updateDate;
	
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getPayPwd() {
		return payPwd;
	}
	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	
	@Override
	public String toString() {
		return "PayPasswordBean [payId=" + payId + ", payPwd=" + payPwd
				+ ", salt=" + salt + ", memberId=" + memberId + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "]";
	}
}
