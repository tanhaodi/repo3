package com.fly.vo.ext;

import com.fly.vo.bean.ProductSpecBean;

import java.util.List;


public class ProductSpecExtBean extends ProductSpecBean {

  private List<ProductSpecBean> list;

  public List<ProductSpecBean> getList() {
    return list;
  }

  public void setList(List<ProductSpecBean> list) {
    this.list = list;
  }
}
