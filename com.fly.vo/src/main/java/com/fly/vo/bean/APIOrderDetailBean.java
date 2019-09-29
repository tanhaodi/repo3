package com.fly.vo.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fly.vo.model.NullObjectBean;
/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: 订单详情专用实体
 * @Date: 2017/2/6 14:29
 */
public class APIOrderDetailBean {
    private String storeId;
    private String storeName;
    private String sobotId;
    List<Map> customerIdList = new ArrayList<>();
    private APIOrderMainBean orderMain;
    private List<APIOrderDetailProductBean> orderProducts;
    private Object refundOrder=new NullObjectBean();
    private Object groupInfo = new NullObjectBean();
    private List<StoreDiscountExtBean> storeDiscounts = new ArrayList<>();//优惠活动
    private OrderSetBean orderSet;
    private String thumbUrl;


	public String getThumbUrl() {
		return thumbUrl;
	}

	public void setThumbUrl(String thumbUrl) {
		this.thumbUrl = thumbUrl;
	}

	public OrderSetBean getOrderSet() {
		return orderSet;
	}

	public void setOrderSet(OrderSetBean orderSet) {
		this.orderSet = orderSet;
	}

	public List<StoreDiscountExtBean> getStoreDiscounts() {
		return storeDiscounts;
	}

	public void setStoreDiscounts(List<StoreDiscountExtBean> storeDiscounts) {
		this.storeDiscounts = storeDiscounts;
	}

	public Object getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(Object groupInfo) {
        this.groupInfo = groupInfo;
    }

    public APIOrderMainBean getOrderMain() {
        return orderMain;
    }

    public void setOrderMain(APIOrderMainBean orderMain) {
        this.orderMain = orderMain;
    }

    public List<APIOrderDetailProductBean> getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(List<APIOrderDetailProductBean> orderProducts) {
        this.orderProducts = orderProducts;
    }

    public String getSobotId() {
        return sobotId;
    }

    public void setSobotId(String sobotId) {
        this.sobotId = sobotId;
    }

    public Object getRefundOrder() {
        return refundOrder;
    }

    public void setRefundOrder(Object refundOrder) {
        this.refundOrder = refundOrder;
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

    public List<Map> getCustomerIdList() {
        return customerIdList;
    }

    public void setCustomerIdList(List<Map> customerIdList) {
        this.customerIdList = customerIdList;
    }
}
