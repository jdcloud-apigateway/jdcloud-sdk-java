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
 * 杀作业实例请求实例
 */
public class GpsmKillJobInstReq  implements java.io.Serializable {

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
     * set 作业名称
     *
     * @param jobName
     */
    public GpsmKillJobInstReq jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 数据日期
     *
     * @param txDate
     */
    public GpsmKillJobInstReq txDate(String txDate) {
        this.txDate = txDate;
        return this;
    }


}