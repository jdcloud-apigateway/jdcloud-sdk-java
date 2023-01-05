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
 * 云主机
 * 与主机操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
为一台云主机缷载云硬盘

详细操作说明请参考帮助文档：[缷载云硬盘](https://docs.jdcloud.com/cn/virtual-machines/detach-cloud-disk)

## 接口说明
- 云主机和云硬盘都没有正在进行中的的任务时才可以操作。
- 云主机状态必须是 &#x60;running&#x60; 或 &#x60;stopped&#x60; 状态。操作系统盘时必须先停止实例。

 */
public class DetachDiskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘ID。
     * Required:true
     */
    @Required
    private String diskId;

    /**
     * 是否强制缷载，默认False。
如果此参数传值为True，数据盘的IO会被强制断掉。

     */
    private Boolean force;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云主机ID。
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 云硬盘ID。
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 云硬盘ID。
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }


    /**
     * get 是否强制缷载，默认False。
如果此参数传值为True，数据盘的IO会被强制断掉。

     *
     * @return
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * set 是否强制缷载，默认False。
如果此参数传值为True，数据盘的IO会被强制断掉。

     *
     * @param force
     */
    public void setForce(Boolean force) {
        this.force = force;
    }


    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 云主机ID。
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 云硬盘ID。
     *
     * @param diskId
     */
    public DetachDiskRequest diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }


    /**
     * set 是否强制缷载，默认False。
如果此参数传值为True，数据盘的IO会被强制断掉。

     *
     * @param force
     */
    public DetachDiskRequest force(Boolean force) {
        this.force = force;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public DetachDiskRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 云主机ID。
     *
     * @param instanceId
     */
    public DetachDiskRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}