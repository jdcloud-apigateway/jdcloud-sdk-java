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
 * jobRerunFailedReason
 */
public class JobRerunFailedReason  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业ID, 形如: ws_123456789012345678_21_1743676930734_123
     */
    private String jobId;

    /**
     * 重跑失败原因
     */
    private String reason;



    /**
     * get 作业ID, 形如: ws_123456789012345678_21_1743676930734_123
     *
     * @return
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * set 作业ID, 形如: ws_123456789012345678_21_1743676930734_123
     *
     * @param jobId
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }


    /**
     * get 重跑失败原因
     *
     * @return
     */
    public String getReason() {
        return reason;
    }

    /**
     * set 重跑失败原因
     *
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }



    /**
     * set 作业ID, 形如: ws_123456789012345678_21_1743676930734_123
     *
     * @param jobId
     */
    public JobRerunFailedReason jobId(String jobId) {
        this.jobId = jobId;
        return this;
    }


    /**
     * set 重跑失败原因
     *
     * @param reason
     */
    public JobRerunFailedReason reason(String reason) {
        this.reason = reason;
        return this;
    }


}