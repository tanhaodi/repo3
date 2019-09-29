package com.fly.vo.bean;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.apimodel
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/2/3 15:31
 */
public class APIFreightModel {
    private int freight=0;
    @JsonIgnore
    private int weight;
    @JsonIgnore
    Map<String,Integer> storeFreiht;

    
	public Map<String, Integer> getStoreFreiht() {
		return storeFreiht;
	}

	public void setStoreFreiht(Map<String, Integer> storeFreiht) {
		this.storeFreiht = storeFreiht;
	}

	public int getFreight() {
        return freight;
    }

    public void setFreight(int freight) {
        this.freight = freight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
