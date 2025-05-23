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
 * 房间人员记录
 */
public class RoomUserRecordInfoContent  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的用户房间号
     */
    private String userRoomId;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的用户ID
     */
    private String userId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 设备类型
     */
    private String deviceType;

    /**
     * 设备型号
     */
    private String deviceModel;

    /**
     * sdk版本
     */
    private String sdkVersion;

    /**
     * 接入服务器ip
     */
    private String internalIp;

    /**
     * 接入网络类型
     */
    private String networkType;

    /**
     * 接入网络ip
     */
    private String extranetIp;

    /**
     * 网络服务提供商
     */
    private String isp;

    /**
     * 网络接入城市
     */
    private String city;

    /**
     * 网络接入省份
     */
    private String province;

    /**
     * 网络接入国家
     */
    private String country;

    /**
     * 状态 1-在线 2-离线
     */
    private Integer status;

    /**
     * 加入时间
     */
    private String joinTime;

    /**
     * 离开时间
     */
    private String leaveTime;



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
     * get 业务接入方定义的且在JRTC系统内注册过的用户房间号
     *
     * @return
     */
    public String getUserRoomId() {
        return userRoomId;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的用户房间号
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
     * get 业务接入方定义的且在JRTC系统内注册过的用户ID
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 业务接入方定义的且在JRTC系统内注册过的用户ID
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * get 昵称
     *
     * @return
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * set 昵称
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
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
     * get 设备名称
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


    /**
     * get 设备类型
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 设备类型
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * get 设备型号
     *
     * @return
     */
    public String getDeviceModel() {
        return deviceModel;
    }

    /**
     * set 设备型号
     *
     * @param deviceModel
     */
    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }


    /**
     * get sdk版本
     *
     * @return
     */
    public String getSdkVersion() {
        return sdkVersion;
    }

    /**
     * set sdk版本
     *
     * @param sdkVersion
     */
    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }


    /**
     * get 接入服务器ip
     *
     * @return
     */
    public String getInternalIp() {
        return internalIp;
    }

    /**
     * set 接入服务器ip
     *
     * @param internalIp
     */
    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }


    /**
     * get 接入网络类型
     *
     * @return
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * set 接入网络类型
     *
     * @param networkType
     */
    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }


    /**
     * get 接入网络ip
     *
     * @return
     */
    public String getExtranetIp() {
        return extranetIp;
    }

    /**
     * set 接入网络ip
     *
     * @param extranetIp
     */
    public void setExtranetIp(String extranetIp) {
        this.extranetIp = extranetIp;
    }


    /**
     * get 网络服务提供商
     *
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     * set 网络服务提供商
     *
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }


    /**
     * get 网络接入城市
     *
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * set 网络接入城市
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * get 网络接入省份
     *
     * @return
     */
    public String getProvince() {
        return province;
    }

    /**
     * set 网络接入省份
     *
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }


    /**
     * get 网络接入国家
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     * set 网络接入国家
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * get 状态 1-在线 2-离线
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态 1-在线 2-离线
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 加入时间
     *
     * @return
     */
    public String getJoinTime() {
        return joinTime;
    }

    /**
     * set 加入时间
     *
     * @param joinTime
     */
    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }


    /**
     * get 离开时间
     *
     * @return
     */
    public String getLeaveTime() {
        return leaveTime;
    }

    /**
     * set 离开时间
     *
     * @param leaveTime
     */
    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }



    /**
     * set 应用ID
     *
     * @param appId
     */
    public RoomUserRecordInfoContent appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * set 业务接入方定义的且在JRTC系统内注册过的用户房间号
     *
     * @param userRoomId
     */
    public RoomUserRecordInfoContent userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }


    /**
     * set 房间名称
     *
     * @param roomName
     */
    public RoomUserRecordInfoContent roomName(String roomName) {
        this.roomName = roomName;
        return this;
    }


    /**
     * set 业务接入方定义的且在JRTC系统内注册过的用户ID
     *
     * @param userId
     */
    public RoomUserRecordInfoContent userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 昵称
     *
     * @param nickName
     */
    public RoomUserRecordInfoContent nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }


    /**
     * set 设备ID
     *
     * @param deviceId
     */
    public RoomUserRecordInfoContent deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }


    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public RoomUserRecordInfoContent deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }


    /**
     * set 设备类型
     *
     * @param deviceType
     */
    public RoomUserRecordInfoContent deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }


    /**
     * set 设备型号
     *
     * @param deviceModel
     */
    public RoomUserRecordInfoContent deviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }


    /**
     * set sdk版本
     *
     * @param sdkVersion
     */
    public RoomUserRecordInfoContent sdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
        return this;
    }


    /**
     * set 接入服务器ip
     *
     * @param internalIp
     */
    public RoomUserRecordInfoContent internalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }


    /**
     * set 接入网络类型
     *
     * @param networkType
     */
    public RoomUserRecordInfoContent networkType(String networkType) {
        this.networkType = networkType;
        return this;
    }


    /**
     * set 接入网络ip
     *
     * @param extranetIp
     */
    public RoomUserRecordInfoContent extranetIp(String extranetIp) {
        this.extranetIp = extranetIp;
        return this;
    }


    /**
     * set 网络服务提供商
     *
     * @param isp
     */
    public RoomUserRecordInfoContent isp(String isp) {
        this.isp = isp;
        return this;
    }


    /**
     * set 网络接入城市
     *
     * @param city
     */
    public RoomUserRecordInfoContent city(String city) {
        this.city = city;
        return this;
    }


    /**
     * set 网络接入省份
     *
     * @param province
     */
    public RoomUserRecordInfoContent province(String province) {
        this.province = province;
        return this;
    }


    /**
     * set 网络接入国家
     *
     * @param country
     */
    public RoomUserRecordInfoContent country(String country) {
        this.country = country;
        return this;
    }


    /**
     * set 状态 1-在线 2-离线
     *
     * @param status
     */
    public RoomUserRecordInfoContent status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 加入时间
     *
     * @param joinTime
     */
    public RoomUserRecordInfoContent joinTime(String joinTime) {
        this.joinTime = joinTime;
        return this;
    }


    /**
     * set 离开时间
     *
     * @param leaveTime
     */
    public RoomUserRecordInfoContent leaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
        return this;
    }


}