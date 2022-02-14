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
 * 查询指定监控任务的详情信息
 */
public class DescribeMetricTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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
     * logmetrictaskUID
     * Required:true
     */
    @Required
    private String logmetrictaskUID;


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
     * get logmetrictaskUID
     *
     * @return
     */
    public String getLogmetrictaskUID() {
        return logmetrictaskUID;
    }

    /**
     * set logmetrictaskUID
     *
     * @param logmetrictaskUID
     */
    public void setLogmetrictaskUID(String logmetrictaskUID) {
        this.logmetrictaskUID = logmetrictaskUID;
    }


    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public DescribeMetricTaskRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 日志集 UID
     *
     * @param logsetUID
     */
    public DescribeMetricTaskRequest logsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
        return this;
    }

    /**
     * set 日志主题 UID
     *
     * @param logtopicUID
     */
    public DescribeMetricTaskRequest logtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
        return this;
    }

    /**
     * set logmetrictaskUID
     *
     * @param logmetrictaskUID
     */
    public DescribeMetricTaskRequest logmetrictaskUID(String logmetrictaskUID) {
        this.logmetrictaskUID = logmetrictaskUID;
        return this;
    }


}