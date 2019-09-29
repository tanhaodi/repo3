package com.fly.vo.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
public class YibaoUserBasicBean {
  private String yibaoUserBasicId;
  private String storeId;
  private String storeName;
  private String memberId;
  /**
   * 类型 0 个人 1 个体工商户 2 企业
   */
  private int type;
  /**
   * 状态 0 平台审核中 1 平台审核通过 2 易宝审核中 3 易宝审核通过 4 平台审核不通过 5 易宝审核不通过
   */
  private int status;
  private String statusStr;
  /**
   * 入网请求号, 字母加字符串组合，不要带特殊符号
   */
  private String requestNo="";
  /**
   * 商户全称 必须与营业执照或其他资质证明上的名称一致
   */
  private String merFullName="";
  /**`
   * 商户品牌名称/简称
   */
  private String merShortName="";
  /**
   * 证件类型 企业：“营业执照”或者“统一社会信用代码证” 枚举值 UNI_CREDIT_CODE=统一社会信用代码证；CORP_CODE ＝营业执照
   */
  private String merCertType="";
  /**
   * 证件号 为所对应的证件类型的证件编号
   */
  private String merCertNo="";
  /**
   * 法人姓名
   */
  private String legalName="";
  /**
   * 法人身份证号
   */
  private String legalIdcard="";
  /**
   * 商户联系人
   */
  private String merlegalPhone="";
  /**
   * 商户法人邮箱
   */
  private String merlegalEmail="";
  /**
   * 商户一级分类编码
   */
  private String merlevel1No="";
  /**
   * 商户二级分类编码
   */
  private String merlevel2No="";
  /**
   * 商户一级分类名称
   */
  private String merlevel1Name="";
  /**
   * 商户二级分类名称
   */
  private String merlevel2Name="";
  /**
   * 商户经营地址所在省
   */
  private String merProvince="";
  /**
   * 商户经营地址所在市
   */
  private String merCity="";
  /**
   * 商户经营地址所在区
   */
  private String merDistrict="";
  /**
   * 商户经营地址所在省
   */
  private String merProvinceName="";
  /**
   * 商户经营地址所在市
   */
  private String merCityName="";
  /**
   * 商户经营地址所在区
   */
  private String merDistrictName="";
  /**
   * 商户经营地址所在具体地址
   */
  private String merAddress="";
  /**
   * 商户经营范围
   */
  private String merScope="";
  /**
   * 商户联系人姓名
   */
  private String merContactName="";
  /**
   * 商户联系人手机
   */
  private String merContactPhone="";
  /**
   * 商户联系人邮箱
   */
  private String merContactEmail="";
  /**
   * 税务登记证编号 签约类型为“ 企业” ， 且证件类型为“ 营业执照”，则必填
   */
  private String taxRegistCert="";
  /**
   * 开户许可证编号
   */
  private String accountLicense="";
  /**
   * 组织机构代码证 签约类型为“ 企业” ， 且证件类型为“ 营业执照”，则必填
   */
  private String orgCode="";
  /**
   * 组织机构代码证是否长期有效 0 否 1 是
   */
  private String isOrgCodeLong;
  /**
   * 组织机构代理证有效期 签约类型为“ 企业” ， 且证件类型为“ 营业执照”，则必填如果为长期有效则不填；时间格式：YYYY-MM-DD
   */
  private Date orgCodeExpiry;
  /**
   * 银行账户 结算银行账号或者银行卡号
   */
  private String cardNo="";
  /**
   * 开户银行总行编码
   */
  private String headBankCode="";
  /**
   * 开户银行名称
   */
  private String headBankName="";
  /**
   * 开户行支行编码 可通过支行信息接口查询要求传递编码
   */
  private String bankCode="";
  /**
   * 开户行支行名称
   */
  private String subBankName="";
  /**
   * 开户省 要求传递编码
   */
  private String bankProvince="";
  /**
   * 开户市 要求传递编码
   */
  private String bankCity="";
  /**
   * 开通产品
   */
  private String productinfo="";
  /**
   * 资质影印件
   */
  private String fileinfo="";

  private String[] fileinfoArry;
  /**
   * 业务功能
   */
  private String businessFunction="";
  /**
   * 提交资料到易宝用
   */
  List<Map<String,Object>> yb;
  /**
   * 易宝的图片地址
   */
  Map<String,Object> yb1;
  /**
   * 平台的图片地址
   */
  Map<String,Object> pf;


  /**
   * 备注
   */
  private String remark="";
  private Date createDate;
  private Date updateDate;
  private int deleteFlag;

  public String getYibaoUserBasicId() {
    return yibaoUserBasicId;
  }

  public void setYibaoUserBasicId(String yibaoUserBasicId) {
    this.yibaoUserBasicId = yibaoUserBasicId;
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

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public String getStatusStr() {
    return statusStr;
  }

  public void setStatusStr(String statusStr) {
    this.statusStr = statusStr;
  }

  public String getRequestNo() {
    return requestNo;
  }

  public void setRequestNo(String requestNo) {
    this.requestNo = requestNo;
  }

  public String getMerFullName() {
    return merFullName;
  }

  public void setMerFullName(String merFullName) {
    this.merFullName = merFullName;
  }

  public String getMerShortName() {
    return merShortName;
  }

  public void setMerShortName(String merShortName) {
    this.merShortName = merShortName;
  }

  public String getMerCertType() {
    return merCertType;
  }

  public void setMerCertType(String merCertType) {
    this.merCertType = merCertType;
  }

  public String getMerCertNo() {
    return merCertNo;
  }

  public void setMerCertNo(String merCertNo) {
    this.merCertNo = merCertNo;
  }

  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public String getLegalIdcard() {
    return legalIdcard;
  }

  public void setLegalIdcard(String legalIdcard) {
    this.legalIdcard = legalIdcard;
  }

  public String getMerlegalPhone() {
    return merlegalPhone;
  }

  public void setMerlegalPhone(String merlegalPhone) {
    this.merlegalPhone = merlegalPhone;
  }

  public String getMerlegalEmail() {
    return merlegalEmail;
  }

  public void setMerlegalEmail(String merlegalEmail) {
    this.merlegalEmail = merlegalEmail;
  }

  public String getMerlevel1No() {
    return merlevel1No;
  }

  public void setMerlevel1No(String merlevel1No) {
    this.merlevel1No = merlevel1No;
  }

  public String getMerlevel2No() {
    return merlevel2No;
  }

  public void setMerlevel2No(String merlevel2No) {
    this.merlevel2No = merlevel2No;
  }

  public String getMerlevel1Name() {
    return merlevel1Name;
  }

  public void setMerlevel1Name(String merlevel1Name) {
    this.merlevel1Name = merlevel1Name;
  }

  public String getMerlevel2Name() {
    return merlevel2Name;
  }

  public void setMerlevel2Name(String merlevel2Name) {
    this.merlevel2Name = merlevel2Name;
  }

  public String getMerProvince() {
    return merProvince;
  }

  public void setMerProvince(String merProvince) {
    this.merProvince = merProvince;
  }

  public String getMerCity() {
    return merCity;
  }

  public void setMerCity(String merCity) {
    this.merCity = merCity;
  }

  public String getMerDistrict() {
    return merDistrict;
  }

  public void setMerDistrict(String merDistrict) {
    this.merDistrict = merDistrict;
  }

  public String getMerProvinceName() {
    return merProvinceName;
  }

  public void setMerProvinceName(String merProvinceName) {
    this.merProvinceName = merProvinceName;
  }

  public String getMerCityName() {
    return merCityName;
  }

  public void setMerCityName(String merCityName) {
    this.merCityName = merCityName;
  }

  public String getMerDistrictName() {
    return merDistrictName;
  }

  public void setMerDistrictName(String merDistrictName) {
    this.merDistrictName = merDistrictName;
  }

  public String getMerAddress() {
    return merAddress;
  }

  public void setMerAddress(String merAddress) {
    this.merAddress = merAddress;
  }

  public String getMerScope() {
    return merScope;
  }

  public void setMerScope(String merScope) {
    this.merScope = merScope;
  }

  public String getMerContactName() {
    return merContactName;
  }

  public void setMerContactName(String merContactName) {
    this.merContactName = merContactName;
  }

  public String getMerContactPhone() {
    return merContactPhone;
  }

  public void setMerContactPhone(String merContactPhone) {
    this.merContactPhone = merContactPhone;
  }

  public String getMerContactEmail() {
    return merContactEmail;
  }

  public void setMerContactEmail(String merContactEmail) {
    this.merContactEmail = merContactEmail;
  }

  public String getTaxRegistCert() {
    return taxRegistCert;
  }

  public void setTaxRegistCert(String taxRegistCert) {
    this.taxRegistCert = taxRegistCert;
  }

  public String getAccountLicense() {
    return accountLicense;
  }

  public void setAccountLicense(String accountLicense) {
    this.accountLicense = accountLicense;
  }

  public String getOrgCode() {
    return orgCode;
  }

  public void setOrgCode(String orgCode) {
    this.orgCode = orgCode;
  }

  public String getIsOrgCodeLong() {
    return isOrgCodeLong;
  }

  public void setIsOrgCodeLong(String isOrgCodeLong) {
    this.isOrgCodeLong = isOrgCodeLong;
  }

  public Date getOrgCodeExpiry() {
    return orgCodeExpiry;
  }

  public void setOrgCodeExpiry(Date orgCodeExpiry) {
    this.orgCodeExpiry = orgCodeExpiry;
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public String getHeadBankCode() {
    return headBankCode;
  }

  public void setHeadBankCode(String headBankCode) {
    this.headBankCode = headBankCode;
  }

  public String getHeadBankName() {
    return headBankName;
  }

  public void setHeadBankName(String headBankName) {
    this.headBankName = headBankName;
  }

  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public String getSubBankName() {
    return subBankName;
  }

  public void setSubBankName(String subBankName) {
    this.subBankName = subBankName;
  }

  public String getBankProvince() {
    return bankProvince;
  }

  public void setBankProvince(String bankProvince) {
    this.bankProvince = bankProvince;
  }

  public String getBankCity() {
    return bankCity;
  }

  public void setBankCity(String bankCity) {
    this.bankCity = bankCity;
  }

  public String getProductinfo() {
    return productinfo;
  }

  public void setProductinfo(String productinfo) {
    this.productinfo = productinfo;
  }

  public String getFileinfo() {
    return fileinfo;
  }

  public void setFileinfo(String fileinfo) {
    this.fileinfo = fileinfo;
  }

  public String[] getFileinfoArry() {
    return fileinfoArry;
  }

  public void setFileinfoArry(String[] fileinfoArry) {
    this.fileinfoArry = fileinfoArry;
  }

  public String getBusinessFunction() {
    return businessFunction;
  }

  public void setBusinessFunction(String businessFunction) {
    this.businessFunction = businessFunction;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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

  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public Map<String, Object> getYb1() {
    return yb1;
  }

  public void setYb1(Map<String, Object> yb1) {
    this.yb1 = yb1;
  }


  public List<Map<String, Object>> getYb() {
    return yb;
  }

  public void setYb(List<Map<String, Object>> yb) {
    this.yb = yb;
  }


  public Map<String, Object> getPf() {
    return pf;
  }

  public void setPf(Map<String, Object> pf) {
    this.pf = pf;
  }
}
