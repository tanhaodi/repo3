package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class CommonTypeBean implements Serializable{
	
	private static final long serialVersionUID = -6642311548371048309L;
	
	private String commonTypeId;
	private String typeImg;
	private String typeName;
	private Integer status;
	private Integer sortIndex;
	private Date createDate;
	private Date updateDate;
	@JsonIgnore
	private Integer deleteFlag;
	
	public String getCommonTypeId() {
		return commonTypeId;
	}
	public void setCommonTypeId(String commonTypeId) {
		this.commonTypeId = commonTypeId;
	}
	public String getTypeImg() {
		return typeImg;
	}
	public void setTypeImg(String typeImg) {
		this.typeImg = typeImg;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getSortIndex() {
		return sortIndex;
	}
	public void setSortIndex(Integer sortIndex) {
		this.sortIndex = sortIndex;
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
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
