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
 * Instance
 * 敏感数据保护-实例相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dcap.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置实例的访问凭证 AK+SK
 */
public class SetInstanceAccessKeyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * accessKey
     * Required:true
     */
    @Required
    private String accessKey;

    /**
     * secretKey
     * Required:true
     */
    @Required
    private String secretKey;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例 ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get accessKey
     *
     * @return
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * set accessKey
     *
     * @param accessKey
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * get secretKey
     *
     * @return
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * set secretKey
     *
     * @param secretKey
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例 ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set accessKey
     *
     * @param accessKey
     */
    public SetInstanceAccessKeyRequest accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * set secretKey
     *
     * @param secretKey
     */
    public SetInstanceAccessKeyRequest secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public SetInstanceAccessKeyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例 ID
     *
     * @param instanceId
     */
    public SetInstanceAccessKeyRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}