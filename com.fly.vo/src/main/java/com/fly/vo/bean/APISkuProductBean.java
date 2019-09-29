package com.fly.vo.bean;

import com.google.common.collect.Lists;

import java.util.List;



public class APISkuProductBean extends SkuPropertyBean {
	
    private List<ProductSpecBean> propertyValues;

    public List<ProductSpecBean> getPropertyValues() {
    	if(propertyValues ==null || propertyValues.isEmpty()) {
    		propertyValues = Lists.newArrayListWithExpectedSize(0);
    	}
        return propertyValues;
    }

    public void setPropertyValues(List<ProductSpecBean> propertyValues) {
        this.propertyValues = propertyValues;
    }
}
