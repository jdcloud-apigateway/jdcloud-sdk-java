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
 * ShenHaiPlatform Admin Manage APIs
 * 作业提供RPC接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 校验作业名称是否存在，true表示不存在，可以新建，false表示已经存在
 */
public class GravityParticleDubboJobManagerGetMgrJobByJobNameRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;

    /**
     * jobName
     * Required:true
     */
    @Required
    private String jobName;



    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }


    /**
     * get jobName
     *
     * @return
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set jobName
     *
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }



    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleDubboJobManagerGetMgrJobByJobNameRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleDubboJobManagerGetMgrJobByJobNameRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


    /**
     * set jobName
     *
     * @param jobName
     */
    public GravityParticleDubboJobManagerGetMgrJobByJobNameRequest jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


}