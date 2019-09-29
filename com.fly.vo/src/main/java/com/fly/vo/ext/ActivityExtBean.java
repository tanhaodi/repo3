package com.fly.vo.ext;

import com.fly.vo.bean.ActivityBean;


import java.util.List;

public class ActivityExtBean extends ActivityBean {

    private List<ActivityProductRelationExtBean> list ;

    public List<ActivityProductRelationExtBean> getList() {
        return list;
    }

    public void setList(List<ActivityProductRelationExtBean> list) {
        this.list = list;
    }
}
