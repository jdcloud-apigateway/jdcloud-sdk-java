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

package com.jdcloud.sdk.service.tidb.model;


/**
 * replicationTask
 */
public class ReplicationTask  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 复制任务ID
     */
    private String taskId;

    /**
     * 目标实例类型
     */
    private String targetType;

    /**
     * 目标实例IP
     */
    private String targetIP;

    /**
     * 目标实例端口
     */
    private String targetPort;

    /**
     * 目标类型为TiDB或MySQL时，连接目标实例的用户名
     */
    private String targetUser;

    /**
     * Kafka的Topic
     */
    private String kafkaTopic;

    /**
     * Kafka的版本
     */
    private String kafkaVersion;

    /**
     * 目标实例备注说明
     */
    private String targetComment;

    /**
     * 任务状态
     */
    private String taskStatus;

    /**
     * 复制的起始时间
     */
    private String startTime;

    /**
     * Checkpoint时间
     */
    private String checkpointTime;

    /**
     * 任务创建时间
     */
    private String createTime;


    /**
     * get 复制任务ID
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 复制任务ID
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * get 目标实例类型
     *
     * @return
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * set 目标实例类型
     *
     * @param targetType
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    /**
     * get 目标实例IP
     *
     * @return
     */
    public String getTargetIP() {
        return targetIP;
    }

    /**
     * set 目标实例IP
     *
     * @param targetIP
     */
    public void setTargetIP(String targetIP) {
        this.targetIP = targetIP;
    }

    /**
     * get 目标实例端口
     *
     * @return
     */
    public String getTargetPort() {
        return targetPort;
    }

    /**
     * set 目标实例端口
     *
     * @param targetPort
     */
    public void setTargetPort(String targetPort) {
        this.targetPort = targetPort;
    }

    /**
     * get 目标类型为TiDB或MySQL时，连接目标实例的用户名
     *
     * @return
     */
    public String getTargetUser() {
        return targetUser;
    }

    /**
     * set 目标类型为TiDB或MySQL时，连接目标实例的用户名
     *
     * @param targetUser
     */
    public void setTargetUser(String targetUser) {
        this.targetUser = targetUser;
    }

    /**
     * get Kafka的Topic
     *
     * @return
     */
    public String getKafkaTopic() {
        return kafkaTopic;
    }

    /**
     * set Kafka的Topic
     *
     * @param kafkaTopic
     */
    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    /**
     * get Kafka的版本
     *
     * @return
     */
    public String getKafkaVersion() {
        return kafkaVersion;
    }

    /**
     * set Kafka的版本
     *
     * @param kafkaVersion
     */
    public void setKafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
    }

    /**
     * get 目标实例备注说明
     *
     * @return
     */
    public String getTargetComment() {
        return targetComment;
    }

    /**
     * set 目标实例备注说明
     *
     * @param targetComment
     */
    public void setTargetComment(String targetComment) {
        this.targetComment = targetComment;
    }

    /**
     * get 任务状态
     *
     * @return
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * set 任务状态
     *
     * @param taskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * get 复制的起始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 复制的起始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get Checkpoint时间
     *
     * @return
     */
    public String getCheckpointTime() {
        return checkpointTime;
    }

    /**
     * set Checkpoint时间
     *
     * @param checkpointTime
     */
    public void setCheckpointTime(String checkpointTime) {
        this.checkpointTime = checkpointTime;
    }

    /**
     * get 任务创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 任务创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 复制任务ID
     *
     * @param taskId
     */
    public ReplicationTask taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * set 目标实例类型
     *
     * @param targetType
     */
    public ReplicationTask targetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * set 目标实例IP
     *
     * @param targetIP
     */
    public ReplicationTask targetIP(String targetIP) {
        this.targetIP = targetIP;
        return this;
    }

    /**
     * set 目标实例端口
     *
     * @param targetPort
     */
    public ReplicationTask targetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    /**
     * set 目标类型为TiDB或MySQL时，连接目标实例的用户名
     *
     * @param targetUser
     */
    public ReplicationTask targetUser(String targetUser) {
        this.targetUser = targetUser;
        return this;
    }

    /**
     * set Kafka的Topic
     *
     * @param kafkaTopic
     */
    public ReplicationTask kafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }

    /**
     * set Kafka的版本
     *
     * @param kafkaVersion
     */
    public ReplicationTask kafkaVersion(String kafkaVersion) {
        this.kafkaVersion = kafkaVersion;
        return this;
    }

    /**
     * set 目标实例备注说明
     *
     * @param targetComment
     */
    public ReplicationTask targetComment(String targetComment) {
        this.targetComment = targetComment;
        return this;
    }

    /**
     * set 任务状态
     *
     * @param taskStatus
     */
    public ReplicationTask taskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * set 复制的起始时间
     *
     * @param startTime
     */
    public ReplicationTask startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set Checkpoint时间
     *
     * @param checkpointTime
     */
    public ReplicationTask checkpointTime(String checkpointTime) {
        this.checkpointTime = checkpointTime;
        return this;
    }

    /**
     * set 任务创建时间
     *
     * @param createTime
     */
    public ReplicationTask createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}