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
 * CoreWebConsoleAPI
 * 控制台开放API
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据模型ID查看物模型完整信息
 */
public class DiscribeThingModelRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物模型ID编号
     * Required:true
     */
    @Required
    private String thingModelId;

    /**
     * 版本号。如果为空，则返回最新版本
     */
    private String thingModelVersion;

    /**
     * 区域id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例Id
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 物模型ID编号
     *
     * @return
     */
    public String getThingModelId() {
        return thingModelId;
    }

    /**
     * set 物模型ID编号
     *
     * @param thingModelId
     */
    public void setThingModelId(String thingModelId) {
        this.thingModelId = thingModelId;
    }

    /**
     * get 版本号。如果为空，则返回最新版本
     *
     * @return
     */
    public String getThingModelVersion() {
        return thingModelVersion;
    }

    /**
     * set 版本号。如果为空，则返回最新版本
     *
     * @param thingModelVersion
     */
    public void setThingModelVersion(String thingModelVersion) {
        this.thingModelVersion = thingModelVersion;
    }

    /**
     * get 区域id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 物模型ID编号
     *
     * @param thingModelId
     */
    public DiscribeThingModelRequest thingModelId(String thingModelId) {
        this.thingModelId = thingModelId;
        return this;
    }

    /**
     * set 版本号。如果为空，则返回最新版本
     *
     * @param thingModelVersion
     */
    public DiscribeThingModelRequest thingModelVersion(String thingModelVersion) {
        this.thingModelVersion = thingModelVersion;
        return this;
    }

    /**
     * set 区域id
     *
     * @param regionId
     */
    public DiscribeThingModelRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例Id
     *
     * @param instanceId
     */
    public DiscribeThingModelRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}