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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dh.model;

import java.util.List;
import java.util.ArrayList;

/**
 * dedicatedPool
 */
public class DedicatedPool  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 专有宿主机池ID
     */
    private String dedicatedPoolId;

    /**
     * 专有宿主机池名称
     */
    private String name;

    /**
     * 专有宿主机池支持的机型
     */
    private String dedicatedHostType;

    /**
     * 专有宿主机池描述
     */
    private String description;

    /**
     * 有宿主机池选定的AZ列表
     */
    
    private List<String> az;
    /**
     * 专有宿主机池资源使用信息
     */
    private ResourceCapacity capacity;

    /**
     * 专有宿主机支持的云主机实例规格
     */
    
    private List<String> supportedInstanceType;
    /**
     * 专有宿主机池下的专有宿主机简要信息
     */
    private DedicatedHostsBreif dedicatedHosts;

    /**
     * 专有宿主机池中的云主机ID列表
     */
    
    private List<String> instanceIds;
    /**
     * 创建时间
     */
    private String createTime;



    /**
     * get 专有宿主机池ID
     *
     * @return
     */
    public String getDedicatedPoolId() {
        return dedicatedPoolId;
    }

    /**
     * set 专有宿主机池ID
     *
     * @param dedicatedPoolId
     */
    public void setDedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
    }


    /**
     * get 专有宿主机池名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 专有宿主机池名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 专有宿主机池支持的机型
     *
     * @return
     */
    public String getDedicatedHostType() {
        return dedicatedHostType;
    }

    /**
     * set 专有宿主机池支持的机型
     *
     * @param dedicatedHostType
     */
    public void setDedicatedHostType(String dedicatedHostType) {
        this.dedicatedHostType = dedicatedHostType;
    }


    /**
     * get 专有宿主机池描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 专有宿主机池描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
    * get 有宿主机池选定的AZ列表
    *
    * @return
    */
    public List<String> getAz() {
        return az;
    }

    /**
    * set 有宿主机池选定的AZ列表
    *
    * @param az
    */
    public void setAz(List<String> az) {
        this.az = az;
    }


    /**
     * get 专有宿主机池资源使用信息
     *
     * @return
     */
    public ResourceCapacity getCapacity() {
        return capacity;
    }

    /**
     * set 专有宿主机池资源使用信息
     *
     * @param capacity
     */
    public void setCapacity(ResourceCapacity capacity) {
        this.capacity = capacity;
    }


    /**
    * get 专有宿主机支持的云主机实例规格
    *
    * @return
    */
    public List<String> getSupportedInstanceType() {
        return supportedInstanceType;
    }

    /**
    * set 专有宿主机支持的云主机实例规格
    *
    * @param supportedInstanceType
    */
    public void setSupportedInstanceType(List<String> supportedInstanceType) {
        this.supportedInstanceType = supportedInstanceType;
    }


    /**
     * get 专有宿主机池下的专有宿主机简要信息
     *
     * @return
     */
    public DedicatedHostsBreif getDedicatedHosts() {
        return dedicatedHosts;
    }

    /**
     * set 专有宿主机池下的专有宿主机简要信息
     *
     * @param dedicatedHosts
     */
    public void setDedicatedHosts(DedicatedHostsBreif dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
    }


    /**
    * get 专有宿主机池中的云主机ID列表
    *
    * @return
    */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    /**
    * set 专有宿主机池中的云主机ID列表
    *
    * @param instanceIds
    */
    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }



    /**
     * set 专有宿主机池ID
     *
     * @param dedicatedPoolId
     */
    public DedicatedPool dedicatedPoolId(String dedicatedPoolId) {
        this.dedicatedPoolId = dedicatedPoolId;
        return this;
    }


    /**
     * set 专有宿主机池名称
     *
     * @param name
     */
    public DedicatedPool name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 专有宿主机池支持的机型
     *
     * @param dedicatedHostType
     */
    public DedicatedPool dedicatedHostType(String dedicatedHostType) {
        this.dedicatedHostType = dedicatedHostType;
        return this;
    }


    /**
     * set 专有宿主机池描述
     *
     * @param description
     */
    public DedicatedPool description(String description) {
        this.description = description;
        return this;
    }


    /**
    * set 有宿主机池选定的AZ列表
    *
    * @param az
    */
    public DedicatedPool az(List<String> az) {
        this.az = az;
        return this;
    }


    /**
     * set 专有宿主机池资源使用信息
     *
     * @param capacity
     */
    public DedicatedPool capacity(ResourceCapacity capacity) {
        this.capacity = capacity;
        return this;
    }


    /**
    * set 专有宿主机支持的云主机实例规格
    *
    * @param supportedInstanceType
    */
    public DedicatedPool supportedInstanceType(List<String> supportedInstanceType) {
        this.supportedInstanceType = supportedInstanceType;
        return this;
    }


    /**
     * set 专有宿主机池下的专有宿主机简要信息
     *
     * @param dedicatedHosts
     */
    public DedicatedPool dedicatedHosts(DedicatedHostsBreif dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }


    /**
    * set 专有宿主机池中的云主机ID列表
    *
    * @param instanceIds
    */
    public DedicatedPool instanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DedicatedPool createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }



    /**
     * add item to 有宿主机池选定的AZ列表
     *
     * @param az
     */
    public void addAz(String az) {
        if (this.az == null) {
            this.az = new ArrayList<>();
        }
        this.az.add(az);
    }

    /**
     * add item to 专有宿主机支持的云主机实例规格
     *
     * @param supportedInstanceType
     */
    public void addSupportedInstanceType(String supportedInstanceType) {
        if (this.supportedInstanceType == null) {
            this.supportedInstanceType = new ArrayList<>();
        }
        this.supportedInstanceType.add(supportedInstanceType);
    }

    /**
     * add item to 专有宿主机池中的云主机ID列表
     *
     * @param instanceId
     */
    public void addInstanceId(String instanceId) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceId);
    }
}