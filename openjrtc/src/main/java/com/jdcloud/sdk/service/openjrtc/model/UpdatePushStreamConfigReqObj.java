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
 * updatePushStreamConfigReqObj
 */
public class UpdatePushStreamConfigReqObj  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 转推类型  1-全局自动 2-指定流转推
     */
    private Integer pushType;

    /**
     * 推流域名
     */
    private String pushDomain;


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
     * set 应用ID
     *
     * @param appId
     */
    public UpdatePushStreamConfigReqObj appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 转推类型  1-全局自动 2-指定流转推
     *
     * @param pushType
     */
    public UpdatePushStreamConfigReqObj pushType(Integer pushType) {
        this.pushType = pushType;
        return this;
    }

    /**
     * set 推流域名
     *
     * @param pushDomain
     */
    public UpdatePushStreamConfigReqObj pushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }


}