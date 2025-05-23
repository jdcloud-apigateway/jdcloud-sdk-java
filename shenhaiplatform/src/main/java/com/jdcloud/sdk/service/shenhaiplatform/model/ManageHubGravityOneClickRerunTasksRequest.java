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
 * OneClickRerunController
 * 运营后台JobOpsController接口
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
 * 一键重跑任务详情
 */
public class ManageHubGravityOneClickRerunTasksRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页号
     */
    private Integer pageNum;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 批次id
     */
    private Integer batchId;

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
     * get 页号
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 页号
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    /**
     * get 页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 批次id
     *
     * @return
     */
    public Integer getBatchId() {
        return batchId;
    }

    /**
     * set 批次id
     *
     * @param batchId
     */
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
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
     * set 页号
     *
     * @param pageNum
     */
    public ManageHubGravityOneClickRerunTasksRequest pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
     * set 页大小
     *
     * @param pageSize
     */
    public ManageHubGravityOneClickRerunTasksRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 批次id
     *
     * @param batchId
     */
    public ManageHubGravityOneClickRerunTasksRequest batchId(Integer batchId) {
        this.batchId = batchId;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ManageHubGravityOneClickRerunTasksRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public ManageHubGravityOneClickRerunTasksRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}