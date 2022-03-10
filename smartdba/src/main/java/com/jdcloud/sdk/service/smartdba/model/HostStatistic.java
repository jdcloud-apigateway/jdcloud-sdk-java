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

package com.jdcloud.sdk.service.smartdba.model;


/**
 * hostStatistic
 */
public class HostStatistic  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 会话源端IP
     */
    private String host;

    /**
     * 活跃会话总数
     */
    private Integer activeCount;

    /**
     * 会话id列表
     */
    private String threadIdList;

    /**
     * 会话总数
     */
    private Integer totalCount;


    /**
     * get 会话源端IP
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set 会话源端IP
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * get 活跃会话总数
     *
     * @return
     */
    public Integer getActiveCount() {
        return activeCount;
    }

    /**
     * set 活跃会话总数
     *
     * @param activeCount
     */
    public void setActiveCount(Integer activeCount) {
        this.activeCount = activeCount;
    }

    /**
     * get 会话id列表
     *
     * @return
     */
    public String getThreadIdList() {
        return threadIdList;
    }

    /**
     * set 会话id列表
     *
     * @param threadIdList
     */
    public void setThreadIdList(String threadIdList) {
        this.threadIdList = threadIdList;
    }

    /**
     * get 会话总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 会话总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set 会话源端IP
     *
     * @param host
     */
    public HostStatistic host(String host) {
        this.host = host;
        return this;
    }

    /**
     * set 活跃会话总数
     *
     * @param activeCount
     */
    public HostStatistic activeCount(Integer activeCount) {
        this.activeCount = activeCount;
        return this;
    }

    /**
     * set 会话id列表
     *
     * @param threadIdList
     */
    public HostStatistic threadIdList(String threadIdList) {
        this.threadIdList = threadIdList;
        return this;
    }

    /**
     * set 会话总数
     *
     * @param totalCount
     */
    public HostStatistic totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


}