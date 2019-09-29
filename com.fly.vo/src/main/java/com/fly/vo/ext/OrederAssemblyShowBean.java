package com.fly.vo.ext;

import com.fly.vo.bean.APIOrderMainBean;
import com.fly.vo.bean.MemberBean;
import com.fly.vo.bean.OrderMainBean;

import java.util.List;

/**
 * @Author: dlz
 * @Date: 2019/3/22 11:52
 * @Version 1.0
 */
public class OrederAssemblyShowBean {
    APIOrderMainBean orderMainBean;
    List<OrederShowBean> list;


    public APIOrderMainBean getOrderMainBean() {
        return orderMainBean;
    }

    public void setOrderMainBean(APIOrderMainBean orderMainBean) {
        this.orderMainBean = orderMainBean;
    }

    public List<OrederShowBean> getList() {
        return list;
    }

    public void setList(List<OrederShowBean> list) {
        this.list = list;
    }
}
