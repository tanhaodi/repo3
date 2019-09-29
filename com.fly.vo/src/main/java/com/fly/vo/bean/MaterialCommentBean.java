package com.fly.vo.bean;

import java.util.Date;

/**
 * 
* @ClassName: MaterialCommentBean
* @Description: 产品素材评论信息表
* @author xupp
* @date 2019年3月22日
*
 */
public class MaterialCommentBean {
	
	private String productMaterialCommentId;
	private String memberId;
	private String commentMemberId;
	private String content;
	private String productMaterialId;
	private String productId;
	private Integer deleteFlag;
	
	public String getProductMaterialCommentId() {
		return productMaterialCommentId;
	}
	public void setProductMaterialCommentId(String productMaterialCommentId) {
		this.productMaterialCommentId = productMaterialCommentId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getCommentMemberId() {
		return commentMemberId;
	}
	public void setCommentMemberId(String commentMemberId) {
		this.commentMemberId = commentMemberId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getProductMaterialId() {
		return productMaterialId;
	}
	public void setProductMaterialId(String productMaterialId) {
		this.productMaterialId = productMaterialId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
