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
 * Sql
 * Sql操作
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 生成数据，支持Mysql，Stardb
 */
public class ConsoleGeneralDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据源id
     */
    private Integer dataSourceId;

    /**
     * 数据库名称
     */
    private String dbName;

    /**
     * 表名。
     */
    private String tableName;

    /**
     * 生成数据行数。
     */
    private Integer count;

    /**
     * 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 数据源id
     *
     * @return
     */
    public Integer getDataSourceId() {
        return dataSourceId;
    }

    /**
     * set 数据源id
     *
     * @param dataSourceId
     */
    public void setDataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
    }


    /**
     * get 数据库名称
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }


    /**
     * get 表名。
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 表名。
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    /**
     * get 生成数据行数。
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 生成数据行数。
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
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
     * set 数据源id
     *
     * @param dataSourceId
     */
    public ConsoleGeneralDataRequest dataSourceId(Integer dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }


    /**
     * set 数据库名称
     *
     * @param dbName
     */
    public ConsoleGeneralDataRequest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }


    /**
     * set 表名。
     *
     * @param tableName
     */
    public ConsoleGeneralDataRequest tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


    /**
     * set 生成数据行数。
     *
     * @param count
     */
    public ConsoleGeneralDataRequest count(Integer count) {
        this.count = count;
        return this;
    }


    /**
     * set 地域代码，取值范围参见[《各地域及可用区对照表》](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public ConsoleGeneralDataRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}