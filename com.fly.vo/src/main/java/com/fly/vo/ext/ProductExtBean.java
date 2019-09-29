package com.fly.vo.ext;

import com.fly.vo.bean.ProductBean;
import com.fly.vo.bean.ProductSpecBean;
import com.fly.vo.bean.SkuBean;

import java.util.List;

public class ProductExtBean extends ProductBean {

	private static final long serialVersionUID = 7956388116717821679L;

	private String statusStr;

    private String checkStatusStr;

    private String storeName;

    private String brandName;

    private Integer salePrice;

    private Integer groupPrice;


    private Integer lcPrice;

    private Integer stocks;//产品总库存

    private List<ProductSpecExtBean> speclist ;

    private List<SkuExtBean> list;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getStocks() {
        return stocks;
    }

    public void setStocks(Integer stocks) {
        this.stocks = stocks;
    }

    public List<ProductSpecExtBean> getSpeclist() {
        return speclist;
    }

    public void setSpeclist(List<ProductSpecExtBean> speclist) {
        this.speclist = speclist;
    }


    public List<SkuExtBean> getList() {
        return list;
    }

    public void setList(List<SkuExtBean> list) {
        this.list = list;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getCheckStatusStr() {
        return checkStatusStr;
    }

    public void setCheckStatusStr(String checkStatusStr) {
        this.checkStatusStr = checkStatusStr;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
}
