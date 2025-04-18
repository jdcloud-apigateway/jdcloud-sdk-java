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
 * 强制运行作业实例，允许触发作业失败，用于补数，商城触发
 */
public class GravityParticleJobscheReRunJobInstRequest extends JdcloudRequest implements java.io.Serializable {

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
     * sessionId
     */
    private Integer sessionId;

    /**
     * 是否清理之前的实例
     */
    private String isCleanBeforeInst;

    /**
     * 调用系统
     */
    private String system;

    /**
     * 是否完成
     */
    private String isComplement;

    /**
     * 请求序列号
     */
    private String _REQ_SEQ_NO_;

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
     * get sessionId
     *
     * @return
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * set sessionId
     *
     * @param sessionId
     */
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * get 是否清理之前的实例
     *
     * @return
     */
    public String getIsCleanBeforeInst() {
        return isCleanBeforeInst;
    }

    /**
     * set 是否清理之前的实例
     *
     * @param isCleanBeforeInst
     */
    public void setIsCleanBeforeInst(String isCleanBeforeInst) {
        this.isCleanBeforeInst = isCleanBeforeInst;
    }


    /**
     * get 调用系统
     *
     * @return
     */
    public String getSystem() {
        return system;
    }

    /**
     * set 调用系统
     *
     * @param system
     */
    public void setSystem(String system) {
        this.system = system;
    }


    /**
     * get 是否完成
     *
     * @return
     */
    public String getIsComplement() {
        return isComplement;
    }

    /**
     * set 是否完成
     *
     * @param isComplement
     */
    public void setIsComplement(String isComplement) {
        this.isComplement = isComplement;
    }


    /**
     * get 请求序列号
     *
     * @return
     */
    public String get_REQ_SEQ_NO_() {
        return _REQ_SEQ_NO_;
    }

    /**
     * set 请求序列号
     *
     * @param _REQ_SEQ_NO_
     */
    public void set_REQ_SEQ_NO_(String _REQ_SEQ_NO_) {
        this._REQ_SEQ_NO_ = _REQ_SEQ_NO_;
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
    public GravityParticleJobscheReRunJobInstRequest jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 数据日期
     *
     * @param txDate
     */
    public GravityParticleJobscheReRunJobInstRequest txDate(String txDate) {
        this.txDate = txDate;
        return this;
    }


    /**
     * set sessionId
     *
     * @param sessionId
     */
    public GravityParticleJobscheReRunJobInstRequest sessionId(Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }


    /**
     * set 是否清理之前的实例
     *
     * @param isCleanBeforeInst
     */
    public GravityParticleJobscheReRunJobInstRequest isCleanBeforeInst(String isCleanBeforeInst) {
        this.isCleanBeforeInst = isCleanBeforeInst;
        return this;
    }


    /**
     * set 调用系统
     *
     * @param system
     */
    public GravityParticleJobscheReRunJobInstRequest system(String system) {
        this.system = system;
        return this;
    }


    /**
     * set 是否完成
     *
     * @param isComplement
     */
    public GravityParticleJobscheReRunJobInstRequest isComplement(String isComplement) {
        this.isComplement = isComplement;
        return this;
    }


    /**
     * set 请求序列号
     *
     * @param _REQ_SEQ_NO_
     */
    public GravityParticleJobscheReRunJobInstRequest _REQ_SEQ_NO_(String _REQ_SEQ_NO_) {
        this._REQ_SEQ_NO_ = _REQ_SEQ_NO_;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GravityParticleJobscheReRunJobInstRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public GravityParticleJobscheReRunJobInstRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}