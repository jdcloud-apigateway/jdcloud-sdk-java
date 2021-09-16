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
 * 镜像
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
查询镜像信息列表。

详细操作说明请参考帮助文档：[镜像概述](https://docs.jdcloud.com/cn/virtual-machines/image-overview)

## 接口说明
- 通过此接口可以查询到京东云官方镜像、第三方镜像、镜像市场、私有镜像、或其他用户共享给您的镜像。
- 请求参数即过滤条件，每个条件之间的关系为逻辑与（AND）的关系。
- 如果使用子帐号查询，只会查询到该子帐号有权限的镜像。关于资源权限请参考 [IAM概述](https://docs.jdcloud.com/cn/iam/product-overview)。
- 单次查询最大可查询100条镜像信息。
- 尽量一次调用接口查询多条数据，不建议使用该批量查询接口一次查询一条数据，如果使用不当导致查询过于密集，可能导致网关触发限流。
- 由于该接口为 &#x60;GET&#x60; 方式请求，最终参数会转换为 &#x60;URL&#x60; 上的参数，但是 &#x60;HTTP&#x60; 协议下的 &#x60;GET&#x60; 请求参数长度是有大小限制的，使用者需要注意参数超长的问题。

 */
public class DescribeImagesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像来源，如果没有指定 &#x60;ids&#x60; 参数，此参数必传。取值范围：
&#x60;public&#x60;：官方镜像。
&#x60;thirdparty&#x60;：镜像市场镜像。
&#x60;private&#x60;：用户自己的私有镜像。
&#x60;shared&#x60;：其他用户分享的镜像。
&#x60;community&#x60;：社区镜像。

     */
    private String imageSource;

    /**
     * 查询已经下线的镜像时使用。
只有查询 &#x60;官方镜像&#x60; 或者 &#x60;镜像市场镜像&#x60; 时，此参数才有意义，其它情况下此参数无效。
指定 &#x60;ids&#x60; 查询时，此参数无效。

     */
    private Boolean offline;

    /**
     * 根据镜像的操作系统发行版查询。
取值范围：&#x60;Ubuntu、CentOS、Windows Server&#x60;。

     */
    private String platform;

    /**
     * 指定镜像ID查询，如果指定了此参数，其它参数可以不传。

     */
    private List<String> ids;

    /**
     * 根据镜像名称模糊查询。
     */
    private String imageName;

    /**
     * 根据镜像支持的系统盘类型查询。支持范围：&#x60;localDisk&#x60; 本地系统盘镜像；&#x60;cloudDisk&#x60; 云盘系统盘镜像。
     */
    private String rootDeviceType;

    /**
     * 根据镜像的使用权限查询，可选参数，仅当 &#x60;imageSource&#x60; 为 &#x60;private&#x60; 时有效。取值范围：
&#x60;all&#x60;：没有限制，所有人均可以使用。
&#x60;specifiedUsers&#x60;：只有共享用户可以使用。
&#x60;ownerOnly&#x60;：镜像拥有者自己可以使用。

     */
    private String launchPermission;

    /**
     * 根据镜像状态查询。参考 [镜像状态](https://docs.jdcloud.com/virtual-machines/api/image_status)
     */
    private String status;

    /**
     * 已废弃。
     */
    private String serviceCode;

    /**
     * 页码；默认为1。
     */
    private Integer pageNumber;

    /**
     * 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     */
    private Integer pageSize;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 镜像来源，如果没有指定 &#x60;ids&#x60; 参数，此参数必传。取值范围：
&#x60;public&#x60;：官方镜像。
&#x60;thirdparty&#x60;：镜像市场镜像。
&#x60;private&#x60;：用户自己的私有镜像。
&#x60;shared&#x60;：其他用户分享的镜像。
&#x60;community&#x60;：社区镜像。

     *
     * @return
     */
    public String getImageSource() {
        return imageSource;
    }

    /**
     * set 镜像来源，如果没有指定 &#x60;ids&#x60; 参数，此参数必传。取值范围：
&#x60;public&#x60;：官方镜像。
&#x60;thirdparty&#x60;：镜像市场镜像。
&#x60;private&#x60;：用户自己的私有镜像。
&#x60;shared&#x60;：其他用户分享的镜像。
&#x60;community&#x60;：社区镜像。

     *
     * @param imageSource
     */
    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    /**
     * get 查询已经下线的镜像时使用。
只有查询 &#x60;官方镜像&#x60; 或者 &#x60;镜像市场镜像&#x60; 时，此参数才有意义，其它情况下此参数无效。
指定 &#x60;ids&#x60; 查询时，此参数无效。

     *
     * @return
     */
    public Boolean getOffline() {
        return offline;
    }

    /**
     * set 查询已经下线的镜像时使用。
只有查询 &#x60;官方镜像&#x60; 或者 &#x60;镜像市场镜像&#x60; 时，此参数才有意义，其它情况下此参数无效。
指定 &#x60;ids&#x60; 查询时，此参数无效。

     *
     * @param offline
     */
    public void setOffline(Boolean offline) {
        this.offline = offline;
    }

    /**
     * get 根据镜像的操作系统发行版查询。
取值范围：&#x60;Ubuntu、CentOS、Windows Server&#x60;。

     *
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * set 根据镜像的操作系统发行版查询。
取值范围：&#x60;Ubuntu、CentOS、Windows Server&#x60;。

     *
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * get 指定镜像ID查询，如果指定了此参数，其它参数可以不传。

     *
     * @return
     */
    public List<String> getIds() {
        return ids;
    }

    /**
     * set 指定镜像ID查询，如果指定了此参数，其它参数可以不传。

     *
     * @param ids
     */
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    /**
     * get 根据镜像名称模糊查询。
     *
     * @return
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * set 根据镜像名称模糊查询。
     *
     * @param imageName
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * get 根据镜像支持的系统盘类型查询。支持范围：&#x60;localDisk&#x60; 本地系统盘镜像；&#x60;cloudDisk&#x60; 云盘系统盘镜像。
     *
     * @return
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }

    /**
     * set 根据镜像支持的系统盘类型查询。支持范围：&#x60;localDisk&#x60; 本地系统盘镜像；&#x60;cloudDisk&#x60; 云盘系统盘镜像。
     *
     * @param rootDeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    /**
     * get 根据镜像的使用权限查询，可选参数，仅当 &#x60;imageSource&#x60; 为 &#x60;private&#x60; 时有效。取值范围：
&#x60;all&#x60;：没有限制，所有人均可以使用。
&#x60;specifiedUsers&#x60;：只有共享用户可以使用。
&#x60;ownerOnly&#x60;：镜像拥有者自己可以使用。

     *
     * @return
     */
    public String getLaunchPermission() {
        return launchPermission;
    }

    /**
     * set 根据镜像的使用权限查询，可选参数，仅当 &#x60;imageSource&#x60; 为 &#x60;private&#x60; 时有效。取值范围：
&#x60;all&#x60;：没有限制，所有人均可以使用。
&#x60;specifiedUsers&#x60;：只有共享用户可以使用。
&#x60;ownerOnly&#x60;：镜像拥有者自己可以使用。

     *
     * @param launchPermission
     */
    public void setLaunchPermission(String launchPermission) {
        this.launchPermission = launchPermission;
    }

    /**
     * get 根据镜像状态查询。参考 [镜像状态](https://docs.jdcloud.com/virtual-machines/api/image_status)
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 根据镜像状态查询。参考 [镜像状态](https://docs.jdcloud.com/virtual-machines/api/image_status)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 已废弃。
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 已废弃。
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

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
     * get 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
     * set 镜像来源，如果没有指定 &#x60;ids&#x60; 参数，此参数必传。取值范围：
&#x60;public&#x60;：官方镜像。
&#x60;thirdparty&#x60;：镜像市场镜像。
&#x60;private&#x60;：用户自己的私有镜像。
&#x60;shared&#x60;：其他用户分享的镜像。
&#x60;community&#x60;：社区镜像。

     *
     * @param imageSource
     */
    public DescribeImagesRequest imageSource(String imageSource) {
        this.imageSource = imageSource;
        return this;
    }

    /**
     * set 查询已经下线的镜像时使用。
只有查询 &#x60;官方镜像&#x60; 或者 &#x60;镜像市场镜像&#x60; 时，此参数才有意义，其它情况下此参数无效。
指定 &#x60;ids&#x60; 查询时，此参数无效。

     *
     * @param offline
     */
    public DescribeImagesRequest offline(Boolean offline) {
        this.offline = offline;
        return this;
    }

    /**
     * set 根据镜像的操作系统发行版查询。
取值范围：&#x60;Ubuntu、CentOS、Windows Server&#x60;。

     *
     * @param platform
     */
    public DescribeImagesRequest platform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * set 指定镜像ID查询，如果指定了此参数，其它参数可以不传。

     *
     * @param ids
     */
    public DescribeImagesRequest ids(List<String> ids) {
        this.ids = ids;
        return this;
    }

    /**
     * set 根据镜像名称模糊查询。
     *
     * @param imageName
     */
    public DescribeImagesRequest imageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * set 根据镜像支持的系统盘类型查询。支持范围：&#x60;localDisk&#x60; 本地系统盘镜像；&#x60;cloudDisk&#x60; 云盘系统盘镜像。
     *
     * @param rootDeviceType
     */
    public DescribeImagesRequest rootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * set 根据镜像的使用权限查询，可选参数，仅当 &#x60;imageSource&#x60; 为 &#x60;private&#x60; 时有效。取值范围：
&#x60;all&#x60;：没有限制，所有人均可以使用。
&#x60;specifiedUsers&#x60;：只有共享用户可以使用。
&#x60;ownerOnly&#x60;：镜像拥有者自己可以使用。

     *
     * @param launchPermission
     */
    public DescribeImagesRequest launchPermission(String launchPermission) {
        this.launchPermission = launchPermission;
        return this;
    }

    /**
     * set 根据镜像状态查询。参考 [镜像状态](https://docs.jdcloud.com/virtual-machines/api/image_status)
     *
     * @param status
     */
    public DescribeImagesRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 已废弃。
     *
     * @param serviceCode
     */
    public DescribeImagesRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 页码；默认为1。
     *
     * @param pageNumber
     */
    public DescribeImagesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小；&lt;br&gt;默认为20；取值范围[10, 100]。
     *
     * @param pageSize
     */
    public DescribeImagesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public DescribeImagesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 指定镜像ID查询，如果指定了此参数，其它参数可以不传。

     *
     * @param id
     */
    public void addId(String id) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(id);
    }

}