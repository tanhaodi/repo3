package com.fly.vo.bean;

import java.io.Serializable;
import java.util.List;

public class SkuCodeBean implements Serializable{

	private static final long serialVersionUID = 1803742070127304769L;
	
	private List<APISkuCodeBean> codeBeans;

	public List<APISkuCodeBean> getCodeBeans() {
		return codeBeans;
	}

	public void setCodeBeans(List<APISkuCodeBean> codeBeans) {
		this.codeBeans = codeBeans;
	}
	

}
