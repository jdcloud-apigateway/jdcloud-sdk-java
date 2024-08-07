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
 * certSpec
 */
public class CertSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 个人用户姓名或企业名
     */
    private String userName;

    /**
     * 0：个人用户，1：企业用户
     */
    private Integer userType;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 证件号类型。个人用户：身份证（idCardNum）,护照（passportNum）,港澳通行证（mtpNum）,自定义（customUserId）。企业用户：统一社会信用代码（usci）,组织机构代码（orgCode）,工商营业执照（businessNum）,自定义（customUserId）
     */
    private String identifyField;

    /**
     * 证件号
     */
    private String identifyValue;

    /**
     * 证件渠道，目前仅有 四川CA（SXCA）
     */
    private String caType;

    /**
     * 证书算法 rsa、sm2
     */
    private String alg;

    /**
     * 1 事件证书(短期证书，证书有效期1天-30天) 0 普通证书（证书有效期一年）。默认为 0
     */
    private Integer certExpire;

    /**
     * P10
     */
    private String certReqBuf;



    /**
     * get 个人用户姓名或企业名
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 个人用户姓名或企业名
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * get 0：个人用户，1：企业用户
     *
     * @return
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * set 0：个人用户，1：企业用户
     *
     * @param userType
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }


    /**
     * get 邮箱
     *
     * @return
     */
    public String getMail() {
        return mail;
    }

    /**
     * set 邮箱
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }


    /**
     * get 手机号
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 手机号
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * get 证件号类型。个人用户：身份证（idCardNum）,护照（passportNum）,港澳通行证（mtpNum）,自定义（customUserId）。企业用户：统一社会信用代码（usci）,组织机构代码（orgCode）,工商营业执照（businessNum）,自定义（customUserId）
     *
     * @return
     */
    public String getIdentifyField() {
        return identifyField;
    }

    /**
     * set 证件号类型。个人用户：身份证（idCardNum）,护照（passportNum）,港澳通行证（mtpNum）,自定义（customUserId）。企业用户：统一社会信用代码（usci）,组织机构代码（orgCode）,工商营业执照（businessNum）,自定义（customUserId）
     *
     * @param identifyField
     */
    public void setIdentifyField(String identifyField) {
        this.identifyField = identifyField;
    }


    /**
     * get 证件号
     *
     * @return
     */
    public String getIdentifyValue() {
        return identifyValue;
    }

    /**
     * set 证件号
     *
     * @param identifyValue
     */
    public void setIdentifyValue(String identifyValue) {
        this.identifyValue = identifyValue;
    }


    /**
     * get 证件渠道，目前仅有 四川CA（SXCA）
     *
     * @return
     */
    public String getCaType() {
        return caType;
    }

    /**
     * set 证件渠道，目前仅有 四川CA（SXCA）
     *
     * @param caType
     */
    public void setCaType(String caType) {
        this.caType = caType;
    }


    /**
     * get 证书算法 rsa、sm2
     *
     * @return
     */
    public String getAlg() {
        return alg;
    }

    /**
     * set 证书算法 rsa、sm2
     *
     * @param alg
     */
    public void setAlg(String alg) {
        this.alg = alg;
    }


    /**
     * get 1 事件证书(短期证书，证书有效期1天-30天) 0 普通证书（证书有效期一年）。默认为 0
     *
     * @return
     */
    public Integer getCertExpire() {
        return certExpire;
    }

    /**
     * set 1 事件证书(短期证书，证书有效期1天-30天) 0 普通证书（证书有效期一年）。默认为 0
     *
     * @param certExpire
     */
    public void setCertExpire(Integer certExpire) {
        this.certExpire = certExpire;
    }


    /**
     * get P10
     *
     * @return
     */
    public String getCertReqBuf() {
        return certReqBuf;
    }

    /**
     * set P10
     *
     * @param certReqBuf
     */
    public void setCertReqBuf(String certReqBuf) {
        this.certReqBuf = certReqBuf;
    }



    /**
     * set 个人用户姓名或企业名
     *
     * @param userName
     */
    public CertSpec userName(String userName) {
        this.userName = userName;
        return this;
    }


    /**
     * set 0：个人用户，1：企业用户
     *
     * @param userType
     */
    public CertSpec userType(Integer userType) {
        this.userType = userType;
        return this;
    }


    /**
     * set 邮箱
     *
     * @param mail
     */
    public CertSpec mail(String mail) {
        this.mail = mail;
        return this;
    }


    /**
     * set 手机号
     *
     * @param phone
     */
    public CertSpec phone(String phone) {
        this.phone = phone;
        return this;
    }


    /**
     * set 证件号类型。个人用户：身份证（idCardNum）,护照（passportNum）,港澳通行证（mtpNum）,自定义（customUserId）。企业用户：统一社会信用代码（usci）,组织机构代码（orgCode）,工商营业执照（businessNum）,自定义（customUserId）
     *
     * @param identifyField
     */
    public CertSpec identifyField(String identifyField) {
        this.identifyField = identifyField;
        return this;
    }


    /**
     * set 证件号
     *
     * @param identifyValue
     */
    public CertSpec identifyValue(String identifyValue) {
        this.identifyValue = identifyValue;
        return this;
    }


    /**
     * set 证件渠道，目前仅有 四川CA（SXCA）
     *
     * @param caType
     */
    public CertSpec caType(String caType) {
        this.caType = caType;
        return this;
    }


    /**
     * set 证书算法 rsa、sm2
     *
     * @param alg
     */
    public CertSpec alg(String alg) {
        this.alg = alg;
        return this;
    }


    /**
     * set 1 事件证书(短期证书，证书有效期1天-30天) 0 普通证书（证书有效期一年）。默认为 0
     *
     * @param certExpire
     */
    public CertSpec certExpire(Integer certExpire) {
        this.certExpire = certExpire;
        return this;
    }


    /**
     * set P10
     *
     * @param certReqBuf
     */
    public CertSpec certReqBuf(String certReqBuf) {
        this.certReqBuf = certReqBuf;
        return this;
    }


}