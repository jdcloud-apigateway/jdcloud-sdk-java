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
 * StorageMetricController
 * 存储指标接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询表DDL
 */
public class ManageHubStorageTableDDLRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 租户code
     * Required:true
     */
    @Required
    private String companyCode;

    /**
     * 数据库名称
     * Required:true
     */
    @Required
    private String database;

    /**
     * 表名称
     * Required:true
     */
    @Required
    private String table;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;



    /**
     * get 租户code
     *
     * @return
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * set 租户code
     *
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * get 数据库名称
     *
     * @return
     */
    public String getDatabase() {
        return database;
    }

    /**
     * set 数据库名称
     *
     * @param database
     */
    public void setDatabase(String database) {
        this.database = database;
    }


    /**
     * get 表名称
     *
     * @return
     */
    public String getTable() {
        return table;
    }

    /**
     * set 表名称
     *
     * @param table
     */
    public void setTable(String table) {
        this.table = table;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }



    /**
     * set 租户code
     *
     * @param companyCode
     */
    public ManageHubStorageTableDDLRequest companyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }


    /**
     * set 数据库名称
     *
     * @param database
     */
    public ManageHubStorageTableDDLRequest database(String database) {
        this.database = database;
        return this;
    }


    /**
     * set 表名称
     *
     * @param table
     */
    public ManageHubStorageTableDDLRequest table(String table) {
        this.table = table;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public ManageHubStorageTableDDLRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public ManageHubStorageTableDDLRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}