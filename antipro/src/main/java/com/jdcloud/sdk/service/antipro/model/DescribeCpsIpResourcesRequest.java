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
 * IP Resources APIs
 * Anti DDoS Protection Package IP Resources APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询 DDoS 防护包可防护的云物理服务器公网 IP(包括云物理服务器弹性公网 IP 及云物理服务器基础网络实例的公网 IP)
 */
public class DescribeCpsIpResourcesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     */
    private Integer pageNumber;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 地域编码, 防护包目前支持: 华北-北京, 华东-宿迁, 华东-上海
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域编码, 防护包目前支持: 华北-北京, 华东-宿迁, 华东-上海
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域编码, 防护包目前支持: 华北-北京, 华东-宿迁, 华东-上海
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码
     *
     * @param pageNumber
     */
    public DescribeCpsIpResourcesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小
     *
     * @param pageSize
     */
    public DescribeCpsIpResourcesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域编码, 防护包目前支持: 华北-北京, 华东-宿迁, 华东-上海
     *
     * @param regionId
     */
    public DescribeCpsIpResourcesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}