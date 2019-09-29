package com.fly.vo.model;


import com.fly.vo.bean.SkuWebBean;

import java.util.List;

public class SkuDetailModel {

    private String content;
    private String intro;
    private List<SkuWebBean> skus;


    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<SkuWebBean> getSkus() {
        return skus;
    }

    public void setSkus(List<SkuWebBean> skus) {
        this.skus = skus;
    }
}
