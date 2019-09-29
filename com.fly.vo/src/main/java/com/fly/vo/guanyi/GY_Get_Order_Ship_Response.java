package com.fly.vo.guanyi;

import java.util.List;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 获取到订单发货信息
 * @Date: 2017/5/4 19:47
 */
public class GY_Get_Order_Ship_Response {
    private boolean success;
    private String errorCode;
    private String subErrorCode;
    private String errorDesc;
    private String subErrorDesc;
    private String requestMethod;
    private String methodName;
    private List<GY_Get_Oder_Detail> orders;
    private Integer total;

    public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getSubErrorCode() {
        return subErrorCode;
    }

    public void setSubErrorCode(String subErrorCode) {
        this.subErrorCode = subErrorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getSubErrorDesc() {
        return subErrorDesc;
    }

    public void setSubErrorDesc(String subErrorDesc) {
        this.subErrorDesc = subErrorDesc;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public List<GY_Get_Oder_Detail> getOrders() {
        return orders;
    }

    public void setOrders(List<GY_Get_Oder_Detail> orders) {
        this.orders = orders;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
