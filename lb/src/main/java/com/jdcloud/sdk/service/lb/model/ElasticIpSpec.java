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

package com.jdcloud.sdk.service.lb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;

/**
 * elasticIpSpec
 */
public class ElasticIpSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 弹性公网IP的限速（单位：Mbps），取值范围为[1-200]
     * Required:true
     */
    @Required
    private Integer bandwidth;

    /**
     * IP服务商，取值为bgp或no_bgp &lt;br&gt;【cn-north-1】：bgp； &lt;br&gt;【cn-south-1】：bgp； &lt;br&gt;【cn-east-1】：bgp； &lt;br&gt;【cn-east-2】：bgp
     * Required:true
     */
    @Required
    private String provider;

    /**
     * 计费配置
     */
    private ChargeSpec chargeSpec;



    /**
     * get 弹性公网IP的限速（单位：Mbps），取值范围为[1-200]
     *
     * @return
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    /**
     * set 弹性公网IP的限速（单位：Mbps），取值范围为[1-200]
     *
     * @param bandwidth
     */
    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }


    /**
     * get IP服务商，取值为bgp或no_bgp &lt;br&gt;【cn-north-1】：bgp； &lt;br&gt;【cn-south-1】：bgp； &lt;br&gt;【cn-east-1】：bgp； &lt;br&gt;【cn-east-2】：bgp
     *
     * @return
     */
    public String getProvider() {
        return provider;
    }

    /**
     * set IP服务商，取值为bgp或no_bgp &lt;br&gt;【cn-north-1】：bgp； &lt;br&gt;【cn-south-1】：bgp； &lt;br&gt;【cn-east-1】：bgp； &lt;br&gt;【cn-east-2】：bgp
     *
     * @param provider
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }


    /**
     * get 计费配置
     *
     * @return
     */
    public ChargeSpec getChargeSpec() {
        return chargeSpec;
    }

    /**
     * set 计费配置
     *
     * @param chargeSpec
     */
    public void setChargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
    }



    /**
     * set 弹性公网IP的限速（单位：Mbps），取值范围为[1-200]
     *
     * @param bandwidth
     */
    public ElasticIpSpec bandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }


    /**
     * set IP服务商，取值为bgp或no_bgp &lt;br&gt;【cn-north-1】：bgp； &lt;br&gt;【cn-south-1】：bgp； &lt;br&gt;【cn-east-1】：bgp； &lt;br&gt;【cn-east-2】：bgp
     *
     * @param provider
     */
    public ElasticIpSpec provider(String provider) {
        this.provider = provider;
        return this;
    }


    /**
     * set 计费配置
     *
     * @param chargeSpec
     */
    public ElasticIpSpec chargeSpec(ChargeSpec chargeSpec) {
        this.chargeSpec = chargeSpec;
        return this;
    }


}