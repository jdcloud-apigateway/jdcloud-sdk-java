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

package com.jdcloud.sdk.service.assistant.model;


/**
 * 用户自定义命令
 */
public class Assistant  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云助手版本
     */
    private String version;

    /**
     * 云助手运行状态
     */
    private String status;

    /**
     * 云主机的操作系统类型
     */
    private String osType;

    /**
     * 云主机的操作系统版本
     */
    private String osVersion;

    /**
     * 云主机Id
     */
    private String instanceId;

    /**
     * 最近一次心跳时间
     */
    private String lastHeartBeat;



    /**
     * get 云助手版本
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 云助手版本
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }


    /**
     * get 云助手运行状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 云助手运行状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 云主机的操作系统类型
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 云主机的操作系统类型
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }


    /**
     * get 云主机的操作系统版本
     *
     * @return
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * set 云主机的操作系统版本
     *
     * @param osVersion
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }


    /**
     * get 云主机Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 最近一次心跳时间
     *
     * @return
     */
    public String getLastHeartBeat() {
        return lastHeartBeat;
    }

    /**
     * set 最近一次心跳时间
     *
     * @param lastHeartBeat
     */
    public void setLastHeartBeat(String lastHeartBeat) {
        this.lastHeartBeat = lastHeartBeat;
    }



    /**
     * set 云助手版本
     *
     * @param version
     */
    public Assistant version(String version) {
        this.version = version;
        return this;
    }


    /**
     * set 云助手运行状态
     *
     * @param status
     */
    public Assistant status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 云主机的操作系统类型
     *
     * @param osType
     */
    public Assistant osType(String osType) {
        this.osType = osType;
        return this;
    }


    /**
     * set 云主机的操作系统版本
     *
     * @param osVersion
     */
    public Assistant osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }


    /**
     * set 云主机Id
     *
     * @param instanceId
     */
    public Assistant instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 最近一次心跳时间
     *
     * @param lastHeartBeat
     */
    public Assistant lastHeartBeat(String lastHeartBeat) {
        this.lastHeartBeat = lastHeartBeat;
        return this;
    }


}