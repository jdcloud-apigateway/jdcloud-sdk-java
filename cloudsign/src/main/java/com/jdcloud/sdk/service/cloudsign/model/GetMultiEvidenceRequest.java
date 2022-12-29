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
 * 存取证对外开放接口
 * 存取证对外开放接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 带主体标记的取证接口
 */
public class GetMultiEvidenceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务流水号
     * Required:true
     */
    @Required
    private String businessId;

    /**
     * 存证编号
     * Required:true
     */
    @Required
    private String evidenceId;

    /**
     * 申请取证主体的ID类型
     * Required:true
     */
    @Required
    private String applicantIdType;

    /**
     * 申请取证主体的ID
     * Required:true
     */
    @Required
    private String applicantIdNum;

    /**
     * 证据链代码
     */
    private String businessCode;

    /**
     * 业务token
     */
    private String token;

    /**
     * 请求流水号
     */
    private String messageId;

    /**
     * 业务类型
     */
    private String evidenceType;

    /**
     * 请求时间
     */
    private String messageDate;

    /**
     * 存证时的请求流水
     */
    private String evidenceMessageId;



    /**
     * get 业务流水号
     *
     * @return
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * set 业务流水号
     *
     * @param businessId
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }


    /**
     * get 存证编号
     *
     * @return
     */
    public String getEvidenceId() {
        return evidenceId;
    }

    /**
     * set 存证编号
     *
     * @param evidenceId
     */
    public void setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
    }


    /**
     * get 申请取证主体的ID类型
     *
     * @return
     */
    public String getApplicantIdType() {
        return applicantIdType;
    }

    /**
     * set 申请取证主体的ID类型
     *
     * @param applicantIdType
     */
    public void setApplicantIdType(String applicantIdType) {
        this.applicantIdType = applicantIdType;
    }


    /**
     * get 申请取证主体的ID
     *
     * @return
     */
    public String getApplicantIdNum() {
        return applicantIdNum;
    }

    /**
     * set 申请取证主体的ID
     *
     * @param applicantIdNum
     */
    public void setApplicantIdNum(String applicantIdNum) {
        this.applicantIdNum = applicantIdNum;
    }


    /**
     * get 证据链代码
     *
     * @return
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * set 证据链代码
     *
     * @param businessCode
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }


    /**
     * get 业务token
     *
     * @return
     */
    public String getToken() {
        return token;
    }

    /**
     * set 业务token
     *
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }


    /**
     * get 请求流水号
     *
     * @return
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * set 请求流水号
     *
     * @param messageId
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }


    /**
     * get 业务类型
     *
     * @return
     */
    public String getEvidenceType() {
        return evidenceType;
    }

    /**
     * set 业务类型
     *
     * @param evidenceType
     */
    public void setEvidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
    }


    /**
     * get 请求时间
     *
     * @return
     */
    public String getMessageDate() {
        return messageDate;
    }

    /**
     * set 请求时间
     *
     * @param messageDate
     */
    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }


    /**
     * get 存证时的请求流水
     *
     * @return
     */
    public String getEvidenceMessageId() {
        return evidenceMessageId;
    }

    /**
     * set 存证时的请求流水
     *
     * @param evidenceMessageId
     */
    public void setEvidenceMessageId(String evidenceMessageId) {
        this.evidenceMessageId = evidenceMessageId;
    }



    /**
     * set 业务流水号
     *
     * @param businessId
     */
    public GetMultiEvidenceRequest businessId(String businessId) {
        this.businessId = businessId;
        return this;
    }


    /**
     * set 存证编号
     *
     * @param evidenceId
     */
    public GetMultiEvidenceRequest evidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
        return this;
    }


    /**
     * set 申请取证主体的ID类型
     *
     * @param applicantIdType
     */
    public GetMultiEvidenceRequest applicantIdType(String applicantIdType) {
        this.applicantIdType = applicantIdType;
        return this;
    }


    /**
     * set 申请取证主体的ID
     *
     * @param applicantIdNum
     */
    public GetMultiEvidenceRequest applicantIdNum(String applicantIdNum) {
        this.applicantIdNum = applicantIdNum;
        return this;
    }


    /**
     * set 证据链代码
     *
     * @param businessCode
     */
    public GetMultiEvidenceRequest businessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }


    /**
     * set 业务token
     *
     * @param token
     */
    public GetMultiEvidenceRequest token(String token) {
        this.token = token;
        return this;
    }


    /**
     * set 请求流水号
     *
     * @param messageId
     */
    public GetMultiEvidenceRequest messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }


    /**
     * set 业务类型
     *
     * @param evidenceType
     */
    public GetMultiEvidenceRequest evidenceType(String evidenceType) {
        this.evidenceType = evidenceType;
        return this;
    }


    /**
     * set 请求时间
     *
     * @param messageDate
     */
    public GetMultiEvidenceRequest messageDate(String messageDate) {
        this.messageDate = messageDate;
        return this;
    }


    /**
     * set 存证时的请求流水
     *
     * @param evidenceMessageId
     */
    public GetMultiEvidenceRequest evidenceMessageId(String evidenceMessageId) {
        this.evidenceMessageId = evidenceMessageId;
        return this;
    }


}