/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;


/**
 * comStamp
 */
public class ComStamp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 最多盖章数目（默认10）
     */
    private Integer stampMax;

    /**
     * 盖章类型（0 坐标 1 关键字 默认1 ）
     */
    private Integer signPositionType;

    /**
     * 盖章关键字（与坐标二选一）
     */
    private String keyword;

    /**
     * 盖章X坐标（与关键字二选一）
     */
    private Integer positionX;

    /**
     * 盖章Y坐标（与关键字二选一）
     */
    private Integer positionY;

    /**
     * 盖章X坐标偏移量（配合positionX）
     */
    private Integer offsetX;

    /**
     * 盖章Y坐标偏移量（配合positionY）
     */
    private Integer offsetY;

    /**
     * 盖章页码（选择坐标盖章时需要）
     */
    private Integer page;

    /**
     * 印章名称
     */
    private String sealName;

    /**
     * 印章图像base64(建议png格式,不传使用默认圆形章)
     */
    private String imageB64;

    /**
     * 印章ID
     */
    private String stampId;

    /**
     * 印章描述
     */
    private String desc;

    /**
     * 是否作为以后签章默认章
     */
    private Boolean isDefault;

    /**
     * 图片类型，只支持png格式
     */
    private String imageType;

    /**
     * 图片大小，高度*宽度
     */
    private Integer imageSize;

    /**
     * 图片高度
     */
    private Integer imageHeight;

    /**
     * 图片宽度
     */
    private Integer imageWidth;

    /**
     * 公司名称
     */
    private String orgName;

    /**
     * 法人姓名
     */
    private String legalPersonName;

    /**
     * 代办人姓名
     */
    private String transactorName;

    /**
     * 代办人身份证号码
     */
    private String transactorIdCardNum;

    /**
     * 代办人手机号
     */
    private String transactorMobile;

    /**
     * 标记字段 - usci(统一社会信用码) orgCode（组织机构代码） businessNum （工商营业执照号）
     */
    private String identifyType;

    /**
     * 标记值
     */
    private String identifyValue;


    /**
     * get 最多盖章数目（默认10）
     *
     * @return
     */
    public Integer getStampMax() {
        return stampMax;
    }

    /**
     * set 最多盖章数目（默认10）
     *
     * @param stampMax
     */
    public void setStampMax(Integer stampMax) {
        this.stampMax = stampMax;
    }

    /**
     * get 盖章类型（0 坐标 1 关键字 默认1 ）
     *
     * @return
     */
    public Integer getSignPositionType() {
        return signPositionType;
    }

    /**
     * set 盖章类型（0 坐标 1 关键字 默认1 ）
     *
     * @param signPositionType
     */
    public void setSignPositionType(Integer signPositionType) {
        this.signPositionType = signPositionType;
    }

    /**
     * get 盖章关键字（与坐标二选一）
     *
     * @return
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * set 盖章关键字（与坐标二选一）
     *
     * @param keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * get 盖章X坐标（与关键字二选一）
     *
     * @return
     */
    public Integer getPositionX() {
        return positionX;
    }

    /**
     * set 盖章X坐标（与关键字二选一）
     *
     * @param positionX
     */
    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    /**
     * get 盖章Y坐标（与关键字二选一）
     *
     * @return
     */
    public Integer getPositionY() {
        return positionY;
    }

    /**
     * set 盖章Y坐标（与关键字二选一）
     *
     * @param positionY
     */
    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    /**
     * get 盖章X坐标偏移量（配合positionX）
     *
     * @return
     */
    public Integer getOffsetX() {
        return offsetX;
    }

    /**
     * set 盖章X坐标偏移量（配合positionX）
     *
     * @param offsetX
     */
    public void setOffsetX(Integer offsetX) {
        this.offsetX = offsetX;
    }

    /**
     * get 盖章Y坐标偏移量（配合positionY）
     *
     * @return
     */
    public Integer getOffsetY() {
        return offsetY;
    }

    /**
     * set 盖章Y坐标偏移量（配合positionY）
     *
     * @param offsetY
     */
    public void setOffsetY(Integer offsetY) {
        this.offsetY = offsetY;
    }

    /**
     * get 盖章页码（选择坐标盖章时需要）
     *
     * @return
     */
    public Integer getPage() {
        return page;
    }

    /**
     * set 盖章页码（选择坐标盖章时需要）
     *
     * @param page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * get 印章名称
     *
     * @return
     */
    public String getSealName() {
        return sealName;
    }

    /**
     * set 印章名称
     *
     * @param sealName
     */
    public void setSealName(String sealName) {
        this.sealName = sealName;
    }

    /**
     * get 印章图像base64(建议png格式,不传使用默认圆形章)
     *
     * @return
     */
    public String getImageB64() {
        return imageB64;
    }

    /**
     * set 印章图像base64(建议png格式,不传使用默认圆形章)
     *
     * @param imageB64
     */
    public void setImageB64(String imageB64) {
        this.imageB64 = imageB64;
    }

    /**
     * get 印章ID
     *
     * @return
     */
    public String getStampId() {
        return stampId;
    }

    /**
     * set 印章ID
     *
     * @param stampId
     */
    public void setStampId(String stampId) {
        this.stampId = stampId;
    }

    /**
     * get 印章描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 印章描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * get 是否作为以后签章默认章
     *
     * @return
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * set 是否作为以后签章默认章
     *
     * @param isDefault
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * get 图片类型，只支持png格式
     *
     * @return
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * set 图片类型，只支持png格式
     *
     * @param imageType
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     * get 图片大小，高度*宽度
     *
     * @return
     */
    public Integer getImageSize() {
        return imageSize;
    }

    /**
     * set 图片大小，高度*宽度
     *
     * @param imageSize
     */
    public void setImageSize(Integer imageSize) {
        this.imageSize = imageSize;
    }

    /**
     * get 图片高度
     *
     * @return
     */
    public Integer getImageHeight() {
        return imageHeight;
    }

    /**
     * set 图片高度
     *
     * @param imageHeight
     */
    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     * get 图片宽度
     *
     * @return
     */
    public Integer getImageWidth() {
        return imageWidth;
    }

    /**
     * set 图片宽度
     *
     * @param imageWidth
     */
    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     * get 公司名称
     *
     * @return
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * set 公司名称
     *
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * get 法人姓名
     *
     * @return
     */
    public String getLegalPersonName() {
        return legalPersonName;
    }

    /**
     * set 法人姓名
     *
     * @param legalPersonName
     */
    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    /**
     * get 代办人姓名
     *
     * @return
     */
    public String getTransactorName() {
        return transactorName;
    }

    /**
     * set 代办人姓名
     *
     * @param transactorName
     */
    public void setTransactorName(String transactorName) {
        this.transactorName = transactorName;
    }

    /**
     * get 代办人身份证号码
     *
     * @return
     */
    public String getTransactorIdCardNum() {
        return transactorIdCardNum;
    }

    /**
     * set 代办人身份证号码
     *
     * @param transactorIdCardNum
     */
    public void setTransactorIdCardNum(String transactorIdCardNum) {
        this.transactorIdCardNum = transactorIdCardNum;
    }

    /**
     * get 代办人手机号
     *
     * @return
     */
    public String getTransactorMobile() {
        return transactorMobile;
    }

    /**
     * set 代办人手机号
     *
     * @param transactorMobile
     */
    public void setTransactorMobile(String transactorMobile) {
        this.transactorMobile = transactorMobile;
    }

    /**
     * get 标记字段 - usci(统一社会信用码) orgCode（组织机构代码） businessNum （工商营业执照号）
     *
     * @return
     */
    public String getIdentifyType() {
        return identifyType;
    }

    /**
     * set 标记字段 - usci(统一社会信用码) orgCode（组织机构代码） businessNum （工商营业执照号）
     *
     * @param identifyType
     */
    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    /**
     * get 标记值
     *
     * @return
     */
    public String getIdentifyValue() {
        return identifyValue;
    }

    /**
     * set 标记值
     *
     * @param identifyValue
     */
    public void setIdentifyValue(String identifyValue) {
        this.identifyValue = identifyValue;
    }


    /**
     * set 最多盖章数目（默认10）
     *
     * @param stampMax
     */
    public ComStamp stampMax(Integer stampMax) {
        this.stampMax = stampMax;
        return this;
    }

    /**
     * set 盖章类型（0 坐标 1 关键字 默认1 ）
     *
     * @param signPositionType
     */
    public ComStamp signPositionType(Integer signPositionType) {
        this.signPositionType = signPositionType;
        return this;
    }

    /**
     * set 盖章关键字（与坐标二选一）
     *
     * @param keyword
     */
    public ComStamp keyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * set 盖章X坐标（与关键字二选一）
     *
     * @param positionX
     */
    public ComStamp positionX(Integer positionX) {
        this.positionX = positionX;
        return this;
    }

    /**
     * set 盖章Y坐标（与关键字二选一）
     *
     * @param positionY
     */
    public ComStamp positionY(Integer positionY) {
        this.positionY = positionY;
        return this;
    }

    /**
     * set 盖章X坐标偏移量（配合positionX）
     *
     * @param offsetX
     */
    public ComStamp offsetX(Integer offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    /**
     * set 盖章Y坐标偏移量（配合positionY）
     *
     * @param offsetY
     */
    public ComStamp offsetY(Integer offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    /**
     * set 盖章页码（选择坐标盖章时需要）
     *
     * @param page
     */
    public ComStamp page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * set 印章名称
     *
     * @param sealName
     */
    public ComStamp sealName(String sealName) {
        this.sealName = sealName;
        return this;
    }

    /**
     * set 印章图像base64(建议png格式,不传使用默认圆形章)
     *
     * @param imageB64
     */
    public ComStamp imageB64(String imageB64) {
        this.imageB64 = imageB64;
        return this;
    }

    /**
     * set 印章ID
     *
     * @param stampId
     */
    public ComStamp stampId(String stampId) {
        this.stampId = stampId;
        return this;
    }

    /**
     * set 印章描述
     *
     * @param desc
     */
    public ComStamp desc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * set 是否作为以后签章默认章
     *
     * @param isDefault
     */
    public ComStamp isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * set 图片类型，只支持png格式
     *
     * @param imageType
     */
    public ComStamp imageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * set 图片大小，高度*宽度
     *
     * @param imageSize
     */
    public ComStamp imageSize(Integer imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * set 图片高度
     *
     * @param imageHeight
     */
    public ComStamp imageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }

    /**
     * set 图片宽度
     *
     * @param imageWidth
     */
    public ComStamp imageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }

    /**
     * set 公司名称
     *
     * @param orgName
     */
    public ComStamp orgName(String orgName) {
        this.orgName = orgName;
        return this;
    }

    /**
     * set 法人姓名
     *
     * @param legalPersonName
     */
    public ComStamp legalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }

    /**
     * set 代办人姓名
     *
     * @param transactorName
     */
    public ComStamp transactorName(String transactorName) {
        this.transactorName = transactorName;
        return this;
    }

    /**
     * set 代办人身份证号码
     *
     * @param transactorIdCardNum
     */
    public ComStamp transactorIdCardNum(String transactorIdCardNum) {
        this.transactorIdCardNum = transactorIdCardNum;
        return this;
    }

    /**
     * set 代办人手机号
     *
     * @param transactorMobile
     */
    public ComStamp transactorMobile(String transactorMobile) {
        this.transactorMobile = transactorMobile;
        return this;
    }

    /**
     * set 标记字段 - usci(统一社会信用码) orgCode（组织机构代码） businessNum （工商营业执照号）
     *
     * @param identifyType
     */
    public ComStamp identifyType(String identifyType) {
        this.identifyType = identifyType;
        return this;
    }

    /**
     * set 标记值
     *
     * @param identifyValue
     */
    public ComStamp identifyValue(String identifyValue) {
        this.identifyValue = identifyValue;
        return this;
    }


}