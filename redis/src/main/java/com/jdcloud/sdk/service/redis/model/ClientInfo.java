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

package com.jdcloud.sdk.service.redis.model;


/**
 * 客户端信息
 */
public class ClientInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * 客户端版本号
     */
    private String version;

    /**
     * 客户端ip
     */
    private String ip;

    /**
     * 进程pid/tid/随机数
     */
    private String pid;

    /**
     * UUID
     */
    private String uuid;

    /**
     * 客户端启动时间
     */
    private String startTime;


    /**
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 客户端版本号
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 客户端版本号
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 客户端ip
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 客户端ip
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 进程pid/tid/随机数
     *
     * @return
     */
    public String getPid() {
        return pid;
    }

    /**
     * set 进程pid/tid/随机数
     *
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * get UUID
     *
     * @return
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * set UUID
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * get 客户端启动时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 客户端启动时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public ClientInfo instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 客户端版本号
     *
     * @param version
     */
    public ClientInfo version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 客户端ip
     *
     * @param ip
     */
    public ClientInfo ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 进程pid/tid/随机数
     *
     * @param pid
     */
    public ClientInfo pid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * set UUID
     *
     * @param uuid
     */
    public ClientInfo uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set 客户端启动时间
     *
     * @param startTime
     */
    public ClientInfo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


}