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
 * Task related APIs
 * 云拔测-任务相关接口
 *
 * OpenAPI spec version: v3
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.detection.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询任务列表
 */
public class QueryTasksRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务Id
     */
    private Long taskId;

    /**
     * 任务名称 模糊匹配
     */
    private String taskName;

    /**
     * 任务地址 模糊匹配
     */
    private String taskUrl;

    /**
     * 任务类型 1、协议 2、网络
     */
    private Integer taskType;

    /**
     * 协议类型 1、TCP 2、UDP 3、SMTP 4、HTTP_HTTPS 5、FTP
     */
    private Integer protocolType;

    /**
     * 任务类别 1、定时拨测 2、即时拨测 默认定时拨测
     */
    private Integer taskClassify;

    /**
     * 任务组ID
     */
    private Long taskGroupId;

    /**
     * 当前页码 需大于等于1
     * Required:true
     */
    @Required
    private Integer pageIndex;

    /**
     * 每页大小 取值范围1到100
     * Required:true
     */
    @Required
    private Integer pageSize;

    /**
     * 任务状态 0开启 1禁用
     */
    private Integer status;



    /**
     * get 任务Id
     *
     * @return
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * set 任务Id
     *
     * @param taskId
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }


    /**
     * get 任务名称 模糊匹配
     *
     * @return
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * set 任务名称 模糊匹配
     *
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


    /**
     * get 任务地址 模糊匹配
     *
     * @return
     */
    public String getTaskUrl() {
        return taskUrl;
    }

    /**
     * set 任务地址 模糊匹配
     *
     * @param taskUrl
     */
    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
    }


    /**
     * get 任务类型 1、协议 2、网络
     *
     * @return
     */
    public Integer getTaskType() {
        return taskType;
    }

    /**
     * set 任务类型 1、协议 2、网络
     *
     * @param taskType
     */
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }


    /**
     * get 协议类型 1、TCP 2、UDP 3、SMTP 4、HTTP_HTTPS 5、FTP
     *
     * @return
     */
    public Integer getProtocolType() {
        return protocolType;
    }

    /**
     * set 协议类型 1、TCP 2、UDP 3、SMTP 4、HTTP_HTTPS 5、FTP
     *
     * @param protocolType
     */
    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }


    /**
     * get 任务类别 1、定时拨测 2、即时拨测 默认定时拨测
     *
     * @return
     */
    public Integer getTaskClassify() {
        return taskClassify;
    }

    /**
     * set 任务类别 1、定时拨测 2、即时拨测 默认定时拨测
     *
     * @param taskClassify
     */
    public void setTaskClassify(Integer taskClassify) {
        this.taskClassify = taskClassify;
    }


    /**
     * get 任务组ID
     *
     * @return
     */
    public Long getTaskGroupId() {
        return taskGroupId;
    }

    /**
     * set 任务组ID
     *
     * @param taskGroupId
     */
    public void setTaskGroupId(Long taskGroupId) {
        this.taskGroupId = taskGroupId;
    }


    /**
     * get 当前页码 需大于等于1
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 当前页码 需大于等于1
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * get 每页大小 取值范围1到100
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页大小 取值范围1到100
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 任务状态 0开启 1禁用
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 任务状态 0开启 1禁用
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }



    /**
     * set 任务Id
     *
     * @param taskId
     */
    public QueryTasksRequest taskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }


    /**
     * set 任务名称 模糊匹配
     *
     * @param taskName
     */
    public QueryTasksRequest taskName(String taskName) {
        this.taskName = taskName;
        return this;
    }


    /**
     * set 任务地址 模糊匹配
     *
     * @param taskUrl
     */
    public QueryTasksRequest taskUrl(String taskUrl) {
        this.taskUrl = taskUrl;
        return this;
    }


    /**
     * set 任务类型 1、协议 2、网络
     *
     * @param taskType
     */
    public QueryTasksRequest taskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }


    /**
     * set 协议类型 1、TCP 2、UDP 3、SMTP 4、HTTP_HTTPS 5、FTP
     *
     * @param protocolType
     */
    public QueryTasksRequest protocolType(Integer protocolType) {
        this.protocolType = protocolType;
        return this;
    }


    /**
     * set 任务类别 1、定时拨测 2、即时拨测 默认定时拨测
     *
     * @param taskClassify
     */
    public QueryTasksRequest taskClassify(Integer taskClassify) {
        this.taskClassify = taskClassify;
        return this;
    }


    /**
     * set 任务组ID
     *
     * @param taskGroupId
     */
    public QueryTasksRequest taskGroupId(Long taskGroupId) {
        this.taskGroupId = taskGroupId;
        return this;
    }


    /**
     * set 当前页码 需大于等于1
     *
     * @param pageIndex
     */
    public QueryTasksRequest pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }


    /**
     * set 每页大小 取值范围1到100
     *
     * @param pageSize
     */
    public QueryTasksRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 任务状态 0开启 1禁用
     *
     * @param status
     */
    public QueryTasksRequest status(Integer status) {
        this.status = status;
        return this;
    }


}