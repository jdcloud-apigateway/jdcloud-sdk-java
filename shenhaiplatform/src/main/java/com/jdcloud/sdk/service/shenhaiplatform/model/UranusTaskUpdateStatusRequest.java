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
 * ShenHaiPlatform Admin Manage APIs
 * 流程画布目录树管理
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 任务单节点-上下线更新/撤销删除
 */
public class UranusTaskUpdateStatusRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务节点code
     * Required:true
     */
    @Required
    private String taskCode;

    /**
     * 任务节点状态
     * Required:true
     */
    @Required
    private Integer status;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;



    /**
     * get 任务节点code
     *
     * @return
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * set 任务节点code
     *
     * @param taskCode
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }


    /**
     * get 任务节点状态
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 任务节点状态
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }



    /**
     * set 任务节点code
     *
     * @param taskCode
     */
    public UranusTaskUpdateStatusRequest taskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }


    /**
     * set 任务节点状态
     *
     * @param status
     */
    public UranusTaskUpdateStatusRequest status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UranusTaskUpdateStatusRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public UranusTaskUpdateStatusRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}