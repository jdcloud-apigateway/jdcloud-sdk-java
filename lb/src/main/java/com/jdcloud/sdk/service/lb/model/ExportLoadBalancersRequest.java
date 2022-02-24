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
 * LoadBalancer
 * 负载均衡器相关接口
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
import com.jdcloud.sdk.service.lb.model.TagFilter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建负载均衡列表导出任务
 */
public class ExportLoadBalancersRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 导出文件类型, 目前支持excel和csv
     */
    private String fileType;

    /**
     * 开始页码, 默认为1, 取值范围：[1,∞), startPage超过总页数时会报错
     */
    private Integer startPage;

    /**
     * 结束页码, 取值范围：[startPage,∞), 当startPage未超过总页数, endpage超过总页数, 会返回从开始页码到最后一页的内容
     */
    private Integer endPage;

    /**
     * 分页大小，默认为20，取值范围：[10,100]
     */
    private Integer pageSize;

    /**
     * loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个
loadBalancerIds - 负载均衡ID列表，支持多个
loadBalancerNames - 负载均衡名称列表，支持多个
vpcId - 负载均衡所在Vpc的Id，支持单个
azType - 负载均衡az类型，取值：all(全部类型)，standard(标准负载均衡)，edge(边缘负载均衡)，默认standard ，支持单个
azs - 可用区，支持多个
columns - 不指定则默认导出基本表头：&quot;LB ID&quot;, &quot;LB Name&quot;, &quot;LB Type&quot;, &quot;Region&quot;
  可选字段值：
    az：lb所属可用区，对应表头&quot;Availability Zone&quot;
    privateIpAddress：lb的vip地址，对应表头&quot;VIP&quot;
    elasticIp：lb的公网IP，对应表头&quot;EIP IPv4 Address&quot;、&quot;EIP IPv4 Bandwidth&quot;
    ipv6Address：lb的ipv6地址，对应表头&quot;IPv6 Address&quot;
    vpc/subnet：lb所属的vpc及子网，对应表头&quot;VPC ID&quot;、&quot;VPC Name&quot;、&quot;Subnet ID&quot;、&quot;Subnet Name&quot;
    deleteProtection：是否开启删除保护，对应表头&quot;Delete Protection&quot;
    charge：lb的计费信息，对应表头&quot;LB Billing Type&quot;、&quot;Creation Time&quot;
    state：lb状态，对应表头&quot;Status&quot;
    tag：lb绑定的标签，对应表头&quot;Tag&quot;
    description：lb的描述信息，对应表头&quot;Description&quot;

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
     * get 导出文件类型, 目前支持excel和csv
     *
     * @return
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * set 导出文件类型, 目前支持excel和csv
     *
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * get 开始页码, 默认为1, 取值范围：[1,∞), startPage超过总页数时会报错
     *
     * @return
     */
    public Integer getStartPage() {
        return startPage;
    }

    /**
     * set 开始页码, 默认为1, 取值范围：[1,∞), startPage超过总页数时会报错
     *
     * @param startPage
     */
    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    /**
     * get 结束页码, 取值范围：[startPage,∞), 当startPage未超过总页数, endpage超过总页数, 会返回从开始页码到最后一页的内容
     *
     * @return
     */
    public Integer getEndPage() {
        return endPage;
    }

    /**
     * set 结束页码, 取值范围：[startPage,∞), 当startPage未超过总页数, endpage超过总页数, 会返回从开始页码到最后一页的内容
     *
     * @param endPage
     */
    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
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
     * get loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个
loadBalancerIds - 负载均衡ID列表，支持多个
loadBalancerNames - 负载均衡名称列表，支持多个
vpcId - 负载均衡所在Vpc的Id，支持单个
azType - 负载均衡az类型，取值：all(全部类型)，standard(标准负载均衡)，edge(边缘负载均衡)，默认standard ，支持单个
azs - 可用区，支持多个
columns - 不指定则默认导出基本表头：&quot;LB ID&quot;, &quot;LB Name&quot;, &quot;LB Type&quot;, &quot;Region&quot;
  可选字段值：
    az：lb所属可用区，对应表头&quot;Availability Zone&quot;
    privateIpAddress：lb的vip地址，对应表头&quot;VIP&quot;
    elasticIp：lb的公网IP，对应表头&quot;EIP IPv4 Address&quot;、&quot;EIP IPv4 Bandwidth&quot;
    ipv6Address：lb的ipv6地址，对应表头&quot;IPv6 Address&quot;
    vpc/subnet：lb所属的vpc及子网，对应表头&quot;VPC ID&quot;、&quot;VPC Name&quot;、&quot;Subnet ID&quot;、&quot;Subnet Name&quot;
    deleteProtection：是否开启删除保护，对应表头&quot;Delete Protection&quot;
    charge：lb的计费信息，对应表头&quot;LB Billing Type&quot;、&quot;Creation Time&quot;
    state：lb状态，对应表头&quot;Status&quot;
    tag：lb绑定的标签，对应表头&quot;Tag&quot;
    description：lb的描述信息，对应表头&quot;Description&quot;

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个
loadBalancerIds - 负载均衡ID列表，支持多个
loadBalancerNames - 负载均衡名称列表，支持多个
vpcId - 负载均衡所在Vpc的Id，支持单个
azType - 负载均衡az类型，取值：all(全部类型)，standard(标准负载均衡)，edge(边缘负载均衡)，默认standard ，支持单个
azs - 可用区，支持多个
columns - 不指定则默认导出基本表头：&quot;LB ID&quot;, &quot;LB Name&quot;, &quot;LB Type&quot;, &quot;Region&quot;
  可选字段值：
    az：lb所属可用区，对应表头&quot;Availability Zone&quot;
    privateIpAddress：lb的vip地址，对应表头&quot;VIP&quot;
    elasticIp：lb的公网IP，对应表头&quot;EIP IPv4 Address&quot;、&quot;EIP IPv4 Bandwidth&quot;
    ipv6Address：lb的ipv6地址，对应表头&quot;IPv6 Address&quot;
    vpc/subnet：lb所属的vpc及子网，对应表头&quot;VPC ID&quot;、&quot;VPC Name&quot;、&quot;Subnet ID&quot;、&quot;Subnet Name&quot;
    deleteProtection：是否开启删除保护，对应表头&quot;Delete Protection&quot;
    charge：lb的计费信息，对应表头&quot;LB Billing Type&quot;、&quot;Creation Time&quot;
    state：lb状态，对应表头&quot;Status&quot;
    tag：lb绑定的标签，对应表头&quot;Tag&quot;
    description：lb的描述信息，对应表头&quot;Description&quot;

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
     * set 导出文件类型, 目前支持excel和csv
     *
     * @param fileType
     */
    public ExportLoadBalancersRequest fileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * set 开始页码, 默认为1, 取值范围：[1,∞), startPage超过总页数时会报错
     *
     * @param startPage
     */
    public ExportLoadBalancersRequest startPage(Integer startPage) {
        this.startPage = startPage;
        return this;
    }

    /**
     * set 结束页码, 取值范围：[startPage,∞), 当startPage未超过总页数, endpage超过总页数, 会返回从开始页码到最后一页的内容
     *
     * @param endPage
     */
    public ExportLoadBalancersRequest endPage(Integer endPage) {
        this.endPage = endPage;
        return this;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public ExportLoadBalancersRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个
loadBalancerIds - 负载均衡ID列表，支持多个
loadBalancerNames - 负载均衡名称列表，支持多个
vpcId - 负载均衡所在Vpc的Id，支持单个
azType - 负载均衡az类型，取值：all(全部类型)，standard(标准负载均衡)，edge(边缘负载均衡)，默认standard ，支持单个
azs - 可用区，支持多个
columns - 不指定则默认导出基本表头：&quot;LB ID&quot;, &quot;LB Name&quot;, &quot;LB Type&quot;, &quot;Region&quot;
  可选字段值：
    az：lb所属可用区，对应表头&quot;Availability Zone&quot;
    privateIpAddress：lb的vip地址，对应表头&quot;VIP&quot;
    elasticIp：lb的公网IP，对应表头&quot;EIP IPv4 Address&quot;、&quot;EIP IPv4 Bandwidth&quot;
    ipv6Address：lb的ipv6地址，对应表头&quot;IPv6 Address&quot;
    vpc/subnet：lb所属的vpc及子网，对应表头&quot;VPC ID&quot;、&quot;VPC Name&quot;、&quot;Subnet ID&quot;、&quot;Subnet Name&quot;
    deleteProtection：是否开启删除保护，对应表头&quot;Delete Protection&quot;
    charge：lb的计费信息，对应表头&quot;LB Billing Type&quot;、&quot;Creation Time&quot;
    state：lb状态，对应表头&quot;Status&quot;
    tag：lb绑定的标签，对应表头&quot;Tag&quot;
    description：lb的描述信息，对应表头&quot;Description&quot;

     *
     * @param filters
     */
    public ExportLoadBalancersRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set Tag筛选条件
     *
     * @param tags
     */
    public ExportLoadBalancersRequest tags(List<TagFilter> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public ExportLoadBalancersRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to loadBalancerType - 负载均衡类型，取值为：alb、nlb、dnlb，默认alb，支持单个
loadBalancerIds - 负载均衡ID列表，支持多个
loadBalancerNames - 负载均衡名称列表，支持多个
vpcId - 负载均衡所在Vpc的Id，支持单个
azType - 负载均衡az类型，取值：all(全部类型)，standard(标准负载均衡)，edge(边缘负载均衡)，默认standard ，支持单个
azs - 可用区，支持多个
columns - 不指定则默认导出基本表头：&quot;LB ID&quot;, &quot;LB Name&quot;, &quot;LB Type&quot;, &quot;Region&quot;
  可选字段值：
    az：lb所属可用区，对应表头&quot;Availability Zone&quot;
    privateIpAddress：lb的vip地址，对应表头&quot;VIP&quot;
    elasticIp：lb的公网IP，对应表头&quot;EIP IPv4 Address&quot;、&quot;EIP IPv4 Bandwidth&quot;
    ipv6Address：lb的ipv6地址，对应表头&quot;IPv6 Address&quot;
    vpc/subnet：lb所属的vpc及子网，对应表头&quot;VPC ID&quot;、&quot;VPC Name&quot;、&quot;Subnet ID&quot;、&quot;Subnet Name&quot;
    deleteProtection：是否开启删除保护，对应表头&quot;Delete Protection&quot;
    charge：lb的计费信息，对应表头&quot;LB Billing Type&quot;、&quot;Creation Time&quot;
    state：lb状态，对应表头&quot;Status&quot;
    tag：lb绑定的标签，对应表头&quot;Tag&quot;
    description：lb的描述信息，对应表头&quot;Description&quot;

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