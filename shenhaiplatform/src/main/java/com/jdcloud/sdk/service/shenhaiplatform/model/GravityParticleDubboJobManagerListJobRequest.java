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
 * 根据作业名模糊查询作业
 */
public class GravityParticleDubboJobManagerListJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录用户名
     */
    private String userName;

    /**
     * 作业名
     */
    private String jobName;

    /**
     * 客户作业名称
     */
    private String cstJobName;

    /**
     * 是否启用
     */
    private String enable;

    /**
     * 工作空间code
     */
    private String workspaceCode;

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
     * get 登录用户名
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 登录用户名
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * get 作业名
     *
     * @return
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set 作业名
     *
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
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
     * get 是否启用
     *
     * @return
     */
    public String getEnable() {
        return enable;
    }

    /**
     * set 是否启用
     *
     * @param enable
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }


    /**
     * get 工作空间code
     *
     * @return
     */
    public String getWorkspaceCode() {
        return workspaceCode;
    }

    /**
     * set 工作空间code
     *
     * @param workspaceCode
     */
    public void setWorkspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
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
     * set 登录用户名
     *
     * @param userName
     */
    public GravityParticleDubboJobManagerListJobRequest userName(String userName) {
        this.userName = userName;
        return this;
    }


    /**
     * set 作业名
     *
     * @param jobName
     */
    public GravityParticleDubboJobManagerListJobRequest jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 客户作业名称
     *
     * @param cstJobName
     */
    public GravityParticleDubboJobManagerListJobRequest cstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
        return this;
    }


    /**
     * set 是否启用
     *
     * @param enable
     */
    public GravityParticleDubboJobManagerListJobRequest enable(String enable) {
        this.enable = enable;
        return this;
    }


    /**
     * set 工作空间code
     *
     * @param workspaceCode
     */
    public GravityParticleDubboJobManagerListJobRequest workspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleDubboJobManagerListJobRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleDubboJobManagerListJobRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}