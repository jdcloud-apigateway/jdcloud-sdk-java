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

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * elasticIpSpec
 */
public class ElasticIpSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 带宽, 范围[1,10240] 单位Mbps
     * Required:true
     */
    @Required
    private Integer bandwidth;

    /**
     * 额外上行带宽, 范围[0,10240] 单位Mbps
     */
    private Integer extraUplinkBandwidth;

    /**
     * 共享带宽ID, 选择加入共享带宽方式购买时必传
     */
    private String bandwidthPackageId;

    /**
     * 购买数量
     * Required:true
     */
    @Required
    private Integer count;

    /**
     * 计费配置
     * Required:true
     */
    @Required
    private ChargeSpec charge;


    /**
     * get 带宽, 范围[1,10240] 单位Mbps
     *
     * @return
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * set 带宽, 范围[1,10240] 单位Mbps
     *
     * @param bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * get 额外上行带宽, 范围[0,10240] 单位Mbps
     *
     * @return
     */
    public Integer getExtraUplinkBandwidth() {
        return extraUplinkBandwidth;
    }

    /**
     * set 额外上行带宽, 范围[0,10240] 单位Mbps
     *
     * @param extraUplinkBandwidth
     */
    public void setExtraUplinkBandwidth(Integer extraUplinkBandwidth) {
        this.extraUplinkBandwidth = extraUplinkBandwidth;
    }

    /**
     * get 共享带宽ID, 选择加入共享带宽方式购买时必传
     *
     * @return
     */
    public String getBandwidthPackageId() {
        return bandwidthPackageId;
    }

    /**
     * set 共享带宽ID, 选择加入共享带宽方式购买时必传
     *
     * @param bandwidthPackageId
     */
    public void setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
    }

    /**
     * get 购买数量
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 购买数量
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * get 计费配置
     *
     * @return
     */
    public ChargeSpec getCharge() {
        return charge;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public void setCharge(ChargeSpec charge) {
        this.charge = charge;
    }


    /**
     * set 带宽, 范围[1,10240] 单位Mbps
     *
     * @param bandwidth
     */
    public ElasticIpSpec bandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * set 额外上行带宽, 范围[0,10240] 单位Mbps
     *
     * @param extraUplinkBandwidth
     */
    public ElasticIpSpec extraUplinkBandwidth(Integer extraUplinkBandwidth) {
        this.extraUplinkBandwidth = extraUplinkBandwidth;
        return this;
    }

    /**
     * set 共享带宽ID, 选择加入共享带宽方式购买时必传
     *
     * @param bandwidthPackageId
     */
    public ElasticIpSpec bandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }

    /**
     * set 购买数量
     *
     * @param count
     */
    public ElasticIpSpec count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public ElasticIpSpec charge(ChargeSpec charge) {
        this.charge = charge;
        return this;
    }


}