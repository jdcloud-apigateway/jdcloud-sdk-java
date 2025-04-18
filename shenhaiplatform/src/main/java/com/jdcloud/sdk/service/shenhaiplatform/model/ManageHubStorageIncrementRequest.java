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
 * StorageMetricController
 * 存储指标接口
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
 * 每日存储增量
 */
public class ManageHubStorageIncrementRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 租户code, 当该参数不为空时，返回该租户的存储日增量；当该参数为空时返回集群的存储日增量
     */
    private String companyCode;

    /**
     * 开始日期 yyyy-MM-dd
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 结束日期 yyyy-MM-dd
     * Required:true
     */
    @Required
    private String endTime;

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
     * get 租户code, 当该参数不为空时，返回该租户的存储日增量；当该参数为空时返回集群的存储日增量
     *
     * @return
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * set 租户code, 当该参数不为空时，返回该租户的存储日增量；当该参数为空时返回集群的存储日增量
     *
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * get 开始日期 yyyy-MM-dd
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始日期 yyyy-MM-dd
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 结束日期 yyyy-MM-dd
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束日期 yyyy-MM-dd
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
     * set 租户code, 当该参数不为空时，返回该租户的存储日增量；当该参数为空时返回集群的存储日增量
     *
     * @param companyCode
     */
    public ManageHubStorageIncrementRequest companyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }


    /**
     * set 开始日期 yyyy-MM-dd
     *
     * @param startTime
     */
    public ManageHubStorageIncrementRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 结束日期 yyyy-MM-dd
     *
     * @param endTime
     */
    public ManageHubStorageIncrementRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ManageHubStorageIncrementRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public ManageHubStorageIncrementRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}