package com.fly.vo.enums;

/**
* @ClassName: PageConfigTypeEnums
* @Description: TODO
* @author xupp
* @date 2019年3月11日
*/
public enum PageConfigTypeEnums {
	//0 首页 1 普通页 2 成为店主 3 秒杀(只有普通页允许存在多个)  4 店铺首页  5 卖场 6 开店礼包 7 html  8 个人中心广告页面
    Index(0,"首页"),
    General(1,"普通页"),
    ToBeStore(2,"成为SV2"),
    SecondKill(3,"秒杀"),
	ShopGiftBag(6,"开店礼包"),
    MemberCoreAdv(8,"个人中心广告页面'");
    //0、首页，1、普通页，2、成为店主，3、秒杀
    private int code; // 错误代码
    private String msg; // 错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private PageConfigTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static PageConfigTypeEnums valueOf(int value) { // 手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return Index;
            case 1:
                return General;
            case 2:
                return ToBeStore;
            case 3:
                return SecondKill;
            case 6:
            	return ShopGiftBag;
            case 7:
                return MemberCoreAdv;
            default:
                return Index;
        }
    }
}
