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

package com.jdcloud.sdk.service.vm.model;


/**
 * 云主机磁盘属性信息。
 */
public class InstanceDiskAttribute  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘ID。
     */
    private String diskId;

    /**
     * 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;（默认值）：不随实例删除。
     */
    private Boolean autoDelete;



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
     * get 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;（默认值）：不随实例删除。
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;（默认值）：不随实例删除。
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }



    /**
     * set 云硬盘ID。
     *
     * @param diskId
     */
    public InstanceDiskAttribute diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }


    /**
     * set 是否随实例一起删除，即删除实例时是否自动删除此磁盘。此参数仅对按配置计费的非多点挂载云硬盘生效。
&#x60;true&#x60;：随实例删除。
&#x60;false&#x60;（默认值）：不随实例删除。
     *
     * @param autoDelete
     */
    public InstanceDiskAttribute autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }


}