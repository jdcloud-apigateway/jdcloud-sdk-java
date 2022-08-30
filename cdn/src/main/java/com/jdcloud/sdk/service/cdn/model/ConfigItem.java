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

package com.jdcloud.sdk.service.cdn.model;


/**
 * configItem
 */
public class ConfigItem  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 配置项类型
     */
    private String configItemType;

    /**
     * 配置项名称
     */
    private String configItemName;

    /**
     * 配置状态
     */
    private Integer configStatus;

    /**
     * 配置状态名
     */
    private String configStatusName;

    /**
     * 配置项细节,类型为Map&lt;String,Object&gt;
     */
    private Object configItemDetails;



    /**
     * get 配置项类型
     *
     * @return
     */
    public String getConfigItemType() {
        return configItemType;
    }

    /**
     * set 配置项类型
     *
     * @param configItemType
     */
    public void setConfigItemType(String configItemType) {
        this.configItemType = configItemType;
    }


    /**
     * get 配置项名称
     *
     * @return
     */
    public String getConfigItemName() {
        return configItemName;
    }

    /**
     * set 配置项名称
     *
     * @param configItemName
     */
    public void setConfigItemName(String configItemName) {
        this.configItemName = configItemName;
    }


    /**
     * get 配置状态
     *
     * @return
     */
    public Integer getConfigStatus() {
        return configStatus;
    }

    /**
     * set 配置状态
     *
     * @param configStatus
     */
    public void setConfigStatus(Integer configStatus) {
        this.configStatus = configStatus;
    }


    /**
     * get 配置状态名
     *
     * @return
     */
    public String getConfigStatusName() {
        return configStatusName;
    }

    /**
     * set 配置状态名
     *
     * @param configStatusName
     */
    public void setConfigStatusName(String configStatusName) {
        this.configStatusName = configStatusName;
    }


    /**
     * get 配置项细节,类型为Map&lt;String,Object&gt;
     *
     * @return
     */
    public Object getConfigItemDetails() {
        return configItemDetails;
    }

    /**
     * set 配置项细节,类型为Map&lt;String,Object&gt;
     *
     * @param configItemDetails
     */
    public void setConfigItemDetails(Object configItemDetails) {
        this.configItemDetails = configItemDetails;
    }



    /**
     * set 配置项类型
     *
     * @param configItemType
     */
    public ConfigItem configItemType(String configItemType) {
        this.configItemType = configItemType;
        return this;
    }


    /**
     * set 配置项名称
     *
     * @param configItemName
     */
    public ConfigItem configItemName(String configItemName) {
        this.configItemName = configItemName;
        return this;
    }


    /**
     * set 配置状态
     *
     * @param configStatus
     */
    public ConfigItem configStatus(Integer configStatus) {
        this.configStatus = configStatus;
        return this;
    }


    /**
     * set 配置状态名
     *
     * @param configStatusName
     */
    public ConfigItem configStatusName(String configStatusName) {
        this.configStatusName = configStatusName;
        return this;
    }


    /**
     * set 配置项细节,类型为Map&lt;String,Object&gt;
     *
     * @param configItemDetails
     */
    public ConfigItem configItemDetails(Object configItemDetails) {
        this.configItemDetails = configItemDetails;
        return this;
    }


}