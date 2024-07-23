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
 * Backend
 * 后端服务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.common.model.Sort;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询 后端服务-高可用组 Target列表详情
 */
public class DescribeAgTargetsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为1, 取值范围：[1,∞), 页码超过总页数时, 显示最后一页
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20，取值范围：[10,100]
     */
    private Integer pageSize;

    /**
     * weight - 权重, 支持多个
targetIds - Target ID列表，支持多个
instanceId - Instance ID,仅支持单个
ipAddress - ip地址,仅支持单个

     */
    
    private List<Filter> filters;
    /**
     * createdTime - 默认值,默认按 createdTime 倒序
weight - 权重值

     */
    
    private List<Sort> sorts;
    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Backend Id
     * Required:true
     */
    @Required
    private String backendId;



    /**
     * get 页码, 默认为1, 取值范围：[1,∞), 页码超过总页数时, 显示最后一页
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1, 取值范围：[1,∞), 页码超过总页数时, 显示最后一页
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小，默认为20，取值范围：[10,100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
    * get weight - 权重, 支持多个
targetIds - Target ID列表，支持多个
instanceId - Instance ID,仅支持单个
ipAddress - ip地址,仅支持单个

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set weight - 权重, 支持多个
targetIds - Target ID列表，支持多个
instanceId - Instance ID,仅支持单个
ipAddress - ip地址,仅支持单个

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
    * get createdTime - 默认值,默认按 createdTime 倒序
weight - 权重值

    *
    * @return
    */
    public List<Sort> getSorts() {
        return sorts;
    }

    /**
    * set createdTime - 默认值,默认按 createdTime 倒序
weight - 权重值

    *
    * @param sorts
    */
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get Backend Id
     *
     * @return
     */
    public String getBackendId() {
        return backendId;
    }

    /**
     * set Backend Id
     *
     * @param backendId
     */
    public void setBackendId(String backendId) {
        this.backendId = backendId;
    }



    /**
     * set 页码, 默认为1, 取值范围：[1,∞), 页码超过总页数时, 显示最后一页
     *
     * @param pageNumber
     */
    public DescribeAgTargetsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeAgTargetsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set weight - 权重, 支持多个
targetIds - Target ID列表，支持多个
instanceId - Instance ID,仅支持单个
ipAddress - ip地址,仅支持单个

    *
    * @param filters
    */
    public DescribeAgTargetsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
    * set createdTime - 默认值,默认按 createdTime 倒序
weight - 权重值

    *
    * @param sorts
    */
    public DescribeAgTargetsRequest sorts(List<Sort> sorts) {
        this.sorts = sorts;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeAgTargetsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Backend Id
     *
     * @param backendId
     */
    public DescribeAgTargetsRequest backendId(String backendId) {
        this.backendId = backendId;
        return this;
    }



    /**
     * add item to weight - 权重, 支持多个
targetIds - Target ID列表，支持多个
instanceId - Instance ID,仅支持单个
ipAddress - ip地址,仅支持单个

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

    /**
     * add item to createdTime - 默认值,默认按 createdTime 倒序
weight - 权重值

     *
     * @param sort
     */
    public void addSort(Sort sort) {
        if (this.sorts == null) {
            this.sorts = new ArrayList<>();
        }
        this.sorts.add(sort);
    }
}