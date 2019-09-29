package com.fly.vo.guanyi;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/5/8 17:42
 */
public class GY_Get_Payment_Params extends GY_Sys_Params {
    private String page_no="0";
    private String page_size="100";
    private String modify_start_date;
    private String modify_end_date;
    private String code;

    public String getPage_no() {
        return page_no;
    }

    public void setPage_no(String page_no) {
        this.page_no = page_no;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public String getModify_start_date() {
        return modify_start_date;
    }

    public void setModify_start_date(String modify_start_date) {
        this.modify_start_date = modify_start_date;
    }

    public String getModify_end_date() {
        return modify_end_date;
    }

    public void setModify_end_date(String modify_end_date) {
        this.modify_end_date = modify_end_date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
