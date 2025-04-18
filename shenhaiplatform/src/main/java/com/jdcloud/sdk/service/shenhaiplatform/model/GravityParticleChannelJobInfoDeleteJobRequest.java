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
 * 作业基本管理
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
 * 删除作业以及子作业和质量作业
 */
public class GravityParticleChannelJobInfoDeleteJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业名称
     */
    private String jobName;

    /**
     * 是否删除子作业 1删除   0不删
     */
    private String isDelSonJob;

    /**
     * 是否删除质量作业  1删除   0不删
     */
    private String isDelQualityJob;

    /**
     * 用户角色列表
     */
    private String user_roles;

    /**
     * 作业负责人
     */
    private String username;

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
     * get 是否删除子作业 1删除   0不删
     *
     * @return
     */
    public String getIsDelSonJob() {
        return isDelSonJob;
    }

    /**
     * set 是否删除子作业 1删除   0不删
     *
     * @param isDelSonJob
     */
    public void setIsDelSonJob(String isDelSonJob) {
        this.isDelSonJob = isDelSonJob;
    }


    /**
     * get 是否删除质量作业  1删除   0不删
     *
     * @return
     */
    public String getIsDelQualityJob() {
        return isDelQualityJob;
    }

    /**
     * set 是否删除质量作业  1删除   0不删
     *
     * @param isDelQualityJob
     */
    public void setIsDelQualityJob(String isDelQualityJob) {
        this.isDelQualityJob = isDelQualityJob;
    }


    /**
     * get 用户角色列表
     *
     * @return
     */
    public String getUser_roles() {
        return user_roles;
    }

    /**
     * set 用户角色列表
     *
     * @param user_roles
     */
    public void setUser_roles(String user_roles) {
        this.user_roles = user_roles;
    }


    /**
     * get 作业负责人
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set 作业负责人
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
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
    public GravityParticleChannelJobInfoDeleteJobRequest jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 是否删除子作业 1删除   0不删
     *
     * @param isDelSonJob
     */
    public GravityParticleChannelJobInfoDeleteJobRequest isDelSonJob(String isDelSonJob) {
        this.isDelSonJob = isDelSonJob;
        return this;
    }


    /**
     * set 是否删除质量作业  1删除   0不删
     *
     * @param isDelQualityJob
     */
    public GravityParticleChannelJobInfoDeleteJobRequest isDelQualityJob(String isDelQualityJob) {
        this.isDelQualityJob = isDelQualityJob;
        return this;
    }


    /**
     * set 用户角色列表
     *
     * @param user_roles
     */
    public GravityParticleChannelJobInfoDeleteJobRequest user_roles(String user_roles) {
        this.user_roles = user_roles;
        return this;
    }


    /**
     * set 作业负责人
     *
     * @param username
     */
    public GravityParticleChannelJobInfoDeleteJobRequest username(String username) {
        this.username = username;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleChannelJobInfoDeleteJobRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleChannelJobInfoDeleteJobRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}