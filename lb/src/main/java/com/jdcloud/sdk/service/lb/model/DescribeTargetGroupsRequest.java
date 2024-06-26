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
 * TargetGroup
 * 目标target组相关接口
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
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询虚拟服务器组列表详情，返回target详情功能3个月后将会下线，建议用户直接使用describeTargets接口查询target详情
 */
public class DescribeTargetGroupsRequest extends JdcloudRequest implements java.io.Serializable {

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
     * targetGroupIds - TargetGroup ID列表，支持多个
targetGroupNames - TargetGroup名称列表，支持多个
loadBalancerId － TargetGroup所属负载均衡的Id，支持单个
loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个

     */
    
    private List<Filter> filters;
    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



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
    * get targetGroupIds - TargetGroup ID列表，支持多个
targetGroupNames - TargetGroup名称列表，支持多个
loadBalancerId － TargetGroup所属负载均衡的Id，支持单个
loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set targetGroupIds - TargetGroup ID列表，支持多个
targetGroupNames - TargetGroup名称列表，支持多个
loadBalancerId － TargetGroup所属负载均衡的Id，支持单个
loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
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
     * set 页码, 默认为1, 取值范围：[1,∞), 页码超过总页数时, 显示最后一页
     *
     * @param pageNumber
     */
    public DescribeTargetGroupsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeTargetGroupsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set targetGroupIds - TargetGroup ID列表，支持多个
targetGroupNames - TargetGroup名称列表，支持多个
loadBalancerId － TargetGroup所属负载均衡的Id，支持单个
loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个

    *
    * @param filters
    */
    public DescribeTargetGroupsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeTargetGroupsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to targetGroupIds - TargetGroup ID列表，支持多个
targetGroupNames - TargetGroup名称列表，支持多个
loadBalancerId － TargetGroup所属负载均衡的Id，支持单个
loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个

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