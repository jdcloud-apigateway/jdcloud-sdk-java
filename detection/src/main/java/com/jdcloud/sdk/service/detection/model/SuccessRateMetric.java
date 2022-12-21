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

package com.jdcloud.sdk.service.detection.model;


/**
 * successRateMetric
 */
public class SuccessRateMetric  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功率(可用率%)
     */
    private Double successRate;

    /**
     * 失败数
     */
    private Long failedCount;

    /**
     * 拨测数
     */
    private Long count;

    /**
     * 时间戳
     */
    private Long timestamp;



    /**
     * get 成功率(可用率%)
     *
     * @return
     */
    public Double getSuccessRate() {
        return successRate;
    }

    /**
     * set 成功率(可用率%)
     *
     * @param successRate
     */
    public void setSuccessRate(Double successRate) {
        this.successRate = successRate;
    }


    /**
     * get 失败数
     *
     * @return
     */
    public Long getFailedCount() {
        return failedCount;
    }

    /**
     * set 失败数
     *
     * @param failedCount
     */
    public void setFailedCount(Long failedCount) {
        this.failedCount = failedCount;
    }


    /**
     * get 拨测数
     *
     * @return
     */
    public Long getCount() {
        return count;
    }

    /**
     * set 拨测数
     *
     * @param count
     */
    public void setCount(Long count) {
        this.count = count;
    }


    /**
     * get 时间戳
     *
     * @return
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * set 时间戳
     *
     * @param timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }



    /**
     * set 成功率(可用率%)
     *
     * @param successRate
     */
    public SuccessRateMetric successRate(Double successRate) {
        this.successRate = successRate;
        return this;
    }


    /**
     * set 失败数
     *
     * @param failedCount
     */
    public SuccessRateMetric failedCount(Long failedCount) {
        this.failedCount = failedCount;
        return this;
    }


    /**
     * set 拨测数
     *
     * @param count
     */
    public SuccessRateMetric count(Long count) {
        this.count = count;
        return this;
    }


    /**
     * set 时间戳
     *
     * @param timestamp
     */
    public SuccessRateMetric timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }


}