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
 * 域名模板管理接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询模板实例详情
 */
public class QueryDomainTempInstResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板实例名称
     */
    private String instName;

    /**
     * 创建时间utc格式
     */
    private String createTime;

    /**
     * 创建时间utc格式
     */
    private String updateTime;

    /**
     * 查询结果,类型为Map&lt;String,Map&lt;String,Object&gt;&gt;
     */
    private Object instProInfoMap;



    /**
     * get 模板实例名称
     *
     * @return
     */
    public String getInstName() {
        return instName;
    }

    /**
     * set 模板实例名称
     *
     * @param instName
     */
    public void setInstName(String instName) {
        this.instName = instName;
    }


    /**
     * get 创建时间utc格式
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间utc格式
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 创建时间utc格式
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 创建时间utc格式
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 查询结果,类型为Map&lt;String,Map&lt;String,Object&gt;&gt;
     *
     * @return
     */
    public Object getInstProInfoMap() {
        return instProInfoMap;
    }

    /**
     * set 查询结果,类型为Map&lt;String,Map&lt;String,Object&gt;&gt;
     *
     * @param instProInfoMap
     */
    public void setInstProInfoMap(Object instProInfoMap) {
        this.instProInfoMap = instProInfoMap;
    }



    /**
     * set 模板实例名称
     *
     * @param instName
     */
    public QueryDomainTempInstResult instName(String instName) {
        this.instName = instName;
        return this;
    }


    /**
     * set 创建时间utc格式
     *
     * @param createTime
     */
    public QueryDomainTempInstResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 创建时间utc格式
     *
     * @param updateTime
     */
    public QueryDomainTempInstResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 查询结果,类型为Map&lt;String,Map&lt;String,Object&gt;&gt;
     *
     * @param instProInfoMap
     */
    public QueryDomainTempInstResult instProInfoMap(Object instProInfoMap) {
        this.instProInfoMap = instProInfoMap;
        return this;
    }


}