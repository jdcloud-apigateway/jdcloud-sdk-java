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

package com.jdcloud.sdk.service.rocketmq.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * instanceSpec
 */
public class InstanceSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 私有网络vpcId
     * Required:true
     */
    @Required
    private String vpcId;

    /**
     * 子网subnetId
     * Required:true
     */
    @Required
    private String subnetId;

    /**
     * rocketmq版本，[5.1.3]
     * Required:true
     */
    @Required
    private String instanceVersion;

    /**
     * rocketmq集群名称，不可为空，只支持大小写字母、数字、英文下划线或者中划线，以字母开头且不能超过32位
     * Required:true
     */
    @Required
    private String instanceName;

    /**
     * 可用区
     * Required:true
     */
    @Required
    
    private List<String> azId;
    /**
     * 集群规格配置
     * Required:true
     */
    @Required
    
    private List<InstanceClassSpec> instanceClassSpec;
    /**
     * 扩展配置
     */
    private ReqExtension extension;

    /**
     * 支持的cpu架构类型, 创建时选择，不选默认创建x86架构的实例
     */
    private String cpuArch;

    /**
     * 用于标识资源分类的Tag键值对
     */
    
    private List<Tag> opsTags;
    /**
     * 用于标识资源分类的Tag键值对
     */
    
    private List<Tag> userTags;


    /**
     * get 私有网络vpcId
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络vpcId
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
     * get 子网subnetId
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 子网subnetId
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }


    /**
     * get rocketmq版本，[5.1.3]
     *
     * @return
     */
    public String getInstanceVersion() {
        return instanceVersion;
    }

    /**
     * set rocketmq版本，[5.1.3]
     *
     * @param instanceVersion
     */
    public void setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
    }


    /**
     * get rocketmq集群名称，不可为空，只支持大小写字母、数字、英文下划线或者中划线，以字母开头且不能超过32位
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set rocketmq集群名称，不可为空，只支持大小写字母、数字、英文下划线或者中划线，以字母开头且不能超过32位
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }


    /**
    * get 可用区
    *
    * @return
    */
    public List<String> getAzId() {
        return azId;
    }

    /**
    * set 可用区
    *
    * @param azId
    */
    public void setAzId(List<String> azId) {
        this.azId = azId;
    }


    /**
    * get 集群规格配置
    *
    * @return
    */
    public List<InstanceClassSpec> getInstanceClassSpec() {
        return instanceClassSpec;
    }

    /**
    * set 集群规格配置
    *
    * @param instanceClassSpec
    */
    public void setInstanceClassSpec(List<InstanceClassSpec> instanceClassSpec) {
        this.instanceClassSpec = instanceClassSpec;
    }


    /**
     * get 扩展配置
     *
     * @return
     */
    public ReqExtension getExtension() {
        return extension;
    }

    /**
     * set 扩展配置
     *
     * @param extension
     */
    public void setExtension(ReqExtension extension) {
        this.extension = extension;
    }


    /**
     * get 支持的cpu架构类型, 创建时选择，不选默认创建x86架构的实例
     *
     * @return
     */
    public String getCpuArch() {
        return cpuArch;
    }

    /**
     * set 支持的cpu架构类型, 创建时选择，不选默认创建x86架构的实例
     *
     * @param cpuArch
     */
    public void setCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
    }


    /**
    * get 用于标识资源分类的Tag键值对
    *
    * @return
    */
    public List<Tag> getOpsTags() {
        return opsTags;
    }

    /**
    * set 用于标识资源分类的Tag键值对
    *
    * @param opsTags
    */
    public void setOpsTags(List<Tag> opsTags) {
        this.opsTags = opsTags;
    }


    /**
    * get 用于标识资源分类的Tag键值对
    *
    * @return
    */
    public List<Tag> getUserTags() {
        return userTags;
    }

    /**
    * set 用于标识资源分类的Tag键值对
    *
    * @param userTags
    */
    public void setUserTags(List<Tag> userTags) {
        this.userTags = userTags;
    }



    /**
     * set 私有网络vpcId
     *
     * @param vpcId
     */
    public InstanceSpec vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
     * set 子网subnetId
     *
     * @param subnetId
     */
    public InstanceSpec subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


    /**
     * set rocketmq版本，[5.1.3]
     *
     * @param instanceVersion
     */
    public InstanceSpec instanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }


    /**
     * set rocketmq集群名称，不可为空，只支持大小写字母、数字、英文下划线或者中划线，以字母开头且不能超过32位
     *
     * @param instanceName
     */
    public InstanceSpec instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }


    /**
    * set 可用区
    *
    * @param azId
    */
    public InstanceSpec azId(List<String> azId) {
        this.azId = azId;
        return this;
    }


    /**
    * set 集群规格配置
    *
    * @param instanceClassSpec
    */
    public InstanceSpec instanceClassSpec(List<InstanceClassSpec> instanceClassSpec) {
        this.instanceClassSpec = instanceClassSpec;
        return this;
    }


    /**
     * set 扩展配置
     *
     * @param extension
     */
    public InstanceSpec extension(ReqExtension extension) {
        this.extension = extension;
        return this;
    }


    /**
     * set 支持的cpu架构类型, 创建时选择，不选默认创建x86架构的实例
     *
     * @param cpuArch
     */
    public InstanceSpec cpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }


    /**
    * set 用于标识资源分类的Tag键值对
    *
    * @param opsTags
    */
    public InstanceSpec opsTags(List<Tag> opsTags) {
        this.opsTags = opsTags;
        return this;
    }


    /**
    * set 用于标识资源分类的Tag键值对
    *
    * @param userTags
    */
    public InstanceSpec userTags(List<Tag> userTags) {
        this.userTags = userTags;
        return this;
    }



    /**
     * add item to 可用区
     *
     * @param azId
     */
    public void addAzId(String azId) {
        if (this.azId == null) {
            this.azId = new ArrayList<>();
        }
        this.azId.add(azId);
    }

    /**
     * add item to 集群规格配置
     *
     * @param instanceClassSpec
     */
    public void addInstanceClassSpec(InstanceClassSpec instanceClassSpec) {
        if (this.instanceClassSpec == null) {
            this.instanceClassSpec = new ArrayList<>();
        }
        this.instanceClassSpec.add(instanceClassSpec);
    }

    /**
     * add item to 用于标识资源分类的Tag键值对
     *
     * @param opsTag
     */
    public void addOpsTag(Tag opsTag) {
        if (this.opsTags == null) {
            this.opsTags = new ArrayList<>();
        }
        this.opsTags.add(opsTag);
    }

    /**
     * add item to 用于标识资源分类的Tag键值对
     *
     * @param userTag
     */
    public void addUserTag(Tag userTag) {
        if (this.userTags == null) {
            this.userTags = new ArrayList<>();
        }
        this.userTags.add(userTag);
    }
}