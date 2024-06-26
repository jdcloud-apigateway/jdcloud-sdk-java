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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 开放设备列表
 */
public class OpenDevices  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备编码
     */
    private String deviceCode;

    /**
     * 设备类型 cabinet机柜 frontCabinet列头柜 sensor温湿度传感器
     */
    private String deviceType;

    /**
     * 设备名称
     */
    private String deviceName;



    /**
     * get 设备编码
     *
     * @return
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * set 设备编码
     *
     * @param deviceCode
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }


    /**
     * get 设备类型 cabinet机柜 frontCabinet列头柜 sensor温湿度传感器
     *
     * @return
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * set 设备类型 cabinet机柜 frontCabinet列头柜 sensor温湿度传感器
     *
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
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
     * set 设备编码
     *
     * @param deviceCode
     */
    public OpenDevices deviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }


    /**
     * set 设备类型 cabinet机柜 frontCabinet列头柜 sensor温湿度传感器
     *
     * @param deviceType
     */
    public OpenDevices deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }


    /**
     * set 设备名称
     *
     * @param deviceName
     */
    public OpenDevices deviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }


}