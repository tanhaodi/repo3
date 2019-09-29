package com.fly.vo.bean;

import java.util.Date;

/**
 * 
* @ClassName: MaterialZanBean
* @Description: 产品素材点赞信息表
* @author xupp
* @date 2019年3月22日
*
 */
public class MaterialZanBean {
	
	private String productMaterialZanId;
	private String memberId;
	private String productId;
	private String productMaterialId;
	private Integer status;
	
	public String getProductMaterialZanId() {
		return productMaterialZanId;
	}
	public void setProductMaterialZanId(String productMaterialZanId) {
		this.productMaterialZanId = productMaterialZanId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductMaterialId() {
		return productMaterialId;
	}
	public void setProductMaterialId(String productMaterialId) {
		this.productMaterialId = productMaterialId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	

}
