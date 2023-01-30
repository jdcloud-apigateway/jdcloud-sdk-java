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

package com.jdcloud.sdk.service.starshield.model;


/**
 * cdnZoneBandwidth
 */
public class CdnZoneBandwidth  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 域名
     */
    private String zoneName;

    /**
     * 带宽峰值，单位bps（bit per second）
     */
    private Double maxBPS;

    /**
     * 带宽峰值的发生时间。值为时间戳对应的long值。
     */
    private Number maxBpsTs;

    /**
     * 总流量，单位Byte
     */
    private Double trafficSum;

    /**
     * 总请求量，单位次数
     */
    private Double requestSum;



    /**
     * get 域名
     *
     * @return
     */
    public String getZoneName() {
        return zoneName;
    }

    /**
     * set 域名
     *
     * @param zoneName
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }


    /**
     * get 带宽峰值，单位bps（bit per second）
     *
     * @return
     */
    public Double getMaxBPS() {
        return maxBPS;
    }

    /**
     * set 带宽峰值，单位bps（bit per second）
     *
     * @param maxBPS
     */
    public void setMaxBPS(Double maxBPS) {
        this.maxBPS = maxBPS;
    }


    /**
     * get 带宽峰值的发生时间。值为时间戳对应的long值。
     *
     * @return
     */
    public Number getMaxBpsTs() {
        return maxBpsTs;
    }

    /**
     * set 带宽峰值的发生时间。值为时间戳对应的long值。
     *
     * @param maxBpsTs
     */
    public void setMaxBpsTs(Number maxBpsTs) {
        this.maxBpsTs = maxBpsTs;
    }


    /**
     * get 总流量，单位Byte
     *
     * @return
     */
    public Double getTrafficSum() {
        return trafficSum;
    }

    /**
     * set 总流量，单位Byte
     *
     * @param trafficSum
     */
    public void setTrafficSum(Double trafficSum) {
        this.trafficSum = trafficSum;
    }


    /**
     * get 总请求量，单位次数
     *
     * @return
     */
    public Double getRequestSum() {
        return requestSum;
    }

    /**
     * set 总请求量，单位次数
     *
     * @param requestSum
     */
    public void setRequestSum(Double requestSum) {
        this.requestSum = requestSum;
    }



    /**
     * set 域名
     *
     * @param zoneName
     */
    public CdnZoneBandwidth zoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }


    /**
     * set 带宽峰值，单位bps（bit per second）
     *
     * @param maxBPS
     */
    public CdnZoneBandwidth maxBPS(Double maxBPS) {
        this.maxBPS = maxBPS;
        return this;
    }


    /**
     * set 带宽峰值的发生时间。值为时间戳对应的long值。
     *
     * @param maxBpsTs
     */
    public CdnZoneBandwidth maxBpsTs(Number maxBpsTs) {
        this.maxBpsTs = maxBpsTs;
        return this;
    }


    /**
     * set 总流量，单位Byte
     *
     * @param trafficSum
     */
    public CdnZoneBandwidth trafficSum(Double trafficSum) {
        this.trafficSum = trafficSum;
        return this;
    }


    /**
     * set 总请求量，单位次数
     *
     * @param requestSum
     */
    public CdnZoneBandwidth requestSum(Double requestSum) {
        this.requestSum = requestSum;
        return this;
    }


}