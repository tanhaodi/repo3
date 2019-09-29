package com.fly.vo.bean;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.express.guanyi
 * @company: Kanger
 * @Description:
 * @Date: 2017/5/9 14:47
 */
public class GY_Refund_Response {
    private boolean success;
    private String errorCode;
    private String subErrorCode;
    private String errorDesc;
    private String subErrorDesc;
    private String requestMethod;
    private String code;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
