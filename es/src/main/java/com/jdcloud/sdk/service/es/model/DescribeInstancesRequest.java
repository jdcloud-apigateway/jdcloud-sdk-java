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
 * ES Instance API
 * es实例的创建、变配、删除、查询接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.es.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.common.model.TagFilter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询es实例列表
 */
public class DescribeInstancesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码，默认1
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认10
     */
    private Integer pageSize;

    /**
     * 过滤条件：
instanceId -实例Id，精确匹配，支持多个
instanceVersion -实例版本，精确匹配，支持单个
azId -azId，精确匹配，支持单个
instanceName - 实例名称，模糊匹配，支持单个
instanceStatus - 实例状态，精确匹配，支持多个(running：运行，error：错误，creating：创建中，changing：变配中，stop：已停止，processing：处理中)
chargeMode - 计费类型，按配置postpaid_by_duration或者包年包月prepaid_by_duration

     */
    private List<Filter> filters;

    /**
     * 标签过滤条件
     */
    private List<TagFilter> tagFilters;

    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 页码，默认1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码，默认1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小，默认10
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认10
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 过滤条件：
instanceId -实例Id，精确匹配，支持多个
instanceVersion -实例版本，精确匹配，支持单个
azId -azId，精确匹配，支持单个
instanceName - 实例名称，模糊匹配，支持单个
instanceStatus - 实例状态，精确匹配，支持多个(running：运行，error：错误，creating：创建中，changing：变配中，stop：已停止，processing：处理中)
chargeMode - 计费类型，按配置postpaid_by_duration或者包年包月prepaid_by_duration

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set 过滤条件：
instanceId -实例Id，精确匹配，支持多个
instanceVersion -实例版本，精确匹配，支持单个
azId -azId，精确匹配，支持单个
instanceName - 实例名称，模糊匹配，支持单个
instanceStatus - 实例状态，精确匹配，支持多个(running：运行，error：错误，creating：创建中，changing：变配中，stop：已停止，processing：处理中)
chargeMode - 计费类型，按配置postpaid_by_duration或者包年包月prepaid_by_duration

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 标签过滤条件
     *
     * @return
     */
    public List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * set 标签过滤条件
     *
     * @param tagFilters
     */
    public void setTagFilters(List<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
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
     * set 页码，默认1
     *
     * @param pageNumber
     */
    public DescribeInstancesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小，默认10
     *
     * @param pageSize
     */
    public DescribeInstancesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 过滤条件：
instanceId -实例Id，精确匹配，支持多个
instanceVersion -实例版本，精确匹配，支持单个
azId -azId，精确匹配，支持单个
instanceName - 实例名称，模糊匹配，支持单个
instanceStatus - 实例状态，精确匹配，支持多个(running：运行，error：错误，creating：创建中，changing：变配中，stop：已停止，processing：处理中)
chargeMode - 计费类型，按配置postpaid_by_duration或者包年包月prepaid_by_duration

     *
     * @param filters
     */
    public DescribeInstancesRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 标签过滤条件
     *
     * @param tagFilters
     */
    public DescribeInstancesRequest tagFilters(List<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public DescribeInstancesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 过滤条件：
instanceId -实例Id，精确匹配，支持多个
instanceVersion -实例版本，精确匹配，支持单个
azId -azId，精确匹配，支持单个
instanceName - 实例名称，模糊匹配，支持单个
instanceStatus - 实例状态，精确匹配，支持多个(running：运行，error：错误，creating：创建中，changing：变配中，stop：已停止，processing：处理中)
chargeMode - 计费类型，按配置postpaid_by_duration或者包年包月prepaid_by_duration

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
     * add item to 标签过滤条件
     *
     * @param tagFilter
     */
    public void addTagFilter(TagFilter tagFilter) {
        if (this.tagFilters == null) {
            this.tagFilters = new ArrayList<>();
        }
        this.tagFilters.add(tagFilter);
    }

}