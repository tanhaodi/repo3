package com.fly.vo.bean;

import java.util.Date;

/**
 * @Author: dlz
 * @Date: 2019/3/11 10:48
 * @Version 1.0
 */
public class AlbumPictureRelationBean {
  private String albumId;
  private String pictureSpaceId;
  private Date createDate;
  private Date updateDate;
  private int deleteFlag;

  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String albumId) {
    this.albumId = albumId;
  }

  public String getPictureSpaceId() {
    return pictureSpaceId;
  }

  public void setPictureSpaceId(String pictureSpaceId) {
    this.pictureSpaceId = pictureSpaceId;
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
}
