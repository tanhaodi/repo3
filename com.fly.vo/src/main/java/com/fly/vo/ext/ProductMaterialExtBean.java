package com.fly.vo.ext;

import com.fly.vo.bean.ProductMaterialBean;

import java.util.List;

public class ProductMaterialExtBean extends ProductMaterialBean{

    private String storeName;

    private String productName;

    private String brandName;

    private String itemCode;

    private String nickName;

    private Integer inviteCode;

    private String phone;

    private String headImage;

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(Integer inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
