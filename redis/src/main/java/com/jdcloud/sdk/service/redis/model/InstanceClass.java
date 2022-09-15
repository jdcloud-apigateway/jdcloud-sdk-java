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
 * 缓存Redis实例的规格信息
 */
public class InstanceClass  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规格代码：redis 2.8与redis 4.0的规格码不同，具体参考 https://docs.jdcloud.com/cn/jcs-for-redis/specifications
     */
    private String instanceClass;

    /**
     * 规格类型：master-slave表示主从版，cluster表示集群版
     */
    private String instanceType;

    /**
     * cpu核数
     */
    private Integer cpu;

    /**
     * 内存总容量（MB）
     */
    private Integer memoryMB;

    /**
     * 磁盘总容量（GB）
     */
    private Integer diskGB;

    /**
     * 最大连接数
     */
    private Integer maxConnection;

    /**
     * 内网带宽（MBps）
     */
    private Integer bandwidthMbps;



    /**
     * get 规格代码：redis 2.8与redis 4.0的规格码不同，具体参考 https://docs.jdcloud.com/cn/jcs-for-redis/specifications
     *
     * @return
     */
    public String getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 规格代码：redis 2.8与redis 4.0的规格码不同，具体参考 https://docs.jdcloud.com/cn/jcs-for-redis/specifications
     *
     * @param instanceClass
     */
    public void setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
    }


    /**
     * get 规格类型：master-slave表示主从版，cluster表示集群版
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 规格类型：master-slave表示主从版，cluster表示集群版
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }


    /**
     * get cpu核数
     *
     * @return
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * set cpu核数
     *
     * @param cpu
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }


    /**
     * get 内存总容量（MB）
     *
     * @return
     */
    public Integer getMemoryMB() {
        return memoryMB;
    }

    /**
     * set 内存总容量（MB）
     *
     * @param memoryMB
     */
    public void setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
    }


    /**
     * get 磁盘总容量（GB）
     *
     * @return
     */
    public Integer getDiskGB() {
        return diskGB;
    }

    /**
     * set 磁盘总容量（GB）
     *
     * @param diskGB
     */
    public void setDiskGB(Integer diskGB) {
        this.diskGB = diskGB;
    }


    /**
     * get 最大连接数
     *
     * @return
     */
    public Integer getMaxConnection() {
        return maxConnection;
    }

    /**
     * set 最大连接数
     *
     * @param maxConnection
     */
    public void setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
    }


    /**
     * get 内网带宽（MBps）
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 内网带宽（MBps）
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }



    /**
     * set 规格代码：redis 2.8与redis 4.0的规格码不同，具体参考 https://docs.jdcloud.com/cn/jcs-for-redis/specifications
     *
     * @param instanceClass
     */
    public InstanceClass instanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }


    /**
     * set 规格类型：master-slave表示主从版，cluster表示集群版
     *
     * @param instanceType
     */
    public InstanceClass instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


    /**
     * set cpu核数
     *
     * @param cpu
     */
    public InstanceClass cpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }


    /**
     * set 内存总容量（MB）
     *
     * @param memoryMB
     */
    public InstanceClass memoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }


    /**
     * set 磁盘总容量（GB）
     *
     * @param diskGB
     */
    public InstanceClass diskGB(Integer diskGB) {
        this.diskGB = diskGB;
        return this;
    }


    /**
     * set 最大连接数
     *
     * @param maxConnection
     */
    public InstanceClass maxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }


    /**
     * set 内网带宽（MBps）
     *
     * @param bandwidthMbps
     */
    public InstanceClass bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }


}