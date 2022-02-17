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
 * pushStreamConfigInfo
 */
public class PushStreamConfigInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 旁路转推开关 1-开启;0关闭
     */
    private Integer pushStatus;

    /**
     * 转推类型  1-全局自动 2-指定流转推
     */
    private Integer pushType;

    /**
     * 推流域名
     */
    private String pushDomain;


    /**
     * get 主键
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 主键
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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
     * get 旁路转推开关 1-开启;0关闭
     *
     * @return
     */
    public Integer getPushStatus() {
        return pushStatus;
    }

    /**
     * set 旁路转推开关 1-开启;0关闭
     *
     * @param pushStatus
     */
    public void setPushStatus(Integer pushStatus) {
        this.pushStatus = pushStatus;
    }

    /**
     * get 转推类型  1-全局自动 2-指定流转推
     *
     * @return
     */
    public Integer getPushType() {
        return pushType;
    }

    /**
     * set 转推类型  1-全局自动 2-指定流转推
     *
     * @param pushType
     */
    public void setPushType(Integer pushType) {
        this.pushType = pushType;
    }

    /**
     * get 推流域名
     *
     * @return
     */
    public String getPushDomain() {
        return pushDomain;
    }

    /**
     * set 推流域名
     *
     * @param pushDomain
     */
    public void setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
    }


    /**
     * set 主键
     *
     * @param id
     */
    public PushStreamConfigInfo id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 应用ID
     *
     * @param appId
     */
    public PushStreamConfigInfo appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 旁路转推开关 1-开启;0关闭
     *
     * @param pushStatus
     */
    public PushStreamConfigInfo pushStatus(Integer pushStatus) {
        this.pushStatus = pushStatus;
        return this;
    }

    /**
     * set 转推类型  1-全局自动 2-指定流转推
     *
     * @param pushType
     */
    public PushStreamConfigInfo pushType(Integer pushType) {
        this.pushType = pushType;
        return this;
    }

    /**
     * set 推流域名
     *
     * @param pushDomain
     */
    public PushStreamConfigInfo pushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }


}