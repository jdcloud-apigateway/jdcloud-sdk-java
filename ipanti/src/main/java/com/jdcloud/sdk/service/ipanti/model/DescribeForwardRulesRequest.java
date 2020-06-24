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
 * Anti DDos Pro non-Web Rule Configuration APIs
 * Anti DDos Pro non-Web Rule Configuration APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询某个实例下的非网站转发配置
 */
public class DescribeForwardRulesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小, 默认为10, 取值范围[10, 100]
     */
    private Integer pageSize;

    /**
     * 查询类型名称, domain:源站域名, ip:源站 IP, port: 转发端口, originPort: 源站端口, serviceIp: 高防IP(仅支持BGP线路的实例)
     */
    private String searchType;

    /**
     * 查询类型值
     */
    private String searchValue;

    /**
     * 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 高防实例 Id
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 页码, 默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小, 默认为10, 取值范围[10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小, 默认为10, 取值范围[10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 查询类型名称, domain:源站域名, ip:源站 IP, port: 转发端口, originPort: 源站端口, serviceIp: 高防IP(仅支持BGP线路的实例)
     *
     * @return
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * set 查询类型名称, domain:源站域名, ip:源站 IP, port: 转发端口, originPort: 源站端口, serviceIp: 高防IP(仅支持BGP线路的实例)
     *
     * @param searchType
     */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    /**
     * get 查询类型值
     *
     * @return
     */
    public String getSearchValue() {
        return searchValue;
    }

    /**
     * set 查询类型值
     *
     * @param searchValue
     */
    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    /**
     * get 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 高防实例 Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 高防实例 Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 页码, 默认为1
     *
     * @param pageNumber
     */
    public DescribeForwardRulesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小, 默认为10, 取值范围[10, 100]
     *
     * @param pageSize
     */
    public DescribeForwardRulesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 查询类型名称, domain:源站域名, ip:源站 IP, port: 转发端口, originPort: 源站端口, serviceIp: 高防IP(仅支持BGP线路的实例)
     *
     * @param searchType
     */
    public DescribeForwardRulesRequest searchType(String searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * set 查询类型值
     *
     * @param searchValue
     */
    public DescribeForwardRulesRequest searchValue(String searchValue) {
        this.searchValue = searchValue;
        return this;
    }

    /**
     * set 区域 ID, 高防不区分区域, 传 cn-north-1 即可
     *
     * @param regionId
     */
    public DescribeForwardRulesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 高防实例 Id
     *
     * @param instanceId
     */
    public DescribeForwardRulesRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}