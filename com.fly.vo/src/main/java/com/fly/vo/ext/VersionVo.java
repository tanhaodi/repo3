package com.fly.vo.ext;

import java.io.Serializable;

public class VersionVo implements Serializable {

	private String version;
    //0不需要升级，1有升级不强制，2有升级必须升级
    private Integer status=0;

    private String msg;

	public String getVersion() {
		return version;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
    
}
