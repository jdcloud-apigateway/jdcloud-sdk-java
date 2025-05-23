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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 解析作业完成信息进行作业实例运行状态更新
 */
public class GravityParticleJobscheProcessJobExeRstRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业名称
     */
    private String jobName;

    /**
     * 数据日期
     */
    private String txDate;

    /**
     * 作业执行会话ID
     */
    private Integer sessionId;

    /**
     * 运行服务器名称
     */
    private String serverName;

    /**
     * 作业运行开始时间
     */
    private String startTime;

    /**
     * 作业运行结束时间
     */
    private String endTime;

    /**
     * 作业执行状态
     */
    private String jobStatus;

    /**
     * 作业返回码
     */
    private Integer returnCode;

    /**
     * 作业执行影响记录条数
     */
    private Long affectRows;

    /**
     * 作业执行警告代码
     */
    private Integer warningCode;

    /**
     * 作业执行集群job app id
     */
    
    private List<String> pids;
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
     * get 作业执行会话ID
     *
     * @return
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * set 作业执行会话ID
     *
     * @param sessionId
     */
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * get 运行服务器名称
     *
     * @return
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * set 运行服务器名称
     *
     * @param serverName
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }


    /**
     * get 作业运行开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 作业运行开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 作业运行结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 作业运行结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 作业执行状态
     *
     * @return
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * set 作业执行状态
     *
     * @param jobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }


    /**
     * get 作业返回码
     *
     * @return
     */
    public Integer getReturnCode() {
        return returnCode;
    }

    /**
     * set 作业返回码
     *
     * @param returnCode
     */
    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }


    /**
     * get 作业执行影响记录条数
     *
     * @return
     */
    public Long getAffectRows() {
        return affectRows;
    }

    /**
     * set 作业执行影响记录条数
     *
     * @param affectRows
     */
    public void setAffectRows(Long affectRows) {
        this.affectRows = affectRows;
    }


    /**
     * get 作业执行警告代码
     *
     * @return
     */
    public Integer getWarningCode() {
        return warningCode;
    }

    /**
     * set 作业执行警告代码
     *
     * @param warningCode
     */
    public void setWarningCode(Integer warningCode) {
        this.warningCode = warningCode;
    }


    /**
    * get 作业执行集群job app id
    *
    * @return
    */
    public List<String> getPids() {
        return pids;
    }

    /**
    * set 作业执行集群job app id
    *
    * @param pids
    */
    public void setPids(List<String> pids) {
        this.pids = pids;
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
    public GravityParticleJobscheProcessJobExeRstRequest jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 数据日期
     *
     * @param txDate
     */
    public GravityParticleJobscheProcessJobExeRstRequest txDate(String txDate) {
        this.txDate = txDate;
        return this;
    }


    /**
     * set 作业执行会话ID
     *
     * @param sessionId
     */
    public GravityParticleJobscheProcessJobExeRstRequest sessionId(Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }


    /**
     * set 运行服务器名称
     *
     * @param serverName
     */
    public GravityParticleJobscheProcessJobExeRstRequest serverName(String serverName) {
        this.serverName = serverName;
        return this;
    }


    /**
     * set 作业运行开始时间
     *
     * @param startTime
     */
    public GravityParticleJobscheProcessJobExeRstRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 作业运行结束时间
     *
     * @param endTime
     */
    public GravityParticleJobscheProcessJobExeRstRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 作业执行状态
     *
     * @param jobStatus
     */
    public GravityParticleJobscheProcessJobExeRstRequest jobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }


    /**
     * set 作业返回码
     *
     * @param returnCode
     */
    public GravityParticleJobscheProcessJobExeRstRequest returnCode(Integer returnCode) {
        this.returnCode = returnCode;
        return this;
    }


    /**
     * set 作业执行影响记录条数
     *
     * @param affectRows
     */
    public GravityParticleJobscheProcessJobExeRstRequest affectRows(Long affectRows) {
        this.affectRows = affectRows;
        return this;
    }


    /**
     * set 作业执行警告代码
     *
     * @param warningCode
     */
    public GravityParticleJobscheProcessJobExeRstRequest warningCode(Integer warningCode) {
        this.warningCode = warningCode;
        return this;
    }


    /**
    * set 作业执行集群job app id
    *
    * @param pids
    */
    public GravityParticleJobscheProcessJobExeRstRequest pids(List<String> pids) {
        this.pids = pids;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleJobscheProcessJobExeRstRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleJobscheProcessJobExeRstRequest appName(String appName) {
        this.appName = appName;
        return this;
    }



    /**
     * add item to 作业执行集群job app id
     *
     * @param pid
     */
    public void addPid(String pid) {
        if (this.pids == null) {
            this.pids = new ArrayList<>();
        }
        this.pids.add(pid);
    }
}