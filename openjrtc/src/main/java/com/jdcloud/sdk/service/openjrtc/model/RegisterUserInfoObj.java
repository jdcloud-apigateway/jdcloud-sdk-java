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
 * registerUserInfoObj
 */
public class RegisterUserInfoObj  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * jrtc系统用户id
     */
    private Long peerId;

    /**
     * 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 是否临时用户
     */
    private Boolean temporary;

    /**
     * 创建时间
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
     * get jrtc系统用户id
     *
     * @return
     */
    public Long getPeerId() {
        return peerId;
    }

    /**
     * set jrtc系统用户id
     *
     * @param peerId
     */
    public void setPeerId(Long peerId) {
        this.peerId = peerId;
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
     * get 用户名称
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 用户名称
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * get 是否临时用户
     *
     * @return
     */
    public Boolean getTemporary() {
        return temporary;
    }

    /**
     * set 是否临时用户
     *
     * @param temporary
     */
    public void setTemporary(Boolean temporary) {
        this.temporary = temporary;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
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
    public RegisterUserInfoObj appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * set jrtc系统用户id
     *
     * @param peerId
     */
    public RegisterUserInfoObj peerId(Long peerId) {
        this.peerId = peerId;
        return this;
    }


    /**
     * set 业务接入方用户体系定义的且在JRTC系统内注册过的userId
     *
     * @param userId
     */
    public RegisterUserInfoObj userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 用户名称
     *
     * @param userName
     */
    public RegisterUserInfoObj userName(String userName) {
        this.userName = userName;
        return this;
    }


    /**
     * set 是否临时用户
     *
     * @param temporary
     */
    public RegisterUserInfoObj temporary(Boolean temporary) {
        this.temporary = temporary;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public RegisterUserInfoObj createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}