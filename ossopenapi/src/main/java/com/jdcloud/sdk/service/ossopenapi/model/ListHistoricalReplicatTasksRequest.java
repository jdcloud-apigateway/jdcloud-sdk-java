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
 * 根据bucket名称获取该bucket下的同步任务列表
 */
public class ListHistoricalReplicatTasksRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 同步任务列表开始的key
     */
    private String marker;

    /**
     * 每次查询返回的结果数，默认为1000
     */
    private Integer limit;

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
     * get 同步任务列表开始的key
     *
     * @return
     */
    public String getMarker() {
        return marker;
    }

    /**
     * set 同步任务列表开始的key
     *
     * @param marker
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }


    /**
     * get 每次查询返回的结果数，默认为1000
     *
     * @return
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * set 每次查询返回的结果数，默认为1000
     *
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }


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
     * set 同步任务列表开始的key
     *
     * @param marker
     */
    public ListHistoricalReplicatTasksRequest marker(String marker) {
        this.marker = marker;
        return this;
    }


    /**
     * set 每次查询返回的结果数，默认为1000
     *
     * @param limit
     */
    public ListHistoricalReplicatTasksRequest limit(Integer limit) {
        this.limit = limit;
        return this;
    }


    /**
     * set 区域ID
     *
     * @param regionId
     */
    public ListHistoricalReplicatTasksRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Bucket名称
     *
     * @param bucketName
     */
    public ListHistoricalReplicatTasksRequest bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }


}