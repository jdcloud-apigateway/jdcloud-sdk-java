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
 * generalSettings
 */
public class GeneralSettings  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用id
     */
    private String appId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * id
     */
    private Integer id;

    /**
     * 设置说明
     */
    private String settingDescription;

    /**
     * 设置分类，0发送频率设置 1发送超量提醒 2短信发送状态回调地址
     */
    private Integer settingType;

    /**
     * 设置值
     */
    private String settingValue;

    /**
     * 当前设置是否生效，0未生效 1生效
     */
    private Integer status;

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
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 设置说明
     *
     * @return
     */
    public String getSettingDescription() {
        return settingDescription;
    }

    /**
     * set 设置说明
     *
     * @param settingDescription
     */
    public void setSettingDescription(String settingDescription) {
        this.settingDescription = settingDescription;
    }

    /**
     * get 设置分类，0发送频率设置 1发送超量提醒 2短信发送状态回调地址
     *
     * @return
     */
    public Integer getSettingType() {
        return settingType;
    }

    /**
     * set 设置分类，0发送频率设置 1发送超量提醒 2短信发送状态回调地址
     *
     * @param settingType
     */
    public void setSettingType(Integer settingType) {
        this.settingType = settingType;
    }

    /**
     * get 设置值
     *
     * @return
     */
    public String getSettingValue() {
        return settingValue;
    }

    /**
     * set 设置值
     *
     * @param settingValue
     */
    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }

    /**
     * get 当前设置是否生效，0未生效 1生效
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 当前设置是否生效，0未生效 1生效
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
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
    public GeneralSettings appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public GeneralSettings createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set id
     *
     * @param id
     */
    public GeneralSettings id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 设置说明
     *
     * @param settingDescription
     */
    public GeneralSettings settingDescription(String settingDescription) {
        this.settingDescription = settingDescription;
        return this;
    }

    /**
     * set 设置分类，0发送频率设置 1发送超量提醒 2短信发送状态回调地址
     *
     * @param settingType
     */
    public GeneralSettings settingType(Integer settingType) {
        this.settingType = settingType;
        return this;
    }

    /**
     * set 设置值
     *
     * @param settingValue
     */
    public GeneralSettings settingValue(String settingValue) {
        this.settingValue = settingValue;
        return this;
    }

    /**
     * set 当前设置是否生效，0未生效 1生效
     *
     * @param status
     */
    public GeneralSettings status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public GeneralSettings updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}