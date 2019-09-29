package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * SkuImageBean
 * @version 1.0
 * @author Geoffrey
 */ 
public class SkuImageBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String skuId;
	private String thumbUrl;
	private String bannerImage;
	@JsonIgnore
	private Date createDate;
	@JsonIgnore
	private Date updateDate;
	@JsonIgnore
	private Integer deleteFlag;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
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

