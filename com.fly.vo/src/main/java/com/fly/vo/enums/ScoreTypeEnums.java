package com.fly.vo.enums;

/**
 * @Author: dlz
 * @Date: 2019/3/11 15:02
 * @Version 1.0
 */
public enum ScoreTypeEnums {
    shopping(0, "购物奖励"),
    subordinate(1, "下级购买奖励"),
    admin(2, "管理员修改");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ScoreTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ScoreTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return shopping;
            case 1:
                return subordinate;
            default:
                return admin;
        }
    }
}
