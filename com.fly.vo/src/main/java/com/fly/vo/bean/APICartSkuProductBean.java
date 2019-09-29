package com.fly.vo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: 购物车产品列表
 * @Date: 2017/2/9 10:14
 */
public class APICartSkuProductBean extends SkuBean{
    private Integer productType=0;//0、普通产品，2、开店礼包,3、秒杀产品
    private Integer hasCoupon=0;
    private String thumbUrl;//缩略图
    private String storeId;
    private String storeName;
    private String sobotId;
    private Integer quantity;
    private String properties ;//产品属性

    //产品属性判断
    @JsonIgnore
    private Date sellBegin;
    @JsonIgnore
    private Date sellEnd;

    //赠品列表
    private List<APISkuPresentBean> presents=new ArrayList<>();
    
    private Date skuRestrictLastDate;//产品限购最后时间
    private int skuRestrictStatus=0;//是否开启限购 0 否 1 是
    private long rebateMoney;//返利活动金额（返一级，此金额从供货价中扣减）
    private Long appVipPrice;//APP专享价格
    private Integer appVipTerminal;//APP专享端 0 安卓或苹果 1 安卓 2 苹果
    private Date appVipEndDate;//APP专享价 结束时间
    //private long minFreeShipMoney;//店铺最低免运费金额
    private Integer isShippingFree=0;
    private Integer freeQuantity=0;
    private StoreDiscountExtBean storeDiscount;//优惠活动
    
  //店铺包邮处理
    @JsonIgnore
    private Integer postageType;
    @JsonIgnore
    private Integer postageStatus;
    @JsonIgnore
	private Long postage;
    @JsonIgnore
	private Long remotePostage;
    @JsonIgnore
	private Long timingPostage;
    @JsonIgnore
	private Long timingRemotePostage;
    @JsonIgnore
	private Integer qinghai;
    @JsonIgnore
	private Integer tibet;
    @JsonIgnore
	private Integer gansu;
    @JsonIgnore
	private Integer xinjiang;
    @JsonIgnore
	private Integer innerMongolia;
    @JsonIgnore
	private Integer ningxia;
    @JsonIgnore
    private Date startDate;
    @JsonIgnore
    private Date endDate;

    public Long getTimingPostage() {
		return timingPostage;
	}

	public void setTimingPostage(Long timingPostage) {
		this.timingPostage = timingPostage;
	}

	public Long getTimingRemotePostage() {
		return timingRemotePostage;
	}

	public void setTimingRemotePostage(Long timingRemotePostage) {
		this.timingRemotePostage = timingRemotePostage;
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

	
	public Integer getPostageType() {
		return postageType;
	}

	public void setPostageType(Integer postageType) {
		this.postageType = postageType;
	}

	public Integer getPostageStatus() {
		return postageStatus;
	}

	public void setPostageStatus(Integer postageStatus) {
		this.postageStatus = postageStatus;
	}

	public Long getPostage() {
		return postage;
	}

	public void setPostage(Long postage) {
		this.postage = postage;
	}

	public Long getRemotePostage() {
		return remotePostage;
	}

	public void setRemotePostage(Long remotePostage) {
		this.remotePostage = remotePostage;
	}

	public Integer getQinghai() {
		return qinghai;
	}

	public void setQinghai(Integer qinghai) {
		this.qinghai = qinghai;
	}

	public Integer getTibet() {
		return tibet;
	}

	public void setTibet(Integer tibet) {
		this.tibet = tibet;
	}

	public Integer getGansu() {
		return gansu;
	}

	public void setGansu(Integer gansu) {
		this.gansu = gansu;
	}

	public Integer getXinjiang() {
		return xinjiang;
	}

	public void setXinjiang(Integer xinjiang) {
		this.xinjiang = xinjiang;
	}

	public Integer getInnerMongolia() {
		return innerMongolia;
	}

	public void setInnerMongolia(Integer innerMongolia) {
		this.innerMongolia = innerMongolia;
	}

	public Integer getNingxia() {
		return ningxia;
	}

	public void setNingxia(Integer ningxia) {
		this.ningxia = ningxia;
	}

	public Date getAppVipEndDate() {
		return appVipEndDate;
	}

	public void setAppVipEndDate(Date appVipEndDate) {
		this.appVipEndDate = appVipEndDate;
	}

	public StoreDiscountExtBean getStoreDiscount() {
        return storeDiscount;
    }

    public void setStoreDiscount(StoreDiscountExtBean storeDiscount) {
        this.storeDiscount = storeDiscount;
    }

    public Integer getFreeQuantity() {
        return freeQuantity;
    }

    public void setFreeQuantity(Integer freeQuantity) {
        this.freeQuantity = freeQuantity;
    }

    public Integer getIsShippingFree() {
        return isShippingFree;
    }

    public void setIsShippingFree(Integer isShippingFree) {
        this.isShippingFree = isShippingFree;
    }

    /*public long getMinFreeShipMoney() {
        return minFreeShipMoney;
    }

    public void setMinFreeShipMoney(long minFreeShipMoney) {
        this.minFreeShipMoney = minFreeShipMoney;
    }*/

    public Long getAppVipPrice() {
        return appVipPrice;
    }

    public void setAppVipPrice(Long appVipPrice) {
        this.appVipPrice = appVipPrice;
    }

    public Integer getAppVipTerminal() {
        return appVipTerminal;
    }

    public void setAppVipTerminal(Integer appVipTerminal) {
        this.appVipTerminal = appVipTerminal;
    }

    public long getRebateMoney() {
        return rebateMoney;
    }

    public void setRebateMoney(long rebateMoney) {
        this.rebateMoney = rebateMoney;
    }

    public Date getSkuRestrictLastDate() {
		return skuRestrictLastDate;
	}

	public void setSkuRestrictLastDate(Date skuRestrictLastDate) {
		this.skuRestrictLastDate = skuRestrictLastDate;
	}

	public int getSkuRestrictStatus() {
		return skuRestrictStatus;
	}

	public void setSkuRestrictStatus(int skuRestrictStatus) {
		this.skuRestrictStatus = skuRestrictStatus;
	}

	public Integer getProductType() {
        return productType;
    }

    public Integer getHasCoupon() {
        return hasCoupon;
    }

    public void setHasCoupon(Integer hasCoupon) {
        this.hasCoupon = hasCoupon;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getSobotId() {
        return sobotId;
    }

    public void setSobotId(String sobotId) {
        this.sobotId = sobotId;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public List<APISkuPresentBean> getPresents() {
        return presents;
    }

    public void setPresents(List<APISkuPresentBean> presents) {
        this.presents = presents;
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
}
