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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置缓存分析阈值
 */
public class ModifyAnalysisThresholdRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * String类型阈值
     */
    private Integer stringSize;

    /**
     * List类型阈值
     */
    private Integer listSize;

    /**
     * Hash类型阈值
     */
    private Integer hashSize;

    /**
     * Set类型阈值
     */
    private Integer setSize;

    /**
     * Zset类型阈值
     */
    private Integer zsetSize;

    /**
     * top值，范围10~1000
     */
    private Integer top;

    /**
     * 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 缓存Redis实例ID，是访问实例的唯一标识
     * Required:true
     */
    @Required
    private String cacheInstanceId;


    /**
     * get String类型阈值
     *
     * @return
     */
    public Integer getStringSize() {
        return stringSize;
    }

    /**
     * set String类型阈值
     *
     * @param stringSize
     */
    public void setStringSize(Integer stringSize) {
        this.stringSize = stringSize;
    }

    /**
     * get List类型阈值
     *
     * @return
     */
    public Integer getListSize() {
        return listSize;
    }

    /**
     * set List类型阈值
     *
     * @param listSize
     */
    public void setListSize(Integer listSize) {
        this.listSize = listSize;
    }

    /**
     * get Hash类型阈值
     *
     * @return
     */
    public Integer getHashSize() {
        return hashSize;
    }

    /**
     * set Hash类型阈值
     *
     * @param hashSize
     */
    public void setHashSize(Integer hashSize) {
        this.hashSize = hashSize;
    }

    /**
     * get Set类型阈值
     *
     * @return
     */
    public Integer getSetSize() {
        return setSize;
    }

    /**
     * set Set类型阈值
     *
     * @param setSize
     */
    public void setSetSize(Integer setSize) {
        this.setSize = setSize;
    }

    /**
     * get Zset类型阈值
     *
     * @return
     */
    public Integer getZsetSize() {
        return zsetSize;
    }

    /**
     * set Zset类型阈值
     *
     * @param zsetSize
     */
    public void setZsetSize(Integer zsetSize) {
        this.zsetSize = zsetSize;
    }

    /**
     * get top值，范围10~1000
     *
     * @return
     */
    public Integer getTop() {
        return top;
    }

    /**
     * set top值，范围10~1000
     *
     * @param top
     */
    public void setTop(Integer top) {
        this.top = top;
    }

    /**
     * get 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @return
     */
    public String getCacheInstanceId() {
        return cacheInstanceId;
    }

    /**
     * set 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @param cacheInstanceId
     */
    public void setCacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
    }


    /**
     * set String类型阈值
     *
     * @param stringSize
     */
    public ModifyAnalysisThresholdRequest stringSize(Integer stringSize) {
        this.stringSize = stringSize;
        return this;
    }

    /**
     * set List类型阈值
     *
     * @param listSize
     */
    public ModifyAnalysisThresholdRequest listSize(Integer listSize) {
        this.listSize = listSize;
        return this;
    }

    /**
     * set Hash类型阈值
     *
     * @param hashSize
     */
    public ModifyAnalysisThresholdRequest hashSize(Integer hashSize) {
        this.hashSize = hashSize;
        return this;
    }

    /**
     * set Set类型阈值
     *
     * @param setSize
     */
    public ModifyAnalysisThresholdRequest setSize(Integer setSize) {
        this.setSize = setSize;
        return this;
    }

    /**
     * set Zset类型阈值
     *
     * @param zsetSize
     */
    public ModifyAnalysisThresholdRequest zsetSize(Integer zsetSize) {
        this.zsetSize = zsetSize;
        return this;
    }

    /**
     * set top值，范围10~1000
     *
     * @param top
     */
    public ModifyAnalysisThresholdRequest top(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * set 缓存Redis实例所在区域的Region ID。目前有华北-北京、华南-广州、华东-上海三个区域，Region ID分别为cn-north-1、cn-south-1、cn-east-2
     *
     * @param regionId
     */
    public ModifyAnalysisThresholdRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 缓存Redis实例ID，是访问实例的唯一标识
     *
     * @param cacheInstanceId
     */
    public ModifyAnalysisThresholdRequest cacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
        return this;
    }


}