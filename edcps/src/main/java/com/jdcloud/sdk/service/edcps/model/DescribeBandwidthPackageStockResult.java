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
 * Distributed-Cloud-Physical-Server
 * 分布式云物理服务器共享带宽操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询共享带宽库存
 */
public class DescribeBandwidthPackageStockResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域
     */
    private String region;

    /**
     * 可用带宽库存
     */
    private Integer availableBandwidth;

    /**
     * 可用额外上行带宽库存
     */
    private Integer availableExtraUplinkBandwidth;


    /**
     * get 地域
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 可用带宽库存
     *
     * @return
     */
    public Integer getAvailableBandwidth() {
        return availableBandwidth;
    }

    /**
     * set 可用带宽库存
     *
     * @param availableBandwidth
     */
    public void setAvailableBandwidth(Integer availableBandwidth) {
        this.availableBandwidth = availableBandwidth;
    }

    /**
     * get 可用额外上行带宽库存
     *
     * @return
     */
    public Integer getAvailableExtraUplinkBandwidth() {
        return availableExtraUplinkBandwidth;
    }

    /**
     * set 可用额外上行带宽库存
     *
     * @param availableExtraUplinkBandwidth
     */
    public void setAvailableExtraUplinkBandwidth(Integer availableExtraUplinkBandwidth) {
        this.availableExtraUplinkBandwidth = availableExtraUplinkBandwidth;
    }


    /**
     * set 地域
     *
     * @param region
     */
    public DescribeBandwidthPackageStockResult region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 可用带宽库存
     *
     * @param availableBandwidth
     */
    public DescribeBandwidthPackageStockResult availableBandwidth(Integer availableBandwidth) {
        this.availableBandwidth = availableBandwidth;
        return this;
    }

    /**
     * set 可用额外上行带宽库存
     *
     * @param availableExtraUplinkBandwidth
     */
    public DescribeBandwidthPackageStockResult availableExtraUplinkBandwidth(Integer availableExtraUplinkBandwidth) {
        this.availableExtraUplinkBandwidth = availableExtraUplinkBandwidth;
        return this;
    }


}