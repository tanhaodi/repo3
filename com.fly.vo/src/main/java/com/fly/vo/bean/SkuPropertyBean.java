package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;

/**
 * SkuPropertyBean
 * @version 1.0
 * @author Geoffrey
 */ 
public class SkuPropertyBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String propertyId;
	@JsonIgnore
	private Integer sortIndex;
	private String propertyName;

	public String getPropertyId(){
		return propertyId;
	}
	public void setPropertyId(String propertyId){
		this.propertyId = propertyId;
	}
	public Integer getSortIndex(){
		return sortIndex;
	}
	public void setSortIndex(Integer sortIndex){
		this.sortIndex = sortIndex;
	}
	public String getPropertyName(){
		return propertyName;
	}
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

}

