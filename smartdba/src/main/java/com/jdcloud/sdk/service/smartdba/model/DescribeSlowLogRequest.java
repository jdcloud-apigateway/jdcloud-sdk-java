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
 * Slow-Log
 * 慢日志相关接口
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
 * 获取当前实例指定时间的慢SQL明细
 */
public class DescribeSlowLogRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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
     * 过滤条件：数据库名
     */
    private String dbName;

    /**
     * 过滤条件：client 用户名
     */
    private String userName;

    /**
     * 过滤条件：client IP
     */
    private String clientIP;

    /**
     * 模糊查询关键字，只支持单个单词
     */
    private String keyword4Search;

    /**
     * 排序的字段，支持 execTime,lockTime,rowsExamined,rowsSent,startTime 默认是 startTime
     */
    private String field;

    /**
     * 排序方式，默认desc
     */
    private String sort;

    /**
     * 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码；
     */
    private Integer pageIndex;

    /**
     * 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     */
    private Integer pageSize;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceGid;


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
     * get 过滤条件：数据库名
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 过滤条件：数据库名
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 过滤条件：client 用户名
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set 过滤条件：client 用户名
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get 过滤条件：client IP
     *
     * @return
     */
    public String getClientIP() {
        return clientIP;
    }

    /**
     * set 过滤条件：client IP
     *
     * @param clientIP
     */
    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    /**
     * get 模糊查询关键字，只支持单个单词
     *
     * @return
     */
    public String getKeyword4Search() {
        return keyword4Search;
    }

    /**
     * set 模糊查询关键字，只支持单个单词
     *
     * @param keyword4Search
     */
    public void setKeyword4Search(String keyword4Search) {
        this.keyword4Search = keyword4Search;
    }

    /**
     * get 排序的字段，支持 execTime,lockTime,rowsExamined,rowsSent,startTime 默认是 startTime
     *
     * @return
     */
    public String getField() {
        return field;
    }

    /**
     * set 排序的字段，支持 execTime,lockTime,rowsExamined,rowsSent,startTime 默认是 startTime
     *
     * @param field
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * get 排序方式，默认desc
     *
     * @return
     */
    public String getSort() {
        return sort;
    }

    /**
     * set 排序方式，默认desc
     *
     * @param sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * get 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码；
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码；
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
     * get 实例ID
     *
     * @return
     */
    public String getInstanceGid() {
        return instanceGid;
    }

    /**
     * set 实例ID
     *
     * @param instanceGid
     */
    public void setInstanceGid(String instanceGid) {
        this.instanceGid = instanceGid;
    }


    /**
     * set 查询开始时间，格式为：2006-01-02T15:04:05Z
     *
     * @param startTime
     */
    public DescribeSlowLogRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间，格式为：2006-01-02T15:04:05Z
     *
     * @param endTime
     */
    public DescribeSlowLogRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 过滤条件：数据库名
     *
     * @param dbName
     */
    public DescribeSlowLogRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 过滤条件：client 用户名
     *
     * @param userName
     */
    public DescribeSlowLogRequest userName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * set 过滤条件：client IP
     *
     * @param clientIP
     */
    public DescribeSlowLogRequest clientIP(String clientIP) {
        this.clientIP = clientIP;
        return this;
    }

    /**
     * set 模糊查询关键字，只支持单个单词
     *
     * @param keyword4Search
     */
    public DescribeSlowLogRequest keyword4Search(String keyword4Search) {
        this.keyword4Search = keyword4Search;
        return this;
    }

    /**
     * set 排序的字段，支持 execTime,lockTime,rowsExamined,rowsSent,startTime 默认是 startTime
     *
     * @param field
     */
    public DescribeSlowLogRequest field(String field) {
        this.field = field;
        return this;
    }

    /**
     * set 排序方式，默认desc
     *
     * @param sort
     */
    public DescribeSlowLogRequest sort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * set 显示数据的页码，默认为1，取值范围：[-1,∞)。pageIndex 为-1时，返回所有数据页码；
     *
     * @param pageIndex
     */
    public DescribeSlowLogRequest pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 每页显示的数据条数，默认为10，取值范围：[1,100]，用于查询列表的接口
     *
     * @param pageSize
     */
    public DescribeSlowLogRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public DescribeSlowLogRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例ID
     *
     * @param instanceGid
     */
    public DescribeSlowLogRequest instanceGid(String instanceGid) {
        this.instanceGid = instanceGid;
        return this;
    }


}