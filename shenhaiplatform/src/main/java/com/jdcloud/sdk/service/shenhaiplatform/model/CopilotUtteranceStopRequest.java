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
 * CloudCopilotController
 * 数据开发治理平台智能助手CloudCopilotController接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 停止发言，用于终止模型回复生成
 */
public class CopilotUtteranceStopRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 对话id
     * Required:true
     */
    @Required
    private String chatId;

    /**
     * 发言id
     * Required:true
     */
    @Required
    private String utteranceId;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;



    /**
     * get 对话id
     *
     * @return
     */
    public String getChatId() {
        return chatId;
    }

    /**
     * set 对话id
     *
     * @param chatId
     */
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }


    /**
     * get 发言id
     *
     * @return
     */
    public String getUtteranceId() {
        return utteranceId;
    }

    /**
     * set 发言id
     *
     * @param utteranceId
     */
    public void setUtteranceId(String utteranceId) {
        this.utteranceId = utteranceId;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }



    /**
     * set 对话id
     *
     * @param chatId
     */
    public CopilotUtteranceStopRequest chatId(String chatId) {
        this.chatId = chatId;
        return this;
    }


    /**
     * set 发言id
     *
     * @param utteranceId
     */
    public CopilotUtteranceStopRequest utteranceId(String utteranceId) {
        this.utteranceId = utteranceId;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CopilotUtteranceStopRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public CopilotUtteranceStopRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}