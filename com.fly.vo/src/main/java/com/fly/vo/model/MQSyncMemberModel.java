package com.fly.vo.model;

import java.io.Serializable;

public class MQSyncMemberModel  implements Serializable{

	private static final long serialVersionUID = -6340992140207778056L;
	
	private int type;
	private String memberId;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
}
