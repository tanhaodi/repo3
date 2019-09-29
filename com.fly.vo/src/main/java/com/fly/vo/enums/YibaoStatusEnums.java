package com.fly.vo.enums;

/**
 * Created by lenovo on 2017/3/15.
 */
public enum YibaoStatusEnums {
    P_audit(0, "平台审核中"),
   // p_pass(1, "平台审核通过"),
    y_audit(1, "易宝审核中"),
    y_pass(2, "易宝审核通过"),
    p_nopass(3, "平台审核不通过"),
    y_nopass(4, "易宝审核不通过"),
    y_trialpass(5,"易宝初审通过");

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private YibaoStatusEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static YibaoStatusEnums valueOf(int value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return P_audit;
            /*case 1:
                return p_pass;*/
            case 1:
                return y_audit;
            case 2:
                return y_pass;
            case 3:
                return p_nopass;
            case 4:
                return y_nopass;
            case 5:
                return y_trialpass;
            default:
                return P_audit;
        }
    }
}
