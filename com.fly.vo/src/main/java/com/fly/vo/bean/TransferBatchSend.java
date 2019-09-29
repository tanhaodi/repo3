package com.fly.vo.bean;

import java.util.List;

/**
 * 批量代付
 * dlz
 */
public class TransferBatchSend {
  private String  customerNumber;
    private String  groupNumber;
    /**
     * 出款总金额
     */
    private String totalAmount;
    /**
     * 出款总笔
     */
    private String totalCount;
    private String product;
    private List<DetailJsonBean> detailJsonBeanList;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public List<DetailJsonBean> getDetailJsonBeanList() {
        return detailJsonBeanList;
    }

    public void setDetailJsonBeanList(List<DetailJsonBean> detailJsonBeanList) {
        this.detailJsonBeanList = detailJsonBeanList;
    }
}
