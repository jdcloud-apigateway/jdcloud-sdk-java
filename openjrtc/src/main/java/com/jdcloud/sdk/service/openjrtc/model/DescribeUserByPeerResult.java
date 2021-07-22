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
 * JrtcUser
 * 用户管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询peer对应的用户信息

 */
public class DescribeUserByPeerResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long peerId;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 业务接入方的用户ID
     */
    private String userId;

    /**
     * 是否临时用户
     */
    private Boolean temporary;

    /**
     * 创建时间
     */
    private String createTime;


    /**
     * get 用户ID
     *
     * @return
     */
    public Long getPeerId() {
        return peerId;
    }

    /**
     * set 用户ID
     *
     * @param peerId
     */
    public void setPeerId(Long peerId) {
        this.peerId = peerId;
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
     * get 业务接入方的用户ID
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 业务接入方的用户ID
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
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
     * set 用户ID
     *
     * @param peerId
     */
    public DescribeUserByPeerResult peerId(Long peerId) {
        this.peerId = peerId;
        return this;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public DescribeUserByPeerResult appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 业务接入方的用户ID
     *
     * @param userId
     */
    public DescribeUserByPeerResult userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * set 是否临时用户
     *
     * @param temporary
     */
    public DescribeUserByPeerResult temporary(Boolean temporary) {
        this.temporary = temporary;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DescribeUserByPeerResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}