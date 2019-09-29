package com.fly.vo.enums;

/**
 * @Author: dlz
 * @Date: 2019/3/11 15:02
 * @Version 1.0
 */
public enum ExpressStatusEnums {
    Unknow(0, "未知"),
    take(1, "接单"),
    printer(2, "打印"),
    takeGoods (3, "捡货"),
    recombination(4, "复核"),
    pack(5, "打包"),
    weigh(6, "称重"),
    shipped(7, "已发货"),
    abnormal(8, "发货异常"),
    close(9, "关闭");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ExpressStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ExpressStatusEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return Unknow;
            case 1:
                return take;
            case 2:
                return printer;
            case 3:
                return takeGoods;
            case 4:
                return recombination;
            case 5:
                return pack;
            case 6:
                return weigh;
            case 7:
                return shipped;
            case 8:
                return abnormal;
            case 9:
                return close;
            default:
                return Unknow;
        }
    }
}
