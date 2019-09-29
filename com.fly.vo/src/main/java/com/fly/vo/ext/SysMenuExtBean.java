package com.fly.vo.ext;

import com.fly.vo.bean.SysMenuBean;

import java.util.List;

public class SysMenuExtBean extends SysMenuBean{

    private List<SysMenuExtBean> list ;

    public List<SysMenuExtBean> getList() {
        return list;
    }

    public void setList(List<SysMenuExtBean> list) {
        this.list = list;
    }
}
