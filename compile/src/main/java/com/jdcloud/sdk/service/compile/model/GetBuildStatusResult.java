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
 * job api
 * API COMPILE CODE TO PACKAGE
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.compile.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询构建任务执行的状态
 */
public class GetBuildStatusResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 执行任务的job名称
     */
    private String name;

    /**
     * 开始执行构建的时间
     */
    private Integer createdAt;

    /**
     * 执行构建的状态
     */
    private String status;

    /**
     * 执行构建完成的百分比
     */
    private Float completionRate;


    /**
     * get 执行任务的job名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 执行任务的job名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 开始执行构建的时间
     *
     * @return
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    /**
     * set 开始执行构建的时间
     *
     * @param createdAt
     */
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * get 执行构建的状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 执行构建的状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 执行构建完成的百分比
     *
     * @return
     */
    public Float getCompletionRate() {
        return completionRate;
    }

    /**
     * set 执行构建完成的百分比
     *
     * @param completionRate
     */
    public void setCompletionRate(Float completionRate) {
        this.completionRate = completionRate;
    }


    /**
     * set 执行任务的job名称
     *
     * @param name
     */
    public GetBuildStatusResult name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 开始执行构建的时间
     *
     * @param createdAt
     */
    public GetBuildStatusResult createdAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * set 执行构建的状态
     *
     * @param status
     */
    public GetBuildStatusResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 执行构建完成的百分比
     *
     * @param completionRate
     */
    public GetBuildStatusResult completionRate(Float completionRate) {
        this.completionRate = completionRate;
        return this;
    }


}