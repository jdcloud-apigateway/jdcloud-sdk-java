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

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * opModifyNatGatewaySpec
 */
public class OpModifyNatGatewaySpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网IP的限速（单位：Mbps），取值范围为[1-4000]
     * Required:true
     */
    @Required
    private Integer bandwidthMbps;

    /**
     * 资源所属的用户pin
     * Required:true
     */
    @Required
    private String userPin;



    /**
     * get 公网IP的限速（单位：Mbps），取值范围为[1-4000]
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 公网IP的限速（单位：Mbps），取值范围为[1-4000]
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }


    /**
     * get 资源所属的用户pin
     *
     * @return
     */
    public String getUserPin() {
        return userPin;
    }

    /**
     * set 资源所属的用户pin
     *
     * @param userPin
     */
    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }



    /**
     * set 公网IP的限速（单位：Mbps），取值范围为[1-4000]
     *
     * @param bandwidthMbps
     */
    public OpModifyNatGatewaySpec bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }


    /**
     * set 资源所属的用户pin
     *
     * @param userPin
     */
    public OpModifyNatGatewaySpec userPin(String userPin) {
        this.userPin = userPin;
        return this;
    }


}