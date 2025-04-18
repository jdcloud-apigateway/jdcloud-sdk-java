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

package com.jdcloud.sdk.service.shenhaiplatform.model;


/**
 * jobBasicInfoVo
 */
public class JobBasicInfoVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业id
     */
    private Integer jobId;

    /**
     * 作业编码
     */
    private String etlJob;

    /**
     * 处理类型-展示
     */
    private String processType;

    /**
     * 创建时间: yyyy-MM-dd HH:mm:ss
     */
    private String createTime;

    /**
     * 更新时间: yyyy-MM-dd HH:mm:ss
     */
    private String updateTime;

    /**
     * 执行类型
     */
    private String exeType;

    /**
     * 工作空间代码
     */
    private String workspaceCode;

    /**
     * 作业类型
     */
    private String jobType;

    /**
     * 周期细节
     */
    private String frequency;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 协作人
     */
    private String shareUser;

    /**
     * 作业描述
     */
    private String jobDesc;

    /**
     * 过期时间
     */
    private String expireTime;

    /**
     * 上线状态
     */
    private String enable;

    /**
     * 优先级
     */
    private Integer priority;

    /**
     * 优先级等级
     */
    private String priorityLevel;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 处理类型代码
     */
    private String processTypeCode;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 作业名称
     */
    private String cstJobName;



    /**
     * get 作业id
     *
     * @return
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * set 作业id
     *
     * @param jobId
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }


    /**
     * get 作业编码
     *
     * @return
     */
    public String getEtlJob() {
        return etlJob;
    }

    /**
     * set 作业编码
     *
     * @param etlJob
     */
    public void setEtlJob(String etlJob) {
        this.etlJob = etlJob;
    }


    /**
     * get 处理类型-展示
     *
     * @return
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * set 处理类型-展示
     *
     * @param processType
     */
    public void setProcessType(String processType) {
        this.processType = processType;
    }


    /**
     * get 创建时间: yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间: yyyy-MM-dd HH:mm:ss
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 更新时间: yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间: yyyy-MM-dd HH:mm:ss
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
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
     * get 工作空间代码
     *
     * @return
     */
    public String getWorkspaceCode() {
        return workspaceCode;
    }

    /**
     * set 工作空间代码
     *
     * @param workspaceCode
     */
    public void setWorkspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
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
     * get 周期细节
     *
     * @return
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * set 周期细节
     *
     * @param frequency
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }


    /**
     * get 用户名
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 用户名
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * get 协作人
     *
     * @return
     */
    public String getShareUser() {
        return shareUser;
    }

    /**
     * set 协作人
     *
     * @param shareUser
     */
    public void setShareUser(String shareUser) {
        this.shareUser = shareUser;
    }


    /**
     * get 作业描述
     *
     * @return
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * set 作业描述
     *
     * @param jobDesc
     */
    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }


    /**
     * get 过期时间
     *
     * @return
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * set 过期时间
     *
     * @param expireTime
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * get 上线状态
     *
     * @return
     */
    public String getEnable() {
        return enable;
    }

    /**
     * set 上线状态
     *
     * @param enable
     */
    public void setEnable(String enable) {
        this.enable = enable;
    }


    /**
     * get 优先级
     *
     * @return
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * set 优先级
     *
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    /**
     * get 优先级等级
     *
     * @return
     */
    public String getPriorityLevel() {
        return priorityLevel;
    }

    /**
     * set 优先级等级
     *
     * @param priorityLevel
     */
    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }


    /**
     * get 渠道
     *
     * @return
     */
    public String getChannel() {
        return channel;
    }

    /**
     * set 渠道
     *
     * @param channel
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }


    /**
     * get 处理类型代码
     *
     * @return
     */
    public String getProcessTypeCode() {
        return processTypeCode;
    }

    /**
     * set 处理类型代码
     *
     * @param processTypeCode
     */
    public void setProcessTypeCode(String processTypeCode) {
        this.processTypeCode = processTypeCode;
    }


    /**
     * get 操作人
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 操作人
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * get 作业名称
     *
     * @return
     */
    public String getCstJobName() {
        return cstJobName;
    }

    /**
     * set 作业名称
     *
     * @param cstJobName
     */
    public void setCstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
    }



    /**
     * set 作业id
     *
     * @param jobId
     */
    public JobBasicInfoVo jobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }


    /**
     * set 作业编码
     *
     * @param etlJob
     */
    public JobBasicInfoVo etlJob(String etlJob) {
        this.etlJob = etlJob;
        return this;
    }


    /**
     * set 处理类型-展示
     *
     * @param processType
     */
    public JobBasicInfoVo processType(String processType) {
        this.processType = processType;
        return this;
    }


    /**
     * set 创建时间: yyyy-MM-dd HH:mm:ss
     *
     * @param createTime
     */
    public JobBasicInfoVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 更新时间: yyyy-MM-dd HH:mm:ss
     *
     * @param updateTime
     */
    public JobBasicInfoVo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 执行类型
     *
     * @param exeType
     */
    public JobBasicInfoVo exeType(String exeType) {
        this.exeType = exeType;
        return this;
    }


    /**
     * set 工作空间代码
     *
     * @param workspaceCode
     */
    public JobBasicInfoVo workspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
        return this;
    }


    /**
     * set 作业类型
     *
     * @param jobType
     */
    public JobBasicInfoVo jobType(String jobType) {
        this.jobType = jobType;
        return this;
    }


    /**
     * set 周期细节
     *
     * @param frequency
     */
    public JobBasicInfoVo frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }


    /**
     * set 用户名
     *
     * @param userName
     */
    public JobBasicInfoVo userName(String userName) {
        this.userName = userName;
        return this;
    }


    /**
     * set 协作人
     *
     * @param shareUser
     */
    public JobBasicInfoVo shareUser(String shareUser) {
        this.shareUser = shareUser;
        return this;
    }


    /**
     * set 作业描述
     *
     * @param jobDesc
     */
    public JobBasicInfoVo jobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
        return this;
    }


    /**
     * set 过期时间
     *
     * @param expireTime
     */
    public JobBasicInfoVo expireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }


    /**
     * set 上线状态
     *
     * @param enable
     */
    public JobBasicInfoVo enable(String enable) {
        this.enable = enable;
        return this;
    }


    /**
     * set 优先级
     *
     * @param priority
     */
    public JobBasicInfoVo priority(Integer priority) {
        this.priority = priority;
        return this;
    }


    /**
     * set 优先级等级
     *
     * @param priorityLevel
     */
    public JobBasicInfoVo priorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
        return this;
    }


    /**
     * set 渠道
     *
     * @param channel
     */
    public JobBasicInfoVo channel(String channel) {
        this.channel = channel;
        return this;
    }


    /**
     * set 处理类型代码
     *
     * @param processTypeCode
     */
    public JobBasicInfoVo processTypeCode(String processTypeCode) {
        this.processTypeCode = processTypeCode;
        return this;
    }


    /**
     * set 操作人
     *
     * @param operator
     */
    public JobBasicInfoVo operator(String operator) {
        this.operator = operator;
        return this;
    }


    /**
     * set 作业名称
     *
     * @param cstJobName
     */
    public JobBasicInfoVo cstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
        return this;
    }


}