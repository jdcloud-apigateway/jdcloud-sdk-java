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
 * Firewall-rules
 * Define Firewall rules using filter expressions for more control over how traffic is matched to the rule.
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询Bot开启状态
 */
public class DescribeBotStatusResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * zone id
     */
    private String zoneId;

    /**
     * 套餐实例id
     */
    private String instanceId;

    /**
     * 订阅类型
     */
    private String subscriptionType;

    /**
     * 订阅id
     */
    private String subscriptionId;

    /**
     * 开关状态
     */
    private String switchStatus;



    /**
     * get zone id
     *
     * @return
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * set zone id
     *
     * @param zoneId
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }


    /**
     * get 套餐实例id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 套餐实例id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 订阅类型
     *
     * @return
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * set 订阅类型
     *
     * @param subscriptionType
     */
    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }


    /**
     * get 订阅id
     *
     * @return
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * set 订阅id
     *
     * @param subscriptionId
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * get 开关状态
     *
     * @return
     */
    public String getSwitchStatus() {
        return switchStatus;
    }

    /**
     * set 开关状态
     *
     * @param switchStatus
     */
    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }



    /**
     * set zone id
     *
     * @param zoneId
     */
    public DescribeBotStatusResult zoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }


    /**
     * set 套餐实例id
     *
     * @param instanceId
     */
    public DescribeBotStatusResult instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 订阅类型
     *
     * @param subscriptionType
     */
    public DescribeBotStatusResult subscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }


    /**
     * set 订阅id
     *
     * @param subscriptionId
     */
    public DescribeBotStatusResult subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }


    /**
     * set 开关状态
     *
     * @param switchStatus
     */
    public DescribeBotStatusResult switchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }


}