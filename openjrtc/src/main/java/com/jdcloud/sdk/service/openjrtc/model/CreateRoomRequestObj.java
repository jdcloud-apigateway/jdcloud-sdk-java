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
 * createRoomRequestObj
 */
public class CreateRoomRequestObj  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 用户ID(创建者ID)
     */
    private Long peerId;


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
     * get 用户ID(创建者ID)
     *
     * @return
     */
    public Long getPeerId() {
        return peerId;
    }

    /**
     * set 用户ID(创建者ID)
     *
     * @param peerId
     */
    public void setPeerId(Long peerId) {
        this.peerId = peerId;
    }


    /**
     * set 房间名称
     *
     * @param roomName
     */
    public CreateRoomRequestObj roomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public CreateRoomRequestObj appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 用户ID(创建者ID)
     *
     * @param peerId
     */
    public CreateRoomRequestObj peerId(Long peerId) {
        this.peerId = peerId;
        return this;
    }


}