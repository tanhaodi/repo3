package com.fly.vo.bean;

import java.io.Serializable;

public class APISpecInfoBean implements Serializable{

	private static final long serialVersionUID = 2678555205649082964L;
	
	private String parentSpecName;//一级规格
	private String specName;//二级规格
	private String parentSpecId;//一级规格
	private String specId;//二级规格
	
	public String getParentSpecId() {
		return parentSpecId;
	}
	public void setParentSpecId(String parentSpecId) {
		this.parentSpecId = parentSpecId;
	}
	public String getSpecId() {
		return specId;
	}
	public void setSpecId(String specId) {
		this.specId = specId;
	}
	public String getParentSpecName() {
		return parentSpecName;
	}
	public void setParentSpecName(String parentSpecName) {
		this.parentSpecName = parentSpecName;
	}
	public String getSpecName() {
		return specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}
	

}
