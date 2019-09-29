package com.fly.vo.bean;

import java.io.Serializable;
import java.util.Date;

public class StorePostageBean implements Serializable{
	private static final long serialVersionUID = -6267439310162147339L;

	private String storeId;
	private int type;
	private int status;
	private long postage;
	private long remotePostage;
	private long timingPostage;
	private long timingRemotePostage;
	private int qinghai;
	private int tibet;
	private int gansu;
	private int xinjiang;
	private int innerMongolia;
	private int ningxia;
	private Date startDate;
	private Date endDate;
	private Date createDate;
	private Date updateDate;
	
	public long getTimingPostage() {
		return timingPostage;
	}
	public void setTimingPostage(long timingPostage) {
		this.timingPostage = timingPostage;
	}
	public long getTimingRemotePostage() {
		return timingRemotePostage;
	}
	public void setTimingRemotePostage(long timingRemotePostage) {
		this.timingRemotePostage = timingRemotePostage;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getPostage() {
		return postage;
	}
	public void setPostage(long postage) {
		this.postage = postage;
	}
	public long getRemotePostage() {
		return remotePostage;
	}
	public void setRemotePostage(long remotePostage) {
		this.remotePostage = remotePostage;
	}
	public int getQinghai() {
		return qinghai;
	}
	public void setQinghai(int qinghai) {
		this.qinghai = qinghai;
	}
	public int getTibet() {
		return tibet;
	}
	public void setTibet(int tibet) {
		this.tibet = tibet;
	}
	public int getGansu() {
		return gansu;
	}
	public void setGansu(int gansu) {
		this.gansu = gansu;
	}
	public int getXinjiang() {
		return xinjiang;
	}
	public void setXinjiang(int xinjiang) {
		this.xinjiang = xinjiang;
	}
	public int getInnerMongolia() {
		return innerMongolia;
	}
	public void setInnerMongolia(int innerMongolia) {
		this.innerMongolia = innerMongolia;
	}
	public int getNingxia() {
		return ningxia;
	}
	public void setNingxia(int ningxia) {
		this.ningxia = ningxia;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
