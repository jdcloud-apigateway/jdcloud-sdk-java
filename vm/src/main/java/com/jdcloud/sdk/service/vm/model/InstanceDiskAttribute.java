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
 * instanceDiskAttribute
 */
public class InstanceDiskAttribute  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 云硬盘ID
     */
    private String diskId;

    /**
     * 随云主机一起删除，删除主机时自动删除此磁盘，默认为false，本地盘(local)不能更改此值。
如果云主机中的数据盘(cloud)是包年包月计费方式，此参数不生效。
如果云主机中的数据盘(cloud)是共享型数据盘，此参数不生效。

     */
    private Boolean autoDelete;


    /**
     * get 云硬盘ID
     *
     * @return
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * get 随云主机一起删除，删除主机时自动删除此磁盘，默认为false，本地盘(local)不能更改此值。
如果云主机中的数据盘(cloud)是包年包月计费方式，此参数不生效。
如果云主机中的数据盘(cloud)是共享型数据盘，此参数不生效。

     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 随云主机一起删除，删除主机时自动删除此磁盘，默认为false，本地盘(local)不能更改此值。
如果云主机中的数据盘(cloud)是包年包月计费方式，此参数不生效。
如果云主机中的数据盘(cloud)是共享型数据盘，此参数不生效。

     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }


    /**
     * set 云硬盘ID
     *
     * @param diskId
     */
    public InstanceDiskAttribute diskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * set 随云主机一起删除，删除主机时自动删除此磁盘，默认为false，本地盘(local)不能更改此值。
如果云主机中的数据盘(cloud)是包年包月计费方式，此参数不生效。
如果云主机中的数据盘(cloud)是共享型数据盘，此参数不生效。

     *
     * @param autoDelete
     */
    public InstanceDiskAttribute autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }


}