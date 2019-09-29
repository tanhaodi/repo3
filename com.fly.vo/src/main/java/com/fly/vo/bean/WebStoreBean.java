package com.fly.vo.bean;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lenovo
 * @date 2017/2/18
 */
public class WebStoreBean implements Serializable {
    private static final long serialVersionUID = -2351230245175770397L;
    private String storeId;
    private String memberId;
    private String merchantNo;
    private String rate;
    private String proportion;
    private String foodBusinessLicense;
    private int isFood;
    //客服分组Id
    private String sobotId;
    private String customerName;
    private String customerId;
    private String userName;
    private String userPhone;
    private Integer status;
    private String  statusStr;
    private Integer storeType=0;
    private String storeTypeStr;
    private String storeName;
    private String thumbUrl;
    private String bannerImage;
    private String anotherName;
    private String contact;
    private String phone;
    private String province;
    private String city;
    private String district;
    private String address;
    private String company;
    private String businessLicense;
    private Integer saleProductCount=0;
    private Integer yibaoType;
    private String yibaoTypeStr;
    private Integer yibaostatus;
    private String yibaostatusStr;
    private Date createDate;
    private Date updateDate;
    private Integer deleteFlag;


    /**
     * 用于是否店铺是否关联erp（null未关联，0未同步，1已同步）
     */
    private Integer seType;
    private String seTypeStr;

    private int ningxia;
    private int neimenggu;
    private int xinjiang;
    private int gansu;
    private int qinghai;
    private int xizang;
    private long postage;
    private long remotePostage;
    private long timingPostage;
    private long timingRemotePostage;
    private String expressName;
    private String shipAddress;
    private Long profitSumMoney;
    private Integer xibeiFreeShipMoneyStatus;
    private long minFreeShipMoney = 0L;
    private String storeTagTypeId;


    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public String getFoodBusinessLicense() {
        return foodBusinessLicense;
    }

    public void setFoodBusinessLicense(String foodBusinessLicense) {
        this.foodBusinessLicense = foodBusinessLicense;
    }

    public int getIsFood() {
        return isFood;
    }

    public void setIsFood(int isFood) {
        this.isFood = isFood;
    }

    public String getSobotId() {
        return sobotId;
    }

    public void setSobotId(String sobotId) {
        this.sobotId = sobotId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public String getStoreTypeStr() {
        return storeTypeStr;
    }

    public void setStoreTypeStr(String storeTypeStr) {
        this.storeTypeStr = storeTypeStr;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getAnotherName() {
        return anotherName;
    }

    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public Integer getSaleProductCount() {
        return saleProductCount;
    }

    public void setSaleProductCount(Integer saleProductCount) {
        this.saleProductCount = saleProductCount;
    }

    public Integer getYibaoType() {
        return yibaoType;
    }

    public void setYibaoType(Integer yibaoType) {
        this.yibaoType = yibaoType;
    }

    public String getYibaoTypeStr() {
        return yibaoTypeStr;
    }

    public void setYibaoTypeStr(String yibaoTypeStr) {
        this.yibaoTypeStr = yibaoTypeStr;
    }

    public Integer getYibaostatus() {
        return yibaostatus;
    }

    public void setYibaostatus(Integer yibaostatus) {
        this.yibaostatus = yibaostatus;
    }

    public String getYibaostatusStr() {
        return yibaostatusStr;
    }

    public void setYibaostatusStr(String yibaostatusStr) {
        this.yibaostatusStr = yibaostatusStr;
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

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getSeType() {
        return seType;
    }

    public void setSeType(Integer seType) {
        this.seType = seType;
    }

    public String getSeTypeStr() {
        return seTypeStr;
    }

    public void setSeTypeStr(String seTypeStr) {
        this.seTypeStr = seTypeStr;
    }

    public int getNingxia() {
        return ningxia;
    }

    public void setNingxia(int ningxia) {
        this.ningxia = ningxia;
    }

    public int getNeimenggu() {
        return neimenggu;
    }

    public void setNeimenggu(int neimenggu) {
        this.neimenggu = neimenggu;
    }

    public int getXinjiang() {
        return xinjiang;
    }

    public void setXinjiang(int xinjiang) {
        this.xinjiang = xinjiang;
    }

    public int getGansu() {
        return gansu;
    }

    public void setGansu(int gansu) {
        this.gansu = gansu;
    }

    public int getQinghai() {
        return qinghai;
    }

    public void setQinghai(int qinghai) {
        this.qinghai = qinghai;
    }

    public int getXizang() {
        return xizang;
    }

    public void setXizang(int xizang) {
        this.xizang = xizang;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public Long getProfitSumMoney() {
        return profitSumMoney;
    }

    public void setProfitSumMoney(Long profitSumMoney) {
        this.profitSumMoney = profitSumMoney;
    }

    public Integer getXibeiFreeShipMoneyStatus() {
        return xibeiFreeShipMoneyStatus;
    }

    public void setXibeiFreeShipMoneyStatus(Integer xibeiFreeShipMoneyStatus) {
        this.xibeiFreeShipMoneyStatus = xibeiFreeShipMoneyStatus;
    }

    public long getMinFreeShipMoney() {
        return minFreeShipMoney;
    }

    public void setMinFreeShipMoney(long minFreeShipMoney) {
        this.minFreeShipMoney = minFreeShipMoney;
    }

    public String getStoreTagTypeId() {
        return storeTagTypeId;
    }

    public void setStoreTagTypeId(String storeTagTypeId) {
        this.storeTagTypeId = storeTagTypeId;
    }
}
