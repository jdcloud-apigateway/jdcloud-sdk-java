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
 * Acl
 * Acl相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询Acl列表
 */
public class DescribeNetworkAclsRequest extends JdcloudRequest implements java.io.Serializable {

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
     * networkAclIds - networkAcl ID列表，支持多个
networkAclNames - networkAcl名称列表，支持多个
vpcId - networkAcl所属vpc Id，支持单个

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
    * get networkAclIds - networkAcl ID列表，支持多个
networkAclNames - networkAcl名称列表，支持多个
vpcId - networkAcl所属vpc Id，支持单个

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set networkAclIds - networkAcl ID列表，支持多个
networkAclNames - networkAcl名称列表，支持多个
vpcId - networkAcl所属vpc Id，支持单个

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
    public DescribeNetworkAclsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeNetworkAclsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set networkAclIds - networkAcl ID列表，支持多个
networkAclNames - networkAcl名称列表，支持多个
vpcId - networkAcl所属vpc Id，支持单个

    *
    * @param filters
    */
    public DescribeNetworkAclsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DescribeNetworkAclsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to networkAclIds - networkAcl ID列表，支持多个
networkAclNames - networkAcl名称列表，支持多个
vpcId - networkAcl所属vpc Id，支持单个

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