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
 * 房间内人员信息
 */
public class RoomUserInfoObj  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appId
     */
    private String appId;

    /**
     * 用户定义的房间号
     */
    private String userRoomId;

    /**
     * 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     */
    private String userId;

    /**
     * 用户房间内昵称
     */
    private String nickName;

    /**
     * 用户socketIo长连接id
     */
    private String connectId;

    /**
     * 状态 1-在线 2-离线
     */
    private Integer status;

    /**
     * 创建时间
     */
    private String joinTime;

    /**
     * 更新时间
     */
    private String updateTime;



    /**
     * get appId
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set appId
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }


    /**
     * get 用户定义的房间号
     *
     * @return
     */
    public String getUserRoomId() {
        return userRoomId;
    }

    /**
     * set 用户定义的房间号
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
     * get 用户房间内昵称
     *
     * @return
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * set 用户房间内昵称
     *
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    /**
     * get 用户socketIo长连接id
     *
     * @return
     */
    public String getConnectId() {
        return connectId;
    }

    /**
     * set 用户socketIo长连接id
     *
     * @param connectId
     */
    public void setConnectId(String connectId) {
        this.connectId = connectId;
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
     * get 创建时间
     *
     * @return
     */
    public String getJoinTime() {
        return joinTime;
    }

    /**
     * set 创建时间
     *
     * @param joinTime
     */
    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }


    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    /**
     * set appId
     *
     * @param appId
     */
    public RoomUserInfoObj appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * set 用户定义的房间号
     *
     * @param userRoomId
     */
    public RoomUserInfoObj userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }


    /**
     * set 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     *
     * @param userId
     */
    public RoomUserInfoObj userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 用户房间内昵称
     *
     * @param nickName
     */
    public RoomUserInfoObj nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }


    /**
     * set 用户socketIo长连接id
     *
     * @param connectId
     */
    public RoomUserInfoObj connectId(String connectId) {
        this.connectId = connectId;
        return this;
    }


    /**
     * set 状态 1-在线 2-离线
     *
     * @param status
     */
    public RoomUserInfoObj status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param joinTime
     */
    public RoomUserInfoObj joinTime(String joinTime) {
        this.joinTime = joinTime;
        return this;
    }


    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public RoomUserInfoObj updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}