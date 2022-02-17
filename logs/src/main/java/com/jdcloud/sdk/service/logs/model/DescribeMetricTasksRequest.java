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
 * Metric APIs
 * 日志服务日志监控任务相关的管理控制接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询监控任务列表，返回该主题下的所有监控任务信息。
 */
public class DescribeMetricTasksRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前所在页，默认为1
in: query
     */
    private Long pageNumber;

    /**
     * 页面大小，默认为20；取值范围[1, 100]
in: query
     */
    private Long pageSize;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 日志集 UID
     * Required:true
     */
    @Required
    private String logsetUID;

    /**
     * 日志主题 UID
     * Required:true
     */
    @Required
    private String logtopicUID;


    /**
     * get 当前所在页，默认为1
in: query
     *
     * @return
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前所在页，默认为1
in: query
     *
     * @param pageNumber
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 页面大小，默认为20；取值范围[1, 100]
in: query
     *
     * @return
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
in: query
     *
     * @param pageSize
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 日志集 UID
     *
     * @return
     */
    public String getLogsetUID() {
        return logsetUID;
    }

    /**
     * set 日志集 UID
     *
     * @param logsetUID
     */
    public void setLogsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
    }

    /**
     * get 日志主题 UID
     *
     * @return
     */
    public String getLogtopicUID() {
        return logtopicUID;
    }

    /**
     * set 日志主题 UID
     *
     * @param logtopicUID
     */
    public void setLogtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
    }


    /**
     * set 当前所在页，默认为1
in: query
     *
     * @param pageNumber
     */
    public DescribeMetricTasksRequest pageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 页面大小，默认为20；取值范围[1, 100]
in: query
     *
     * @param pageSize
     */
    public DescribeMetricTasksRequest pageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DescribeMetricTasksRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 日志集 UID
     *
     * @param logsetUID
     */
    public DescribeMetricTasksRequest logsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
        return this;
    }

    /**
     * set 日志主题 UID
     *
     * @param logtopicUID
     */
    public DescribeMetricTasksRequest logtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
        return this;
    }


}