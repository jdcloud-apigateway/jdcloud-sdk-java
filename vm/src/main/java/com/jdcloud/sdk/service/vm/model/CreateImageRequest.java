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
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.vm.model.InstanceDiskAttachmentSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 为云主机创建私有镜像。云主机状态必须为&lt;b&gt;stopped&lt;/b&gt;。&lt;br&gt;
云主机没有正在进行中的任务才可制作镜像。&lt;br&gt;
如果云主机中挂载了数据盘，默认会将数据盘创建快照，生成打包镜像。&lt;br&gt;
调用接口后，需要等待镜像状态变为&lt;b&gt;ready&lt;/b&gt;后，才能正常使用镜像。

 */
public class CreateImageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像名称，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     * Required:true
     */
    @Required
    private String name;

    /**
     * 镜像描述，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     * Required:true
     */
    @Required
    private String description;

    /**
     * 数据盘列表，可以在打包镜像的基础上，额外增加新的快照、空盘、或排除云主机中的数据盘。
     */
    private List<InstanceDiskAttachmentSpec> dataDisks;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 镜像名称，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 镜像名称，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 镜像描述，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 镜像描述，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 数据盘列表，可以在打包镜像的基础上，额外增加新的快照、空盘、或排除云主机中的数据盘。
     *
     * @return
     */
    public List<InstanceDiskAttachmentSpec> getDataDisks() {
        return dataDisks;
    }

    /**
     * set 数据盘列表，可以在打包镜像的基础上，额外增加新的快照、空盘、或排除云主机中的数据盘。
     *
     * @param dataDisks
     */
    public void setDataDisks(List<InstanceDiskAttachmentSpec> dataDisks) {
        this.dataDisks = dataDisks;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 云主机ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 镜像名称，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param name
     */
    public CreateImageRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 镜像描述，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param description
     */
    public CreateImageRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 数据盘列表，可以在打包镜像的基础上，额外增加新的快照、空盘、或排除云主机中的数据盘。
     *
     * @param dataDisks
     */
    public CreateImageRequest dataDisks(List<InstanceDiskAttachmentSpec> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateImageRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云主机ID
     *
     * @param instanceId
     */
    public CreateImageRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * add item to 数据盘列表，可以在打包镜像的基础上，额外增加新的快照、空盘、或排除云主机中的数据盘。
     *
     * @param dataDisk
     */
    public void addDataDisk(InstanceDiskAttachmentSpec dataDisk) {
        if (this.dataDisks == null) {
            this.dataDisks = new ArrayList<>();
        }
        this.dataDisks.add(dataDisk);
    }

}