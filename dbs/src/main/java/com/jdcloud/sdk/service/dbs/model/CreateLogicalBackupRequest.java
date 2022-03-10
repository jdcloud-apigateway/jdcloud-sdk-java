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
 * 数据库备份服务
 * 数据库备份服务接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 手动触发逻辑备份
 */
public class CreateLogicalBackupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》]
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 备份计划ID
     * Required:true
     */
    @Required
    private String backupPlanId;


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 备份计划ID
     *
     * @return
     */
    public String getBackupPlanId() {
        return backupPlanId;
    }

    /**
     * set 备份计划ID
     *
     * @param backupPlanId
     */
    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》]
     *
     * @param regionId
     */
    public CreateLogicalBackupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 备份计划ID
     *
     * @param backupPlanId
     */
    public CreateLogicalBackupRequest backupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }


}