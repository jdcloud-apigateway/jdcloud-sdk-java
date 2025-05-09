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
 * history replicator task
 * 同步历史数据API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 停止bucket名称获取该bucket下的同步任务
 */
public class AbortHistoricalReplicatTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Bucket名称
     * Required:true
     */
    @Required
    private String bucketName;

    /**
     * 任务ID
     * Required:true
     */
    @Required
    private String taskId;



    /**
     * get 区域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get Bucket名称
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set Bucket名称
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }


    /**
     * get 任务ID
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 任务ID
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }



    /**
     * set 区域ID
     *
     * @param regionId
     */
    public AbortHistoricalReplicatTaskRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Bucket名称
     *
     * @param bucketName
     */
    public AbortHistoricalReplicatTaskRequest bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }


    /**
     * set 任务ID
     *
     * @param taskId
     */
    public AbortHistoricalReplicatTaskRequest taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


}