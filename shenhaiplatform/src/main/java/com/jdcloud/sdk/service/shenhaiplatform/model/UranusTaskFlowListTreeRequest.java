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
 * ShenHaiPlatform Admin Manage APIs
 * 流程画布目录树管理
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
 * 工作流目录树
 */
public class UranusTaskFlowListTreeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关键字查询
     */
    private String keyWord;

    /**
     * 目录code
     */
    private String catalogCode;

    /**
     * 工作流code
     */
    private String flowCode;

    /**
     * 查询过滤条件  all 全部、recent 最近使用、join 参数、collection 收藏
     */
    private String searchType;

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
     * get 关键字查询
     *
     * @return
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * set 关键字查询
     *
     * @param keyWord
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }


    /**
     * get 目录code
     *
     * @return
     */
    public String getCatalogCode() {
        return catalogCode;
    }

    /**
     * set 目录code
     *
     * @param catalogCode
     */
    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }


    /**
     * get 工作流code
     *
     * @return
     */
    public String getFlowCode() {
        return flowCode;
    }

    /**
     * set 工作流code
     *
     * @param flowCode
     */
    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode;
    }


    /**
     * get 查询过滤条件  all 全部、recent 最近使用、join 参数、collection 收藏
     *
     * @return
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * set 查询过滤条件  all 全部、recent 最近使用、join 参数、collection 收藏
     *
     * @param searchType
     */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
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
     * set 关键字查询
     *
     * @param keyWord
     */
    public UranusTaskFlowListTreeRequest keyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }


    /**
     * set 目录code
     *
     * @param catalogCode
     */
    public UranusTaskFlowListTreeRequest catalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
        return this;
    }


    /**
     * set 工作流code
     *
     * @param flowCode
     */
    public UranusTaskFlowListTreeRequest flowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }


    /**
     * set 查询过滤条件  all 全部、recent 最近使用、join 参数、collection 收藏
     *
     * @param searchType
     */
    public UranusTaskFlowListTreeRequest searchType(String searchType) {
        this.searchType = searchType;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UranusTaskFlowListTreeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public UranusTaskFlowListTreeRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}