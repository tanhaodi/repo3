package com.fly.vo.enums;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.enums
 * @company: Kanger
 * @Description: 描述
 * @Date: 2017/2/16 16:52
 */
public enum  ProductTypeEnums {
    Gennel(0,"普通产品"),
    Present(1,"赠品"),
    Store(2,"开店礼包"),
    SecondKill(3,"秒杀产品"),
	Overseas(4,"海外购产品"),
	FullGive(5,"满送产品");

    private int code; //错误代码
    private String msg; //错误消息
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private ProductTypeEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public static  ProductTypeEnums valueOf(Integer type){
        switch (type){
            case 0:
                return Gennel;
            case 1:
                return Present;
            case 2:
                return Store;
            case 3:
                return SecondKill;
            case 4:
            	return Overseas;
            case 5:
            	return FullGive;
            default:
                return Gennel;
        }
    }
}
