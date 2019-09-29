package com.fly.vo.enums;

/**
 * describe 描述：会员消息类型
 * @author 作者 liguan
 * @date 创建时间：2018年8月23日 上午9:39:04
 */
public enum MemberMessageTypeEnums {
    SysMsg(0, "系统消息"),
    RegistMsg(1,"注册消息"),
    RegistNextMsg(2,"下级注册消息"),
    UpGradeMsg(3,"升级消息"),
    UpGradeNextMsg(4,"下级升级消息"),
    OrderPayMsg(5,"订单支付消息"),
    OrderExchangeMsg(6,"积分兑换"),
    ShipOrderMsg(7,"发货消息"),
    ReceiveOrderMsg(8,"确认收货消息"),
    AppRefundMonery(9,"申请退款"),
    AppRefundGood(10,"申请退货"),
    RefundMoneySuccess(11,"退单成功消息"),
    ProfitMsg(12,"收益消息"),
    FreezeAccountMsg(13,"账户冻结"),
    FreezeScoreMsg(14,"积分冻结"),
    FreezeMoneyMsg(15,"零钱冻结"),
    TrsOutMsg(16,"转账消息"),
    pushMsg(17,"推送消息"),
    UnFreezeOp(18,"解冻收益后的消息"),
	SENDAPPLY(19,"注册审核消息");

    private int code; //错误代码
    private String msg; //错误消息
    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
    private MemberMessageTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static MemberMessageTypeEnums valueOf(Integer value) {    //    手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return RegistMsg;
            case 2:
                return RegistNextMsg;
            case 3:
                return UpGradeMsg;
            case 4:
                return UpGradeNextMsg;
            case 5:
                return OrderPayMsg;
            case 6:
                return OrderExchangeMsg;
            case 7:
                return ShipOrderMsg;
            case 8:
                return ReceiveOrderMsg;
            case 9:
                return AppRefundMonery;
            case 10:
                return AppRefundGood;
            case 11:
                return RefundMoneySuccess;
            case 12:
                return ProfitMsg;
            case 13:
                return FreezeAccountMsg;
            case 14:
                return FreezeScoreMsg;
            case 15:
                return FreezeMoneyMsg;
            case 16:
                return TrsOutMsg;
            case 17:
                return pushMsg;
            case 18:
            	return UnFreezeOp;
            case 19:
            	return SENDAPPLY;
            default:
                return SysMsg;
        }
    }
}
