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
 * 作业日志分页查询
 */
public class GpsmJobLogInfoPageQryReq  implements java.io.Serializable {

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
     * job 运行session id
     */
    private String jobSessionId;

    /**
     * job运行日期
     */
    private String txDate;



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
     * get job 运行session id
     *
     * @return
     */
    public String getJobSessionId() {
        return jobSessionId;
    }

    /**
     * set job 运行session id
     *
     * @param jobSessionId
     */
    public void setJobSessionId(String jobSessionId) {
        this.jobSessionId = jobSessionId;
    }


    /**
     * get job运行日期
     *
     * @return
     */
    public String getTxDate() {
        return txDate;
    }

    /**
     * set job运行日期
     *
     * @param txDate
     */
    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }



    /**
     * set 页面大小
     *
     * @param pageSize
     */
    public GpsmJobLogInfoPageQryReq pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 页码
     *
     * @param pageNum
     */
    public GpsmJobLogInfoPageQryReq pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }


    /**
     * set 作业名称
     *
     * @param jobName
     */
    public GpsmJobLogInfoPageQryReq jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set job 运行session id
     *
     * @param jobSessionId
     */
    public GpsmJobLogInfoPageQryReq jobSessionId(String jobSessionId) {
        this.jobSessionId = jobSessionId;
        return this;
    }


    /**
     * set job运行日期
     *
     * @param txDate
     */
    public GpsmJobLogInfoPageQryReq txDate(String txDate) {
        this.txDate = txDate;
        return this;
    }


}