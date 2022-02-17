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
 * 统计信息
 */
public class UserNumInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的房间号
     */
    private String userRoomId;

    /**
     * 房间在线人数
     */
    private Integer number;

    /**
     * 持续时长-minute
     */
    private Long duration;

    /**
     * 创建时间UTC
     */
    private String createTime;


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
     * get 房间在线人数
     *
     * @return
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * set 房间在线人数
     *
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * get 持续时长-minute
     *
     * @return
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * set 持续时长-minute
     *
     * @param duration
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * get 创建时间UTC
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间UTC
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 应用ID
     *
     * @param appId
     */
    public UserNumInfo appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public UserNumInfo appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public UserNumInfo userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }

    /**
     * set 房间在线人数
     *
     * @param number
     */
    public UserNumInfo number(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * set 持续时长-minute
     *
     * @param duration
     */
    public UserNumInfo duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * set 创建时间UTC
     *
     * @param createTime
     */
    public UserNumInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}