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
 * Callback
 * 回调配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vqd.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询回调配置
 */
public class QueryCallbackResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 回调方式
     */
    private String callbackType;

    /**
     * HTTP方式的回调URL
     */
    private String httpUrl;

    /**
     * 回调事件列表
     */
    private List<String> callbackEvents;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;


    /**
     * get 回调方式
     *
     * @return
     */
    public String getCallbackType() {
        return callbackType;
    }

    /**
     * set 回调方式
     *
     * @param callbackType
     */
    public void setCallbackType(String callbackType) {
        this.callbackType = callbackType;
    }

    /**
     * get HTTP方式的回调URL
     *
     * @return
     */
    public String getHttpUrl() {
        return httpUrl;
    }

    /**
     * set HTTP方式的回调URL
     *
     * @param httpUrl
     */
    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }

    /**
     * get 回调事件列表
     *
     * @return
     */
    public List<String> getCallbackEvents() {
        return callbackEvents;
    }

    /**
     * set 回调事件列表
     *
     * @param callbackEvents
     */
    public void setCallbackEvents(List<String> callbackEvents) {
        this.callbackEvents = callbackEvents;
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
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 回调方式
     *
     * @param callbackType
     */
    public QueryCallbackResult callbackType(String callbackType) {
        this.callbackType = callbackType;
        return this;
    }

    /**
     * set HTTP方式的回调URL
     *
     * @param httpUrl
     */
    public QueryCallbackResult httpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }

    /**
     * set 回调事件列表
     *
     * @param callbackEvents
     */
    public QueryCallbackResult callbackEvents(List<String> callbackEvents) {
        this.callbackEvents = callbackEvents;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public QueryCallbackResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public QueryCallbackResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * add item to 回调事件列表
     *
     * @param callbackEvent
     */
    public void addCallbackEvent(String callbackEvent) {
        if (this.callbackEvents == null) {
            this.callbackEvents = new ArrayList<>();
        }
        this.callbackEvents.add(callbackEvent);
    }

}