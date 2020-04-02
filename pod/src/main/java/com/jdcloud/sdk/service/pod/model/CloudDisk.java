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

package com.jdcloud.sdk.service.pod.model;


/**
 * 容器系统盘配置
 */
public class CloudDisk  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * category
     */
    private String category;

    /**
     * 云盘ID。
     */
    private String volumeId;

    /**
     * 云盘快照ID。
     */
    private String snapshotId;

    /**
     * 云盘类型：hdd.std1,ssd.gp1,ssd.io1。
     */
    private String diskType;

    /**
     * 云盘size,单位 GB。
     */
    private Integer sizeGB;

    /**
     * 指定volume文件系统类型，目前支持[xfs, ext4]。
     */
    private String fsType;

    /**
     * 云盘的 iops 值，目前只有 ssd.io1 类型有效。
     */
    private Integer iops;

    /**
     * 是否随pod删除。
     */
    private Boolean autoDelete;


    /**
     * get category
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * set category
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * get 云盘ID。
     *
     * @return
     */
    public String getVolumeId() {
        return volumeId;
    }

    /**
     * set 云盘ID。
     *
     * @param volumeId
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * get 云盘快照ID。
     *
     * @return
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * set 云盘快照ID。
     *
     * @param snapshotId
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * get 云盘类型：hdd.std1,ssd.gp1,ssd.io1。
     *
     * @return
     */
    public String getDiskType() {
        return diskType;
    }

    /**
     * set 云盘类型：hdd.std1,ssd.gp1,ssd.io1。
     *
     * @param diskType
     */
    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    /**
     * get 云盘size,单位 GB。
     *
     * @return
     */
    public Integer getSizeGB() {
        return sizeGB;
    }

    /**
     * set 云盘size,单位 GB。
     *
     * @param sizeGB
     */
    public void setSizeGB(Integer sizeGB) {
        this.sizeGB = sizeGB;
    }

    /**
     * get 指定volume文件系统类型，目前支持[xfs, ext4]。
     *
     * @return
     */
    public String getFsType() {
        return fsType;
    }

    /**
     * set 指定volume文件系统类型，目前支持[xfs, ext4]。
     *
     * @param fsType
     */
    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    /**
     * get 云盘的 iops 值，目前只有 ssd.io1 类型有效。
     *
     * @return
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * set 云盘的 iops 值，目前只有 ssd.io1 类型有效。
     *
     * @param iops
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * get 是否随pod删除。
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 是否随pod删除。
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }


    /**
     * set category
     *
     * @param category
     */
    public CloudDisk category(String category) {
        this.category = category;
        return this;
    }

    /**
     * set 云盘ID。
     *
     * @param volumeId
     */
    public CloudDisk volumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * set 云盘快照ID。
     *
     * @param snapshotId
     */
    public CloudDisk snapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * set 云盘类型：hdd.std1,ssd.gp1,ssd.io1。
     *
     * @param diskType
     */
    public CloudDisk diskType(String diskType) {
        this.diskType = diskType;
        return this;
    }

    /**
     * set 云盘size,单位 GB。
     *
     * @param sizeGB
     */
    public CloudDisk sizeGB(Integer sizeGB) {
        this.sizeGB = sizeGB;
        return this;
    }

    /**
     * set 指定volume文件系统类型，目前支持[xfs, ext4]。
     *
     * @param fsType
     */
    public CloudDisk fsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    /**
     * set 云盘的 iops 值，目前只有 ssd.io1 类型有效。
     *
     * @param iops
     */
    public CloudDisk iops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * set 是否随pod删除。
     *
     * @param autoDelete
     */
    public CloudDisk autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }


}