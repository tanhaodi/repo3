package com.fly.vo.enums;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.enums
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/2/16 16:52
 */
public enum ProductTypeWebEnums {
    Gennel(0,"普通产品"),
    Store(1,"升级礼包");


    private int code; //错误代码
    private String msg; //错误消息
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ProductTypeWebEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static ProductTypeWebEnums valueOf(Integer type){
        switch (type){
            case 0:
                return Gennel;
            case 1:
               return Store;
            default:
                return Gennel;
        }
    }
}
