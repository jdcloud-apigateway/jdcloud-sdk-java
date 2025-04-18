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
 * 重置作业实例状态请求体
 */
public class GpsmResetJobInstReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业名称
     */
    private String jobName;

    /**
     * 数据日期
     */
    private String txDate;

    /**
     * 作业重置的状态
     */
    private String jobStatus;

    /**
     * 作业重置的状态，向后兼容字段和jobStatus一个含义，新接口用jobStatus
     */
    private String status;



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
     * get 作业重置的状态
     *
     * @return
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * set 作业重置的状态
     *
     * @param jobStatus
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }


    /**
     * get 作业重置的状态，向后兼容字段和jobStatus一个含义，新接口用jobStatus
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 作业重置的状态，向后兼容字段和jobStatus一个含义，新接口用jobStatus
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }



    /**
     * set 作业名称
     *
     * @param jobName
     */
    public GpsmResetJobInstReq jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 数据日期
     *
     * @param txDate
     */
    public GpsmResetJobInstReq txDate(String txDate) {
        this.txDate = txDate;
        return this;
    }


    /**
     * set 作业重置的状态
     *
     * @param jobStatus
     */
    public GpsmResetJobInstReq jobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }


    /**
     * set 作业重置的状态，向后兼容字段和jobStatus一个含义，新接口用jobStatus
     *
     * @param status
     */
    public GpsmResetJobInstReq status(String status) {
        this.status = status;
        return this;
    }


}