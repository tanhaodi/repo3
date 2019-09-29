package com.fly.vo.enums;

/**
 * describe 描述：订单计算收益状态
 * @author 作者 liguan 
 * @date 创建时间：2019年4月13日 下午5:18:12
 */
public enum OrderProfitStatusEnum {
	PROFIT_NONE(0, "未计算"),
	PROFIT_CONFIRM_CALC(1, "确定收益关系中"),
	PROFIT_CONFIRM_SUCCESS(2, "确定收益关系完成"),
	PROFIT_CALC(3, "收益计算中"),
	PROFIT_SUCCESS(4, "收益计算完成"),
	PROFIT_REFUND_CALC(5,  "退单计算中"),
	PROFIT_REFUND_SUCCESS(6,  "退单计算完成"),
	UNFREEZE_CALC(7,"解冻计算中"),
	UNFREEZE_SUCCESS(8,"解冻计算完成");

    private int code; // 错误代码
    private String msg; // 错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private OrderProfitStatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static OrderProfitStatusEnum valueOf(int value) { // 手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return PROFIT_NONE;
            case 1:
                return PROFIT_CONFIRM_CALC;
            case 2:
                return PROFIT_CONFIRM_SUCCESS;
            case 3:
                return PROFIT_CALC;
            case 4:
                return PROFIT_SUCCESS;
            case 5:
                return PROFIT_REFUND_CALC;
            case 6:
                return PROFIT_REFUND_SUCCESS;
            case 7:
                return UNFREEZE_CALC;
            case 8:
                return UNFREEZE_SUCCESS;
            default:
                return PROFIT_NONE;
        }
    }
}
