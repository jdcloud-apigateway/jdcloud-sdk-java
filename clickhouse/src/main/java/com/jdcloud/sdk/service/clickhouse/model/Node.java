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

package com.jdcloud.sdk.service.clickhouse.model;


/**
 * node
 */
public class Node  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节点ID
     */
    private String nodeId;

    /**
     * 节点序号，格式为“分片序号-副本序号”，分片序号和副本序号都是从0开始。例如，节点序号：&quot;0-0&quot;，表示该节点位于分片0，副本0上
     */
    private String nodeSeqNo;

    /**
     * 节点状态
     */
    private String nodeStatus;

    /**
     * CPU 使用百分比
     */
    private Float cpuUtil;

    /**
     * 内存使用百分比
     */
    private Float memeryUtil;

    /**
     * 存储使用百分比
     */
    private Float diskUsage;


    /**
     * get 节点ID
     *
     * @return
     */
    public String getNodeId() {
        return nodeId;
    }

    /**
     * set 节点ID
     *
     * @param nodeId
     */
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * get 节点序号，格式为“分片序号-副本序号”，分片序号和副本序号都是从0开始。例如，节点序号：&quot;0-0&quot;，表示该节点位于分片0，副本0上
     *
     * @return
     */
    public String getNodeSeqNo() {
        return nodeSeqNo;
    }

    /**
     * set 节点序号，格式为“分片序号-副本序号”，分片序号和副本序号都是从0开始。例如，节点序号：&quot;0-0&quot;，表示该节点位于分片0，副本0上
     *
     * @param nodeSeqNo
     */
    public void setNodeSeqNo(String nodeSeqNo) {
        this.nodeSeqNo = nodeSeqNo;
    }

    /**
     * get 节点状态
     *
     * @return
     */
    public String getNodeStatus() {
        return nodeStatus;
    }

    /**
     * set 节点状态
     *
     * @param nodeStatus
     */
    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    /**
     * get CPU 使用百分比
     *
     * @return
     */
    public Float getCpuUtil() {
        return cpuUtil;
    }

    /**
     * set CPU 使用百分比
     *
     * @param cpuUtil
     */
    public void setCpuUtil(Float cpuUtil) {
        this.cpuUtil = cpuUtil;
    }

    /**
     * get 内存使用百分比
     *
     * @return
     */
    public Float getMemeryUtil() {
        return memeryUtil;
    }

    /**
     * set 内存使用百分比
     *
     * @param memeryUtil
     */
    public void setMemeryUtil(Float memeryUtil) {
        this.memeryUtil = memeryUtil;
    }

    /**
     * get 存储使用百分比
     *
     * @return
     */
    public Float getDiskUsage() {
        return diskUsage;
    }

    /**
     * set 存储使用百分比
     *
     * @param diskUsage
     */
    public void setDiskUsage(Float diskUsage) {
        this.diskUsage = diskUsage;
    }


    /**
     * set 节点ID
     *
     * @param nodeId
     */
    public Node nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * set 节点序号，格式为“分片序号-副本序号”，分片序号和副本序号都是从0开始。例如，节点序号：&quot;0-0&quot;，表示该节点位于分片0，副本0上
     *
     * @param nodeSeqNo
     */
    public Node nodeSeqNo(String nodeSeqNo) {
        this.nodeSeqNo = nodeSeqNo;
        return this;
    }

    /**
     * set 节点状态
     *
     * @param nodeStatus
     */
    public Node nodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }

    /**
     * set CPU 使用百分比
     *
     * @param cpuUtil
     */
    public Node cpuUtil(Float cpuUtil) {
        this.cpuUtil = cpuUtil;
        return this;
    }

    /**
     * set 内存使用百分比
     *
     * @param memeryUtil
     */
    public Node memeryUtil(Float memeryUtil) {
        this.memeryUtil = memeryUtil;
        return this;
    }

    /**
     * set 存储使用百分比
     *
     * @param diskUsage
     */
    public Node diskUsage(Float diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }


}