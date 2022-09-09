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
 * Instance-Management
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改TiDB实例备份策略。
 */
public class ModifyBackupPolicyRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自动备份开始时间窗口,例如：00:00-01:00，表示0点到1点开始进行数据库自动备份，备份完成时间则跟实例大小有关，不一定在这个时间范围中该参数只能是以下取值:00:00-01:0001:00-02:00......23:00-24:00
     */
    private String startWindow;

    /**
     * 自动备份的周期，多个取值用英文逗号分隔，支持以下参数，不区分大小写:- Monday：周一 - Tuesday：周二 - Wednesday：周三 - Thursday：周四 - Friday：周五- Saturday：周六- Sunday：周日 例如定义周一和周三备份，则输入为Monday,Wednesday
     */
    private String backupPeriod;

    /**
     * 是否开启自动增量备份。 开启后会在没有全量备份的日期自动进行一次增量备份
     */
    private Boolean autoIncBackup;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 自动备份开始时间窗口,例如：00:00-01:00，表示0点到1点开始进行数据库自动备份，备份完成时间则跟实例大小有关，不一定在这个时间范围中该参数只能是以下取值:00:00-01:0001:00-02:00......23:00-24:00
     *
     * @return
     */
    public String getStartWindow() {
        return startWindow;
    }

    /**
     * set 自动备份开始时间窗口,例如：00:00-01:00，表示0点到1点开始进行数据库自动备份，备份完成时间则跟实例大小有关，不一定在这个时间范围中该参数只能是以下取值:00:00-01:0001:00-02:00......23:00-24:00
     *
     * @param startWindow
     */
    public void setStartWindow(String startWindow) {
        this.startWindow = startWindow;
    }


    /**
     * get 自动备份的周期，多个取值用英文逗号分隔，支持以下参数，不区分大小写:- Monday：周一 - Tuesday：周二 - Wednesday：周三 - Thursday：周四 - Friday：周五- Saturday：周六- Sunday：周日 例如定义周一和周三备份，则输入为Monday,Wednesday
     *
     * @return
     */
    public String getBackupPeriod() {
        return backupPeriod;
    }

    /**
     * set 自动备份的周期，多个取值用英文逗号分隔，支持以下参数，不区分大小写:- Monday：周一 - Tuesday：周二 - Wednesday：周三 - Thursday：周四 - Friday：周五- Saturday：周六- Sunday：周日 例如定义周一和周三备份，则输入为Monday,Wednesday
     *
     * @param backupPeriod
     */
    public void setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
    }


    /**
     * get 是否开启自动增量备份。 开启后会在没有全量备份的日期自动进行一次增量备份
     *
     * @return
     */
    public Boolean getAutoIncBackup() {
        return autoIncBackup;
    }

    /**
     * set 是否开启自动增量备份。 开启后会在没有全量备份的日期自动进行一次增量备份
     *
     * @param autoIncBackup
     */
    public void setAutoIncBackup(Boolean autoIncBackup) {
        this.autoIncBackup = autoIncBackup;
    }


    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 自动备份开始时间窗口,例如：00:00-01:00，表示0点到1点开始进行数据库自动备份，备份完成时间则跟实例大小有关，不一定在这个时间范围中该参数只能是以下取值:00:00-01:0001:00-02:00......23:00-24:00
     *
     * @param startWindow
     */
    public ModifyBackupPolicyRequest startWindow(String startWindow) {
        this.startWindow = startWindow;
        return this;
    }


    /**
     * set 自动备份的周期，多个取值用英文逗号分隔，支持以下参数，不区分大小写:- Monday：周一 - Tuesday：周二 - Wednesday：周三 - Thursday：周四 - Friday：周五- Saturday：周六- Sunday：周日 例如定义周一和周三备份，则输入为Monday,Wednesday
     *
     * @param backupPeriod
     */
    public ModifyBackupPolicyRequest backupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }


    /**
     * set 是否开启自动增量备份。 开启后会在没有全量备份的日期自动进行一次增量备份
     *
     * @param autoIncBackup
     */
    public ModifyBackupPolicyRequest autoIncBackup(Boolean autoIncBackup) {
        this.autoIncBackup = autoIncBackup;
        return this;
    }


    /**
     * set 地域代码
     *
     * @param regionId
     */
    public ModifyBackupPolicyRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public ModifyBackupPolicyRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}