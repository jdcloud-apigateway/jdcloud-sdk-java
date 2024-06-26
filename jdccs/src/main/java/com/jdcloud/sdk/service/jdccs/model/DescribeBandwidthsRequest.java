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
 * Resource API
 * 云托管服务的资源API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.common.model.Sort;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询带宽（出口）列表
 */
public class DescribeBandwidthsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码, 默认为1
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20
     */
    private Integer pageSize;

    /**
     * 线路类型 dynamicBGP:动态BGP thirdLineBGP:三线BGP telecom:电信单线 unicom:联通单线 mobile:移动单线
     */
    private String lineType;

    /**
     * 计费方式 fixedBandwidth:固定带宽 95thPercentile:95峰值 merge95thPercentile:合并95峰值
     */
    private String chargeType;

    /**
     * 带宽（出口）名称
     */
    private String bandwidthName;

    /**
     * 关联的公网IP
     */
    private String relatedIp;

    /**
     * bandwidthId - 带宽实例ID，精确匹配，支持多个

     */
    
    private List<Filter> filters;
    /**
     * null
     */
    
    private List<Sort> sorts;
    /**
     * IDC机房ID
     * Required:true
     */
    @Required
    private String idc;



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
     * get 分页大小，默认为20
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get 线路类型 dynamicBGP:动态BGP thirdLineBGP:三线BGP telecom:电信单线 unicom:联通单线 mobile:移动单线
     *
     * @return
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * set 线路类型 dynamicBGP:动态BGP thirdLineBGP:三线BGP telecom:电信单线 unicom:联通单线 mobile:移动单线
     *
     * @param lineType
     */
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }


    /**
     * get 计费方式 fixedBandwidth:固定带宽 95thPercentile:95峰值 merge95thPercentile:合并95峰值
     *
     * @return
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * set 计费方式 fixedBandwidth:固定带宽 95thPercentile:95峰值 merge95thPercentile:合并95峰值
     *
     * @param chargeType
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * get 带宽（出口）名称
     *
     * @return
     */
    public String getBandwidthName() {
        return bandwidthName;
    }

    /**
     * set 带宽（出口）名称
     *
     * @param bandwidthName
     */
    public void setBandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
    }


    /**
     * get 关联的公网IP
     *
     * @return
     */
    public String getRelatedIp() {
        return relatedIp;
    }

    /**
     * set 关联的公网IP
     *
     * @param relatedIp
     */
    public void setRelatedIp(String relatedIp) {
        this.relatedIp = relatedIp;
    }


    /**
    * get bandwidthId - 带宽实例ID，精确匹配，支持多个

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set bandwidthId - 带宽实例ID，精确匹配，支持多个

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
    * get null
    *
    * @return
    */
    public List<Sort> getSorts() {
        return sorts;
    }

    /**
    * set null
    *
    * @param sorts
    */
    public void setSorts(List<Sort> sorts) {
        this.sorts = sorts;
    }


    /**
     * get IDC机房ID
     *
     * @return
     */
    public String getIdc() {
        return idc;
    }

    /**
     * set IDC机房ID
     *
     * @param idc
     */
    public void setIdc(String idc) {
        this.idc = idc;
    }



    /**
     * set 页码, 默认为1
     *
     * @param pageNumber
     */
    public DescribeBandwidthsRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小，默认为20
     *
     * @param pageSize
     */
    public DescribeBandwidthsRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set 线路类型 dynamicBGP:动态BGP thirdLineBGP:三线BGP telecom:电信单线 unicom:联通单线 mobile:移动单线
     *
     * @param lineType
     */
    public DescribeBandwidthsRequest lineType(String lineType) {
        this.lineType = lineType;
        return this;
    }


    /**
     * set 计费方式 fixedBandwidth:固定带宽 95thPercentile:95峰值 merge95thPercentile:合并95峰值
     *
     * @param chargeType
     */
    public DescribeBandwidthsRequest chargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }


    /**
     * set 带宽（出口）名称
     *
     * @param bandwidthName
     */
    public DescribeBandwidthsRequest bandwidthName(String bandwidthName) {
        this.bandwidthName = bandwidthName;
        return this;
    }


    /**
     * set 关联的公网IP
     *
     * @param relatedIp
     */
    public DescribeBandwidthsRequest relatedIp(String relatedIp) {
        this.relatedIp = relatedIp;
        return this;
    }


    /**
    * set bandwidthId - 带宽实例ID，精确匹配，支持多个

    *
    * @param filters
    */
    public DescribeBandwidthsRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
    * set null
    *
    * @param sorts
    */
    public DescribeBandwidthsRequest sorts(List<Sort> sorts) {
        this.sorts = sorts;
        return this;
    }


    /**
     * set IDC机房ID
     *
     * @param idc
     */
    public DescribeBandwidthsRequest idc(String idc) {
        this.idc = idc;
        return this;
    }



    /**
     * add item to bandwidthId - 带宽实例ID，精确匹配，支持多个

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
     * add item to null
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