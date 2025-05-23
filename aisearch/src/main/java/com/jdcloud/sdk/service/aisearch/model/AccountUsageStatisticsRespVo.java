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

package com.jdcloud.sdk.service.aisearch.model;


/**
 * accountUsageStatisticsRespVo
 */
public class AccountUsageStatisticsRespVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总调用量
     */
    private Long totalCallCount;

    /**
     * 今日调用量
     */
    private Long todayCallCount;

    /**
     * 昨日调用量
     */
    private Long yesterdayCallCount;

    /**
     * 本月调用量
     */
    private Long thisMonthCallCount;



    /**
     * get 总调用量
     *
     * @return
     */
    public Long getTotalCallCount() {
        return totalCallCount;
    }

    /**
     * set 总调用量
     *
     * @param totalCallCount
     */
    public void setTotalCallCount(Long totalCallCount) {
        this.totalCallCount = totalCallCount;
    }


    /**
     * get 今日调用量
     *
     * @return
     */
    public Long getTodayCallCount() {
        return todayCallCount;
    }

    /**
     * set 今日调用量
     *
     * @param todayCallCount
     */
    public void setTodayCallCount(Long todayCallCount) {
        this.todayCallCount = todayCallCount;
    }


    /**
     * get 昨日调用量
     *
     * @return
     */
    public Long getYesterdayCallCount() {
        return yesterdayCallCount;
    }

    /**
     * set 昨日调用量
     *
     * @param yesterdayCallCount
     */
    public void setYesterdayCallCount(Long yesterdayCallCount) {
        this.yesterdayCallCount = yesterdayCallCount;
    }


    /**
     * get 本月调用量
     *
     * @return
     */
    public Long getThisMonthCallCount() {
        return thisMonthCallCount;
    }

    /**
     * set 本月调用量
     *
     * @param thisMonthCallCount
     */
    public void setThisMonthCallCount(Long thisMonthCallCount) {
        this.thisMonthCallCount = thisMonthCallCount;
    }



    /**
     * set 总调用量
     *
     * @param totalCallCount
     */
    public AccountUsageStatisticsRespVo totalCallCount(Long totalCallCount) {
        this.totalCallCount = totalCallCount;
        return this;
    }


    /**
     * set 今日调用量
     *
     * @param todayCallCount
     */
    public AccountUsageStatisticsRespVo todayCallCount(Long todayCallCount) {
        this.todayCallCount = todayCallCount;
        return this;
    }


    /**
     * set 昨日调用量
     *
     * @param yesterdayCallCount
     */
    public AccountUsageStatisticsRespVo yesterdayCallCount(Long yesterdayCallCount) {
        this.yesterdayCallCount = yesterdayCallCount;
        return this;
    }


    /**
     * set 本月调用量
     *
     * @param thisMonthCallCount
     */
    public AccountUsageStatisticsRespVo thisMonthCallCount(Long thisMonthCallCount) {
        this.thisMonthCallCount = thisMonthCallCount;
        return this;
    }


}