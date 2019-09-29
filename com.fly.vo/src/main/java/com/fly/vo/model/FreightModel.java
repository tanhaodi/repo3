package com.fly.vo.model;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnore;

public class FreightModel {
	private long freight=0;
    @JsonIgnore
    private long weight;
    @JsonIgnore
    Map<String,Long> storeFreiht;
    
	public long getFreight() {
		return freight;
	}
	public void setFreight(long freight) {
		this.freight = freight;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public Map<String, Long> getStoreFreiht() {
		return storeFreiht;
	}
	public void setStoreFreiht(Map<String, Long> storeFreiht) {
		this.storeFreiht = storeFreiht;
	}
}
