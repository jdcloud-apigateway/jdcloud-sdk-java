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
 * rdts
 * rdts api
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rdts.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 如果迁移超时、迁移失败，可重新迁移
 */
public class RestartMigrationJobRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 迁移任务所在区域的Region ID。华北-北京(cn-north-1)，华东-上海(cn-east-2)，华南-广州(cn-south-1)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 迁移任务的唯一标识
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 迁移任务所在区域的Region ID。华北-北京(cn-north-1)，华东-上海(cn-east-2)，华南-广州(cn-south-1)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 迁移任务所在区域的Region ID。华北-北京(cn-north-1)，华东-上海(cn-east-2)，华南-广州(cn-south-1)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 迁移任务的唯一标识
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 迁移任务的唯一标识
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 迁移任务所在区域的Region ID。华北-北京(cn-north-1)，华东-上海(cn-east-2)，华南-广州(cn-south-1)
     *
     * @param regionId
     */
    public RestartMigrationJobRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 迁移任务的唯一标识
     *
     * @param instanceId
     */
    public RestartMigrationJobRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}