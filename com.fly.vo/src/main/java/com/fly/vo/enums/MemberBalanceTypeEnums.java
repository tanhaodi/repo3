package com.fly.vo.enums;

/**
 * Created by Administrator on 2015/10/22.
 */
public enum MemberBalanceTypeEnums {
    Unknow(0, "默认"),
    GetCash(1, "充值"),
    OutPay(2, "消费"),
    ToPay(3, "管理员调整"),
    OutPayBack(4, "零钱转出退回"),
    oldSysPay(5,"原系统零钱导入"),
    SystemAdd(6,"系统充值"),
    SystemSubtract(7,"系统扣减"),
    Lottery(13,"积分抽奖"),
    OldAward(65, "系统迁移"),
    CautionFill(8, "系统填充保证金"),
    CautionRefund(10,"退还保证金"),
    DealFailRefund(11,"提现失败退回零钱"),
    RedPacket(17,"领取红包");
    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private MemberBalanceTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static MemberBalanceTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return GetCash;
            case 2:
                return OutPay;
            case 3:
                return ToPay;
            case 4:
            	return OutPayBack;
            case 5:
            	return oldSysPay;
            case 6:
                return SystemAdd;
            case 7:
                return SystemSubtract;
            case 13:
                return Lottery;
            case 65:
                return OldAward;
            case 17:
            	return RedPacket;
            case 8:
            	return CautionFill;
            case 10:
            	return CautionRefund;
            case 11:
            	return DealFailRefund;
            default:
                return Unknow;
        }
    }
}
