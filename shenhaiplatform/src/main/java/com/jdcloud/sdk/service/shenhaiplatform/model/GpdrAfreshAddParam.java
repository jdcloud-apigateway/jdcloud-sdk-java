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
 * gpdrAfreshAddParam
 */
public class GpdrAfreshAddParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业名称
     * Required:true
     */
    @Required
    private String jobName;

    /**
     * 补数开始时间
     * Required:true
     */
    @Required
    private String startDate;

    /**
     * 补数结束时间
     * Required:true
     */
    @Required
    private String endDate;

    /**
     * 并行数
     */
    private Integer parallelNum;

    /**
     * 子作业名称
     */
    
    private List<String> childJobNames;


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
     * get 补数开始时间
     *
     * @return
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * set 补数开始时间
     *
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * get 补数结束时间
     *
     * @return
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * set 补数结束时间
     *
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    /**
     * get 并行数
     *
     * @return
     */
    public Integer getParallelNum() {
        return parallelNum;
    }

    /**
     * set 并行数
     *
     * @param parallelNum
     */
    public void setParallelNum(Integer parallelNum) {
        this.parallelNum = parallelNum;
    }


    /**
    * get 子作业名称
    *
    * @return
    */
    public List<String> getChildJobNames() {
        return childJobNames;
    }

    /**
    * set 子作业名称
    *
    * @param childJobNames
    */
    public void setChildJobNames(List<String> childJobNames) {
        this.childJobNames = childJobNames;
    }



    /**
     * set 作业名称
     *
     * @param jobName
     */
    public GpdrAfreshAddParam jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 补数开始时间
     *
     * @param startDate
     */
    public GpdrAfreshAddParam startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }


    /**
     * set 补数结束时间
     *
     * @param endDate
     */
    public GpdrAfreshAddParam endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }


    /**
     * set 并行数
     *
     * @param parallelNum
     */
    public GpdrAfreshAddParam parallelNum(Integer parallelNum) {
        this.parallelNum = parallelNum;
        return this;
    }


    /**
    * set 子作业名称
    *
    * @param childJobNames
    */
    public GpdrAfreshAddParam childJobNames(List<String> childJobNames) {
        this.childJobNames = childJobNames;
        return this;
    }



    /**
     * add item to 子作业名称
     *
     * @param childJobName
     */
    public void addChildJobName(String childJobName) {
        if (this.childJobNames == null) {
            this.childJobNames = new ArrayList<>();
        }
        this.childJobNames.add(childJobName);
    }
}