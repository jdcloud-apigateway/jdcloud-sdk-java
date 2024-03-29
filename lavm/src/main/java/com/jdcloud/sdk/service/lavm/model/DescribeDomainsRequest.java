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
 * instance
 * 轻量应用云主机实例的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lavm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询域名接口

 */
public class DescribeDomainsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名名称。支持模糊搜索，最多20个，例如: &#x60;[\&quot;name-1\&quot;, \&quot;name-2\&quot;]&#x60;, json array 字串。

     */
    private String domainNames;

    /**
     * 页码；默认为1。
     */
    private Integer pageNumber;

    /**
     * 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     */
    private Integer pageSize;

    /**
     * regionId

     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 域名名称。支持模糊搜索，最多20个，例如: &#x60;[\&quot;name-1\&quot;, \&quot;name-2\&quot;]&#x60;, json array 字串。

     *
     * @return
     */
    public String getDomainNames() {
        return domainNames;
    }

    /**
     * set 域名名称。支持模糊搜索，最多20个，例如: &#x60;[\&quot;name-1\&quot;, \&quot;name-2\&quot;]&#x60;, json array 字串。

     *
     * @param domainNames
     */
    public void setDomainNames(String domainNames) {
        this.domainNames = domainNames;
    }


    /**
     * get 页码；默认为1。
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get regionId

     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId

     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 域名名称。支持模糊搜索，最多20个，例如: &#x60;[\&quot;name-1\&quot;, \&quot;name-2\&quot;]&#x60;, json array 字串。

     *
     * @param domainNames
     */
    public DescribeDomainsRequest domainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }


    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public DescribeDomainsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public DescribeDomainsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set regionId

     *
     * @param regionId
     */
    public DescribeDomainsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}