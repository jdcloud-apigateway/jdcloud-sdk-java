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
 * Live API
 * 直播管理API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.live.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 恢复直播流推送
 */
public class ResumeLiveStreamRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;

    /**
     * 您的加速域名
     * Required:true
     */
    @Required
    private String publishDomain;

    /**
     * 流名称
     * Required:true
     */
    @Required
    private String streamName;


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
     * get 您的加速域名
     *
     * @return
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    /**
     * set 您的加速域名
     *
     * @param publishDomain
     */
    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    /**
     * get 流名称
     *
     * @return
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public ResumeLiveStreamRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 您的加速域名
     *
     * @param publishDomain
     */
    public ResumeLiveStreamRequest publishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * set 流名称
     *
     * @param streamName
     */
    public ResumeLiveStreamRequest streamName(String streamName) {
        this.streamName = streamName;
        return this;
    }


}