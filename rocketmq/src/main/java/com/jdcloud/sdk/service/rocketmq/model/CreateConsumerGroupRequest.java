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
 * ConsumerGroup
 * consumerGroup相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rocketmq.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建consumerGroup
 */
public class CreateConsumerGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * consumerGroup名称
     * Required:true
     */
    @Required
    private String consumerGroup;

    /**
     * 描述，长度不大于128
     */
    private String description;

    /**
     * 消费重试次数（默认16）
     */
    private Integer retryMaxTimes;

    /**
     * 是否开启死信（默认开启）
     */
    private Boolean enableDlq;

    /**
     * 区域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例id
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get consumerGroup名称
     *
     * @return
     */
    public String getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * set consumerGroup名称
     *
     * @param consumerGroup
     */
    public void setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
    }


    /**
     * get 描述，长度不大于128
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述，长度不大于128
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 消费重试次数（默认16）
     *
     * @return
     */
    public Integer getRetryMaxTimes() {
        return retryMaxTimes;
    }

    /**
     * set 消费重试次数（默认16）
     *
     * @param retryMaxTimes
     */
    public void setRetryMaxTimes(Integer retryMaxTimes) {
        this.retryMaxTimes = retryMaxTimes;
    }


    /**
     * get 是否开启死信（默认开启）
     *
     * @return
     */
    public Boolean getEnableDlq() {
        return enableDlq;
    }

    /**
     * set 是否开启死信（默认开启）
     *
     * @param enableDlq
     */
    public void setEnableDlq(Boolean enableDlq) {
        this.enableDlq = enableDlq;
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
     * get 实例id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set consumerGroup名称
     *
     * @param consumerGroup
     */
    public CreateConsumerGroupRequest consumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }


    /**
     * set 描述，长度不大于128
     *
     * @param description
     */
    public CreateConsumerGroupRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 消费重试次数（默认16）
     *
     * @param retryMaxTimes
     */
    public CreateConsumerGroupRequest retryMaxTimes(Integer retryMaxTimes) {
        this.retryMaxTimes = retryMaxTimes;
        return this;
    }


    /**
     * set 是否开启死信（默认开启）
     *
     * @param enableDlq
     */
    public CreateConsumerGroupRequest enableDlq(Boolean enableDlq) {
        this.enableDlq = enableDlq;
        return this;
    }


    /**
     * set 区域ID
     *
     * @param regionId
     */
    public CreateConsumerGroupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 实例id
     *
     * @param instanceId
     */
    public CreateConsumerGroupRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}