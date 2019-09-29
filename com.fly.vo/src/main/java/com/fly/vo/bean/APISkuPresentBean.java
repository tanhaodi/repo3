package com.fly.vo.bean;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: 赠品实体
 * @Date: 2017/2/16 15:59
 */
public class APISkuPresentBean extends SkuBean{
    private String thumbUrl;
    private Integer quantity=0;//赠送数量
    @JsonIgnore
    private String properties;
    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }
}
