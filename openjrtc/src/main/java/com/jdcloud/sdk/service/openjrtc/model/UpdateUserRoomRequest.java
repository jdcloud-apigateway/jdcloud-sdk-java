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
 * UserRoom
 * 用户房间号管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改房间

 */
public class UpdateUserRoomRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户房间号
     */
    private String userRoomId;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 房间类型 1-小房间；2-大房间
     */
    private Integer roomType;

    /**
     * 应用ID
     * Required:true
     */
    @Required
    private String appId;


    /**
     * get 用户房间号
     *
     * @return
     */
    public String getUserRoomId() {
        return userRoomId;
    }

    /**
     * set 用户房间号
     *
     * @param userRoomId
     */
    public void setUserRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
    }

    /**
     * get 房间名称
     *
     * @return
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * set 房间名称
     *
     * @param roomName
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * get 房间类型 1-小房间；2-大房间
     *
     * @return
     */
    public Integer getRoomType() {
        return roomType;
    }

    /**
     * set 房间类型 1-小房间；2-大房间
     *
     * @param roomType
     */
    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

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
     * set 用户房间号
     *
     * @param userRoomId
     */
    public UpdateUserRoomRequest userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }

    /**
     * set 房间名称
     *
     * @param roomName
     */
    public UpdateUserRoomRequest roomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * set 房间类型 1-小房间；2-大房间
     *
     * @param roomType
     */
    public UpdateUserRoomRequest roomType(Integer roomType) {
        this.roomType = roomType;
        return this;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public UpdateUserRoomRequest appId(String appId) {
        this.appId = appId;
        return this;
    }


}