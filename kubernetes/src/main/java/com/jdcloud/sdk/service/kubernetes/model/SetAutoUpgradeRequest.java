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
 * Cluster
 * 集群相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kubernetes.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.kubernetes.model.MaintenanceWindowSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置自动升级
 */
public class SetAutoUpgradeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开启或者关闭集群自动升级，开启时必须指定 maintenancePolicy
     * Required:true
     */
    @Required
    private Boolean autoUpgrade;

    /**
     * 开启集群自动升级, 必须配置集群维护策略
     */
    private MaintenanceWindowSpec maintenanceWindow;

    /**
     * 地域 ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 集群 ID
     * Required:true
     */
    @Required
    private String clusterId;


    /**
     * get 开启或者关闭集群自动升级，开启时必须指定 maintenancePolicy
     *
     * @return
     */
    public Boolean getAutoUpgrade() {
        return autoUpgrade;
    }

    /**
     * set 开启或者关闭集群自动升级，开启时必须指定 maintenancePolicy
     *
     * @param autoUpgrade
     */
    public void setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
    }

    /**
     * get 开启集群自动升级, 必须配置集群维护策略
     *
     * @return
     */
    public MaintenanceWindowSpec getMaintenanceWindow() {
        return maintenanceWindow;
    }

    /**
     * set 开启集群自动升级, 必须配置集群维护策略
     *
     * @param maintenanceWindow
     */
    public void setMaintenanceWindow(MaintenanceWindowSpec maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    /**
     * get 地域 ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 集群 ID
     *
     * @return
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * set 集群 ID
     *
     * @param clusterId
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }


    /**
     * set 开启或者关闭集群自动升级，开启时必须指定 maintenancePolicy
     *
     * @param autoUpgrade
     */
    public SetAutoUpgradeRequest autoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }

    /**
     * set 开启集群自动升级, 必须配置集群维护策略
     *
     * @param maintenanceWindow
     */
    public SetAutoUpgradeRequest maintenanceWindow(MaintenanceWindowSpec maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    /**
     * set 地域 ID
     *
     * @param regionId
     */
    public SetAutoUpgradeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 集群 ID
     *
     * @param clusterId
     */
    public SetAutoUpgradeRequest clusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }


}