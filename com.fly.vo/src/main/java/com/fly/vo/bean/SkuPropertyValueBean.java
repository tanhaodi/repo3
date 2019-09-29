package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;

/**
 * SkuPropertyValueBean
 * @version 1.0
 * @author Geoffrey
 */ 
public class SkuPropertyValueBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String propertyValueId;
	@JsonIgnore
	private String propertyId;
	private String propertyValue;
	@JsonIgnore
	private Integer sortIndex;

	public String getPropertyValueId(){
		return propertyValueId;
	}
	public void setPropertyValueId(String propertyValueId){
		this.propertyValueId = propertyValueId;
	}
	public String getPropertyId(){
		return propertyId;
	}
	public void setPropertyId(String propertyId){
		this.propertyId = propertyId;
	}
	public String getPropertyValue(){
		return propertyValue;
	}
	public void setPropertyValue(String propertyValue){
		this.propertyValue = propertyValue;
	}
	public Integer getSortIndex(){
		return sortIndex;
	}
	public void setSortIndex(Integer sortIndex){
		this.sortIndex = sortIndex;
	}

}

