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
 * 作业补数相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 补数跟踪列表
 */
public class GravityParticleJobHisRunListTaskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业补数信息主键id
     */
    private Integer id;

    /**
     * 当前补数日期
     */
    private String txdate;

    /**
     * 任务状态
     */
    private String statu;

    /**
     * 补数任务是否关闭
     */
    private String enable;

    /**
     * 补数当前状态信息
     */
    private String currentMsg;

    /**
     * 任务名称
     */
    private String jobName;

    /**
     * 补数开始日期
     */
    private String jobStartDate;

    /**
     * 补数结束日期
     */
    private String jobEndDate;

    /**
     * 作业描述
     */
    private String description;

    /**
     * 周期具体日期
     */
    private String cycle;

    /**
     * 处理类型
     */
    private String processType;

    /**
     * 执行类型
     */
    private String exeType;

    /**
     * 创建时间
     */
    private String createDate;

    /**
     * calc：数据计算，extract：数据抽取，ods：ODS加工，load：数据推送，hdfs：数据同步,dqim:质量作业
     */
    private String processTypeLabel;

    /**
     * 作业负责人
     */
    private String manager;

    /**
     * 状态
     */
    private String statusLabel;

    /**
     * 作业类型
     */
    private String jobType;

    /**
     * 作业子类型
     */
    private String jobChildType;

    /**
     * 当前用户是否为当前作业的管理员
     */
    private Boolean managerFlag;

    /**
     * 客户作业名
     */
    private String cstJobName;



    /**
     * get 作业补数信息主键id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 作业补数信息主键id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get 当前补数日期
     *
     * @return
     */
    public String getTxdate() {
        return txdate;
    }

    /**
     * set 当前补数日期
     *
     * @param txdate
     */
    public void setTxdate(String txdate) {
        this.txdate = txdate;
    }


    /**
     * get 任务状态
     *
     * @return
     */
    public String getStatu() {
        return statu;
    }

    /**
     * set 任务状态
     *
     * @param statu
     */
    public void setStatu(String statu) {
        this.statu = statu;
    }


    /**
     * get 补数任务是否关闭
     *
     * @return
     */
    public String getEnable() {
        return enable;
    }

    /**
     * set 补数任务是否关闭
     *
     * @param enable
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }


    /**
     * get 补数当前状态信息
     *
     * @return
     */
    public String getCurrentMsg() {
        return currentMsg;
    }

    /**
     * set 补数当前状态信息
     *
     * @param currentMsg
     */
    public void setCurrentMsg(String currentMsg) {
        this.currentMsg = currentMsg;
    }


    /**
     * get 任务名称
     *
     * @return
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set 任务名称
     *
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }


    /**
     * get 补数开始日期
     *
     * @return
     */
    public String getJobStartDate() {
        return jobStartDate;
    }

    /**
     * set 补数开始日期
     *
     * @param jobStartDate
     */
    public void setJobStartDate(String jobStartDate) {
        this.jobStartDate = jobStartDate;
    }


    /**
     * get 补数结束日期
     *
     * @return
     */
    public String getJobEndDate() {
        return jobEndDate;
    }

    /**
     * set 补数结束日期
     *
     * @param jobEndDate
     */
    public void setJobEndDate(String jobEndDate) {
        this.jobEndDate = jobEndDate;
    }


    /**
     * get 作业描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 作业描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 周期具体日期
     *
     * @return
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * set 周期具体日期
     *
     * @param cycle
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }


    /**
     * get 处理类型
     *
     * @return
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * set 处理类型
     *
     * @param processType
     */
    public void setProcessType(String processType) {
        this.processType = processType;
    }


    /**
     * get 执行类型
     *
     * @return
     */
    public String getExeType() {
        return exeType;
    }

    /**
     * set 执行类型
     *
     * @param exeType
     */
    public void setExeType(String exeType) {
        this.exeType = exeType;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * set 创建时间
     *
     * @param createDate
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


    /**
     * get calc：数据计算，extract：数据抽取，ods：ODS加工，load：数据推送，hdfs：数据同步,dqim:质量作业
     *
     * @return
     */
    public String getProcessTypeLabel() {
        return processTypeLabel;
    }

    /**
     * set calc：数据计算，extract：数据抽取，ods：ODS加工，load：数据推送，hdfs：数据同步,dqim:质量作业
     *
     * @param processTypeLabel
     */
    public void setProcessTypeLabel(String processTypeLabel) {
        this.processTypeLabel = processTypeLabel;
    }


    /**
     * get 作业负责人
     *
     * @return
     */
    public String getManager() {
        return manager;
    }

    /**
     * set 作业负责人
     *
     * @param manager
     */
    public void setManager(String manager) {
        this.manager = manager;
    }


    /**
     * get 状态
     *
     * @return
     */
    public String getStatusLabel() {
        return statusLabel;
    }

    /**
     * set 状态
     *
     * @param statusLabel
     */
    public void setStatusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
    }


    /**
     * get 作业类型
     *
     * @return
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * set 作业类型
     *
     * @param jobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }


    /**
     * get 作业子类型
     *
     * @return
     */
    public String getJobChildType() {
        return jobChildType;
    }

    /**
     * set 作业子类型
     *
     * @param jobChildType
     */
    public void setJobChildType(String jobChildType) {
        this.jobChildType = jobChildType;
    }


    /**
     * get 当前用户是否为当前作业的管理员
     *
     * @return
     */
    public Boolean getManagerFlag() {
        return managerFlag;
    }

    /**
     * set 当前用户是否为当前作业的管理员
     *
     * @param managerFlag
     */
    public void setManagerFlag(Boolean managerFlag) {
        this.managerFlag = managerFlag;
    }


    /**
     * get 客户作业名
     *
     * @return
     */
    public String getCstJobName() {
        return cstJobName;
    }

    /**
     * set 客户作业名
     *
     * @param cstJobName
     */
    public void setCstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
    }



    /**
     * set 作业补数信息主键id
     *
     * @param id
     */
    public GravityParticleJobHisRunListTaskResult id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 当前补数日期
     *
     * @param txdate
     */
    public GravityParticleJobHisRunListTaskResult txdate(String txdate) {
        this.txdate = txdate;
        return this;
    }


    /**
     * set 任务状态
     *
     * @param statu
     */
    public GravityParticleJobHisRunListTaskResult statu(String statu) {
        this.statu = statu;
        return this;
    }


    /**
     * set 补数任务是否关闭
     *
     * @param enable
     */
    public GravityParticleJobHisRunListTaskResult enable(String enable) {
        this.enable = enable;
        return this;
    }


    /**
     * set 补数当前状态信息
     *
     * @param currentMsg
     */
    public GravityParticleJobHisRunListTaskResult currentMsg(String currentMsg) {
        this.currentMsg = currentMsg;
        return this;
    }


    /**
     * set 任务名称
     *
     * @param jobName
     */
    public GravityParticleJobHisRunListTaskResult jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 补数开始日期
     *
     * @param jobStartDate
     */
    public GravityParticleJobHisRunListTaskResult jobStartDate(String jobStartDate) {
        this.jobStartDate = jobStartDate;
        return this;
    }


    /**
     * set 补数结束日期
     *
     * @param jobEndDate
     */
    public GravityParticleJobHisRunListTaskResult jobEndDate(String jobEndDate) {
        this.jobEndDate = jobEndDate;
        return this;
    }


    /**
     * set 作业描述
     *
     * @param description
     */
    public GravityParticleJobHisRunListTaskResult description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 周期具体日期
     *
     * @param cycle
     */
    public GravityParticleJobHisRunListTaskResult cycle(String cycle) {
        this.cycle = cycle;
        return this;
    }


    /**
     * set 处理类型
     *
     * @param processType
     */
    public GravityParticleJobHisRunListTaskResult processType(String processType) {
        this.processType = processType;
        return this;
    }


    /**
     * set 执行类型
     *
     * @param exeType
     */
    public GravityParticleJobHisRunListTaskResult exeType(String exeType) {
        this.exeType = exeType;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createDate
     */
    public GravityParticleJobHisRunListTaskResult createDate(String createDate) {
        this.createDate = createDate;
        return this;
    }


    /**
     * set calc：数据计算，extract：数据抽取，ods：ODS加工，load：数据推送，hdfs：数据同步,dqim:质量作业
     *
     * @param processTypeLabel
     */
    public GravityParticleJobHisRunListTaskResult processTypeLabel(String processTypeLabel) {
        this.processTypeLabel = processTypeLabel;
        return this;
    }


    /**
     * set 作业负责人
     *
     * @param manager
     */
    public GravityParticleJobHisRunListTaskResult manager(String manager) {
        this.manager = manager;
        return this;
    }


    /**
     * set 状态
     *
     * @param statusLabel
     */
    public GravityParticleJobHisRunListTaskResult statusLabel(String statusLabel) {
        this.statusLabel = statusLabel;
        return this;
    }


    /**
     * set 作业类型
     *
     * @param jobType
     */
    public GravityParticleJobHisRunListTaskResult jobType(String jobType) {
        this.jobType = jobType;
        return this;
    }


    /**
     * set 作业子类型
     *
     * @param jobChildType
     */
    public GravityParticleJobHisRunListTaskResult jobChildType(String jobChildType) {
        this.jobChildType = jobChildType;
        return this;
    }


    /**
     * set 当前用户是否为当前作业的管理员
     *
     * @param managerFlag
     */
    public GravityParticleJobHisRunListTaskResult managerFlag(Boolean managerFlag) {
        this.managerFlag = managerFlag;
        return this;
    }


    /**
     * set 客户作业名
     *
     * @param cstJobName
     */
    public GravityParticleJobHisRunListTaskResult cstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
        return this;
    }


}