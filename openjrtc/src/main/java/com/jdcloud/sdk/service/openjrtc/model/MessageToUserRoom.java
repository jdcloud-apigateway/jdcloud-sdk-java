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

package com.jdcloud.sdk.service.openjrtc.model;


/**
 * 自定义消息体
 */
public class MessageToUserRoom  implements java.io.Serializable {

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
    public MessageToUserRoom appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public MessageToUserRoom userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }

    /**
     * set 事件名称
     *
     * @param eventName
     */
    public MessageToUserRoom eventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * set 自定义信令消息
     *
     * @param message
     */
    public MessageToUserRoom message(String message) {
        this.message = message;
        return this;
    }


}