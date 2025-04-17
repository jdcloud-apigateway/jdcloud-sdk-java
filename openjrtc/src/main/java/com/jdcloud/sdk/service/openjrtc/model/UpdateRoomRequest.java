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
 * JrtcRoom
 * 房间号管理接口
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
public class UpdateRoomRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 房间ID
     */
    private Long roomId;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 应用ID
     * Required:true
     */
    @Required
    private String appId;



    /**
     * get 房间ID
     *
     * @return
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * set 房间ID
     *
     * @param roomId
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
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
     * set 房间ID
     *
     * @param roomId
     */
    public UpdateRoomRequest roomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }


    /**
     * set 房间名称
     *
     * @param roomName
     */
    public UpdateRoomRequest roomName(String roomName) {
        this.roomName = roomName;
        return this;
    }


    /**
     * set 应用ID
     *
     * @param appId
     */
    public UpdateRoomRequest appId(String appId) {
        this.appId = appId;
        return this;
    }


}