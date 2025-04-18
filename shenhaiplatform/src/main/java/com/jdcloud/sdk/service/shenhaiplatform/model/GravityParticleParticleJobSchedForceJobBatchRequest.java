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
 * 作业状态管理
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.shenhaiplatform.model.GpsmJobNameDTO;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量强制作业运行
 */
public class GravityParticleParticleJobSchedForceJobBatchRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据日期
     */
    private String txDate;

    /**
     * 作业名称列表
     */
    
    private List<GpsmJobNameDTO> jobNames;
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
     * get 数据日期
     *
     * @return
     */
    public String getTxDate() {
        return txDate;
    }

    /**
     * set 数据日期
     *
     * @param txDate
     */
    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }


    /**
    * get 作业名称列表
    *
    * @return
    */
    public List<GpsmJobNameDTO> getJobNames() {
        return jobNames;
    }

    /**
    * set 作业名称列表
    *
    * @param jobNames
    */
    public void setJobNames(List<GpsmJobNameDTO> jobNames) {
        this.jobNames = jobNames;
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
     * set 数据日期
     *
     * @param txDate
     */
    public GravityParticleParticleJobSchedForceJobBatchRequest txDate(String txDate) {
        this.txDate = txDate;
        return this;
    }


    /**
    * set 作业名称列表
    *
    * @param jobNames
    */
    public GravityParticleParticleJobSchedForceJobBatchRequest jobNames(List<GpsmJobNameDTO> jobNames) {
        this.jobNames = jobNames;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleParticleJobSchedForceJobBatchRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleParticleJobSchedForceJobBatchRequest appName(String appName) {
        this.appName = appName;
        return this;
    }



    /**
     * add item to 作业名称列表
     *
     * @param jobName
     */
    public void addJobName(GpsmJobNameDTO jobName) {
        if (this.jobNames == null) {
            this.jobNames = new ArrayList<>();
        }
        this.jobNames.add(jobName);
    }
}