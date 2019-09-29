package com.fly.vo.guanyi;

import java.util.List;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 添加产品
 * @Date: 2017/4/27 20:47
 */

public class GY_ProductAddModel extends GY_Sys_Params{
    private String code;
    private String name;
    private String simple_name;
    private String category_code;
    private String supplier_code;
    private String stock_status_code;
    private String weight;
    private String unit_code;
    private String sales_point;
    private String package_point;
    private String purchase_price;
    private String sales_price;
    private String agent_price;
    private String cost_price;
    private String supplier_outer_id;
    private String note;
    private List<GY_SkuModel> skus;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSimple_name() {
        return simple_name;
    }

    public void setSimple_name(String simple_name) {
        this.simple_name = simple_name;
    }

    public String getCategory_code() {
        return category_code;
    }

    public void setCategory_code(String category_code) {
        this.category_code = category_code;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public String getStock_status_code() {
        return stock_status_code;
    }

    public void setStock_status_code(String stock_status_code) {
        this.stock_status_code = stock_status_code;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getUnit_code() {
        return unit_code;
    }

    public void setUnit_code(String unit_code) {
        this.unit_code = unit_code;
    }

    public String getSales_point() {
        return sales_point;
    }

    public void setSales_point(String sales_point) {
        this.sales_point = sales_point;
    }

    public String getPackage_point() {
        return package_point;
    }

    public void setPackage_point(String package_point) {
        this.package_point = package_point;
    }

    public String getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(String purchase_price) {
        this.purchase_price = purchase_price;
    }

    public String getSales_price() {
        return sales_price;
    }

    public void setSales_price(String sales_price) {
        this.sales_price = sales_price;
    }

    public String getAgent_price() {
        return agent_price;
    }

    public void setAgent_price(String agent_price) {
        this.agent_price = agent_price;
    }

    public String getCost_price() {
        return cost_price;
    }

    public void setCost_price(String cost_price) {
        this.cost_price = cost_price;
    }

    public String getSupplier_outer_id() {
        return supplier_outer_id;
    }

    public void setSupplier_outer_id(String supplier_outer_id) {
        this.supplier_outer_id = supplier_outer_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<GY_SkuModel> getSkus() {
        return skus;
    }

    public void setSkus(List<GY_SkuModel> skus) {
        this.skus = skus;
    }
}
