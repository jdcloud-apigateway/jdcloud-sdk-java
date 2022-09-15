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
 * 规格详细信息
 */
public class FlavorDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 该规格的CPU核数
     */
    private Integer cpu;

    /**
     * 该规格的磁盘大小（GB)
     */
    private Integer diskGB;

    /**
     * 该规格的最大连接数
     */
    private Integer maxConnection;

    /**
     * 该规格的带宽（Mbps)
     */
    private Integer bandwidthMbps;



    /**
     * get 该规格的CPU核数
     *
     * @return
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * set 该规格的CPU核数
     *
     * @param cpu
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }


    /**
     * get 该规格的磁盘大小（GB)
     *
     * @return
     */
    public Integer getDiskGB() {
        return diskGB;
    }

    /**
     * set 该规格的磁盘大小（GB)
     *
     * @param diskGB
     */
    public void setDiskGB(Integer diskGB) {
        this.diskGB = diskGB;
    }


    /**
     * get 该规格的最大连接数
     *
     * @return
     */
    public Integer getMaxConnection() {
        return maxConnection;
    }

    /**
     * set 该规格的最大连接数
     *
     * @param maxConnection
     */
    public void setMaxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
    }


    /**
     * get 该规格的带宽（Mbps)
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 该规格的带宽（Mbps)
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }



    /**
     * set 该规格的CPU核数
     *
     * @param cpu
     */
    public FlavorDetail cpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }


    /**
     * set 该规格的磁盘大小（GB)
     *
     * @param diskGB
     */
    public FlavorDetail diskGB(Integer diskGB) {
        this.diskGB = diskGB;
        return this;
    }


    /**
     * set 该规格的最大连接数
     *
     * @param maxConnection
     */
    public FlavorDetail maxConnection(Integer maxConnection) {
        this.maxConnection = maxConnection;
        return this;
    }


    /**
     * set 该规格的带宽（Mbps)
     *
     * @param bandwidthMbps
     */
    public FlavorDetail bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }


}