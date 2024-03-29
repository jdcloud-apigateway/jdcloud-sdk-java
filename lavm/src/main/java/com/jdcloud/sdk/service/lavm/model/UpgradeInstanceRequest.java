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
 * instance
 * 轻量应用云主机实例的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lavm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 升级轻量应用云主机。

 */
public class UpgradeInstanceRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 轻量应用云主机方案ID

     * Required:true
     */
    @Required
    private String planId;

    /**
     * 轻量应用云主机的实例ID

     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * regionId

     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 轻量应用云主机方案ID

     *
     * @return
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * set 轻量应用云主机方案ID

     *
     * @param planId
     */
    public void setPlanId(String planId) {
        this.planId = planId;
    }


    /**
     * get 轻量应用云主机的实例ID

     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 轻量应用云主机的实例ID

     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get regionId

     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId

     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 轻量应用云主机方案ID

     *
     * @param planId
     */
    public UpgradeInstanceRequest planId(String planId) {
        this.planId = planId;
        return this;
    }


    /**
     * set 轻量应用云主机的实例ID

     *
     * @param instanceId
     */
    public UpgradeInstanceRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set regionId

     *
     * @param regionId
     */
    public UpgradeInstanceRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}