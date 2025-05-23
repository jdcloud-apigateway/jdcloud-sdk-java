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
 * 作业消耗时间排行榜
 */
public class GpmnJobSpendTimeRankingVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 排名
     */
    private Integer order;

    /**
     * 作业名
     */
    private String jobName;

    /**
     * 作业类型描述
     */
    private String jobType;

    /**
     * 负责人
     */
    private String manager;

    /**
     * 平均运行时长，形如hh:mm:ss
     */
    private String spendTimeAvg;

    /**
     * 运行最大时长，形如 hh:mm:ss
     */
    private String spendTimeLongest;

    /**
     * 客户作业名
     */
    private String cstJobName;



    /**
     * get 排名
     *
     * @return
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * set 排名
     *
     * @param order
     */
    public void setOrder(Integer order) {
        this.order = order;
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
     * get 作业类型描述
     *
     * @return
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * set 作业类型描述
     *
     * @param jobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
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
     * get 平均运行时长，形如hh:mm:ss
     *
     * @return
     */
    public String getSpendTimeAvg() {
        return spendTimeAvg;
    }

    /**
     * set 平均运行时长，形如hh:mm:ss
     *
     * @param spendTimeAvg
     */
    public void setSpendTimeAvg(String spendTimeAvg) {
        this.spendTimeAvg = spendTimeAvg;
    }


    /**
     * get 运行最大时长，形如 hh:mm:ss
     *
     * @return
     */
    public String getSpendTimeLongest() {
        return spendTimeLongest;
    }

    /**
     * set 运行最大时长，形如 hh:mm:ss
     *
     * @param spendTimeLongest
     */
    public void setSpendTimeLongest(String spendTimeLongest) {
        this.spendTimeLongest = spendTimeLongest;
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
     * set 排名
     *
     * @param order
     */
    public GpmnJobSpendTimeRankingVo order(Integer order) {
        this.order = order;
        return this;
    }


    /**
     * set 作业名
     *
     * @param jobName
     */
    public GpmnJobSpendTimeRankingVo jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 作业类型描述
     *
     * @param jobType
     */
    public GpmnJobSpendTimeRankingVo jobType(String jobType) {
        this.jobType = jobType;
        return this;
    }


    /**
     * set 负责人
     *
     * @param manager
     */
    public GpmnJobSpendTimeRankingVo manager(String manager) {
        this.manager = manager;
        return this;
    }


    /**
     * set 平均运行时长，形如hh:mm:ss
     *
     * @param spendTimeAvg
     */
    public GpmnJobSpendTimeRankingVo spendTimeAvg(String spendTimeAvg) {
        this.spendTimeAvg = spendTimeAvg;
        return this;
    }


    /**
     * set 运行最大时长，形如 hh:mm:ss
     *
     * @param spendTimeLongest
     */
    public GpmnJobSpendTimeRankingVo spendTimeLongest(String spendTimeLongest) {
        this.spendTimeLongest = spendTimeLongest;
        return this;
    }


    /**
     * set 客户作业名
     *
     * @param cstJobName
     */
    public GpmnJobSpendTimeRankingVo cstJobName(String cstJobName) {
        this.cstJobName = cstJobName;
        return this;
    }


}