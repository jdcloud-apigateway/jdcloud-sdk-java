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
 * 返回结果对象
 */
public class GpdpJobDetailResultDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据日期
     */
    private String txDate;

    /**
     * 计划执行时间
     */
    private String planExecTime;

    /**
     * 负责人
     */
    private String manager;

    /**
     * 作业名称
     */
    private String jobName;

    /**
     * 最后一次运行结束时间
     */
    private String lastEndTime;

    /**
     * 最后一次运行开始时间
     */
    private String lastStartTime;

    /**
     * 作业运行耗时/秒
     */
    private Integer costTime;

    /**
     * 表名
     */
    private Integer targetTable;



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
     * get 计划执行时间
     *
     * @return
     */
    public String getPlanExecTime() {
        return planExecTime;
    }

    /**
     * set 计划执行时间
     *
     * @param planExecTime
     */
    public void setPlanExecTime(String planExecTime) {
        this.planExecTime = planExecTime;
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
     * get 最后一次运行结束时间
     *
     * @return
     */
    public String getLastEndTime() {
        return lastEndTime;
    }

    /**
     * set 最后一次运行结束时间
     *
     * @param lastEndTime
     */
    public void setLastEndTime(String lastEndTime) {
        this.lastEndTime = lastEndTime;
    }


    /**
     * get 最后一次运行开始时间
     *
     * @return
     */
    public String getLastStartTime() {
        return lastStartTime;
    }

    /**
     * set 最后一次运行开始时间
     *
     * @param lastStartTime
     */
    public void setLastStartTime(String lastStartTime) {
        this.lastStartTime = lastStartTime;
    }


    /**
     * get 作业运行耗时/秒
     *
     * @return
     */
    public Integer getCostTime() {
        return costTime;
    }

    /**
     * set 作业运行耗时/秒
     *
     * @param costTime
     */
    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }


    /**
     * get 表名
     *
     * @return
     */
    public Integer getTargetTable() {
        return targetTable;
    }

    /**
     * set 表名
     *
     * @param targetTable
     */
    public void setTargetTable(Integer targetTable) {
        this.targetTable = targetTable;
    }



    /**
     * set 数据日期
     *
     * @param txDate
     */
    public GpdpJobDetailResultDTO txDate(String txDate) {
        this.txDate = txDate;
        return this;
    }


    /**
     * set 计划执行时间
     *
     * @param planExecTime
     */
    public GpdpJobDetailResultDTO planExecTime(String planExecTime) {
        this.planExecTime = planExecTime;
        return this;
    }


    /**
     * set 负责人
     *
     * @param manager
     */
    public GpdpJobDetailResultDTO manager(String manager) {
        this.manager = manager;
        return this;
    }


    /**
     * set 作业名称
     *
     * @param jobName
     */
    public GpdpJobDetailResultDTO jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 最后一次运行结束时间
     *
     * @param lastEndTime
     */
    public GpdpJobDetailResultDTO lastEndTime(String lastEndTime) {
        this.lastEndTime = lastEndTime;
        return this;
    }


    /**
     * set 最后一次运行开始时间
     *
     * @param lastStartTime
     */
    public GpdpJobDetailResultDTO lastStartTime(String lastStartTime) {
        this.lastStartTime = lastStartTime;
        return this;
    }


    /**
     * set 作业运行耗时/秒
     *
     * @param costTime
     */
    public GpdpJobDetailResultDTO costTime(Integer costTime) {
        this.costTime = costTime;
        return this;
    }


    /**
     * set 表名
     *
     * @param targetTable
     */
    public GpdpJobDetailResultDTO targetTable(Integer targetTable) {
        this.targetTable = targetTable;
        return this;
    }


}