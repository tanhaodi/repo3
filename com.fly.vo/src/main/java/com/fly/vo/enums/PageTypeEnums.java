package com.fly.vo.enums;

/**
 * @Author: dlz
 * @Date: 2019/3/11 15:02
 * @Version 1.0
 */
public enum PageTypeEnums {
    HomePage(0, "首页"),
    GeneralPage(1, "普通页");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private PageTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static PageTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return HomePage;
            case 1:
                return GeneralPage;
            default:
                return GeneralPage;
        }
    }
}
