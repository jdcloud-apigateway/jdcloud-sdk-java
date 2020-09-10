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
 * Agent Interface
 * Agent Interface
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbaudit.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改agent资源限额,支持多个agentId,英文逗号分隔
 */
public class ModyfyAgentLimitsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否限制 0 不限制 1 限制(cpuLimit/memLimit必填)
     */
    private Integer limitStatus;

    /**
     * cpu使用限制（1%-50%）
     */
    private Integer cpuLimit;

    /**
     * 内存占用限额（1%-50%）
     */
    private Integer memLimit;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * agentId
     * Required:true
     */
    @Required
    private String agentId;


    /**
     * get 是否限制 0 不限制 1 限制(cpuLimit/memLimit必填)
     *
     * @return
     */
    public Integer getLimitStatus() {
        return limitStatus;
    }

    /**
     * set 是否限制 0 不限制 1 限制(cpuLimit/memLimit必填)
     *
     * @param limitStatus
     */
    public void setLimitStatus(Integer limitStatus) {
        this.limitStatus = limitStatus;
    }

    /**
     * get cpu使用限制（1%-50%）
     *
     * @return
     */
    public Integer getCpuLimit() {
        return cpuLimit;
    }

    /**
     * set cpu使用限制（1%-50%）
     *
     * @param cpuLimit
     */
    public void setCpuLimit(Integer cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    /**
     * get 内存占用限额（1%-50%）
     *
     * @return
     */
    public Integer getMemLimit() {
        return memLimit;
    }

    /**
     * set 内存占用限额（1%-50%）
     *
     * @param memLimit
     */
    public void setMemLimit(Integer memLimit) {
        this.memLimit = memLimit;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get agentId
     *
     * @return
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * set agentId
     *
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }


    /**
     * set 是否限制 0 不限制 1 限制(cpuLimit/memLimit必填)
     *
     * @param limitStatus
     */
    public ModyfyAgentLimitsRequest limitStatus(Integer limitStatus) {
        this.limitStatus = limitStatus;
        return this;
    }

    /**
     * set cpu使用限制（1%-50%）
     *
     * @param cpuLimit
     */
    public ModyfyAgentLimitsRequest cpuLimit(Integer cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * set 内存占用限额（1%-50%）
     *
     * @param memLimit
     */
    public ModyfyAgentLimitsRequest memLimit(Integer memLimit) {
        this.memLimit = memLimit;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public ModyfyAgentLimitsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set agentId
     *
     * @param agentId
     */
    public ModyfyAgentLimitsRequest agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }


}