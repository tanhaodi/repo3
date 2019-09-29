package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.io.Serializable;

/**
 * OrderDetailBean
 *
 * @author Geoffrey
 * @version 1.0
 */
public class OrderDetailBean implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String orderDetailId;
    protected String order1Id;
    @JsonIgnore
    protected String orderId;
    @JsonIgnore
    protected String storeId;
    @JsonIgnore
    protected Integer sortIndex;
    protected Integer marketPrice;
    protected Integer salePrice;
    protected Integer groupPrice;
    protected Integer lcPrice;
    @JsonIgnore
    protected String productId;
    protected String productImage;
    protected String skuId;
    @JsonIgnore
    protected String skuCode;
    protected long quantity;
    protected long price;
    protected long costPrice;
    @JsonIgnore
    protected long platformProfit;
    @JsonIgnore
    protected long distributionProfit;
    @JsonIgnore
    protected long lineWeight;
    protected long lineTotal;
    protected String properties;
    protected String presentRelationProductId;
    protected Integer productType = 0;
    @JsonIgnore
    protected long firstProfit;
    @JsonIgnore
    protected long secondProfit;
    @JsonIgnore
    protected long threeProfit;

    protected Integer commentStatus=0;

    protected long rebateMoney;
    protected long appVipPrice;
    @JsonIgnore
    protected long retailPrice;
    @JsonIgnore
    protected long marketPprice;
    protected long communityProfit=0;
	protected long communityPrice=0;
	protected long weight;
	
	protected String activityId;

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public String getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
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

	public long getCommunityProfit() {
		return communityProfit;
	}

	public void setCommunityProfit(long communityProfit) {
		this.communityProfit = communityProfit;
	}

	public long getCommunityPrice() {
		return communityPrice;
	}

	public void setCommunityPrice(long communityPrice) {
		this.communityPrice = communityPrice;
	}

	public long getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(long retailPrice) {
        this.retailPrice = retailPrice;
    }

    public long getMarketPprice() {
        return marketPprice;
    }

    public void setMarketPprice(long marketPprice) {
        this.marketPprice = marketPprice;
    }

    public long getAppVipPrice() {
        return appVipPrice;
    }

    public void setAppVipPrice(long appVipPrice) {
        this.appVipPrice = appVipPrice;
    }

    public long getRebateMoney() {
        return rebateMoney;
    }

    public void setRebateMoney(long rebateMoney) {
        this.rebateMoney = rebateMoney;
    }

    public String getPresentRelationProductId() {
        return presentRelationProductId;
    }

    public void setPresentRelationProductId(String presentRelationProductId) {
        this.presentRelationProductId = presentRelationProductId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public long getFirstProfit() {
        return firstProfit;
    }

    public void setFirstProfit(long firstProfit) {
        this.firstProfit = firstProfit;
    }

    public long getSecondProfit() {
        return secondProfit;
    }

    public void setSecondProfit(long secondProfit) {
        this.secondProfit = secondProfit;
    }

    public long getThreeProfit() {
        return threeProfit;
    }

    public void setThreeProfit(long threeProfit) {
        this.threeProfit = threeProfit;
    }

    public String getOrder1Id() {
        return order1Id;
    }

    public void setOrder1Id(String order1Id) {
        this.order1Id = order1Id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(long costPrice) {
        this.costPrice = costPrice;
    }

    public long getPlatformProfit() {
        return platformProfit;
    }

    public void setPlatformProfit(long platformProfit) {
        this.platformProfit = platformProfit;
    }

    public long getDistributionProfit() {
        return distributionProfit;
    }

    public void setDistributionProfit(long distributionProfit) {
        this.distributionProfit = distributionProfit;
    }

    public long getLineWeight() {
        return lineWeight;
    }

    public void setLineWeight(long lineWeight) {
        this.lineWeight = lineWeight;
    }

    public long getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(long lineTotal) {
        this.lineTotal = lineTotal;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }
}

