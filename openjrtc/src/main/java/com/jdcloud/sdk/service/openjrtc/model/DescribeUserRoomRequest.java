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
 * 查询注册房间号

 */
public class DescribeUserRoomRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的房间号
     * Required:true
     */
    @Required
    private String userRoomId;

    /**
     * 应用ID
     * Required:true
     */
    @Required
    private String appId;


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
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public DescribeUserRoomRequest userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public DescribeUserRoomRequest appId(String appId) {
        this.appId = appId;
        return this;
    }


}