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
 * instanceClassSpec
 */
public class InstanceClassSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节点角色 [broker]
     */
    private String role;

    /**
     * 节点规格代码
     */
    private String nodeClassCode;

    /**
     * 节点个数
     */
    private Integer nodeCount;

    /**
     * 磁盘类型规格代码
     */
    private String nodeDiskType;

    /**
     * 单节点磁盘大小单位GB
     */
    private Integer nodeDiskGB;

    /**
     * 副本数
     */
    private Integer replicaPerGroup;



    /**
     * get 节点角色 [broker]
     *
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     * set 节点角色 [broker]
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }


    /**
     * get 节点规格代码
     *
     * @return
     */
    public String getNodeClassCode() {
        return nodeClassCode;
    }

    /**
     * set 节点规格代码
     *
     * @param nodeClassCode
     */
    public void setNodeClassCode(String nodeClassCode) {
        this.nodeClassCode = nodeClassCode;
    }


    /**
     * get 节点个数
     *
     * @return
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * set 节点个数
     *
     * @param nodeCount
     */
    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }


    /**
     * get 磁盘类型规格代码
     *
     * @return
     */
    public String getNodeDiskType() {
        return nodeDiskType;
    }

    /**
     * set 磁盘类型规格代码
     *
     * @param nodeDiskType
     */
    public void setNodeDiskType(String nodeDiskType) {
        this.nodeDiskType = nodeDiskType;
    }


    /**
     * get 单节点磁盘大小单位GB
     *
     * @return
     */
    public Integer getNodeDiskGB() {
        return nodeDiskGB;
    }

    /**
     * set 单节点磁盘大小单位GB
     *
     * @param nodeDiskGB
     */
    public void setNodeDiskGB(Integer nodeDiskGB) {
        this.nodeDiskGB = nodeDiskGB;
    }


    /**
     * get 副本数
     *
     * @return
     */
    public Integer getReplicaPerGroup() {
        return replicaPerGroup;
    }

    /**
     * set 副本数
     *
     * @param replicaPerGroup
     */
    public void setReplicaPerGroup(Integer replicaPerGroup) {
        this.replicaPerGroup = replicaPerGroup;
    }



    /**
     * set 节点角色 [broker]
     *
     * @param role
     */
    public InstanceClassSpec role(String role) {
        this.role = role;
        return this;
    }


    /**
     * set 节点规格代码
     *
     * @param nodeClassCode
     */
    public InstanceClassSpec nodeClassCode(String nodeClassCode) {
        this.nodeClassCode = nodeClassCode;
        return this;
    }


    /**
     * set 节点个数
     *
     * @param nodeCount
     */
    public InstanceClassSpec nodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }


    /**
     * set 磁盘类型规格代码
     *
     * @param nodeDiskType
     */
    public InstanceClassSpec nodeDiskType(String nodeDiskType) {
        this.nodeDiskType = nodeDiskType;
        return this;
    }


    /**
     * set 单节点磁盘大小单位GB
     *
     * @param nodeDiskGB
     */
    public InstanceClassSpec nodeDiskGB(Integer nodeDiskGB) {
        this.nodeDiskGB = nodeDiskGB;
        return this;
    }


    /**
     * set 副本数
     *
     * @param replicaPerGroup
     */
    public InstanceClassSpec replicaPerGroup(Integer replicaPerGroup) {
        this.replicaPerGroup = replicaPerGroup;
        return this;
    }


}