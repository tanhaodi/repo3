package com.fly.vo.guanyi;

import java.util.List;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description: 添加产品响应参数
 * @Date: 2017/4/29 15:39
 */
public class GY_Add_Product_Response {
    private boolean success ;
    private String subErrorCode;
    private String errorCode;
    private String errorDesc;
    private String subErrorDesc;
    private String requestMethod;
    private String id;
    private String code;
    private String created;
    private String modified;
    private List<GY_Add_Sku_Response> skus;
    private String methodName;


    public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public boolean getSuccess() {

        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getSubErrorCode() {
        return subErrorCode;
    }

    public void setSubErrorCode(String subErrorCode) {
        this.subErrorCode = subErrorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public List<GY_Add_Sku_Response> getSkus() {
        return skus;
    }

    public void setSkus(List<GY_Add_Sku_Response> skus) {
        this.skus = skus;
    }


}
