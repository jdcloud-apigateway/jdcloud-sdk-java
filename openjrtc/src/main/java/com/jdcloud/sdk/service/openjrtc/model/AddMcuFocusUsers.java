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

import java.util.List;
import java.util.ArrayList;

/**
 * addMcuFocusUsers
 */
public class AddMcuFocusUsers  implements java.io.Serializable {

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
     * 焦点用户userId列表
     */
    
    private List<String> userIds;


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
    * get 焦点用户userId列表
    *
    * @return
    */
    public List<String> getUserIds() {
        return userIds;
    }

    /**
    * set 焦点用户userId列表
    *
    * @param userIds
    */
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }



    /**
     * set 应用ID
     *
     * @param appId
     */
    public AddMcuFocusUsers appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public AddMcuFocusUsers userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }


    /**
    * set 焦点用户userId列表
    *
    * @param userIds
    */
    public AddMcuFocusUsers userIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }



    /**
     * add item to 焦点用户userId列表
     *
     * @param userId
     */
    public void addUserId(String userId) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        this.userIds.add(userId);
    }
}