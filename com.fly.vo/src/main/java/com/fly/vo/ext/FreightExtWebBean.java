package com.fly.vo.ext;

import com.fly.vo.bean.FreightBean;
import com.fly.vo.bean.FreightProvince;

import java.util.Date;
import java.util.List;

public class FreightExtWebBean extends FreightBean{


  private List<FreightProvince>  list;

    public List<FreightProvince> getList() {
        return list;
    }

    public void setList(List<FreightProvince> list) {
        this.list = list;
    }
}
