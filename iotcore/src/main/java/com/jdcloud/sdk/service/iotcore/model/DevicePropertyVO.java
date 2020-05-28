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

package com.jdcloud.sdk.service.iotcore.model;


/**
 * 设备属性控制
 */
public class DevicePropertyVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * {&quot;streamId1&quot;:&quot;value1&quot;,&quot;streamId2&quot;:2,&quot;streamId3&quot;:&quot;value3&quot;}
     */
    private Object cmd;

    /**
     * 设备标识ID
     */
    private String deviceId;

    /**
     * 物类型
     */
    private String thingTypeName;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 版本号
     */
    private Integer version;


    /**
     * get {&quot;streamId1&quot;:&quot;value1&quot;,&quot;streamId2&quot;:2,&quot;streamId3&quot;:&quot;value3&quot;}
     *
     * @return
     */
    public Object getCmd() {
        return cmd;
    }

    /**
     * set {&quot;streamId1&quot;:&quot;value1&quot;,&quot;streamId2&quot;:2,&quot;streamId3&quot;:&quot;value3&quot;}
     *
     * @param cmd
     */
    public void setCmd(Object cmd) {
        this.cmd = cmd;
    }

    /**
     * get 设备标识ID
     *
     * @return
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * set 设备标识ID
     *
     * @param deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * get 物类型
     *
     * @return
     */
    public String getThingTypeName() {
        return thingTypeName;
    }

    /**
     * set 物类型
     *
     * @param thingTypeName
     */
    public void setThingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
    }

    /**
     * get 设备名称
     *
     * @return
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * get 版本号
     *
     * @return
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * set 版本号
     *
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }


    /**
     * set {&quot;streamId1&quot;:&quot;value1&quot;,&quot;streamId2&quot;:2,&quot;streamId3&quot;:&quot;value3&quot;}
     *
     * @param cmd
     */
    public DevicePropertyVO cmd(Object cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * set 设备标识ID
     *
     * @param deviceId
     */
    public DevicePropertyVO deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * set 物类型
     *
     * @param thingTypeName
     */
    public DevicePropertyVO thingTypeName(String thingTypeName) {
        this.thingTypeName = thingTypeName;
        return this;
    }

    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public DevicePropertyVO deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    /**
     * set 版本号
     *
     * @param version
     */
    public DevicePropertyVO version(Integer version) {
        this.version = version;
        return this;
    }


}