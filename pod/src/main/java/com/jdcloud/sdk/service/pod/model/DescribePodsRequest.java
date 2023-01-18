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
 * Pod
 * Pod 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.pod.model.TagFilter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量查询 pod 的详细信息&lt;br&gt;
此接口支持分页查询，默认每页20条。

 */
public class DescribePodsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为20；取值范围[10, 100]
     */
    private Integer pageSize;

    /**
     * podId - pod ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
phase - pod 状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
subnetId - 镜像ID，精确匹配，支持多个
agId - 镜像ID，精确匹配，支持多个

     */
    
    private List<Filter> filters;
    /**
     * Tag筛选条件
     */
    
    private List<TagFilter> tags;
    /**
     * Region ID
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
     * get 分页大小；默认为20；取值范围[10, 100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
    * get podId - pod ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
phase - pod 状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
subnetId - 镜像ID，精确匹配，支持多个
agId - 镜像ID，精确匹配，支持多个

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set podId - pod ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
phase - pod 状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
subnetId - 镜像ID，精确匹配，支持多个
agId - 镜像ID，精确匹配，支持多个

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
    * get Tag筛选条件
    *
    * @return
    */
    public List<TagFilter> getTags() {
        return tags;
    }

    /**
    * set Tag筛选条件
    *
    * @param tags
    */
    public void setTags(List<TagFilter> tags) {
        this.tags = tags;
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
     * set 页码；默认为1
     *
     * @param pageNumber
     */
    public DescribePodsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小；默认为20；取值范围[10, 100]
     *
     * @param pageSize
     */
    public DescribePodsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set podId - pod ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
phase - pod 状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
subnetId - 镜像ID，精确匹配，支持多个
agId - 镜像ID，精确匹配，支持多个

    *
    * @param filters
    */
    public DescribePodsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
    * set Tag筛选条件
    *
    * @param tags
    */
    public DescribePodsRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribePodsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to podId - pod ID，精确匹配，支持多个
privateIpAddress - 主网卡IP地址，模糊匹配，支持单个
az - 可用区，精确匹配，支持多个
vpcId - 私有网络ID，精确匹配，支持多个
phase - pod 状态，精确匹配，支持多个
name - 实例名称，模糊匹配，支持单个
subnetId - 镜像ID，精确匹配，支持多个
agId - 镜像ID，精确匹配，支持多个

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
     * add item to Tag筛选条件
     *
     * @param tag
     */
    public void addTag(TagFilter tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }
}