package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fly.vo.ext.SkuExtBean;

/**
 * 
 * @ClassName: ProductBean
 * @Description: TODO
 * @author xupp
 * @date 2019年3月13日
 *
 */
public class ProductBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//activity
	private String activityId;//活动编号
	private String actName;//标题
	private Integer maxAmount;// 活动数量
	private Integer sales;// 销量
	private Date startDate;
	private Date endDate;

	// product
	private String productId; // '产品ID',
	private Integer productSource; // '货源（0自营，1、旗舰店商品，2普通店铺商品）'
	private String storeId; // '店铺id'
	private String parentClassifyId; // '一级分类'
	private String classifyId; // '二级分类'
	private String brandId; // '品牌ID'
	private String productName; // '产品名称'
	private String intro;// '产品简介'
	private Integer incId;
	private String spuCode; // '编号'
	private String itemCode; // '货号'
	@JsonIgnore
	private Integer sortIndex; // '排序号 值越大排序越前'
	private Integer saleCount; // '销量'
	private Date sellBegin; //销售开始时间
	private Date sellEnd; //销售结束时间
	private Integer isLimit; // '是否限购 0 否 1 是'
	private Date limitBegin; // '限购开始时间'
	private Date limitEnd; // '限购结束时间'
	private Integer status; // '上架状态 0 下架 1 上架'
	private Integer checkStatus; // '审核状态 0 审核中 1 审核通过 2 审核不通过'
	private String content; // '产品详情'
	private String thumbUrl; // '产品小图'
	private String video; // '产品视频'
	private String videoCoverImage; // '视频封面图片'
	private Integer type; // '0、普通产品'
	private String freightId;//运费模板ID
	private Integer isShippingFree; // '是否包邮'
	private Integer freeQuantity; // '包邮数量，几个起包邮，大于等于2生效'
	private Integer syncStatus;// '物流同步状态0，未同步，1已同步'
	private Integer viewCount;// '人气'
	private String remark;// '备注'
	private Date createDate;
	private Date updateDate;
	@JsonIgnore
	private int deleteFlag;
	private Integer limitMinCount;
	private Integer limitMaxCount;


	// sku
	private String skuId;
	private String skuCode;// 简码
	private String bannerImage;//产品sku轮播图大图
	private Integer marketPrice;// 市场价格
	private Integer salePrice;// 销售价格
	private Integer groupPrice;// 团长价
	private Integer lcPrice;// 联创团长价
	private Integer stock;
	private String code;
	private String storeName;
	private Integer memberType;
	
	private List<SkuExtBean> bean;
	
	private Date today;

	private String skuThumbUrl;
	
	private List<FreightProvinceBean> postage;
	
	private List<APISpecInfoBean> specNames;

	public String getSkuThumbUrl() {
		return skuThumbUrl;
	}

	public void setSkuThumbUrl(String skuThumbUrl) {
		this.skuThumbUrl = skuThumbUrl;
	}

	public Date getSellBegin() {
		return sellBegin;
	}

	public void setSellBegin(Date sellBegin) {
		this.sellBegin = sellBegin;
	}

	public Date getSellEnd() {
		return sellEnd;
	}

	public void setSellEnd(Date sellEnd) {
		this.sellEnd = sellEnd;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public List<APISpecInfoBean> getSpecNames() {
		return specNames;
	}

	public void setSpecNames(List<APISpecInfoBean> specNames) {
		this.specNames = specNames;
	}
	
	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Date getToday() {
		return today;
	}

	public Integer getIncId() {
		return incId;
	}

	public void setIncId(Integer incId) {
		this.incId = incId;
	}

	public void setToday(Date today) {
		this.today = today;
	}
	
	public List<FreightProvinceBean> getPostage() {
		return postage;
	}

	public void setPostage(List<FreightProvinceBean> postage) {
		this.postage = postage;
	}

	public String getBannerImage() {
		return bannerImage;
	}

	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<SkuExtBean> getBean() {
		return bean;
	}

	public void setBean(List<SkuExtBean> bean) {
		this.bean = bean;
	}

	public Integer getMemberType() {
		return memberType;
	}

	public void setMemberType(Integer memberType) {
		this.memberType = memberType;
	}

	public String getFreightId() {
		return freightId;
	}

	public void setFreightId(String freightId) {
		this.freightId = freightId;
	}

	public Integer getLimitMinCount() {
		return limitMinCount;
	}

	public void setLimitMinCount(Integer limitMinCount) {
		this.limitMinCount = limitMinCount;
	}

	public Integer getLimitMaxCount() {
		return limitMaxCount;
	}

	public void setLimitMaxCount(Integer limitMaxCount) {
		this.limitMaxCount = limitMaxCount;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public Integer getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(Integer maxAmount) {
		this.maxAmount = maxAmount;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Integer getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(Integer marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Integer getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Integer salePrice) {
		this.salePrice = salePrice;
	}

	public Integer getGroupPrice() {
		return groupPrice;
	}

	public void setGroupPrice(Integer groupPrice) {
		this.groupPrice = groupPrice;
	}


	public Integer getLcPrice() {
		return lcPrice;
	}

	public void setLcPrice(Integer lcPrice) {
		this.lcPrice = lcPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getProductSource() {
		return productSource;
	}

	public void setProductSource(Integer productSource) {
		this.productSource = productSource;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getParentClassifyId() {
		return parentClassifyId;
	}

	public void setParentClassifyId(String parentClassifyId) {
		this.parentClassifyId = parentClassifyId;
	}

	public String getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(String classifyId) {
		this.classifyId = classifyId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getSpuCode() {
		return spuCode;
	}

	public void setSpuCode(String spuCode) {
		this.spuCode = spuCode;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public Integer getSortIndex() {
		return sortIndex;
	}

	public void setSortIndex(Integer sortIndex) {
		this.sortIndex = sortIndex;
	}

	public Integer getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}

	public Integer getIsLimit() {
		return isLimit;
	}

	public void setIsLimit(Integer isLimit) {
		this.isLimit = isLimit;
	}

	public Date getLimitBegin() {
		return limitBegin;
	}

	public void setLimitBegin(Date limitBegin) {
		this.limitBegin = limitBegin;
	}

	public Date getLimitEnd() {
		return limitEnd;
	}

	public void setLimitEnd(Date limitEnd) {
		this.limitEnd = limitEnd;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getIsShippingFree() {
		return isShippingFree;
	}

	public void setIsShippingFree(Integer isShippingFree) {
		this.isShippingFree = isShippingFree;
	}

	public Integer getFreeQuantity() {
		return freeQuantity;
	}

	public void setFreeQuantity(Integer freeQuantity) {
		this.freeQuantity = freeQuantity;
	}

	public Integer getSyncStatus() {
		return syncStatus;
	}

	public void setSyncStatus(Integer syncStatus) {
		this.syncStatus = syncStatus;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
