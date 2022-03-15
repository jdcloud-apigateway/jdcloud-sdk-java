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
 * Lock-Analyse
 * 死锁诊断和查询相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.smartdba.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取当前实例的所有诊断记录
 */
public class DescribeAnalyseListRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码
     */
    private Integer pageIndex;

    /**
     * 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     */
    private Integer pageSize;

    /**
     * 查询开始时间，格式为：2006-01-02T15:04:05Z
     * Required:true
     */
    @Required
    private String startTime;

    /**
     * 查询截止时间，格式为：2006-01-02T15:04:05Z
     * Required:true
     */
    @Required
    private String endTime;

    /**
     * 是否只过滤死锁存在的记录
     */
    private Boolean state;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceGid;


    /**
     * get 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 是否只过滤死锁存在的记录
     *
     * @return
     */
    public Boolean getState() {
        return state;
    }

    /**
     * set 是否只过滤死锁存在的记录
     *
     * @param state
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceGid() {
        return instanceGid;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceGid
     */
    public void setInstanceGid(String instanceGid) {
        this.instanceGid = instanceGid;
    }


    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码
     *
     * @param pageIndex
     */
    public DescribeAnalyseListRequest pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     *
     * @param pageSize
     */
    public DescribeAnalyseListRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @param startTime
     */
    public DescribeAnalyseListRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @param endTime
     */
    public DescribeAnalyseListRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 是否只过滤死锁存在的记录
     *
     * @param state
     */
    public DescribeAnalyseListRequest state(Boolean state) {
        this.state = state;
        return this;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public DescribeAnalyseListRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceGid
     */
    public DescribeAnalyseListRequest instanceGid(String instanceGid) {
        this.instanceGid = instanceGid;
        return this;
    }


}