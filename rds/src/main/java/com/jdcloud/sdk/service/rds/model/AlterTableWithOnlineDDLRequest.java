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
 * Command
 * command相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 通过 PT-OSC 服务来处理 DDL 命令, 避免锁表。此接口暂是对部分用户开放
 */
public class AlterTableWithOnlineDDLRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * DDL命令修改的库名
     * Required:true
     */
    @Required
    private String database;

    /**
     * DDL命令修改的表名
     * Required:true
     */
    @Required
    private String table;

    /**
     * 需要执行的的DDL命令
     * Required:true
     */
    @Required
    private String command;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * RDS 实例ID，唯一标识一个RDS实例
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get DDL命令修改的库名
     *
     * @return
     */
    public String getDatabase() {
        return database;
    }

    /**
     * set DDL命令修改的库名
     *
     * @param database
     */
    public void setDatabase(String database) {
        this.database = database;
    }


    /**
     * get DDL命令修改的表名
     *
     * @return
     */
    public String getTable() {
        return table;
    }

    /**
     * set DDL命令修改的表名
     *
     * @param table
     */
    public void setTable(String table) {
        this.table = table;
    }


    /**
     * get 需要执行的的DDL命令
     *
     * @return
     */
    public String getCommand() {
        return command;
    }

    /**
     * set 需要执行的的DDL命令
     *
     * @param command
     */
    public void setCommand(String command) {
        this.command = command;
    }


    /**
     * get 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get RDS 实例ID，唯一标识一个RDS实例
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set DDL命令修改的库名
     *
     * @param database
     */
    public AlterTableWithOnlineDDLRequest database(String database) {
        this.database = database;
        return this;
    }


    /**
     * set DDL命令修改的表名
     *
     * @param table
     */
    public AlterTableWithOnlineDDLRequest table(String table) {
        this.table = table;
        return this;
    }


    /**
     * set 需要执行的的DDL命令
     *
     * @param command
     */
    public AlterTableWithOnlineDDLRequest command(String command) {
        this.command = command;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public AlterTableWithOnlineDDLRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set RDS 实例ID，唯一标识一个RDS实例
     *
     * @param instanceId
     */
    public AlterTableWithOnlineDDLRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}