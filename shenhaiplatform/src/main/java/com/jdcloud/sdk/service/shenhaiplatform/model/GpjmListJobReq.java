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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * gpjmListJobReq
 */
public class GpjmListJobReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页面大小
     * Required:true
     */
    @Required
    private Integer pageSize;

    /**
     * 页码
     * Required:true
     */
    @Required
    private Integer pageNum;

    /**
     * 最后一次运行状态
     */
    
    private List<String> lastJobStatus;
    /**
     * 处理类型
     */
    
    private List<String> excludeJobTypes;
    /**
     * marketJobsAll
     */
    private String marketJobsAll;

    /**
     * 负责人
     */
    private String manager;

    /**
     * 任务类型
     */
    private String queryMode;

    /**
     * 作业上上线下线状态
     */
    private String enable;

    /**
     * 作业名
     */
    private String jobName;

    /**
     * currentStatus
     */
    private String currentStatus;

    /**
     * 处理类型
     */
    private String processType;

    /**
     * 数据日期
     */
    private String lastTxdate;

    /**
     * 运行周期
     */
    private String cycle;

    /**
     * 任务执行时间开始
     */
    private String jobStartRunTime;

    /**
     * 任务执行时间- 结束
     */
    private String jobEndRunTime;

    /**
     * 任务创建日期-结束
     */
    private String createTimeBefore;

    /**
     * 任务创建日期-开始
     */
    private String createTimeAfter;

    /**
     * 任务修改日期-结束
     */
    private String updateTimeBefore;

    /**
     * 任务修改日期-开始
     */
    private String updateTimeAfter;

    /**
     * 任务类型
     */
    private String jobType;

    /**
     * markClassifyCode
     */
    private String markClassifyCode;

    /**
     * markName
     */
    private String markName;

    /**
     * jobChildType
     */
    private String jobChildType;

    /**
     * 客户作业名
     */
    private String cstJobName;



    /**
     * get 页面大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页面大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 页码
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    /**
    * get 最后一次运行状态
    *
    * @return
    */
    public List<String> getLastJobStatus() {
        return lastJobStatus;
    }

    /**
    * set 最后一次运行状态
    *
    * @param lastJobStatus
    */
    public void setLastJobStatus(List<String> lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
    }


    /**
    * get 处理类型
    *
    * @return
    */
    public List<String> getExcludeJobTypes() {
        return excludeJobTypes;
    }

    /**
    * set 处理类型
    *
    * @param excludeJobTypes
    */
    public void setExcludeJobTypes(List<String> excludeJobTypes) {
        this.excludeJobTypes = excludeJobTypes;
    }


    /**
     * get marketJobsAll
     *
     * @return
     */
    public String getMarketJobsAll() {
        return marketJobsAll;
    }

    /**
     * set marketJobsAll
     *
     * @param marketJobsAll
     */
    public void setMarketJobsAll(String marketJobsAll) {
        this.marketJobsAll = marketJobsAll;
    }


    /**
     * get 负责人
     *
     * @return
     */
    public String getManager() {
        return manager;
    }

    /**
     * set 负责人
     *
     * @param manager
     */
    public void setManager(String manager) {
        this.manager = manager;
    }


    /**
     * get 任务类型
     *
     * @return
     */
    public String getQueryMode() {
        return queryMode;
    }

    /**
     * set 任务类型
     *
     * @param queryMode
     */
    public void setQueryMode(String queryMode) {
        this.queryMode = queryMode;
    }


    /**
     * get 作业上上线下线状态
     *
     * @return
     */
    public String getEnable() {
        return enable;
    }

    /**
     * set 作业上上线下线状态
     *
     * @param enable
     */
    public void setEnable(String enable) {
        this.enable = enable;
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
     * get currentStatus
     *
     * @return
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * set currentStatus
     *
     * @param currentStatus
     */
    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
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
     * get 数据日期
     *
     * @return
     */
    public String getLastTxdate() {
        return lastTxdate;
    }

    /**
     * set 数据日期
     *
     * @param lastTxdate
     */
    public void setLastTxdate(String lastTxdate) {
        this.lastTxdate = lastTxdate;
    }


    /**
     * get 运行周期
     *
     * @return
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * set 运行周期
     *
     * @param cycle
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }


    /**
     * get 任务执行时间开始
     *
     * @return
     */
    public String getJobStartRunTime() {
        return jobStartRunTime;
    }

    /**
     * set 任务执行时间开始
     *
     * @param jobStartRunTime
     */
    public void setJobStartRunTime(String jobStartRunTime) {
        this.jobStartRunTime = jobStartRunTime;
    }


    /**
     * get 任务执行时间- 结束
     *
     * @return
     */
    public String getJobEndRunTime() {
        return jobEndRunTime;
    }

    /**
     * set 任务执行时间- 结束
     *
     * @param jobEndRunTime
     */
    public void setJobEndRunTime(String jobEndRunTime) {
        this.jobEndRunTime = jobEndRunTime;
    }


    /**
     * get 任务创建日期-结束
     *
     * @return
     */
    public String getCreateTimeBefore() {
        return createTimeBefore;
    }

    /**
     * set 任务创建日期-结束
     *
     * @param createTimeBefore
     */
    public void setCreateTimeBefore(String createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
    }


    /**
     * get 任务创建日期-开始
     *
     * @return
     */
    public String getCreateTimeAfter() {
        return createTimeAfter;
    }

    /**
     * set 任务创建日期-开始
     *
     * @param createTimeAfter
     */
    public void setCreateTimeAfter(String createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
    }


    /**
     * get 任务修改日期-结束
     *
     * @return
     */
    public String getUpdateTimeBefore() {
        return updateTimeBefore;
    }

    /**
     * set 任务修改日期-结束
     *
     * @param updateTimeBefore
     */
    public void setUpdateTimeBefore(String updateTimeBefore) {
        this.updateTimeBefore = updateTimeBefore;
    }


    /**
     * get 任务修改日期-开始
     *
     * @return
     */
    public String getUpdateTimeAfter() {
        return updateTimeAfter;
    }

    /**
     * set 任务修改日期-开始
     *
     * @param updateTimeAfter
     */
    public void setUpdateTimeAfter(String updateTimeAfter) {
        this.updateTimeAfter = updateTimeAfter;
    }


    /**
     * get 任务类型
     *
     * @return
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * set 任务类型
     *
     * @param jobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }


    /**
     * get markClassifyCode
     *
     * @return
     */
    public String getMarkClassifyCode() {
        return markClassifyCode;
    }

    /**
     * set markClassifyCode
     *
     * @param markClassifyCode
     */
    public void setMarkClassifyCode(String markClassifyCode) {
        this.markClassifyCode = markClassifyCode;
    }


    /**
     * get markName
     *
     * @return
     */
    public String getMarkName() {
        return markName;
    }

    /**
     * set markName
     *
     * @param markName
     */
    public void setMarkName(String markName) {
        this.markName = markName;
    }


    /**
     * get jobChildType
     *
     * @return
     */
    public String getJobChildType() {
        return jobChildType;
    }

    /**
     * set jobChildType
     *
     * @param jobChildType
     */
    public void setJobChildType(String jobChildType) {
        this.jobChildType = jobChildType;
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
     * set 页面大小
     *
     * @param pageSize
     */
    public GpjmListJobReq pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 页码
     *
     * @param pageNum
     */
    public GpjmListJobReq pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
    * set 最后一次运行状态
    *
    * @param lastJobStatus
    */
    public GpjmListJobReq lastJobStatus(List<String> lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
        return this;
    }


    /**
    * set 处理类型
    *
    * @param excludeJobTypes
    */
    public GpjmListJobReq excludeJobTypes(List<String> excludeJobTypes) {
        this.excludeJobTypes = excludeJobTypes;
        return this;
    }


    /**
     * set marketJobsAll
     *
     * @param marketJobsAll
     */
    public GpjmListJobReq marketJobsAll(String marketJobsAll) {
        this.marketJobsAll = marketJobsAll;
        return this;
    }


    /**
     * set 负责人
     *
     * @param manager
     */
    public GpjmListJobReq manager(String manager) {
        this.manager = manager;
        return this;
    }


    /**
     * set 任务类型
     *
     * @param queryMode
     */
    public GpjmListJobReq queryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }


    /**
     * set 作业上上线下线状态
     *
     * @param enable
     */
    public GpjmListJobReq enable(String enable) {
        this.enable = enable;
        return this;
    }


    /**
     * set 作业名
     *
     * @param jobName
     */
    public GpjmListJobReq jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set currentStatus
     *
     * @param currentStatus
     */
    public GpjmListJobReq currentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }


    /**
     * set 处理类型
     *
     * @param processType
     */
    public GpjmListJobReq processType(String processType) {
        this.processType = processType;
        return this;
    }


    /**
     * set 数据日期
     *
     * @param lastTxdate
     */
    public GpjmListJobReq lastTxdate(String lastTxdate) {
        this.lastTxdate = lastTxdate;
        return this;
    }


    /**
     * set 运行周期
     *
     * @param cycle
     */
    public GpjmListJobReq cycle(String cycle) {
        this.cycle = cycle;
        return this;
    }


    /**
     * set 任务执行时间开始
     *
     * @param jobStartRunTime
     */
    public GpjmListJobReq jobStartRunTime(String jobStartRunTime) {
        this.jobStartRunTime = jobStartRunTime;
        return this;
    }


    /**
     * set 任务执行时间- 结束
     *
     * @param jobEndRunTime
     */
    public GpjmListJobReq jobEndRunTime(String jobEndRunTime) {
        this.jobEndRunTime = jobEndRunTime;
        return this;
    }


    /**
     * set 任务创建日期-结束
     *
     * @param createTimeBefore
     */
    public GpjmListJobReq createTimeBefore(String createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
        return this;
    }


    /**
     * set 任务创建日期-开始
     *
     * @param createTimeAfter
     */
    public GpjmListJobReq createTimeAfter(String createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
        return this;
    }


    /**
     * set 任务修改日期-结束
     *
     * @param updateTimeBefore
     */
    public GpjmListJobReq updateTimeBefore(String updateTimeBefore) {
        this.updateTimeBefore = updateTimeBefore;
        return this;
    }


    /**
     * set 任务修改日期-开始
     *
     * @param updateTimeAfter
     */
    public GpjmListJobReq updateTimeAfter(String updateTimeAfter) {
        this.updateTimeAfter = updateTimeAfter;
        return this;
    }


    /**
     * set 任务类型
     *
     * @param jobType
     */
    public GpjmListJobReq jobType(String jobType) {
        this.jobType = jobType;
        return this;
    }


    /**
     * set markClassifyCode
     *
     * @param markClassifyCode
     */
    public GpjmListJobReq markClassifyCode(String markClassifyCode) {
        this.markClassifyCode = markClassifyCode;
        return this;
    }


    /**
     * set markName
     *
     * @param markName
     */
    public GpjmListJobReq markName(String markName) {
        this.markName = markName;
        return this;
    }


    /**
     * set jobChildType
     *
     * @param jobChildType
     */
    public GpjmListJobReq jobChildType(String jobChildType) {
        this.jobChildType = jobChildType;
        return this;
    }


    /**
     * set 客户作业名
     *
     * @param cstJobName
     */
    public GpjmListJobReq cstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
        return this;
    }



    /**
     * add item to 最后一次运行状态
     *
     * @param lastJobStatu
     */
    public void addLastJobStatu(String lastJobStatu) {
        if (this.lastJobStatus == null) {
            this.lastJobStatus = new ArrayList<>();
        }
        this.lastJobStatus.add(lastJobStatu);
    }

    /**
     * add item to 处理类型
     *
     * @param excludeJobType
     */
    public void addExcludeJobType(String excludeJobType) {
        if (this.excludeJobTypes == null) {
            this.excludeJobTypes = new ArrayList<>();
        }
        this.excludeJobTypes.add(excludeJobType);
    }
}