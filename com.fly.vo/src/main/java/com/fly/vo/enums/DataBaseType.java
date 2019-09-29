package com.fly.vo.enums;

/**
 * Created by Administrator on 2015/11/12.
 */
public class DataBaseType {

    /**
     * 主数据库
     * 设置server_config表的database_type字段为0
     */
    public final static int BASE_DATA = 0;

    /**
     * 订单库
     * 设置server_config表的database_type字段为1
     */
    public final static int ORDER_DATA = 1;

    /**
     * 系统日志库的数据库连接字符串的类型
     * 设置server_config表的database_type字段为2
     */
    public final static int SYS_LOG = 2;

    /**
     * 订单的交易日志库的数据库连接字符串的类型
     * 设置server_config表的database_type字段为3
     */
    public final static int ORDER_LOG = 3;

    /**
     * 用户地址库和邀请码库
     * 设置member表的database_type字段为4
     */
    public final static int MEMBER_DATA = 4;

    /**
     * 收益库
     * 设置server_config表的database_type字段为5
     */
    public final static int PROFIT_DATA = 5;

    /**
     * 业绩库
     * 设置server_config表的database_type字段为6
     */
    public final static int ACHIVEMENT_DATA = 6;

    /**
     * 评论库
     * 设置server_config表的database_type字段为7
     */
    public final static int COMMENT_DATA = 7;

    /**
     * 产品库
     * 设置server_config表的database_type字段为8
     */
    public final static int PRODUCT_DATA = 8;
    
    /**
     * 店铺库
     * 设置店铺退换货地址表的database_type字段为9
     */
    public final static int STORE_DATA = 9;
}
