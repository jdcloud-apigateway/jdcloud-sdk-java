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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.redis.model.RedisKey;
import com.jdcloud.sdk.service.redis.model.RedisCmd;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询缓存分析任务详情，最多查询到30天前的数据
 */
public class DescribeCacheAnalysisResultResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务开始时间, rfc3339格式
     */
    private String startTime;

    /**
     * 任务结束时间, rfc3339格式
     */
    private String finishTime;

    /**
     * 任务类型，0:手动分析，1自动分析
     */
    private Integer analysisType;

    /**
     * stringBigKeys
     */
    
    private List<RedisKey> stringBigKeys;
    /**
     * otherBigKeys
     */
    
    private List<RedisKey> otherBigKeys;
    /**
     * hotKeys
     */
    
    private List<RedisKey> hotKeys;
    /**
     * cmdCallTimesTop
     */
    
    private List<RedisCmd> cmdCallTimesTop;
    /**
     * cmdUseCpuTop
     */
    
    private List<RedisCmd> cmdUseCpuTop;
    /**
     * key的类型分布
     */
    private Object keyTypeDistribution;

    /**
     * key的大小分布
     */
    private Object keySizeDistribution;



    /**
     * get 任务开始时间, rfc3339格式
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 任务开始时间, rfc3339格式
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 任务结束时间, rfc3339格式
     *
     * @return
     */
    public String getFinishTime() {
        return finishTime;
    }

    /**
     * set 任务结束时间, rfc3339格式
     *
     * @param finishTime
     */
    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }


    /**
     * get 任务类型，0:手动分析，1自动分析
     *
     * @return
     */
    public Integer getAnalysisType() {
        return analysisType;
    }

    /**
     * set 任务类型，0:手动分析，1自动分析
     *
     * @param analysisType
     */
    public void setAnalysisType(Integer analysisType) {
        this.analysisType = analysisType;
    }


    /**
    * get stringBigKeys
    *
    * @return
    */
    public List<RedisKey> getStringBigKeys() {
        return stringBigKeys;
    }

    /**
    * set stringBigKeys
    *
    * @param stringBigKeys
    */
    public void setStringBigKeys(List<RedisKey> stringBigKeys) {
        this.stringBigKeys = stringBigKeys;
    }


    /**
    * get otherBigKeys
    *
    * @return
    */
    public List<RedisKey> getOtherBigKeys() {
        return otherBigKeys;
    }

    /**
    * set otherBigKeys
    *
    * @param otherBigKeys
    */
    public void setOtherBigKeys(List<RedisKey> otherBigKeys) {
        this.otherBigKeys = otherBigKeys;
    }


    /**
    * get hotKeys
    *
    * @return
    */
    public List<RedisKey> getHotKeys() {
        return hotKeys;
    }

    /**
    * set hotKeys
    *
    * @param hotKeys
    */
    public void setHotKeys(List<RedisKey> hotKeys) {
        this.hotKeys = hotKeys;
    }


    /**
    * get cmdCallTimesTop
    *
    * @return
    */
    public List<RedisCmd> getCmdCallTimesTop() {
        return cmdCallTimesTop;
    }

    /**
    * set cmdCallTimesTop
    *
    * @param cmdCallTimesTop
    */
    public void setCmdCallTimesTop(List<RedisCmd> cmdCallTimesTop) {
        this.cmdCallTimesTop = cmdCallTimesTop;
    }


    /**
    * get cmdUseCpuTop
    *
    * @return
    */
    public List<RedisCmd> getCmdUseCpuTop() {
        return cmdUseCpuTop;
    }

    /**
    * set cmdUseCpuTop
    *
    * @param cmdUseCpuTop
    */
    public void setCmdUseCpuTop(List<RedisCmd> cmdUseCpuTop) {
        this.cmdUseCpuTop = cmdUseCpuTop;
    }


    /**
     * get key的类型分布
     *
     * @return
     */
    public Object getKeyTypeDistribution() {
        return keyTypeDistribution;
    }

    /**
     * set key的类型分布
     *
     * @param keyTypeDistribution
     */
    public void setKeyTypeDistribution(Object keyTypeDistribution) {
        this.keyTypeDistribution = keyTypeDistribution;
    }


    /**
     * get key的大小分布
     *
     * @return
     */
    public Object getKeySizeDistribution() {
        return keySizeDistribution;
    }

    /**
     * set key的大小分布
     *
     * @param keySizeDistribution
     */
    public void setKeySizeDistribution(Object keySizeDistribution) {
        this.keySizeDistribution = keySizeDistribution;
    }



    /**
     * set 任务开始时间, rfc3339格式
     *
     * @param startTime
     */
    public DescribeCacheAnalysisResultResult startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 任务结束时间, rfc3339格式
     *
     * @param finishTime
     */
    public DescribeCacheAnalysisResultResult finishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }


    /**
     * set 任务类型，0:手动分析，1自动分析
     *
     * @param analysisType
     */
    public DescribeCacheAnalysisResultResult analysisType(Integer analysisType) {
        this.analysisType = analysisType;
        return this;
    }


    /**
    * set stringBigKeys
    *
    * @param stringBigKeys
    */
    public DescribeCacheAnalysisResultResult stringBigKeys(List<RedisKey> stringBigKeys) {
        this.stringBigKeys = stringBigKeys;
        return this;
    }


    /**
    * set otherBigKeys
    *
    * @param otherBigKeys
    */
    public DescribeCacheAnalysisResultResult otherBigKeys(List<RedisKey> otherBigKeys) {
        this.otherBigKeys = otherBigKeys;
        return this;
    }


    /**
    * set hotKeys
    *
    * @param hotKeys
    */
    public DescribeCacheAnalysisResultResult hotKeys(List<RedisKey> hotKeys) {
        this.hotKeys = hotKeys;
        return this;
    }


    /**
    * set cmdCallTimesTop
    *
    * @param cmdCallTimesTop
    */
    public DescribeCacheAnalysisResultResult cmdCallTimesTop(List<RedisCmd> cmdCallTimesTop) {
        this.cmdCallTimesTop = cmdCallTimesTop;
        return this;
    }


    /**
    * set cmdUseCpuTop
    *
    * @param cmdUseCpuTop
    */
    public DescribeCacheAnalysisResultResult cmdUseCpuTop(List<RedisCmd> cmdUseCpuTop) {
        this.cmdUseCpuTop = cmdUseCpuTop;
        return this;
    }


    /**
     * set key的类型分布
     *
     * @param keyTypeDistribution
     */
    public DescribeCacheAnalysisResultResult keyTypeDistribution(Object keyTypeDistribution) {
        this.keyTypeDistribution = keyTypeDistribution;
        return this;
    }


    /**
     * set key的大小分布
     *
     * @param keySizeDistribution
     */
    public DescribeCacheAnalysisResultResult keySizeDistribution(Object keySizeDistribution) {
        this.keySizeDistribution = keySizeDistribution;
        return this;
    }



    /**
     * add item to stringBigKeys
     *
     * @param stringBigKey
     */
    public void addStringBigKey(RedisKey stringBigKey) {
        if (this.stringBigKeys == null) {
            this.stringBigKeys = new ArrayList<>();
        }
        this.stringBigKeys.add(stringBigKey);
    }

    /**
     * add item to otherBigKeys
     *
     * @param otherBigKey
     */
    public void addOtherBigKey(RedisKey otherBigKey) {
        if (this.otherBigKeys == null) {
            this.otherBigKeys = new ArrayList<>();
        }
        this.otherBigKeys.add(otherBigKey);
    }

    /**
     * add item to hotKeys
     *
     * @param hotKey
     */
    public void addHotKey(RedisKey hotKey) {
        if (this.hotKeys == null) {
            this.hotKeys = new ArrayList<>();
        }
        this.hotKeys.add(hotKey);
    }

    /**
     * add item to cmdCallTimesTop
     *
     * @param cmdCallTimesTop
     */
    public void addCmdCallTimesTop(RedisCmd cmdCallTimesTop) {
        if (this.cmdCallTimesTop == null) {
            this.cmdCallTimesTop = new ArrayList<>();
        }
        this.cmdCallTimesTop.add(cmdCallTimesTop);
    }

    /**
     * add item to cmdUseCpuTop
     *
     * @param cmdUseCpuTop
     */
    public void addCmdUseCpuTop(RedisCmd cmdUseCpuTop) {
        if (this.cmdUseCpuTop == null) {
            this.cmdUseCpuTop = new ArrayList<>();
        }
        this.cmdUseCpuTop.add(cmdUseCpuTop);
    }
}