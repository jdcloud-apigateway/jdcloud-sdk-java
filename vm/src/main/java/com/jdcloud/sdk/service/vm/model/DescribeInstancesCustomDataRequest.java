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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
批量查询云主机用户自定义元数据。

详细操作说明请参考帮助文档：[自定义元数据](https://docs.jdcloud.com/cn/virtual-machines/userdata)

## 接口说明
- 使用 &#x60;filters&#x60; 过滤器进行条件筛选，每个 &#x60;filter&#x60; 之间的关系为逻辑与（AND）的关系。
- 单次查询最大可查询10台云主机实例自定义元数据。

 */
public class DescribeInstancesCustomDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码；默认为1。
     */
    private Integer pageNumber;

    /**
     * 分页大小；默认为10；取值范围[1, 10]。
     */
    private Integer pageSize;

    /**
     * &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceId&#x60;: 云主机ID，精确匹配，支持多个
&#x60;privateIpAddress&#x60;: 主网卡内网主IP地址，模糊匹配，支持多个
&#x60;vpcId&#x60;: 私有网络ID，精确匹配，支持多个
&#x60;status&#x60;: 云主机状态，精确匹配，支持多个，参考 [云主机状态](https://docs.jdcloud.com/virtual-machines/api/vm_status)
&#x60;name&#x60;: 云主机名称，模糊匹配，支持单个
&#x60;imageId&#x60;: 镜像ID，精确匹配，支持多个
&#x60;agId&#x60;: 使用可用组id，支持单个
&#x60;faultDomain&#x60;: 错误域，支持多个
&#x60;networkInterfaceId&#x60;: 弹性网卡ID，精确匹配，支持多个
&#x60;subnetId&#x60;: 子网ID，精确匹配，支持多个

     */
    
    private List<Filter> filters;
    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 页码；默认为1。
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
     * get 分页大小；默认为10；取值范围[1, 10]。
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；默认为10；取值范围[1, 10]。
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
    * get &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceId&#x60;: 云主机ID，精确匹配，支持多个
&#x60;privateIpAddress&#x60;: 主网卡内网主IP地址，模糊匹配，支持多个
&#x60;vpcId&#x60;: 私有网络ID，精确匹配，支持多个
&#x60;status&#x60;: 云主机状态，精确匹配，支持多个，参考 [云主机状态](https://docs.jdcloud.com/virtual-machines/api/vm_status)
&#x60;name&#x60;: 云主机名称，模糊匹配，支持单个
&#x60;imageId&#x60;: 镜像ID，精确匹配，支持多个
&#x60;agId&#x60;: 使用可用组id，支持单个
&#x60;faultDomain&#x60;: 错误域，支持多个
&#x60;networkInterfaceId&#x60;: 弹性网卡ID，精确匹配，支持多个
&#x60;subnetId&#x60;: 子网ID，精确匹配，支持多个

    *
    * @return
    */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
    * set &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceId&#x60;: 云主机ID，精确匹配，支持多个
&#x60;privateIpAddress&#x60;: 主网卡内网主IP地址，模糊匹配，支持多个
&#x60;vpcId&#x60;: 私有网络ID，精确匹配，支持多个
&#x60;status&#x60;: 云主机状态，精确匹配，支持多个，参考 [云主机状态](https://docs.jdcloud.com/virtual-machines/api/vm_status)
&#x60;name&#x60;: 云主机名称，模糊匹配，支持单个
&#x60;imageId&#x60;: 镜像ID，精确匹配，支持多个
&#x60;agId&#x60;: 使用可用组id，支持单个
&#x60;faultDomain&#x60;: 错误域，支持多个
&#x60;networkInterfaceId&#x60;: 弹性网卡ID，精确匹配，支持多个
&#x60;subnetId&#x60;: 子网ID，精确匹配，支持多个

    *
    * @param filters
    */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }


    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public DescribeInstancesCustomDataRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
     * set 分页大小；默认为10；取值范围[1, 10]。
     *
     * @param pageSize
     */
    public DescribeInstancesCustomDataRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
    * set &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceId&#x60;: 云主机ID，精确匹配，支持多个
&#x60;privateIpAddress&#x60;: 主网卡内网主IP地址，模糊匹配，支持多个
&#x60;vpcId&#x60;: 私有网络ID，精确匹配，支持多个
&#x60;status&#x60;: 云主机状态，精确匹配，支持多个，参考 [云主机状态](https://docs.jdcloud.com/virtual-machines/api/vm_status)
&#x60;name&#x60;: 云主机名称，模糊匹配，支持单个
&#x60;imageId&#x60;: 镜像ID，精确匹配，支持多个
&#x60;agId&#x60;: 使用可用组id，支持单个
&#x60;faultDomain&#x60;: 错误域，支持多个
&#x60;networkInterfaceId&#x60;: 弹性网卡ID，精确匹配，支持多个
&#x60;subnetId&#x60;: 子网ID，精确匹配，支持多个

    *
    * @param filters
    */
    public DescribeInstancesCustomDataRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public DescribeInstancesCustomDataRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to &lt;b&gt;filters 中支持使用以下关键字进行过滤&lt;/b&gt;
&#x60;instanceId&#x60;: 云主机ID，精确匹配，支持多个
&#x60;privateIpAddress&#x60;: 主网卡内网主IP地址，模糊匹配，支持多个
&#x60;vpcId&#x60;: 私有网络ID，精确匹配，支持多个
&#x60;status&#x60;: 云主机状态，精确匹配，支持多个，参考 [云主机状态](https://docs.jdcloud.com/virtual-machines/api/vm_status)
&#x60;name&#x60;: 云主机名称，模糊匹配，支持单个
&#x60;imageId&#x60;: 镜像ID，精确匹配，支持多个
&#x60;agId&#x60;: 使用可用组id，支持单个
&#x60;faultDomain&#x60;: 错误域，支持多个
&#x60;networkInterfaceId&#x60;: 弹性网卡ID，精确匹配，支持多个
&#x60;subnetId&#x60;: 子网ID，精确匹配，支持多个

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