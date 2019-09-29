package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;

public class TProvinceBean implements Serializable{
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private Integer id;
	private String provinceId;
	private String province;

	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getProvinceId(){
		return provinceId;
	}
	public void setProvinceId(String provinceId){
		this.provinceId = provinceId;
	}
	public String getProvince(){
		return province;
	}
	public void setProvince(String province){
		this.province = province;
	}

}

