package com.fly.vo.bean;

/**
 * @Author: Geoffrey
 * @Packager: com.fly.dao.directsale.log
 * @company: Kanger
 * @Description: epr同步日志
 * @Date: 2017/5/3 10:12
 */
public class SendErpLogBean {
    private String code;
    private String syncName;
    private Integer syncStatus = 0;
    private Integer type = 0;
    private String sysName;
    private String resultLog;
    private String createDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSyncName() {
        return syncName;
    }

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    public Integer getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(Integer syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getResultLog() {
        return resultLog;
    }

    public void setResultLog(String expressLog) {
        this.resultLog = expressLog;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
