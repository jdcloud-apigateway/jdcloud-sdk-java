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
 * Monitor API
 * 云托管服务的监控API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 按照时间段查询单个机柜AB路电流-原始数据
 */
public class DescribeRangetimeCabinetOriCurrentRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机柜资源ID
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 查询时间范围的开始时间， UNIX时间戳，（最多支持最近90天数据查询）
     * Required:true
     */
    @Required
    private Integer startTime;

    /**
     * 查询时间范围的结束时间， UNIX时间戳，（最多支持最近90天数据查询）
     * Required:true
     */
    @Required
    private Integer endTime;

    /**
     * IDC机房ID
     * Required:true
     */
    @Required
    private String idc;



    /**
     * get 机柜资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 机柜资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * get 查询时间范围的开始时间， UNIX时间戳，（最多支持最近90天数据查询）
     *
     * @return
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * set 查询时间范围的开始时间， UNIX时间戳，（最多支持最近90天数据查询）
     *
     * @param startTime
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }


    /**
     * get 查询时间范围的结束时间， UNIX时间戳，（最多支持最近90天数据查询）
     *
     * @return
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * set 查询时间范围的结束时间， UNIX时间戳，（最多支持最近90天数据查询）
     *
     * @param endTime
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }


    /**
     * get IDC机房ID
     *
     * @return
     */
    public String getIdc() {
        return idc;
    }

    /**
     * set IDC机房ID
     *
     * @param idc
     */
    public void setIdc(String idc) {
        this.idc = idc;
    }



    /**
     * set 机柜资源ID
     *
     * @param resourceId
     */
    public DescribeRangetimeCabinetOriCurrentRequest resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }


    /**
     * set 查询时间范围的开始时间， UNIX时间戳，（最多支持最近90天数据查询）
     *
     * @param startTime
     */
    public DescribeRangetimeCabinetOriCurrentRequest startTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 查询时间范围的结束时间， UNIX时间戳，（最多支持最近90天数据查询）
     *
     * @param endTime
     */
    public DescribeRangetimeCabinetOriCurrentRequest endTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set IDC机房ID
     *
     * @param idc
     */
    public DescribeRangetimeCabinetOriCurrentRequest idc(String idc) {
        this.idc = idc;
        return this;
    }


}