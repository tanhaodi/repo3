package com.fly.vo.ext;

/**
 * @Author: dlz
 * @Date: 2019/3/13 20:35
 * @Version 1.0
 */
public class CategoryBrandRelationBean {
    String categoryBrandId;
    String parentName;
    String categoryName;
    String categoryId;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryBrandId() {
        return categoryBrandId;
    }

    public void setCategoryBrandId(String categoryBrandId) {
        this.categoryBrandId = categoryBrandId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
