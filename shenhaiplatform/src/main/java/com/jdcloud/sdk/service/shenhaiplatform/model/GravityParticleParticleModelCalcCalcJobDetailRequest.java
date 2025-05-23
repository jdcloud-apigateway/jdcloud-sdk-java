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
 * 模型控制器
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
 * 计算作业详情
 */
public class GravityParticleParticleModelCalcCalcJobDetailRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业名称
     */
    private String jobName;

    /**
     * 是否可用，1 已上线，2已下线
     */
    private String enable;

    /**
     * 客户作业名称
     */
    private String cstJobName;

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
     * get 作业名称
     *
     * @return
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set 作业名称
     *
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }


    /**
     * get 是否可用，1 已上线，2已下线
     *
     * @return
     */
    public String getEnable() {
        return enable;
    }

    /**
     * set 是否可用，1 已上线，2已下线
     *
     * @param enable
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }


    /**
     * get 客户作业名称
     *
     * @return
     */
    public String getCstJobName() {
        return cstJobName;
    }

    /**
     * set 客户作业名称
     *
     * @param cstJobName
     */
    public void setCstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
    }


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
     * set 作业名称
     *
     * @param jobName
     */
    public GravityParticleParticleModelCalcCalcJobDetailRequest jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 是否可用，1 已上线，2已下线
     *
     * @param enable
     */
    public GravityParticleParticleModelCalcCalcJobDetailRequest enable(String enable) {
        this.enable = enable;
        return this;
    }


    /**
     * set 客户作业名称
     *
     * @param cstJobName
     */
    public GravityParticleParticleModelCalcCalcJobDetailRequest cstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleParticleModelCalcCalcJobDetailRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleParticleModelCalcCalcJobDetailRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}