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

package com.jdcloud.sdk.service.clickhouse.model;


/**
 * slowLog
 */
public class SlowLog  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 源IP
     */
    private String ip;

    /**
     * 初始请求ID
     */
    private String requestId;

    /**
     * 节点名称
     */
    private String segmentName;

    /**
     * SQL开始时间
     */
    private String startTime;

    /**
     * 慢日志SQL执行时间
     */
    private String queryTime;

    /**
     * SQL语句
     */
    private String sql;

    /**
     * 读取慢日志SQL的行数
     */
    private Integer lineNumber;

    /**
     * 读取慢日志SQL的数据量
     */
    private String dataSize;

    /**
     * 返回结果数据量大小
     */
    private String executingResult;

    /**
     * 返回结果内存使用量
     */
    private String memoryUsage;


    /**
     * get 源IP
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 源IP
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 初始请求ID
     *
     * @return
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * set 初始请求ID
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * get 节点名称
     *
     * @return
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * set 节点名称
     *
     * @param segmentName
     */
    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * get SQL开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set SQL开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 慢日志SQL执行时间
     *
     * @return
     */
    public String getQueryTime() {
        return queryTime;
    }

    /**
     * set 慢日志SQL执行时间
     *
     * @param queryTime
     */
    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    /**
     * get SQL语句
     *
     * @return
     */
    public String getSql() {
        return sql;
    }

    /**
     * set SQL语句
     *
     * @param sql
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * get 读取慢日志SQL的行数
     *
     * @return
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * set 读取慢日志SQL的行数
     *
     * @param lineNumber
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * get 读取慢日志SQL的数据量
     *
     * @return
     */
    public String getDataSize() {
        return dataSize;
    }

    /**
     * set 读取慢日志SQL的数据量
     *
     * @param dataSize
     */
    public void setDataSize(String dataSize) {
        this.dataSize = dataSize;
    }

    /**
     * get 返回结果数据量大小
     *
     * @return
     */
    public String getExecutingResult() {
        return executingResult;
    }

    /**
     * set 返回结果数据量大小
     *
     * @param executingResult
     */
    public void setExecutingResult(String executingResult) {
        this.executingResult = executingResult;
    }

    /**
     * get 返回结果内存使用量
     *
     * @return
     */
    public String getMemoryUsage() {
        return memoryUsage;
    }

    /**
     * set 返回结果内存使用量
     *
     * @param memoryUsage
     */
    public void setMemoryUsage(String memoryUsage) {
        this.memoryUsage = memoryUsage;
    }


    /**
     * set 源IP
     *
     * @param ip
     */
    public SlowLog ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 初始请求ID
     *
     * @param requestId
     */
    public SlowLog requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * set 节点名称
     *
     * @param segmentName
     */
    public SlowLog segmentName(String segmentName) {
        this.segmentName = segmentName;
        return this;
    }

    /**
     * set SQL开始时间
     *
     * @param startTime
     */
    public SlowLog startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 慢日志SQL执行时间
     *
     * @param queryTime
     */
    public SlowLog queryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }

    /**
     * set SQL语句
     *
     * @param sql
     */
    public SlowLog sql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * set 读取慢日志SQL的行数
     *
     * @param lineNumber
     */
    public SlowLog lineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * set 读取慢日志SQL的数据量
     *
     * @param dataSize
     */
    public SlowLog dataSize(String dataSize) {
        this.dataSize = dataSize;
        return this;
    }

    /**
     * set 返回结果数据量大小
     *
     * @param executingResult
     */
    public SlowLog executingResult(String executingResult) {
        this.executingResult = executingResult;
        return this;
    }

    /**
     * set 返回结果内存使用量
     *
     * @param memoryUsage
     */
    public SlowLog memoryUsage(String memoryUsage) {
        this.memoryUsage = memoryUsage;
        return this;
    }


}