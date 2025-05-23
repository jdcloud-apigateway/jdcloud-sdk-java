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
 * Jtlas Search API
 * 数据图谱-元数据查询 API
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
 * 查询表查看脚本
 */
public class JtlasGetTableQueryScriptRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文档ID
     * Required:true
     */
    @Required
    private String id;

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
     * get 文档ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 文档ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * set 文档ID
     *
     * @param id
     */
    public JtlasGetTableQueryScriptRequest id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public JtlasGetTableQueryScriptRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public JtlasGetTableQueryScriptRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}