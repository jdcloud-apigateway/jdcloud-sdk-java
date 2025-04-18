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
 * 作业信息查询
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
 * 查询作业操作记录
 */
public class GravityParticleParticleJobListOperationRecordRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页面大小
     * Required:true
     */
    @Required
    private Integer pageSize;

    /**
     * 页码
     * Required:true
     */
    @Required
    private Integer pageNum;

    /**
     * 作业id
     */
    private Integer jobId;

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
     * get 页面大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页面大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 页码
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    /**
     * get 作业id
     *
     * @return
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * set 作业id
     *
     * @param jobId
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
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
     * set 页面大小
     *
     * @param pageSize
     */
    public GravityParticleParticleJobListOperationRecordRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 页码
     *
     * @param pageNum
     */
    public GravityParticleParticleJobListOperationRecordRequest pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
     * set 作业id
     *
     * @param jobId
     */
    public GravityParticleParticleJobListOperationRecordRequest jobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleParticleJobListOperationRecordRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleParticleJobListOperationRecordRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}