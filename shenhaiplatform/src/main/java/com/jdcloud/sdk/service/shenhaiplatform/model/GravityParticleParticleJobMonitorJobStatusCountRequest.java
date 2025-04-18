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
 * 作业监控
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
 * 工作台作业统计接口
 */
public class GravityParticleParticleJobMonitorJobStatusCountRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 处理类型
     */
    private String processType;

    /**
     * 查询数据
     */
    private String date;

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
     * get 处理类型
     *
     * @return
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * set 处理类型
     *
     * @param processType
     */
    public void setProcessType(String processType) {
        this.processType = processType;
    }


    /**
     * get 查询数据
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * set 查询数据
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
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
     * set 处理类型
     *
     * @param processType
     */
    public GravityParticleParticleJobMonitorJobStatusCountRequest processType(String processType) {
        this.processType = processType;
        return this;
    }


    /**
     * set 查询数据
     *
     * @param date
     */
    public GravityParticleParticleJobMonitorJobStatusCountRequest date(String date) {
        this.date = date;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleParticleJobMonitorJobStatusCountRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleParticleJobMonitorJobStatusCountRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}