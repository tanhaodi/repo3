package com.fly.vo.bean;

import java.util.Date;

/**
 * @Author: dlz
 * @Date: 2019/3/11 10:48
 * @Version 1.0
 */
public class AlbumBean {
  private String albumId;
  private String name;
  /**
   * 包含视频和相片的总条数
   */
  private int count;
  private String storeId="0";
  private String memberId;
  private String albumImage;
  private long sortIndex;
  private String remark;
  private Date createDate;
  private Date updateDate;
  private int deleteFlag;

  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String albumId) {
    this.albumId = albumId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public String getAlbumImage() {
    return albumImage;
  }

  public void setAlbumImage(String albumImage) {
    this.albumImage = albumImage;
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

  public int getDeleteFlag() {
    return deleteFlag;
  }

  public void setDeleteFlag(int deleteFlag) {
    this.deleteFlag = deleteFlag;
  }

  public long getSortIndex() {
    return sortIndex;
  }

  public void setSortIndex(long sortIndex) {
    this.sortIndex = sortIndex;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
