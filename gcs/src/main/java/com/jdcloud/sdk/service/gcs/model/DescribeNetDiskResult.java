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
 * GPU-Computing-Service
 * GPU算力服务网盘相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.gcs.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询网盘信息
 */
public class DescribeNetDiskResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 已开通 yes,否则 no
     */
    private String open;

    /**
     * 用量数值，单位Byte
     */
    private Long bytesUsed;

    /**
     * 总量数值，单位Byte
     */
    private Long bytesQuota;

    /**
     * 命名空间
     */
    private String namespace;

    /**
     * 网盘UUID
     */
    private String netdiskId;

    /**
     * 可用区
     */
    private String az;

    /**
     * 网盘pvc名称
     */
    private String pvcName;

    /**
     * 网盘类型 ceph
     */
    private String netType;

    /**
     * 网盘挂载路径
     */
    private String pvPath;

    /**
     * 网盘在网络存储中地址
     */
    private String netVolumeName;

    /**
     * 网盘在网络存储中物理路径
     */
    private String netVolumePath;

    /**
     * 网盘大小，G
     */
    private Integer storage;



    /**
     * get 已开通 yes,否则 no
     *
     * @return
     */
    public String getOpen() {
        return open;
    }

    /**
     * set 已开通 yes,否则 no
     *
     * @param open
     */
    public void setOpen(String open) {
        this.open = open;
    }


    /**
     * get 用量数值，单位Byte
     *
     * @return
     */
    public Long getBytesUsed() {
        return bytesUsed;
    }

    /**
     * set 用量数值，单位Byte
     *
     * @param bytesUsed
     */
    public void setBytesUsed(Long bytesUsed) {
        this.bytesUsed = bytesUsed;
    }


    /**
     * get 总量数值，单位Byte
     *
     * @return
     */
    public Long getBytesQuota() {
        return bytesQuota;
    }

    /**
     * set 总量数值，单位Byte
     *
     * @param bytesQuota
     */
    public void setBytesQuota(Long bytesQuota) {
        this.bytesQuota = bytesQuota;
    }


    /**
     * get 命名空间
     *
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * set 命名空间
     *
     * @param namespace
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }


    /**
     * get 网盘UUID
     *
     * @return
     */
    public String getNetdiskId() {
        return netdiskId;
    }

    /**
     * set 网盘UUID
     *
     * @param netdiskId
     */
    public void setNetdiskId(String netdiskId) {
        this.netdiskId = netdiskId;
    }


    /**
     * get 可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }


    /**
     * get 网盘pvc名称
     *
     * @return
     */
    public String getPvcName() {
        return pvcName;
    }

    /**
     * set 网盘pvc名称
     *
     * @param pvcName
     */
    public void setPvcName(String pvcName) {
        this.pvcName = pvcName;
    }


    /**
     * get 网盘类型 ceph
     *
     * @return
     */
    public String getNetType() {
        return netType;
    }

    /**
     * set 网盘类型 ceph
     *
     * @param netType
     */
    public void setNetType(String netType) {
        this.netType = netType;
    }


    /**
     * get 网盘挂载路径
     *
     * @return
     */
    public String getPvPath() {
        return pvPath;
    }

    /**
     * set 网盘挂载路径
     *
     * @param pvPath
     */
    public void setPvPath(String pvPath) {
        this.pvPath = pvPath;
    }


    /**
     * get 网盘在网络存储中地址
     *
     * @return
     */
    public String getNetVolumeName() {
        return netVolumeName;
    }

    /**
     * set 网盘在网络存储中地址
     *
     * @param netVolumeName
     */
    public void setNetVolumeName(String netVolumeName) {
        this.netVolumeName = netVolumeName;
    }


    /**
     * get 网盘在网络存储中物理路径
     *
     * @return
     */
    public String getNetVolumePath() {
        return netVolumePath;
    }

    /**
     * set 网盘在网络存储中物理路径
     *
     * @param netVolumePath
     */
    public void setNetVolumePath(String netVolumePath) {
        this.netVolumePath = netVolumePath;
    }


    /**
     * get 网盘大小，G
     *
     * @return
     */
    public Integer getStorage() {
        return storage;
    }

    /**
     * set 网盘大小，G
     *
     * @param storage
     */
    public void setStorage(Integer storage) {
        this.storage = storage;
    }



    /**
     * set 已开通 yes,否则 no
     *
     * @param open
     */
    public DescribeNetDiskResult open(String open) {
        this.open = open;
        return this;
    }


    /**
     * set 用量数值，单位Byte
     *
     * @param bytesUsed
     */
    public DescribeNetDiskResult bytesUsed(Long bytesUsed) {
        this.bytesUsed = bytesUsed;
        return this;
    }


    /**
     * set 总量数值，单位Byte
     *
     * @param bytesQuota
     */
    public DescribeNetDiskResult bytesQuota(Long bytesQuota) {
        this.bytesQuota = bytesQuota;
        return this;
    }


    /**
     * set 命名空间
     *
     * @param namespace
     */
    public DescribeNetDiskResult namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }


    /**
     * set 网盘UUID
     *
     * @param netdiskId
     */
    public DescribeNetDiskResult netdiskId(String netdiskId) {
        this.netdiskId = netdiskId;
        return this;
    }


    /**
     * set 可用区
     *
     * @param az
     */
    public DescribeNetDiskResult az(String az) {
        this.az = az;
        return this;
    }


    /**
     * set 网盘pvc名称
     *
     * @param pvcName
     */
    public DescribeNetDiskResult pvcName(String pvcName) {
        this.pvcName = pvcName;
        return this;
    }


    /**
     * set 网盘类型 ceph
     *
     * @param netType
     */
    public DescribeNetDiskResult netType(String netType) {
        this.netType = netType;
        return this;
    }


    /**
     * set 网盘挂载路径
     *
     * @param pvPath
     */
    public DescribeNetDiskResult pvPath(String pvPath) {
        this.pvPath = pvPath;
        return this;
    }


    /**
     * set 网盘在网络存储中地址
     *
     * @param netVolumeName
     */
    public DescribeNetDiskResult netVolumeName(String netVolumeName) {
        this.netVolumeName = netVolumeName;
        return this;
    }


    /**
     * set 网盘在网络存储中物理路径
     *
     * @param netVolumePath
     */
    public DescribeNetDiskResult netVolumePath(String netVolumePath) {
        this.netVolumePath = netVolumePath;
        return this;
    }


    /**
     * set 网盘大小，G
     *
     * @param storage
     */
    public DescribeNetDiskResult storage(Integer storage) {
        this.storage = storage;
        return this;
    }


}