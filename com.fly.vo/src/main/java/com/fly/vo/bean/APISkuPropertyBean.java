package com.fly.vo.bean;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/2/6 9:48
 */
public class APISkuPropertyBean extends SkuPropertyBean {
    private List<SkuPropertyValueBean> propertyValues;

    public List<SkuPropertyValueBean> getPropertyValues() {
    	if(propertyValues ==null || propertyValues.isEmpty()) {
    		propertyValues = Lists.newArrayListWithExpectedSize(0);
    	}
        return propertyValues;
    }

    public void setPropertyValues(List<SkuPropertyValueBean> propertyValues) {
        this.propertyValues = propertyValues;
    }
}
