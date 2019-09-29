package com.fly.vo.enums;

/**
 * describe 描述：权限规则
 * @author 作者 liguan 
 * @date 创建时间：2019年3月29日 下午7:32:05
 */
public enum RoleRuleEnums {
	//以8位2进制表示 1 表示有权限 0 表示没权限  
	//如：11110000 分别对应 增（有权限）、删（有权限）、改（有权限）、查（有权限）、导入（没权限）、导出（没权限）、#（没权限）、# （没权限）
	//其中#表示预留权
    add(1, "新增"),
    del(2, "删除"),
    edit(3, "编辑"),
    get(4, "查询"),
    input(5, "导入"),
	output(6, "导出");
	

    private int code; //错误代码
    private String msg; //错误消息

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private RoleRuleEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static RoleRuleEnums valueOf(int value) {  
        switch (value) {
            case 1:
                return add;
            case 2:
                return del;
            case 3:
                return edit;
            case 4:
                return get;
            case 5:
                return edit;
            case 6:
                return get;
            default:
                return get;
        }
    }
}
