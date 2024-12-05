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
 * user service
 * user service
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 开通对象存储服务
 */
public class OpenServiceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 用户Id
     * Required:true
     */
    @Required
    private String userId;

    /**
     * app code
     * Required:true
     */
    @Required
    private String appCode;

    /**
     * service code
     * Required:true
     */
    @Required
    private String serviceCode;



    /**
     * get 区域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 用户Id
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 用户Id
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * get app code
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set app code
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }


    /**
     * get service code
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set service code
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }



    /**
     * set 区域ID
     *
     * @param regionId
     */
    public OpenServiceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 用户Id
     *
     * @param userId
     */
    public OpenServiceRequest userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set app code
     *
     * @param appCode
     */
    public OpenServiceRequest appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


    /**
     * set service code
     *
     * @param serviceCode
     */
    public OpenServiceRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


}