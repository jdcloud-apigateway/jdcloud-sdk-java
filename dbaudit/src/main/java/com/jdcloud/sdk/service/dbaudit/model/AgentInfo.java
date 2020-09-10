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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbaudit.model;


/**
 * 数据库审计agent信息
 */
public class AgentInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * agentID
     */
    private String agnetId;

    /**
     * 主机ID
     */
    private String hostId;

    /**
     * 操作系统类型 Windows Server | CentOS
     */
    private String osType;

    /**
     * 主机名称
     */
    private String hostName;

    /**
     * agent运行状态 0 安装中 1 运行中 2 离线 3 已卸载 4 待配置 5 安装失败(ifrit安装失败，需要重试或者手动安装)
     */
    private Integer agentStatus;

    /**
     * ifrit客户端的状态 0 安装成功 1 离线状态
     */
    private Integer ifritStatus;

    /**
     * agent审计的数据库数量
     */
    private Integer auditCount;

    /**
     * 是否限制CPU/MEM
0 否 
1 是 此时cpuLimit/memLimit为必填项

     */
    private Integer limitStatus;

    /**
     * CPU限制，单位%
     */
    private Float cpuLimit;

    /**
     * 内存限制，单位%
     */
    private Float memLimit;

    /**
     * CPU实时占比，单位%
     */
    private Float cpuPercent;

    /**
     * 内存实时占比，单位%
     */
    private Float memPercert;

    /**
     * 内存总量,单位MB
     */
    private Integer memTotal;

    /**
     * CPU核数,单位核数
     */
    private Integer cpuTotal;

    /**
     * agent安装时间
     */
    private String installTime;

    /**
     * 最后一次上报数据时间
     */
    private String lastUpdateTime;


    /**
     * get agentID
     *
     * @return
     */
    public String getAgnetId() {
        return agnetId;
    }

    /**
     * set agentID
     *
     * @param agnetId
     */
    public void setAgnetId(String agnetId) {
        this.agnetId = agnetId;
    }

    /**
     * get 主机ID
     *
     * @return
     */
    public String getHostId() {
        return hostId;
    }

    /**
     * set 主机ID
     *
     * @param hostId
     */
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    /**
     * get 操作系统类型 Windows Server | CentOS
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 操作系统类型 Windows Server | CentOS
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * get 主机名称
     *
     * @return
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * set 主机名称
     *
     * @param hostName
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * get agent运行状态 0 安装中 1 运行中 2 离线 3 已卸载 4 待配置 5 安装失败(ifrit安装失败，需要重试或者手动安装)
     *
     * @return
     */
    public Integer getAgentStatus() {
        return agentStatus;
    }

    /**
     * set agent运行状态 0 安装中 1 运行中 2 离线 3 已卸载 4 待配置 5 安装失败(ifrit安装失败，需要重试或者手动安装)
     *
     * @param agentStatus
     */
    public void setAgentStatus(Integer agentStatus) {
        this.agentStatus = agentStatus;
    }

    /**
     * get ifrit客户端的状态 0 安装成功 1 离线状态
     *
     * @return
     */
    public Integer getIfritStatus() {
        return ifritStatus;
    }

    /**
     * set ifrit客户端的状态 0 安装成功 1 离线状态
     *
     * @param ifritStatus
     */
    public void setIfritStatus(Integer ifritStatus) {
        this.ifritStatus = ifritStatus;
    }

    /**
     * get agent审计的数据库数量
     *
     * @return
     */
    public Integer getAuditCount() {
        return auditCount;
    }

    /**
     * set agent审计的数据库数量
     *
     * @param auditCount
     */
    public void setAuditCount(Integer auditCount) {
        this.auditCount = auditCount;
    }

    /**
     * get 是否限制CPU/MEM
0 否 
1 是 此时cpuLimit/memLimit为必填项

     *
     * @return
     */
    public Integer getLimitStatus() {
        return limitStatus;
    }

    /**
     * set 是否限制CPU/MEM
0 否 
1 是 此时cpuLimit/memLimit为必填项

     *
     * @param limitStatus
     */
    public void setLimitStatus(Integer limitStatus) {
        this.limitStatus = limitStatus;
    }

    /**
     * get CPU限制，单位%
     *
     * @return
     */
    public Float getCpuLimit() {
        return cpuLimit;
    }

    /**
     * set CPU限制，单位%
     *
     * @param cpuLimit
     */
    public void setCpuLimit(Float cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    /**
     * get 内存限制，单位%
     *
     * @return
     */
    public Float getMemLimit() {
        return memLimit;
    }

    /**
     * set 内存限制，单位%
     *
     * @param memLimit
     */
    public void setMemLimit(Float memLimit) {
        this.memLimit = memLimit;
    }

    /**
     * get CPU实时占比，单位%
     *
     * @return
     */
    public Float getCpuPercent() {
        return cpuPercent;
    }

    /**
     * set CPU实时占比，单位%
     *
     * @param cpuPercent
     */
    public void setCpuPercent(Float cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    /**
     * get 内存实时占比，单位%
     *
     * @return
     */
    public Float getMemPercert() {
        return memPercert;
    }

    /**
     * set 内存实时占比，单位%
     *
     * @param memPercert
     */
    public void setMemPercert(Float memPercert) {
        this.memPercert = memPercert;
    }

    /**
     * get 内存总量,单位MB
     *
     * @return
     */
    public Integer getMemTotal() {
        return memTotal;
    }

    /**
     * set 内存总量,单位MB
     *
     * @param memTotal
     */
    public void setMemTotal(Integer memTotal) {
        this.memTotal = memTotal;
    }

    /**
     * get CPU核数,单位核数
     *
     * @return
     */
    public Integer getCpuTotal() {
        return cpuTotal;
    }

    /**
     * set CPU核数,单位核数
     *
     * @param cpuTotal
     */
    public void setCpuTotal(Integer cpuTotal) {
        this.cpuTotal = cpuTotal;
    }

    /**
     * get agent安装时间
     *
     * @return
     */
    public String getInstallTime() {
        return installTime;
    }

    /**
     * set agent安装时间
     *
     * @param installTime
     */
    public void setInstallTime(String installTime) {
        this.installTime = installTime;
    }

    /**
     * get 最后一次上报数据时间
     *
     * @return
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * set 最后一次上报数据时间
     *
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }


    /**
     * set agentID
     *
     * @param agnetId
     */
    public AgentInfo agnetId(String agnetId) {
        this.agnetId = agnetId;
        return this;
    }

    /**
     * set 主机ID
     *
     * @param hostId
     */
    public AgentInfo hostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * set 操作系统类型 Windows Server | CentOS
     *
     * @param osType
     */
    public AgentInfo osType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set 主机名称
     *
     * @param hostName
     */
    public AgentInfo hostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * set agent运行状态 0 安装中 1 运行中 2 离线 3 已卸载 4 待配置 5 安装失败(ifrit安装失败，需要重试或者手动安装)
     *
     * @param agentStatus
     */
    public AgentInfo agentStatus(Integer agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * set ifrit客户端的状态 0 安装成功 1 离线状态
     *
     * @param ifritStatus
     */
    public AgentInfo ifritStatus(Integer ifritStatus) {
        this.ifritStatus = ifritStatus;
        return this;
    }

    /**
     * set agent审计的数据库数量
     *
     * @param auditCount
     */
    public AgentInfo auditCount(Integer auditCount) {
        this.auditCount = auditCount;
        return this;
    }

    /**
     * set 是否限制CPU/MEM
0 否 
1 是 此时cpuLimit/memLimit为必填项

     *
     * @param limitStatus
     */
    public AgentInfo limitStatus(Integer limitStatus) {
        this.limitStatus = limitStatus;
        return this;
    }

    /**
     * set CPU限制，单位%
     *
     * @param cpuLimit
     */
    public AgentInfo cpuLimit(Float cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * set 内存限制，单位%
     *
     * @param memLimit
     */
    public AgentInfo memLimit(Float memLimit) {
        this.memLimit = memLimit;
        return this;
    }

    /**
     * set CPU实时占比，单位%
     *
     * @param cpuPercent
     */
    public AgentInfo cpuPercent(Float cpuPercent) {
        this.cpuPercent = cpuPercent;
        return this;
    }

    /**
     * set 内存实时占比，单位%
     *
     * @param memPercert
     */
    public AgentInfo memPercert(Float memPercert) {
        this.memPercert = memPercert;
        return this;
    }

    /**
     * set 内存总量,单位MB
     *
     * @param memTotal
     */
    public AgentInfo memTotal(Integer memTotal) {
        this.memTotal = memTotal;
        return this;
    }

    /**
     * set CPU核数,单位核数
     *
     * @param cpuTotal
     */
    public AgentInfo cpuTotal(Integer cpuTotal) {
        this.cpuTotal = cpuTotal;
        return this;
    }

    /**
     * set agent安装时间
     *
     * @param installTime
     */
    public AgentInfo installTime(String installTime) {
        this.installTime = installTime;
        return this;
    }

    /**
     * set 最后一次上报数据时间
     *
     * @param lastUpdateTime
     */
    public AgentInfo lastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }


}