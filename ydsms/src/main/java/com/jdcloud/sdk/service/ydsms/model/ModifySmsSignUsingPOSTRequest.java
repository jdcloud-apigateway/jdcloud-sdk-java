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
 * 云鼎短信服务-签名相关接口
 * 云鼎短信服务-签名相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ydsms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 编辑短信签名
 */
public class ModifySmsSignUsingPOSTRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用id
     * Required:true
     */
    @Required
    private String appId;

    /**
     * 申请说明
     */
    private String applyExplanation;

    /**
     * 授权委托下载地址，若短信签名用途为他用，涉及第三方权益需上传，上传至 oss
     */
    private String signAttorneyUrl;

    /**
     * 证明材料下载地址，上传至 oss
     * Required:true
     */
    @Required
    private String signCertificateUrl;

    /**
     * 若签名内容侵犯到第三方权益必须获得第三方真实授权，长度为 2~12 个字符无须添加【】、()、[] 符号，签名发送会自带【】符号，避免重复
     * Required:true
     */
    @Required
    private String signContent;

    /**
     * 其他证明材料下载地址 上传至 oss
     */
    private String signOtherCertificateUrl;

    /**
     * 签名用途，0自用 1他用
     * Required:true
     */
    @Required
    private Integer signPurpose;

    /**
     * 签名类型id，调用listSmsSignTypesUsingGET 接口获取
     * Required:true
     */
    @Required
    private Integer signTypeId;

    /**
     * 签名id
     * Required:true
     */
    @Required
    private String signId;


    /**
     * get 应用id
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用id
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 申请说明
     *
     * @return
     */
    public String getApplyExplanation() {
        return applyExplanation;
    }

    /**
     * set 申请说明
     *
     * @param applyExplanation
     */
    public void setApplyExplanation(String applyExplanation) {
        this.applyExplanation = applyExplanation;
    }

    /**
     * get 授权委托下载地址，若短信签名用途为他用，涉及第三方权益需上传，上传至 oss
     *
     * @return
     */
    public String getSignAttorneyUrl() {
        return signAttorneyUrl;
    }

    /**
     * set 授权委托下载地址，若短信签名用途为他用，涉及第三方权益需上传，上传至 oss
     *
     * @param signAttorneyUrl
     */
    public void setSignAttorneyUrl(String signAttorneyUrl) {
        this.signAttorneyUrl = signAttorneyUrl;
    }

    /**
     * get 证明材料下载地址，上传至 oss
     *
     * @return
     */
    public String getSignCertificateUrl() {
        return signCertificateUrl;
    }

    /**
     * set 证明材料下载地址，上传至 oss
     *
     * @param signCertificateUrl
     */
    public void setSignCertificateUrl(String signCertificateUrl) {
        this.signCertificateUrl = signCertificateUrl;
    }

    /**
     * get 若签名内容侵犯到第三方权益必须获得第三方真实授权，长度为 2~12 个字符无须添加【】、()、[] 符号，签名发送会自带【】符号，避免重复
     *
     * @return
     */
    public String getSignContent() {
        return signContent;
    }

    /**
     * set 若签名内容侵犯到第三方权益必须获得第三方真实授权，长度为 2~12 个字符无须添加【】、()、[] 符号，签名发送会自带【】符号，避免重复
     *
     * @param signContent
     */
    public void setSignContent(String signContent) {
        this.signContent = signContent;
    }

    /**
     * get 其他证明材料下载地址 上传至 oss
     *
     * @return
     */
    public String getSignOtherCertificateUrl() {
        return signOtherCertificateUrl;
    }

    /**
     * set 其他证明材料下载地址 上传至 oss
     *
     * @param signOtherCertificateUrl
     */
    public void setSignOtherCertificateUrl(String signOtherCertificateUrl) {
        this.signOtherCertificateUrl = signOtherCertificateUrl;
    }

    /**
     * get 签名用途，0自用 1他用
     *
     * @return
     */
    public Integer getSignPurpose() {
        return signPurpose;
    }

    /**
     * set 签名用途，0自用 1他用
     *
     * @param signPurpose
     */
    public void setSignPurpose(Integer signPurpose) {
        this.signPurpose = signPurpose;
    }

    /**
     * get 签名类型id，调用listSmsSignTypesUsingGET 接口获取
     *
     * @return
     */
    public Integer getSignTypeId() {
        return signTypeId;
    }

    /**
     * set 签名类型id，调用listSmsSignTypesUsingGET 接口获取
     *
     * @param signTypeId
     */
    public void setSignTypeId(Integer signTypeId) {
        this.signTypeId = signTypeId;
    }

    /**
     * get 签名id
     *
     * @return
     */
    public String getSignId() {
        return signId;
    }

    /**
     * set 签名id
     *
     * @param signId
     */
    public void setSignId(String signId) {
        this.signId = signId;
    }


    /**
     * set 应用id
     *
     * @param appId
     */
    public ModifySmsSignUsingPOSTRequest appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 申请说明
     *
     * @param applyExplanation
     */
    public ModifySmsSignUsingPOSTRequest applyExplanation(String applyExplanation) {
        this.applyExplanation = applyExplanation;
        return this;
    }

    /**
     * set 授权委托下载地址，若短信签名用途为他用，涉及第三方权益需上传，上传至 oss
     *
     * @param signAttorneyUrl
     */
    public ModifySmsSignUsingPOSTRequest signAttorneyUrl(String signAttorneyUrl) {
        this.signAttorneyUrl = signAttorneyUrl;
        return this;
    }

    /**
     * set 证明材料下载地址，上传至 oss
     *
     * @param signCertificateUrl
     */
    public ModifySmsSignUsingPOSTRequest signCertificateUrl(String signCertificateUrl) {
        this.signCertificateUrl = signCertificateUrl;
        return this;
    }

    /**
     * set 若签名内容侵犯到第三方权益必须获得第三方真实授权，长度为 2~12 个字符无须添加【】、()、[] 符号，签名发送会自带【】符号，避免重复
     *
     * @param signContent
     */
    public ModifySmsSignUsingPOSTRequest signContent(String signContent) {
        this.signContent = signContent;
        return this;
    }

    /**
     * set 其他证明材料下载地址 上传至 oss
     *
     * @param signOtherCertificateUrl
     */
    public ModifySmsSignUsingPOSTRequest signOtherCertificateUrl(String signOtherCertificateUrl) {
        this.signOtherCertificateUrl = signOtherCertificateUrl;
        return this;
    }

    /**
     * set 签名用途，0自用 1他用
     *
     * @param signPurpose
     */
    public ModifySmsSignUsingPOSTRequest signPurpose(Integer signPurpose) {
        this.signPurpose = signPurpose;
        return this;
    }

    /**
     * set 签名类型id，调用listSmsSignTypesUsingGET 接口获取
     *
     * @param signTypeId
     */
    public ModifySmsSignUsingPOSTRequest signTypeId(Integer signTypeId) {
        this.signTypeId = signTypeId;
        return this;
    }

    /**
     * set 签名id
     *
     * @param signId
     */
    public ModifySmsSignUsingPOSTRequest signId(String signId) {
        this.signId = signId;
        return this;
    }


}