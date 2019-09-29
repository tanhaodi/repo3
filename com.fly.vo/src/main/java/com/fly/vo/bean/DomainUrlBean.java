package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class DomainUrlBean implements Serializable{

	private static final long serialVersionUID = 4606691633001502001L;
	@JsonIgnore
	private int domainUrlId;
	private String domainUrl;
	@JsonIgnore
	private int type;
	@JsonIgnore
	private Date createDate;
	@JsonIgnore
	private Date updateDate;
	@JsonIgnore
	private int deleteFlag;
	
	public int getDomainUrlId() {
		return domainUrlId;
	}
	public void setDomainUrlId(int domainUrlId) {
		this.domainUrlId = domainUrlId;
	}
	public String getDomainUrl() {
		return domainUrl;
	}
	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
	public int getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
