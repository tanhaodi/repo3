package com.fly.vo.enums;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.enums
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/2/16 16:52
 */
public enum StoreTypeEnums {
    Proprietary(0,"自营店"),
    Flagship(1,"旗舰店"),
    Common(2,"普通店");


    private int code; //错误代码
    private String msg; //错误消息
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private StoreTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static StoreTypeEnums valueOf(Integer type){
        switch (type){
            case 0:
                return Proprietary;
            case 1:
               return Flagship;
            case 2:
                return Common;
            default:
                return Proprietary;
        }
    }
}
