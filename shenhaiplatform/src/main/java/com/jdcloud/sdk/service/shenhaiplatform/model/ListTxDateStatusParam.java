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
 * listTxDateStatusParam
 */
public class ListTxDateStatusParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 任务编码
     */
    private String companyCode;

    /**
     * 负责人pin
     */
    private String managerPin;

    /**
     * 工作空间编码
     */
    private String workspaceCode;

    /**
     * 任务名称
     */
    private String cstJobName;

    /**
     * 数据日期
     */
    private String txDate;

    /**
     * 任务运行开始-开始时间: yyyy-MM-dd HH:mm
     */
    private String jobStartAfterTime;

    /**
     * 任务运行开始-结束时间: yyyy-MM-dd HH:mm
     */
    private String jobStartBeforeTime;

    /**
     * 任务运行结束-开始时间: yyyy-MM-dd HH:mm
     */
    private String jobEndAfterTime;

    /**
     * 任务运行结束-结束时间: yyyy-MM-dd HH:mm
     */
    private String jobEndBeforeTime;

    /**
     * 任务类型
     */
    private String jobType;

    /**
     * 运行频率
     */
    private String cycle;

    /**
     * 运行状态
     */
    private String status;



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
     * get 页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 任务编码
     *
     * @return
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * set 任务编码
     *
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * get 负责人pin
     *
     * @return
     */
    public String getManagerPin() {
        return managerPin;
    }

    /**
     * set 负责人pin
     *
     * @param managerPin
     */
    public void setManagerPin(String managerPin) {
        this.managerPin = managerPin;
    }


    /**
     * get 工作空间编码
     *
     * @return
     */
    public String getWorkspaceCode() {
        return workspaceCode;
    }

    /**
     * set 工作空间编码
     *
     * @param workspaceCode
     */
    public void setWorkspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
    }


    /**
     * get 任务名称
     *
     * @return
     */
    public String getCstJobName() {
        return cstJobName;
    }

    /**
     * set 任务名称
     *
     * @param cstJobName
     */
    public void setCstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
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
     * get 任务运行开始-开始时间: yyyy-MM-dd HH:mm
     *
     * @return
     */
    public String getJobStartAfterTime() {
        return jobStartAfterTime;
    }

    /**
     * set 任务运行开始-开始时间: yyyy-MM-dd HH:mm
     *
     * @param jobStartAfterTime
     */
    public void setJobStartAfterTime(String jobStartAfterTime) {
        this.jobStartAfterTime = jobStartAfterTime;
    }


    /**
     * get 任务运行开始-结束时间: yyyy-MM-dd HH:mm
     *
     * @return
     */
    public String getJobStartBeforeTime() {
        return jobStartBeforeTime;
    }

    /**
     * set 任务运行开始-结束时间: yyyy-MM-dd HH:mm
     *
     * @param jobStartBeforeTime
     */
    public void setJobStartBeforeTime(String jobStartBeforeTime) {
        this.jobStartBeforeTime = jobStartBeforeTime;
    }


    /**
     * get 任务运行结束-开始时间: yyyy-MM-dd HH:mm
     *
     * @return
     */
    public String getJobEndAfterTime() {
        return jobEndAfterTime;
    }

    /**
     * set 任务运行结束-开始时间: yyyy-MM-dd HH:mm
     *
     * @param jobEndAfterTime
     */
    public void setJobEndAfterTime(String jobEndAfterTime) {
        this.jobEndAfterTime = jobEndAfterTime;
    }


    /**
     * get 任务运行结束-结束时间: yyyy-MM-dd HH:mm
     *
     * @return
     */
    public String getJobEndBeforeTime() {
        return jobEndBeforeTime;
    }

    /**
     * set 任务运行结束-结束时间: yyyy-MM-dd HH:mm
     *
     * @param jobEndBeforeTime
     */
    public void setJobEndBeforeTime(String jobEndBeforeTime) {
        this.jobEndBeforeTime = jobEndBeforeTime;
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
     * get 运行频率
     *
     * @return
     */
    public String getCycle() {
        return cycle;
    }

    /**
     * set 运行频率
     *
     * @param cycle
     */
    public void setCycle(String cycle) {
        this.cycle = cycle;
    }


    /**
     * get 运行状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 运行状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }



    /**
     * set 页码
     *
     * @param pageNum
     */
    public ListTxDateStatusParam pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
     * set 页大小
     *
     * @param pageSize
     */
    public ListTxDateStatusParam pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 任务编码
     *
     * @param companyCode
     */
    public ListTxDateStatusParam companyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }


    /**
     * set 负责人pin
     *
     * @param managerPin
     */
    public ListTxDateStatusParam managerPin(String managerPin) {
        this.managerPin = managerPin;
        return this;
    }


    /**
     * set 工作空间编码
     *
     * @param workspaceCode
     */
    public ListTxDateStatusParam workspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
        return this;
    }


    /**
     * set 任务名称
     *
     * @param cstJobName
     */
    public ListTxDateStatusParam cstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
        return this;
    }


    /**
     * set 数据日期
     *
     * @param txDate
     */
    public ListTxDateStatusParam txDate(String txDate) {
        this.txDate = txDate;
        return this;
    }


    /**
     * set 任务运行开始-开始时间: yyyy-MM-dd HH:mm
     *
     * @param jobStartAfterTime
     */
    public ListTxDateStatusParam jobStartAfterTime(String jobStartAfterTime) {
        this.jobStartAfterTime = jobStartAfterTime;
        return this;
    }


    /**
     * set 任务运行开始-结束时间: yyyy-MM-dd HH:mm
     *
     * @param jobStartBeforeTime
     */
    public ListTxDateStatusParam jobStartBeforeTime(String jobStartBeforeTime) {
        this.jobStartBeforeTime = jobStartBeforeTime;
        return this;
    }


    /**
     * set 任务运行结束-开始时间: yyyy-MM-dd HH:mm
     *
     * @param jobEndAfterTime
     */
    public ListTxDateStatusParam jobEndAfterTime(String jobEndAfterTime) {
        this.jobEndAfterTime = jobEndAfterTime;
        return this;
    }


    /**
     * set 任务运行结束-结束时间: yyyy-MM-dd HH:mm
     *
     * @param jobEndBeforeTime
     */
    public ListTxDateStatusParam jobEndBeforeTime(String jobEndBeforeTime) {
        this.jobEndBeforeTime = jobEndBeforeTime;
        return this;
    }


    /**
     * set 任务类型
     *
     * @param jobType
     */
    public ListTxDateStatusParam jobType(String jobType) {
        this.jobType = jobType;
        return this;
    }


    /**
     * set 运行频率
     *
     * @param cycle
     */
    public ListTxDateStatusParam cycle(String cycle) {
        this.cycle = cycle;
        return this;
    }


    /**
     * set 运行状态
     *
     * @param status
     */
    public ListTxDateStatusParam status(String status) {
        this.status = status;
        return this;
    }


}