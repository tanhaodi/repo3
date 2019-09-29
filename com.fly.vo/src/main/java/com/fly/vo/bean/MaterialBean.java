package com.fly.vo.bean;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * 
* @ClassName: MaterialBean
* @Description: 产品素材表
* @author xupp
* @date 2019年3月22日
*
 */
public class MaterialBean {

	private String productMaterialId;
	private String operator;
	private Integer type;
	private String productId;
	private String img;
	private String content;
	private String video;
	private String videoCoverImage;
	@JsonIgnore
	private Integer sortIndex;
	private Date startDate;
	private Integer isView;
	private Integer status;
	private Integer zanCount;
	private Integer commentCount;
	private Integer saveCount;
	private Integer posterCount;
	private String remark;
	private Date createDate;
	@JsonIgnore
	private Integer deleteFlag;
	
	private String userName;
	private String headImage;
	private String productMaterialZanId;
	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getProductMaterialZanId() {
		return productMaterialZanId;
	}
	public void setProductMaterialZanId(String productMaterialZanId) {
		this.productMaterialZanId = productMaterialZanId;
	}
	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getVideoCoverImage() {
		return videoCoverImage;
	}
	public void setVideoCoverImage(String videoCoverImage) {
		this.videoCoverImage = videoCoverImage;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductMaterialId() {
		return productMaterialId;
	}
	public void setProductMaterialId(String productMaterialId) {
		this.productMaterialId = productMaterialId;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getSortIndex() {
		return sortIndex;
	}
	public void setSortIndex(Integer sortIndex) {
		this.sortIndex = sortIndex;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Integer getIsView() {
		return isView;
	}
	public void setIsView(Integer isView) {
		this.isView = isView;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getZanCount() {
		return zanCount;
	}
	public void setZanCount(Integer zanCount) {
		this.zanCount = zanCount;
	}
	public Integer getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}
	public Integer getSaveCount() {
		return saveCount;
	}
	public void setSaveCount(Integer saveCount) {
		this.saveCount = saveCount;
	}
	public Integer getPosterCount() {
		return posterCount;
	}
	public void setPosterCount(Integer posterCount) {
		this.posterCount = posterCount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
