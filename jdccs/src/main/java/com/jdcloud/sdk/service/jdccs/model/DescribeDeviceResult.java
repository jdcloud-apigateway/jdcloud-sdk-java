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
 * Resource API
 * 云托管服务的资源API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdccs.model;

import com.jdcloud.sdk.service.jdccs.model.Device;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询设备详情
 */
public class DescribeDeviceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * device
     */
    private Device device;



    /**
     * get device
     *
     * @return
     */
    public Device getDevice() {
        return device;
    }

    /**
     * set device
     *
     * @param device
     */
    public void setDevice(Device device) {
        this.device = device;
    }



    /**
     * set device
     *
     * @param device
     */
    public DescribeDeviceResult device(Device device) {
        this.device = device;
        return this;
    }


}