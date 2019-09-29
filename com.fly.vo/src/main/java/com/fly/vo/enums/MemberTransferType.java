package com.fly.vo.enums;

/**
 * Created with IntelliJ IDEA.
 * User: qiujingwang
 * Date: 2016/2/22
 * Description:转账业务表类型（失败类型）
 */
public enum MemberTransferType {
    Unknow(0, "未知"),
    TRANSFER_IN(1, "转入"),
    TRANSFER_OUT(2, "转出"),
    PAY_MENT(6, "支出"),
    PAY_MENT_FOR_PROXY(7, "代报单支出")    ;


    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private MemberTransferType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MemberTransferType valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return Unknow;

            case 1:
                return TRANSFER_IN;
            case 2:
                return TRANSFER_OUT;
            case 6:
                return PAY_MENT;
            case 7:
                return PAY_MENT_FOR_PROXY;
            default:
                return Unknow;
        }
    }
}
