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


/**
 * flavorConfig
 */
public class FlavorConfig  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指定规格是否售卖
     */
    private Boolean onSale;

    /**
     * 规格代码
     */
    private String instanceClassCode;

    /**
     * 指定规格表示的cpu核数
     */
    private Integer cpu;

    /**
     * 指定规格表示的内存
     */
    private Integer memoryGB;

    /**
     * 存储配置(是不是云盘、本地盘的大小、云盘的最小值、最大值、默认值、步长)
     */
    private StorageLimit storageLimit;

    /**
     * 节点个数配置(节点个数最小值、最大值、默认值、步长)
     */
    private NodeCountLimit nodeCountLimit;

    /**
     * 副本组个数配置(副本组个数最小值、最大值、默认值、步长)
     */
    private ReplicaPeGroupLimit replicaPeGroupLimit;



    /**
     * get 指定规格是否售卖
     *
     * @return
     */
    public Boolean getOnSale() {
        return onSale;
    }

    /**
     * set 指定规格是否售卖
     *
     * @param onSale
     */
    public void setOnSale(Boolean onSale) {
        this.onSale = onSale;
    }


    /**
     * get 规格代码
     *
     * @return
     */
    public String getInstanceClassCode() {
        return instanceClassCode;
    }

    /**
     * set 规格代码
     *
     * @param instanceClassCode
     */
    public void setInstanceClassCode(String instanceClassCode) {
        this.instanceClassCode = instanceClassCode;
    }


    /**
     * get 指定规格表示的cpu核数
     *
     * @return
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * set 指定规格表示的cpu核数
     *
     * @param cpu
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }


    /**
     * get 指定规格表示的内存
     *
     * @return
     */
    public Integer getMemoryGB() {
        return memoryGB;
    }

    /**
     * set 指定规格表示的内存
     *
     * @param memoryGB
     */
    public void setMemoryGB(Integer memoryGB) {
        this.memoryGB = memoryGB;
    }


    /**
     * get 存储配置(是不是云盘、本地盘的大小、云盘的最小值、最大值、默认值、步长)
     *
     * @return
     */
    public StorageLimit getStorageLimit() {
        return storageLimit;
    }

    /**
     * set 存储配置(是不是云盘、本地盘的大小、云盘的最小值、最大值、默认值、步长)
     *
     * @param storageLimit
     */
    public void setStorageLimit(StorageLimit storageLimit) {
        this.storageLimit = storageLimit;
    }


    /**
     * get 节点个数配置(节点个数最小值、最大值、默认值、步长)
     *
     * @return
     */
    public NodeCountLimit getNodeCountLimit() {
        return nodeCountLimit;
    }

    /**
     * set 节点个数配置(节点个数最小值、最大值、默认值、步长)
     *
     * @param nodeCountLimit
     */
    public void setNodeCountLimit(NodeCountLimit nodeCountLimit) {
        this.nodeCountLimit = nodeCountLimit;
    }


    /**
     * get 副本组个数配置(副本组个数最小值、最大值、默认值、步长)
     *
     * @return
     */
    public ReplicaPeGroupLimit getReplicaPeGroupLimit() {
        return replicaPeGroupLimit;
    }

    /**
     * set 副本组个数配置(副本组个数最小值、最大值、默认值、步长)
     *
     * @param replicaPeGroupLimit
     */
    public void setReplicaPeGroupLimit(ReplicaPeGroupLimit replicaPeGroupLimit) {
        this.replicaPeGroupLimit = replicaPeGroupLimit;
    }



    /**
     * set 指定规格是否售卖
     *
     * @param onSale
     */
    public FlavorConfig onSale(Boolean onSale) {
        this.onSale = onSale;
        return this;
    }


    /**
     * set 规格代码
     *
     * @param instanceClassCode
     */
    public FlavorConfig instanceClassCode(String instanceClassCode) {
        this.instanceClassCode = instanceClassCode;
        return this;
    }


    /**
     * set 指定规格表示的cpu核数
     *
     * @param cpu
     */
    public FlavorConfig cpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }


    /**
     * set 指定规格表示的内存
     *
     * @param memoryGB
     */
    public FlavorConfig memoryGB(Integer memoryGB) {
        this.memoryGB = memoryGB;
        return this;
    }


    /**
     * set 存储配置(是不是云盘、本地盘的大小、云盘的最小值、最大值、默认值、步长)
     *
     * @param storageLimit
     */
    public FlavorConfig storageLimit(StorageLimit storageLimit) {
        this.storageLimit = storageLimit;
        return this;
    }


    /**
     * set 节点个数配置(节点个数最小值、最大值、默认值、步长)
     *
     * @param nodeCountLimit
     */
    public FlavorConfig nodeCountLimit(NodeCountLimit nodeCountLimit) {
        this.nodeCountLimit = nodeCountLimit;
        return this;
    }


    /**
     * set 副本组个数配置(副本组个数最小值、最大值、默认值、步长)
     *
     * @param replicaPeGroupLimit
     */
    public FlavorConfig replicaPeGroupLimit(ReplicaPeGroupLimit replicaPeGroupLimit) {
        this.replicaPeGroupLimit = replicaPeGroupLimit;
        return this;
    }


}