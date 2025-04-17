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
 * UserMessage
 * 自定义信令消息
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 发送自定义信令给房间内的人员
 */
public class PostMessageToUserRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的房间号
     */
    private String userRoomId;

    /**
     * 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     */
    private String userId;

    /**
     * 事件名称
     */
    private String eventName;

    /**
     * 自定义信令消息
     */
    private String message;



    /**
     * get 应用ID
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }


    /**
     * get 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @return
     */
    public String getUserRoomId() {
        return userRoomId;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public void setUserRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
    }


    /**
     * get 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * get 事件名称
     *
     * @return
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * set 事件名称
     *
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    /**
     * get 自定义信令消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 自定义信令消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }



    /**
     * set 应用ID
     *
     * @param appId
     */
    public PostMessageToUserRequest appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public PostMessageToUserRequest userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }


    /**
     * set 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     *
     * @param userId
     */
    public PostMessageToUserRequest userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 事件名称
     *
     * @param eventName
     */
    public PostMessageToUserRequest eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }


    /**
     * set 自定义信令消息
     *
     * @param message
     */
    public PostMessageToUserRequest message(String message) {
        this.message = message;
        return this;
    }


}