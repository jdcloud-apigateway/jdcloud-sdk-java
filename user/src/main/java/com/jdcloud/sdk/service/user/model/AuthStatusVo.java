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

package com.jdcloud.sdk.service.user.model;


/**
 * authStatusVo
 */
public class AuthStatusVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 银行账号
     */
    private String bankAccount;

    /**
     * 开户行编号
     */
    private String bankCode;

    /**
     * 是否扫脸实名（已废弃）
     */
    private Integer legalFace;

    /**
     * 个人实名方式（描述）
     */
    private String personAuthWay;

    /**
     * 是否弱实名0否，1是
     */
    private Integer weakAuth;

    /**
     * 是否需要授权 0否，1是
     */
    private Integer authorizeStatus;

    /**
     * 开户行名称
     */
    private String bankName;

    /**
     * 企业实名状态
     */
    private Integer companyAuthStatus;

    /**
     * 个人实名状态
     */
    private Integer personAuthStatus;

    /**
     * 企业实名方式（描述）
     */
    private String companyAuthWay;

    /**
     * 认证方式（企业）
     */
    private Integer legalAuthType;

    /**
     * 更新实名认证状态1认证中，0未认证
     */
    private Integer authType;

    /**
     * 是否允许更新认证false不允许
     */
    private Boolean supportUpdateCompanyAuth;

    /**
     * 冻结时间
     */
    private String frozenTime;

    /**
     * 是否扫脸实名（已废弃）
     */
    private Boolean legalAuth;

    /**
     * 驳回原因
     */
    private String rejectReason;

    /**
     * 京东金融企业实名状态（-1 为认证 1 审核中 2 被驳回 3 未完成认证 4 认证通过）
     */
    private Integer fromJDWallet;

    /**
     * 京东金融的个人认证状态（-1 未认证 1 已认证）
     */
    private Integer fromFinance;

    /**
     * 提交方式0：接口提交，1：组件页面
     */
    private Integer integrationType;

    /**
     * 企业实名信息
     */
    private CompanyAuthInfoVo companyAuthInfo;

    /**
     * 个人实名信息
     */
    private PersonAuthInfoVo personAuthInfo;



    /**
     * get 银行账号
     *
     * @return
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * set 银行账号
     *
     * @param bankAccount
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }


    /**
     * get 开户行编号
     *
     * @return
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * set 开户行编号
     *
     * @param bankCode
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * get 是否扫脸实名（已废弃）
     *
     * @return
     */
    public Integer getLegalFace() {
        return legalFace;
    }

    /**
     * set 是否扫脸实名（已废弃）
     *
     * @param legalFace
     */
    public void setLegalFace(Integer legalFace) {
        this.legalFace = legalFace;
    }


    /**
     * get 个人实名方式（描述）
     *
     * @return
     */
    public String getPersonAuthWay() {
        return personAuthWay;
    }

    /**
     * set 个人实名方式（描述）
     *
     * @param personAuthWay
     */
    public void setPersonAuthWay(String personAuthWay) {
        this.personAuthWay = personAuthWay;
    }


    /**
     * get 是否弱实名0否，1是
     *
     * @return
     */
    public Integer getWeakAuth() {
        return weakAuth;
    }

    /**
     * set 是否弱实名0否，1是
     *
     * @param weakAuth
     */
    public void setWeakAuth(Integer weakAuth) {
        this.weakAuth = weakAuth;
    }


    /**
     * get 是否需要授权 0否，1是
     *
     * @return
     */
    public Integer getAuthorizeStatus() {
        return authorizeStatus;
    }

    /**
     * set 是否需要授权 0否，1是
     *
     * @param authorizeStatus
     */
    public void setAuthorizeStatus(Integer authorizeStatus) {
        this.authorizeStatus = authorizeStatus;
    }


    /**
     * get 开户行名称
     *
     * @return
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * set 开户行名称
     *
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }


    /**
     * get 企业实名状态
     *
     * @return
     */
    public Integer getCompanyAuthStatus() {
        return companyAuthStatus;
    }

    /**
     * set 企业实名状态
     *
     * @param companyAuthStatus
     */
    public void setCompanyAuthStatus(Integer companyAuthStatus) {
        this.companyAuthStatus = companyAuthStatus;
    }


    /**
     * get 个人实名状态
     *
     * @return
     */
    public Integer getPersonAuthStatus() {
        return personAuthStatus;
    }

    /**
     * set 个人实名状态
     *
     * @param personAuthStatus
     */
    public void setPersonAuthStatus(Integer personAuthStatus) {
        this.personAuthStatus = personAuthStatus;
    }


    /**
     * get 企业实名方式（描述）
     *
     * @return
     */
    public String getCompanyAuthWay() {
        return companyAuthWay;
    }

    /**
     * set 企业实名方式（描述）
     *
     * @param companyAuthWay
     */
    public void setCompanyAuthWay(String companyAuthWay) {
        this.companyAuthWay = companyAuthWay;
    }


    /**
     * get 认证方式（企业）
     *
     * @return
     */
    public Integer getLegalAuthType() {
        return legalAuthType;
    }

    /**
     * set 认证方式（企业）
     *
     * @param legalAuthType
     */
    public void setLegalAuthType(Integer legalAuthType) {
        this.legalAuthType = legalAuthType;
    }


    /**
     * get 更新实名认证状态1认证中，0未认证
     *
     * @return
     */
    public Integer getAuthType() {
        return authType;
    }

    /**
     * set 更新实名认证状态1认证中，0未认证
     *
     * @param authType
     */
    public void setAuthType(Integer authType) {
        this.authType = authType;
    }


    /**
     * get 是否允许更新认证false不允许
     *
     * @return
     */
    public Boolean getSupportUpdateCompanyAuth() {
        return supportUpdateCompanyAuth;
    }

    /**
     * set 是否允许更新认证false不允许
     *
     * @param supportUpdateCompanyAuth
     */
    public void setSupportUpdateCompanyAuth(Boolean supportUpdateCompanyAuth) {
        this.supportUpdateCompanyAuth = supportUpdateCompanyAuth;
    }


    /**
     * get 冻结时间
     *
     * @return
     */
    public String getFrozenTime() {
        return frozenTime;
    }

    /**
     * set 冻结时间
     *
     * @param frozenTime
     */
    public void setFrozenTime(String frozenTime) {
        this.frozenTime = frozenTime;
    }


    /**
     * get 是否扫脸实名（已废弃）
     *
     * @return
     */
    public Boolean getLegalAuth() {
        return legalAuth;
    }

    /**
     * set 是否扫脸实名（已废弃）
     *
     * @param legalAuth
     */
    public void setLegalAuth(Boolean legalAuth) {
        this.legalAuth = legalAuth;
    }


    /**
     * get 驳回原因
     *
     * @return
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * set 驳回原因
     *
     * @param rejectReason
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }


    /**
     * get 京东金融企业实名状态（-1 为认证 1 审核中 2 被驳回 3 未完成认证 4 认证通过）
     *
     * @return
     */
    public Integer getFromJDWallet() {
        return fromJDWallet;
    }

    /**
     * set 京东金融企业实名状态（-1 为认证 1 审核中 2 被驳回 3 未完成认证 4 认证通过）
     *
     * @param fromJDWallet
     */
    public void setFromJDWallet(Integer fromJDWallet) {
        this.fromJDWallet = fromJDWallet;
    }


    /**
     * get 京东金融的个人认证状态（-1 未认证 1 已认证）
     *
     * @return
     */
    public Integer getFromFinance() {
        return fromFinance;
    }

    /**
     * set 京东金融的个人认证状态（-1 未认证 1 已认证）
     *
     * @param fromFinance
     */
    public void setFromFinance(Integer fromFinance) {
        this.fromFinance = fromFinance;
    }


    /**
     * get 提交方式0：接口提交，1：组件页面
     *
     * @return
     */
    public Integer getIntegrationType() {
        return integrationType;
    }

    /**
     * set 提交方式0：接口提交，1：组件页面
     *
     * @param integrationType
     */
    public void setIntegrationType(Integer integrationType) {
        this.integrationType = integrationType;
    }


    /**
     * get 企业实名信息
     *
     * @return
     */
    public CompanyAuthInfoVo getCompanyAuthInfo() {
        return companyAuthInfo;
    }

    /**
     * set 企业实名信息
     *
     * @param companyAuthInfo
     */
    public void setCompanyAuthInfo(CompanyAuthInfoVo companyAuthInfo) {
        this.companyAuthInfo = companyAuthInfo;
    }


    /**
     * get 个人实名信息
     *
     * @return
     */
    public PersonAuthInfoVo getPersonAuthInfo() {
        return personAuthInfo;
    }

    /**
     * set 个人实名信息
     *
     * @param personAuthInfo
     */
    public void setPersonAuthInfo(PersonAuthInfoVo personAuthInfo) {
        this.personAuthInfo = personAuthInfo;
    }



    /**
     * set 银行账号
     *
     * @param bankAccount
     */
    public AuthStatusVo bankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }


    /**
     * set 开户行编号
     *
     * @param bankCode
     */
    public AuthStatusVo bankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }


    /**
     * set 是否扫脸实名（已废弃）
     *
     * @param legalFace
     */
    public AuthStatusVo legalFace(Integer legalFace) {
        this.legalFace = legalFace;
        return this;
    }


    /**
     * set 个人实名方式（描述）
     *
     * @param personAuthWay
     */
    public AuthStatusVo personAuthWay(String personAuthWay) {
        this.personAuthWay = personAuthWay;
        return this;
    }


    /**
     * set 是否弱实名0否，1是
     *
     * @param weakAuth
     */
    public AuthStatusVo weakAuth(Integer weakAuth) {
        this.weakAuth = weakAuth;
        return this;
    }


    /**
     * set 是否需要授权 0否，1是
     *
     * @param authorizeStatus
     */
    public AuthStatusVo authorizeStatus(Integer authorizeStatus) {
        this.authorizeStatus = authorizeStatus;
        return this;
    }


    /**
     * set 开户行名称
     *
     * @param bankName
     */
    public AuthStatusVo bankName(String bankName) {
        this.bankName = bankName;
        return this;
    }


    /**
     * set 企业实名状态
     *
     * @param companyAuthStatus
     */
    public AuthStatusVo companyAuthStatus(Integer companyAuthStatus) {
        this.companyAuthStatus = companyAuthStatus;
        return this;
    }


    /**
     * set 个人实名状态
     *
     * @param personAuthStatus
     */
    public AuthStatusVo personAuthStatus(Integer personAuthStatus) {
        this.personAuthStatus = personAuthStatus;
        return this;
    }


    /**
     * set 企业实名方式（描述）
     *
     * @param companyAuthWay
     */
    public AuthStatusVo companyAuthWay(String companyAuthWay) {
        this.companyAuthWay = companyAuthWay;
        return this;
    }


    /**
     * set 认证方式（企业）
     *
     * @param legalAuthType
     */
    public AuthStatusVo legalAuthType(Integer legalAuthType) {
        this.legalAuthType = legalAuthType;
        return this;
    }


    /**
     * set 更新实名认证状态1认证中，0未认证
     *
     * @param authType
     */
    public AuthStatusVo authType(Integer authType) {
        this.authType = authType;
        return this;
    }


    /**
     * set 是否允许更新认证false不允许
     *
     * @param supportUpdateCompanyAuth
     */
    public AuthStatusVo supportUpdateCompanyAuth(Boolean supportUpdateCompanyAuth) {
        this.supportUpdateCompanyAuth = supportUpdateCompanyAuth;
        return this;
    }


    /**
     * set 冻结时间
     *
     * @param frozenTime
     */
    public AuthStatusVo frozenTime(String frozenTime) {
        this.frozenTime = frozenTime;
        return this;
    }


    /**
     * set 是否扫脸实名（已废弃）
     *
     * @param legalAuth
     */
    public AuthStatusVo legalAuth(Boolean legalAuth) {
        this.legalAuth = legalAuth;
        return this;
    }


    /**
     * set 驳回原因
     *
     * @param rejectReason
     */
    public AuthStatusVo rejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
        return this;
    }


    /**
     * set 京东金融企业实名状态（-1 为认证 1 审核中 2 被驳回 3 未完成认证 4 认证通过）
     *
     * @param fromJDWallet
     */
    public AuthStatusVo fromJDWallet(Integer fromJDWallet) {
        this.fromJDWallet = fromJDWallet;
        return this;
    }


    /**
     * set 京东金融的个人认证状态（-1 未认证 1 已认证）
     *
     * @param fromFinance
     */
    public AuthStatusVo fromFinance(Integer fromFinance) {
        this.fromFinance = fromFinance;
        return this;
    }


    /**
     * set 提交方式0：接口提交，1：组件页面
     *
     * @param integrationType
     */
    public AuthStatusVo integrationType(Integer integrationType) {
        this.integrationType = integrationType;
        return this;
    }


    /**
     * set 企业实名信息
     *
     * @param companyAuthInfo
     */
    public AuthStatusVo companyAuthInfo(CompanyAuthInfoVo companyAuthInfo) {
        this.companyAuthInfo = companyAuthInfo;
        return this;
    }


    /**
     * set 个人实名信息
     *
     * @param personAuthInfo
     */
    public AuthStatusVo personAuthInfo(PersonAuthInfoVo personAuthInfo) {
        this.personAuthInfo = personAuthInfo;
        return this;
    }


}