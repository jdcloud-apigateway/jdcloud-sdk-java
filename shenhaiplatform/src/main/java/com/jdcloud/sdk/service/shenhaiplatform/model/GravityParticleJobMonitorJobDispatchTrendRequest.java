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
 * 将作业按趋势进行数据量的统计
 */
public class GravityParticleJobMonitorJobDispatchTrendRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否统计本人作业
     */
    private Boolean isMine;

    /**
     * 统计维度：job作业，inst实例
     * Required:true
     */
    @Required
    private String dimType;

    /**
     * 统计范围天数
     * Required:true
     */
    @Required
    private Integer slot;

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
     * get 是否统计本人作业
     *
     * @return
     */
    public Boolean getIsMine() {
        return isMine;
    }

    /**
     * set 是否统计本人作业
     *
     * @param isMine
     */
    public void setIsMine(Boolean isMine) {
        this.isMine = isMine;
    }


    /**
     * get 统计维度：job作业，inst实例
     *
     * @return
     */
    public String getDimType() {
        return dimType;
    }

    /**
     * set 统计维度：job作业，inst实例
     *
     * @param dimType
     */
    public void setDimType(String dimType) {
        this.dimType = dimType;
    }


    /**
     * get 统计范围天数
     *
     * @return
     */
    public Integer getSlot() {
        return slot;
    }

    /**
     * set 统计范围天数
     *
     * @param slot
     */
    public void setSlot(Integer slot) {
        this.slot = slot;
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
     * set 是否统计本人作业
     *
     * @param isMine
     */
    public GravityParticleJobMonitorJobDispatchTrendRequest isMine(Boolean isMine) {
        this.isMine = isMine;
        return this;
    }


    /**
     * set 统计维度：job作业，inst实例
     *
     * @param dimType
     */
    public GravityParticleJobMonitorJobDispatchTrendRequest dimType(String dimType) {
        this.dimType = dimType;
        return this;
    }


    /**
     * set 统计范围天数
     *
     * @param slot
     */
    public GravityParticleJobMonitorJobDispatchTrendRequest slot(Integer slot) {
        this.slot = slot;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleJobMonitorJobDispatchTrendRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleJobMonitorJobDispatchTrendRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}