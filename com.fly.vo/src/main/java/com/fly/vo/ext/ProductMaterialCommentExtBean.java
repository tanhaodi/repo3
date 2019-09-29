package com.fly.vo.ext;

import com.fly.vo.bean.ProductMaterialCommentBean;

import java.util.List;

public class ProductMaterialCommentExtBean extends ProductMaterialCommentBean {

    private String nickName ;

    private String headImage;

    private List<ProductMaterialCommentExtBean> list ;


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public List<ProductMaterialCommentExtBean> getList() {
        return list;
    }

    public void setList(List<ProductMaterialCommentExtBean> list) {
        this.list = list;
    }
}
