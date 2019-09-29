package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

public class CommonProblemBean implements Serializable{

	private static final long serialVersionUID = 6449588772828308547L;
	
	private String commonProblemId;
	private String commonTypeId;
	private Integer status;
	private String title;
	private String content;
	private Integer help;
	private Integer solve;
	private Date createDate;
	private Date updateDate;
	@JsonIgnore
	private Integer deleteFlag;
	
	public String getCommonProblemId() {
		return commonProblemId;
	}
	public void setCommonProblemId(String commonProblemId) {
		this.commonProblemId = commonProblemId;
	}
	public String getCommonTypeId() {
		return commonTypeId;
	}
	public void setCommonTypeId(String commonTypeId) {
		this.commonTypeId = commonTypeId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getHelp() {
		return help;
	}
	public void setHelp(Integer help) {
		this.help = help;
	}
	public Integer getSolve() {
		return solve;
	}
	public void setSolve(Integer solve) {
		this.solve = solve;
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
