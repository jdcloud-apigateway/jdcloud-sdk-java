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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.yunding.model;


/**
 * cluster
 */
public class Cluster  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 实例名称
     */
    private String name;

    /**
     * 数据中心
     */
    private String dataCenter;

    /**
     * 域名
     */
    private String domain;

    /**
     * 端口号
     */
    private String connectionPort;

    /**
     * 数据库引擎
     */
    private String dbEngine;

    /**
     * 数据库版本
     */
    private String dbVersion;



    /**
     * get id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 实例名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 数据中心
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 数据中心
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }


    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 端口号
     *
     * @return
     */
    public String getConnectionPort() {
        return connectionPort;
    }

    /**
     * set 端口号
     *
     * @param connectionPort
     */
    public void setConnectionPort(String connectionPort) {
        this.connectionPort = connectionPort;
    }


    /**
     * get 数据库引擎
     *
     * @return
     */
    public String getDbEngine() {
        return dbEngine;
    }

    /**
     * set 数据库引擎
     *
     * @param dbEngine
     */
    public void setDbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
    }


    /**
     * get 数据库版本
     *
     * @return
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * set 数据库版本
     *
     * @param dbVersion
     */
    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }



    /**
     * set id
     *
     * @param id
     */
    public Cluster id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 实例名称
     *
     * @param name
     */
    public Cluster name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 数据中心
     *
     * @param dataCenter
     */
    public Cluster dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public Cluster domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 端口号
     *
     * @param connectionPort
     */
    public Cluster connectionPort(String connectionPort) {
        this.connectionPort = connectionPort;
        return this;
    }


    /**
     * set 数据库引擎
     *
     * @param dbEngine
     */
    public Cluster dbEngine(String dbEngine) {
        this.dbEngine = dbEngine;
        return this;
    }


    /**
     * set 数据库版本
     *
     * @param dbVersion
     */
    public Cluster dbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }


}