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
 * abnormalEventInfo
 */
public class AbnormalEventInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String uuid;

    /**
     * JRTC应用ID
     */
    private String appId;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的userRoomId
     */
    private String userRoomId;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的userId
     */
    private String userId;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 异常事件码
     */
    private String abnormalCode;

    /**
     * 异常事件描述
     */
    private String abnormalDescription;

    /**
     * 异常事件详情
     */
    private String abnormalDetail;

    /**
     * 级别
     */
    private String qualityLevel;

    /**
     * 事件发生事件 UTC时间
     */
    private String eventTime;



    /**
     * get 主键
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set 主键
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }


    /**
     * get JRTC应用ID
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set JRTC应用ID
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }


    /**
     * get 业务接入方定义的且在JRTC系统内注册过的userRoomId
     *
     * @return
     */
    public String getUserRoomId() {
        return userRoomId;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的userRoomId
     *
     * @param userRoomId
     */
    public void setUserRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
    }


    /**
     * get 业务接入方定义的且在JRTC系统内注册过的userId
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的userId
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * get 设备ID
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备ID
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * get 异常事件码
     *
     * @return
     */
    public String getAbnormalCode() {
        return abnormalCode;
    }

    /**
     * set 异常事件码
     *
     * @param abnormalCode
     */
    public void setAbnormalCode(String abnormalCode) {
        this.abnormalCode = abnormalCode;
    }


    /**
     * get 异常事件描述
     *
     * @return
     */
    public String getAbnormalDescription() {
        return abnormalDescription;
    }

    /**
     * set 异常事件描述
     *
     * @param abnormalDescription
     */
    public void setAbnormalDescription(String abnormalDescription) {
        this.abnormalDescription = abnormalDescription;
    }


    /**
     * get 异常事件详情
     *
     * @return
     */
    public String getAbnormalDetail() {
        return abnormalDetail;
    }

    /**
     * set 异常事件详情
     *
     * @param abnormalDetail
     */
    public void setAbnormalDetail(String abnormalDetail) {
        this.abnormalDetail = abnormalDetail;
    }


    /**
     * get 级别
     *
     * @return
     */
    public String getQualityLevel() {
        return qualityLevel;
    }

    /**
     * set 级别
     *
     * @param qualityLevel
     */
    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
    }


    /**
     * get 事件发生事件 UTC时间
     *
     * @return
     */
    public String getEventTime() {
        return eventTime;
    }

    /**
     * set 事件发生事件 UTC时间
     *
     * @param eventTime
     */
    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }



    /**
     * set 主键
     *
     * @param uuid
     */
    public AbnormalEventInfo uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }


    /**
     * set JRTC应用ID
     *
     * @param appId
     */
    public AbnormalEventInfo appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * set 业务接入方定义的且在JRTC系统内注册过的userRoomId
     *
     * @param userRoomId
     */
    public AbnormalEventInfo userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }


    /**
     * set 业务接入方定义的且在JRTC系统内注册过的userId
     *
     * @param userId
     */
    public AbnormalEventInfo userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 设备ID
     *
     * @param deviceId
     */
    public AbnormalEventInfo deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }


    /**
     * set 异常事件码
     *
     * @param abnormalCode
     */
    public AbnormalEventInfo abnormalCode(String abnormalCode) {
        this.abnormalCode = abnormalCode;
        return this;
    }


    /**
     * set 异常事件描述
     *
     * @param abnormalDescription
     */
    public AbnormalEventInfo abnormalDescription(String abnormalDescription) {
        this.abnormalDescription = abnormalDescription;
        return this;
    }


    /**
     * set 异常事件详情
     *
     * @param abnormalDetail
     */
    public AbnormalEventInfo abnormalDetail(String abnormalDetail) {
        this.abnormalDetail = abnormalDetail;
        return this;
    }


    /**
     * set 级别
     *
     * @param qualityLevel
     */
    public AbnormalEventInfo qualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
        return this;
    }


    /**
     * set 事件发生事件 UTC时间
     *
     * @param eventTime
     */
    public AbnormalEventInfo eventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }


}