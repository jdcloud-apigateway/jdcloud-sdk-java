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
 * Distributed-Cloud-Physical-Server
 * 分布式云物理服务器弹性公网IP操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询弹性公网IP列表&lt;br/&gt;
支持分页查询，默认每页20条&lt;br/&gt;

 */
public class DescribeElasticIpsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[20, 100]
     */
    private Integer pageSize;

    /**
     * 弹性公网IP状态，取值范围：associate、disassociate
     */
    private String status;

    /**
     * 弹性公网IP是否加入共享带宽，取值范围：yes、no
     */
    private String hasJoinBandwidthPackage;

    /**
     * 支付模式，取值为：prepaid_by_duration表示预付费，postpaid_by_duration表示按配置后付费
     */
    private String chargeMode;

    /**
     * 实例Id
     */
    private String instanceId;

    /**
     * 子网Id
     */
    private String subnetId;

    /**
     * elasticIpId - 弹性公网IPID，精确匹配，支持多个&lt;br/&gt;
elasticIp - 弹性公网IP，精确匹配，支持多个&lt;br/&gt;
bandwidthPackageId - 共享带宽ID，精确匹配，支持多个

     */
    private List<Filter> filters;

    /**
     * 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码；默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小；默认为20；取值范围[20, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 弹性公网IP状态，取值范围：associate、disassociate
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 弹性公网IP状态，取值范围：associate、disassociate
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 弹性公网IP是否加入共享带宽，取值范围：yes、no
     *
     * @return
     */
    public String getHasJoinBandwidthPackage() {
        return hasJoinBandwidthPackage;
    }

    /**
     * set 弹性公网IP是否加入共享带宽，取值范围：yes、no
     *
     * @param hasJoinBandwidthPackage
     */
    public void setHasJoinBandwidthPackage(String hasJoinBandwidthPackage) {
        this.hasJoinBandwidthPackage = hasJoinBandwidthPackage;
    }

    /**
     * get 支付模式，取值为：prepaid_by_duration表示预付费，postpaid_by_duration表示按配置后付费
     *
     * @return
     */
    public String getChargeMode() {
        return chargeMode;
    }

    /**
     * set 支付模式，取值为：prepaid_by_duration表示预付费，postpaid_by_duration表示按配置后付费
     *
     * @param chargeMode
     */
    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    /**
     * get 实例Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 子网Id
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网Id
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get elasticIpId - 弹性公网IPID，精确匹配，支持多个&lt;br/&gt;
elasticIp - 弹性公网IP，精确匹配，支持多个&lt;br/&gt;
bandwidthPackageId - 共享带宽ID，精确匹配，支持多个

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set elasticIpId - 弹性公网IPID，精确匹配，支持多个&lt;br/&gt;
elasticIp - 弹性公网IP，精确匹配，支持多个&lt;br/&gt;
bandwidthPackageId - 共享带宽ID，精确匹配，支持多个

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribeElasticIpsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；默认为20；取值范围[20, 100]
     *
     * @param pageSize
     */
    public DescribeElasticIpsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 弹性公网IP状态，取值范围：associate、disassociate
     *
     * @param status
     */
    public DescribeElasticIpsRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 弹性公网IP是否加入共享带宽，取值范围：yes、no
     *
     * @param hasJoinBandwidthPackage
     */
    public DescribeElasticIpsRequest hasJoinBandwidthPackage(String hasJoinBandwidthPackage) {
        this.hasJoinBandwidthPackage = hasJoinBandwidthPackage;
        return this;
    }

    /**
     * set 支付模式，取值为：prepaid_by_duration表示预付费，postpaid_by_duration表示按配置后付费
     *
     * @param chargeMode
     */
    public DescribeElasticIpsRequest chargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * set 实例Id
     *
     * @param instanceId
     */
    public DescribeElasticIpsRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 子网Id
     *
     * @param subnetId
     */
    public DescribeElasticIpsRequest subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set elasticIpId - 弹性公网IPID，精确匹配，支持多个&lt;br/&gt;
elasticIp - 弹性公网IP，精确匹配，支持多个&lt;br/&gt;
bandwidthPackageId - 共享带宽ID，精确匹配，支持多个

     *
     * @param filters
     */
    public DescribeElasticIpsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public DescribeElasticIpsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to elasticIpId - 弹性公网IPID，精确匹配，支持多个&lt;br/&gt;
elasticIp - 弹性公网IP，精确匹配，支持多个&lt;br/&gt;
bandwidthPackageId - 共享带宽ID，精确匹配，支持多个

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}