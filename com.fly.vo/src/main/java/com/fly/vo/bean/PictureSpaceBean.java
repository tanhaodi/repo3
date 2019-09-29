package com.fly.vo.bean;

import java.util.Date;

/**
 * @Author: dlz
 * @Date: 2019/3/11 10:48
 * @Version 1.0
 */
public class PictureSpaceBean {
  private String pictureSpaceId;
  private String name;
  private String storeId;
  private String memberId;
  private int type;
  private String url;
  private String videoCoverImage;
  private Date createDate;
  private Date updateDate;
  private int deleteFlag;
  private String albumId;



  public String getPictureSpaceId() {
    return pictureSpaceId;
  }

  public void setPictureSpaceId(String pictureSpaceId) {
    this.pictureSpaceId = pictureSpaceId;
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

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getVideoCoverImage() {
    return videoCoverImage;
  }

  public void setVideoCoverImage(String videoCoverImage) {
    this.videoCoverImage = videoCoverImage;
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

  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String albumId) {
    this.albumId = albumId;
  }
}
