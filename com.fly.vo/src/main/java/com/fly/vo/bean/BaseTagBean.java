package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class BaseTagBean implements Serializable{
	private static final long serialVersionUID = 5873282211860055189L;
	
	private String id;
	private String tagName;
	private  int indexSort;
	private String operator;
	@JsonIgnore
	private int type;
	@JsonIgnore
	private Date createDate;

	private Date updateDate;
	@JsonIgnore
	private int deleteFlag;


	public int getIndexSort() {
		return indexSort;
	}

	public void setIndexSort(int indexSort) {
		this.indexSort = indexSort;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
