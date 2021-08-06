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

package com.jdcloud.sdk.service.ydsms.model;


/**
 * smsTemplateVO
 */
public class SmsTemplateVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用id
     */
    private String appId;

    /**
     * 申请状态 1申请中,2拒绝,3通过
     */
    private Integer applyStatus;

    /**
     * 短信模板审核说明
     */
    private String auditorExplanation;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 模板状态 0 未启用  1 启用
     */
    private Integer status;

    /**
     * 模板内容
     */
    private String templateContent;

    /**
     * 模板id
     */
    private String templateId;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 模板类型，0 验证码短信,1 通知短信,2 推广短信
     */
    private Integer templateType;

    /**
     * updateTime
     */
    private String updateTime;


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
     * get 申请状态 1申请中,2拒绝,3通过
     *
     * @return
     */
    public Integer getApplyStatus() {
        return applyStatus;
    }

    /**
     * set 申请状态 1申请中,2拒绝,3通过
     *
     * @param applyStatus
     */
    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    /**
     * get 短信模板审核说明
     *
     * @return
     */
    public String getAuditorExplanation() {
        return auditorExplanation;
    }

    /**
     * set 短信模板审核说明
     *
     * @param auditorExplanation
     */
    public void setAuditorExplanation(String auditorExplanation) {
        this.auditorExplanation = auditorExplanation;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 模板状态 0 未启用  1 启用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 模板状态 0 未启用  1 启用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 模板内容
     *
     * @return
     */
    public String getTemplateContent() {
        return templateContent;
    }

    /**
     * set 模板内容
     *
     * @param templateContent
     */
    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    /**
     * get 模板id
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 模板id
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * get 模板名称
     *
     * @return
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * set 模板名称
     *
     * @param templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * get 模板类型，0 验证码短信,1 通知短信,2 推广短信
     *
     * @return
     */
    public Integer getTemplateType() {
        return templateType;
    }

    /**
     * set 模板类型，0 验证码短信,1 通知短信,2 推广短信
     *
     * @param templateType
     */
    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 应用id
     *
     * @param appId
     */
    public SmsTemplateVO appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 申请状态 1申请中,2拒绝,3通过
     *
     * @param applyStatus
     */
    public SmsTemplateVO applyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
        return this;
    }

    /**
     * set 短信模板审核说明
     *
     * @param auditorExplanation
     */
    public SmsTemplateVO auditorExplanation(String auditorExplanation) {
        this.auditorExplanation = auditorExplanation;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public SmsTemplateVO createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public SmsTemplateVO pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 模板状态 0 未启用  1 启用
     *
     * @param status
     */
    public SmsTemplateVO status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 模板内容
     *
     * @param templateContent
     */
    public SmsTemplateVO templateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }

    /**
     * set 模板id
     *
     * @param templateId
     */
    public SmsTemplateVO templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 模板名称
     *
     * @param templateName
     */
    public SmsTemplateVO templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * set 模板类型，0 验证码短信,1 通知短信,2 推广短信
     *
     * @param templateType
     */
    public SmsTemplateVO templateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public SmsTemplateVO updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}