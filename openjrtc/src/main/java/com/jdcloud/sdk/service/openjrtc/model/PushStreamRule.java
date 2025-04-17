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
 * pushStreamRule
 */
public class PushStreamRule  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务接入方定义的且在JRTC系统内注册过的房间号
     */
    private String userRoomId;

    /**
     * 业务接入方用户体系定义的且在JRTC系统内注册过的userId,当前不支持混流，且只支持一个userId,不指定时，默认录转推房间内所有userId的单路音视频流
     */
    private String mcuUsers;



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
     * get 业务接入方用户体系定义的且在JRTC系统内注册过的userId,当前不支持混流，且只支持一个userId,不指定时，默认录转推房间内所有userId的单路音视频流
     *
     * @return
     */
    public String getMcuUsers() {
        return mcuUsers;
    }

    /**
     * set 业务接入方用户体系定义的且在JRTC系统内注册过的userId,当前不支持混流，且只支持一个userId,不指定时，默认录转推房间内所有userId的单路音视频流
     *
     * @param mcuUsers
     */
    public void setMcuUsers(String mcuUsers) {
        this.mcuUsers = mcuUsers;
    }



    /**
     * set 业务接入方定义的且在JRTC系统内注册过的房间号
     *
     * @param userRoomId
     */
    public PushStreamRule userRoomId(String userRoomId) {
        this.userRoomId = userRoomId;
        return this;
    }


    /**
     * set 业务接入方用户体系定义的且在JRTC系统内注册过的userId,当前不支持混流，且只支持一个userId,不指定时，默认录转推房间内所有userId的单路音视频流
     *
     * @param mcuUsers
     */
    public PushStreamRule mcuUsers(String mcuUsers) {
        this.mcuUsers = mcuUsers;
        return this;
    }


}