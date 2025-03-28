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
 * PodTemplateSpec
 * pod模板创建参数
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.pod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * pod模板创建参数
 */
public class PodTemplateSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例类型；参考[文档](https://www.jdcloud.com/help/detail/1992/isCatalog/1)
     * Required:true
     */
    @Required
    private String instanceType;

    /**
     * pod中容器重启策略；Always, OnFailure, Never；默认：Always
     */
    private String restartPolicy;

    /**
     * 优雅关机宽限时长，如果超时，则触发强制关机。默认：30s，值不能是负数，范围：[0-300]
     */
    private Integer terminationGracePeriodSeconds;

    /**
     * pod内容器的/etc/resolv.conf配置
     */
    private DnsConfigSpec dnsConfig;

    /**
     * 容器日志配置信息；默认会在本地分配10MB的存储空间
     */
    private LogConfigSpec logConfig;

    /**
     * 域名和IP映射的信息；&lt;/br&gt; 最大10个alias
     */
    
    private List<HostAliasSpec> hostAliases;
    /**
     * Pod的volume列表，可以挂载到container上。长度范围：[0,7]
     */
    
    private List<PodTemplateVolumeSpec> volumes;
    /**
     * Pod的容器列表，至少一个容器。长度范围[1,8]
     * Required:true
     */
    @Required
    
    private List<PodTemplateContainerSpec> containers;
    /**
     * 主网卡主IP关联的弹性IP规格
     */
    private PodTemplateElasticIpSpec elasticIp;

    /**
     * 主网卡配置信息。
     * Required:true
     */
    @Required
    private PodTemplateNetworkInterfaceAttachmentSpec primaryNetworkInterface;

    /**
     * 辅助网卡配置信息。
     */
    
    private List<PodTemplateNetworkInterfaceAttachmentSpec> secondaryNetworkInterfaces;
    /**
     * 用户普通标签集合
     */
    
    private List<Tag> userTags;


    /**
     * get 实例类型；参考[文档](https://www.jdcloud.com/help/detail/1992/isCatalog/1)
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类型；参考[文档](https://www.jdcloud.com/help/detail/1992/isCatalog/1)
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }


    /**
     * get pod中容器重启策略；Always, OnFailure, Never；默认：Always
     *
     * @return
     */
    public String getRestartPolicy() {
        return restartPolicy;
    }

    /**
     * set pod中容器重启策略；Always, OnFailure, Never；默认：Always
     *
     * @param restartPolicy
     */
    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }


    /**
     * get 优雅关机宽限时长，如果超时，则触发强制关机。默认：30s，值不能是负数，范围：[0-300]
     *
     * @return
     */
    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    /**
     * set 优雅关机宽限时长，如果超时，则触发强制关机。默认：30s，值不能是负数，范围：[0-300]
     *
     * @param terminationGracePeriodSeconds
     */
    public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }


    /**
     * get pod内容器的/etc/resolv.conf配置
     *
     * @return
     */
    public DnsConfigSpec getDnsConfig() {
        return dnsConfig;
    }

    /**
     * set pod内容器的/etc/resolv.conf配置
     *
     * @param dnsConfig
     */
    public void setDnsConfig(DnsConfigSpec dnsConfig) {
        this.dnsConfig = dnsConfig;
    }


    /**
     * get 容器日志配置信息；默认会在本地分配10MB的存储空间
     *
     * @return
     */
    public LogConfigSpec getLogConfig() {
        return logConfig;
    }

    /**
     * set 容器日志配置信息；默认会在本地分配10MB的存储空间
     *
     * @param logConfig
     */
    public void setLogConfig(LogConfigSpec logConfig) {
        this.logConfig = logConfig;
    }


    /**
    * get 域名和IP映射的信息；&lt;/br&gt; 最大10个alias
    *
    * @return
    */
    public List<HostAliasSpec> getHostAliases() {
        return hostAliases;
    }

    /**
    * set 域名和IP映射的信息；&lt;/br&gt; 最大10个alias
    *
    * @param hostAliases
    */
    public void setHostAliases(List<HostAliasSpec> hostAliases) {
        this.hostAliases = hostAliases;
    }


    /**
    * get Pod的volume列表，可以挂载到container上。长度范围：[0,7]
    *
    * @return
    */
    public List<PodTemplateVolumeSpec> getVolumes() {
        return volumes;
    }

    /**
    * set Pod的volume列表，可以挂载到container上。长度范围：[0,7]
    *
    * @param volumes
    */
    public void setVolumes(List<PodTemplateVolumeSpec> volumes) {
        this.volumes = volumes;
    }


    /**
    * get Pod的容器列表，至少一个容器。长度范围[1,8]
    *
    * @return
    */
    public List<PodTemplateContainerSpec> getContainers() {
        return containers;
    }

    /**
    * set Pod的容器列表，至少一个容器。长度范围[1,8]
    *
    * @param containers
    */
    public void setContainers(List<PodTemplateContainerSpec> containers) {
        this.containers = containers;
    }


    /**
     * get 主网卡主IP关联的弹性IP规格
     *
     * @return
     */
    public PodTemplateElasticIpSpec getElasticIp() {
        return elasticIp;
    }

    /**
     * set 主网卡主IP关联的弹性IP规格
     *
     * @param elasticIp
     */
    public void setElasticIp(PodTemplateElasticIpSpec elasticIp) {
        this.elasticIp = elasticIp;
    }


    /**
     * get 主网卡配置信息。
     *
     * @return
     */
    public PodTemplateNetworkInterfaceAttachmentSpec getPrimaryNetworkInterface() {
        return primaryNetworkInterface;
    }

    /**
     * set 主网卡配置信息。
     *
     * @param primaryNetworkInterface
     */
    public void setPrimaryNetworkInterface(PodTemplateNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
    }


    /**
    * get 辅助网卡配置信息。
    *
    * @return
    */
    public List<PodTemplateNetworkInterfaceAttachmentSpec> getSecondaryNetworkInterfaces() {
        return secondaryNetworkInterfaces;
    }

    /**
    * set 辅助网卡配置信息。
    *
    * @param secondaryNetworkInterfaces
    */
    public void setSecondaryNetworkInterfaces(List<PodTemplateNetworkInterfaceAttachmentSpec> secondaryNetworkInterfaces) {
        this.secondaryNetworkInterfaces = secondaryNetworkInterfaces;
    }


    /**
    * get 用户普通标签集合
    *
    * @return
    */
    public List<Tag> getUserTags() {
        return userTags;
    }

    /**
    * set 用户普通标签集合
    *
    * @param userTags
    */
    public void setUserTags(List<Tag> userTags) {
        this.userTags = userTags;
    }



    /**
     * set 实例类型；参考[文档](https://www.jdcloud.com/help/detail/1992/isCatalog/1)
     *
     * @param instanceType
     */
    public PodTemplateSpec instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


    /**
     * set pod中容器重启策略；Always, OnFailure, Never；默认：Always
     *
     * @param restartPolicy
     */
    public PodTemplateSpec restartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }


    /**
     * set 优雅关机宽限时长，如果超时，则触发强制关机。默认：30s，值不能是负数，范围：[0-300]
     *
     * @param terminationGracePeriodSeconds
     */
    public PodTemplateSpec terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }


    /**
     * set pod内容器的/etc/resolv.conf配置
     *
     * @param dnsConfig
     */
    public PodTemplateSpec dnsConfig(DnsConfigSpec dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }


    /**
     * set 容器日志配置信息；默认会在本地分配10MB的存储空间
     *
     * @param logConfig
     */
    public PodTemplateSpec logConfig(LogConfigSpec logConfig) {
        this.logConfig = logConfig;
        return this;
    }


    /**
    * set 域名和IP映射的信息；&lt;/br&gt; 最大10个alias
    *
    * @param hostAliases
    */
    public PodTemplateSpec hostAliases(List<HostAliasSpec> hostAliases) {
        this.hostAliases = hostAliases;
        return this;
    }


    /**
    * set Pod的volume列表，可以挂载到container上。长度范围：[0,7]
    *
    * @param volumes
    */
    public PodTemplateSpec volumes(List<PodTemplateVolumeSpec> volumes) {
        this.volumes = volumes;
        return this;
    }


    /**
    * set Pod的容器列表，至少一个容器。长度范围[1,8]
    *
    * @param containers
    */
    public PodTemplateSpec containers(List<PodTemplateContainerSpec> containers) {
        this.containers = containers;
        return this;
    }


    /**
     * set 主网卡主IP关联的弹性IP规格
     *
     * @param elasticIp
     */
    public PodTemplateSpec elasticIp(PodTemplateElasticIpSpec elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }


    /**
     * set 主网卡配置信息。
     *
     * @param primaryNetworkInterface
     */
    public PodTemplateSpec primaryNetworkInterface(PodTemplateNetworkInterfaceAttachmentSpec primaryNetworkInterface) {
        this.primaryNetworkInterface = primaryNetworkInterface;
        return this;
    }


    /**
    * set 辅助网卡配置信息。
    *
    * @param secondaryNetworkInterfaces
    */
    public PodTemplateSpec secondaryNetworkInterfaces(List<PodTemplateNetworkInterfaceAttachmentSpec> secondaryNetworkInterfaces) {
        this.secondaryNetworkInterfaces = secondaryNetworkInterfaces;
        return this;
    }


    /**
    * set 用户普通标签集合
    *
    * @param userTags
    */
    public PodTemplateSpec userTags(List<Tag> userTags) {
        this.userTags = userTags;
        return this;
    }



    /**
     * add item to 域名和IP映射的信息；&lt;/br&gt; 最大10个alias
     *
     * @param hostAliase
     */
    public void addHostAliase(HostAliasSpec hostAliase) {
        if (this.hostAliases == null) {
            this.hostAliases = new ArrayList<>();
        }
        this.hostAliases.add(hostAliase);
    }

    /**
     * add item to Pod的volume列表，可以挂载到container上。长度范围：[0,7]
     *
     * @param volume
     */
    public void addVolume(PodTemplateVolumeSpec volume) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volume);
    }

    /**
     * add item to Pod的容器列表，至少一个容器。长度范围[1,8]
     *
     * @param container
     */
    public void addContainer(PodTemplateContainerSpec container) {
        if (this.containers == null) {
            this.containers = new ArrayList<>();
        }
        this.containers.add(container);
    }

    /**
     * add item to 辅助网卡配置信息。
     *
     * @param secondaryNetworkInterface
     */
    public void addSecondaryNetworkInterface(PodTemplateNetworkInterfaceAttachmentSpec secondaryNetworkInterface) {
        if (this.secondaryNetworkInterfaces == null) {
            this.secondaryNetworkInterfaces = new ArrayList<>();
        }
        this.secondaryNetworkInterfaces.add(secondaryNetworkInterface);
    }

    /**
     * add item to 用户普通标签集合
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