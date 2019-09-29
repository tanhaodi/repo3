package com.fly.vo.ext;

public class ProductCountBean {
    private Integer allProductCount;//商品总数

    private Integer putOnSaleCount;//上架商品总数

    private Integer pullOffShelvesCount;//下架商品总数

    private Integer unauditedCount;//未审核商品总数

    private Integer notPassCount;//未通过商品总数




    public Integer getAllProductCount() {
        return allProductCount;
    }

    public void setAllProductCount(Integer allProductCount) {
        this.allProductCount = allProductCount;
    }

    public Integer getPutOnSaleCount() {
        return putOnSaleCount;
    }

    public void setPutOnSaleCount(Integer putOnSaleCount) {
        this.putOnSaleCount = putOnSaleCount;
    }

    public Integer getPullOffShelvesCount() {
        return pullOffShelvesCount;
    }

    public void setPullOffShelvesCount(Integer pullOffShelvesCount) {
        this.pullOffShelvesCount = pullOffShelvesCount;
    }

    public Integer getUnauditedCount() {
        return unauditedCount;
    }

    public void setUnauditedCount(Integer unauditedCount) {
        this.unauditedCount = unauditedCount;
    }

    public Integer getNotPassCount() {
        return notPassCount;
    }

    public void setNotPassCount(Integer notPassCount) {
        this.notPassCount = notPassCount;
    }
}
