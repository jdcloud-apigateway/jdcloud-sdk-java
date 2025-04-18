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

import com.jdcloud.sdk.annotation.Required;

/**
 * gpdpJobDependenceReq
 */
public class GpdpJobDependenceReq  implements java.io.Serializable {

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
     * 作业名称
     */
    private String jobName;

    /**
     * 作业是否有效
     */
    private String jobEnable;



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
     * get 作业是否有效
     *
     * @return
     */
    public String getJobEnable() {
        return jobEnable;
    }

    /**
     * set 作业是否有效
     *
     * @param jobEnable
     */
    public void setJobEnable(String jobEnable) {
        this.jobEnable = jobEnable;
    }



    /**
     * set 页面大小
     *
     * @param pageSize
     */
    public GpdpJobDependenceReq pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 页码
     *
     * @param pageNum
     */
    public GpdpJobDependenceReq pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
     * set 作业名称
     *
     * @param jobName
     */
    public GpdpJobDependenceReq jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 作业是否有效
     *
     * @param jobEnable
     */
    public GpdpJobDependenceReq jobEnable(String jobEnable) {
        this.jobEnable = jobEnable;
        return this;
    }


}