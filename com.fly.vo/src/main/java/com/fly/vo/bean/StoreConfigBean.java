package com.fly.vo.bean;

import java.io.Serializable;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.Initmodel
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/4/28 10:50
 */
public class StoreConfigBean implements Serializable{
	private static final long serialVersionUID = -4644481938623035650L;
	private String title;
    private Object config;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getConfig() {
        return config;
    }

    public void setConfig(Object config) {
        this.config = config;
    }
}
