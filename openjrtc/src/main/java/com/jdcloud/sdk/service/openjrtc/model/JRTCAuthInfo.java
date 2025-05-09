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
 * jRTCAuthInfo
 */
public class JRTCAuthInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * appId
     */
    private String appId;

    /**
     * appKey
     */
    private String appKey;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 会议号
     */
    private Long roomId;

    /**
     * 随机令牌
     */
    private String nonce;

    /**
     * 时间戳-毫秒
     */
    private Long timestamp;

    /**
     * token
     */
    private String token;

    /**
     * 是否可用（true-可用,false-不可用）
     */
    private Boolean available;



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
     * get appKey
     *
     * @return
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * set appKey
     *
     * @param appKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }


    /**
     * get 用户id
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 用户id
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * get 会议号
     *
     * @return
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * set 会议号
     *
     * @param roomId
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }


    /**
     * get 随机令牌
     *
     * @return
     */
    public String getNonce() {
        return nonce;
    }

    /**
     * set 随机令牌
     *
     * @param nonce
     */
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }


    /**
     * get 时间戳-毫秒
     *
     * @return
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * set 时间戳-毫秒
     *
     * @param timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * get token
     *
     * @return
     */
    public String getToken() {
        return token;
    }

    /**
     * set token
     *
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }


    /**
     * get 是否可用（true-可用,false-不可用）
     *
     * @return
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * set 是否可用（true-可用,false-不可用）
     *
     * @param available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }



    /**
     * set appId
     *
     * @param appId
     */
    public JRTCAuthInfo appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * set appKey
     *
     * @param appKey
     */
    public JRTCAuthInfo appKey(String appKey) {
        this.appKey = appKey;
        return this;
    }


    /**
     * set 用户id
     *
     * @param userId
     */
    public JRTCAuthInfo userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 会议号
     *
     * @param roomId
     */
    public JRTCAuthInfo roomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }


    /**
     * set 随机令牌
     *
     * @param nonce
     */
    public JRTCAuthInfo nonce(String nonce) {
        this.nonce = nonce;
        return this;
    }


    /**
     * set 时间戳-毫秒
     *
     * @param timestamp
     */
    public JRTCAuthInfo timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }


    /**
     * set token
     *
     * @param token
     */
    public JRTCAuthInfo token(String token) {
        this.token = token;
        return this;
    }


    /**
     * set 是否可用（true-可用,false-不可用）
     *
     * @param available
     */
    public JRTCAuthInfo available(Boolean available) {
        this.available = available;
        return this;
    }


}