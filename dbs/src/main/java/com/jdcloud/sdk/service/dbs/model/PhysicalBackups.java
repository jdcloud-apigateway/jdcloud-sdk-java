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

package com.jdcloud.sdk.service.dbs.model;


/**
 * physicalBackups
 */
public class PhysicalBackups  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 全量备份ID
     */
    private String backupId;

    /**
     * 备份开始时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     */
    private String backupStartTime;

    /**
     * 备份结束时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     */
    private String backupEndTime;

    /**
     * 备份到期时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     */
    private String backupExpiredTime;

    /**
     * 备份大小，单位：Byte
     */
    private Long sizeByte;

    /**
     * 是否手动触发的备份任务 0代表自动触发的备份 1代表手动触发的
     */
    private Integer isManual;

    /**
     * 备份状态 成功-COMPLETED  运行中-BUILDING  失败-ERROR
     */
    private String status;

    /**
     * 错误信息，仅sucess为false时返回
     */
    private String errorMessages;

    /**
     * 源数据库的连接地址，可以为IP或者域名
     */
    private String ip;

    /**
     * 源数据库的端口
     */
    private Integer port;


    /**
     * get 全量备份ID
     *
     * @return
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * set 全量备份ID
     *
     * @param backupId
     */
    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * get 备份开始时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getBackupStartTime() {
        return backupStartTime;
    }

    /**
     * set 备份开始时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param backupStartTime
     */
    public void setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
    }

    /**
     * get 备份结束时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getBackupEndTime() {
        return backupEndTime;
    }

    /**
     * set 备份结束时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param backupEndTime
     */
    public void setBackupEndTime(String backupEndTime) {
        this.backupEndTime = backupEndTime;
    }

    /**
     * get 备份到期时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getBackupExpiredTime() {
        return backupExpiredTime;
    }

    /**
     * set 备份到期时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param backupExpiredTime
     */
    public void setBackupExpiredTime(String backupExpiredTime) {
        this.backupExpiredTime = backupExpiredTime;
    }

    /**
     * get 备份大小，单位：Byte
     *
     * @return
     */
    public Long getSizeByte() {
        return sizeByte;
    }

    /**
     * set 备份大小，单位：Byte
     *
     * @param sizeByte
     */
    public void setSizeByte(Long sizeByte) {
        this.sizeByte = sizeByte;
    }

    /**
     * get 是否手动触发的备份任务 0代表自动触发的备份 1代表手动触发的
     *
     * @return
     */
    public Integer getIsManual() {
        return isManual;
    }

    /**
     * set 是否手动触发的备份任务 0代表自动触发的备份 1代表手动触发的
     *
     * @param isManual
     */
    public void setIsManual(Integer isManual) {
        this.isManual = isManual;
    }

    /**
     * get 备份状态 成功-COMPLETED  运行中-BUILDING  失败-ERROR
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 备份状态 成功-COMPLETED  运行中-BUILDING  失败-ERROR
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 错误信息，仅sucess为false时返回
     *
     * @return
     */
    public String getErrorMessages() {
        return errorMessages;
    }

    /**
     * set 错误信息，仅sucess为false时返回
     *
     * @param errorMessages
     */
    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    /**
     * get 源数据库的连接地址，可以为IP或者域名
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 源数据库的连接地址，可以为IP或者域名
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 源数据库的端口
     *
     * @return
     */
    public Integer getPort() {
        return port;
    }

    /**
     * set 源数据库的端口
     *
     * @param port
     */
    public void setPort(Integer port) {
        this.port = port;
    }


    /**
     * set 全量备份ID
     *
     * @param backupId
     */
    public PhysicalBackups backupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * set 备份开始时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param backupStartTime
     */
    public PhysicalBackups backupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }

    /**
     * set 备份结束时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param backupEndTime
     */
    public PhysicalBackups backupEndTime(String backupEndTime) {
        this.backupEndTime = backupEndTime;
        return this;
    }

    /**
     * set 备份到期时间，UTC时间格式：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param backupExpiredTime
     */
    public PhysicalBackups backupExpiredTime(String backupExpiredTime) {
        this.backupExpiredTime = backupExpiredTime;
        return this;
    }

    /**
     * set 备份大小，单位：Byte
     *
     * @param sizeByte
     */
    public PhysicalBackups sizeByte(Long sizeByte) {
        this.sizeByte = sizeByte;
        return this;
    }

    /**
     * set 是否手动触发的备份任务 0代表自动触发的备份 1代表手动触发的
     *
     * @param isManual
     */
    public PhysicalBackups isManual(Integer isManual) {
        this.isManual = isManual;
        return this;
    }

    /**
     * set 备份状态 成功-COMPLETED  运行中-BUILDING  失败-ERROR
     *
     * @param status
     */
    public PhysicalBackups status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 错误信息，仅sucess为false时返回
     *
     * @param errorMessages
     */
    public PhysicalBackups errorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }

    /**
     * set 源数据库的连接地址，可以为IP或者域名
     *
     * @param ip
     */
    public PhysicalBackups ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 源数据库的端口
     *
     * @param port
     */
    public PhysicalBackups port(Integer port) {
        this.port = port;
        return this;
    }


}