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

package com.jdcloud.sdk.service.rocketmq.model;


/**
 * fipExposure
 */
public class FipExposure  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否开启floatingIp暴露
     */
    private Boolean enableFipExposure;

    /**
     * 带宽
     */
    private Integer bandwidthMbps;



    /**
     * get 是否开启floatingIp暴露
     *
     * @return
     */
    public Boolean getEnableFipExposure() {
        return enableFipExposure;
    }

    /**
     * set 是否开启floatingIp暴露
     *
     * @param enableFipExposure
     */
    public void setEnableFipExposure(Boolean enableFipExposure) {
        this.enableFipExposure = enableFipExposure;
    }


    /**
     * get 带宽
     *
     * @return
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /**
     * set 带宽
     *
     * @param bandwidthMbps
     */
    public void setBandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
    }



    /**
     * set 是否开启floatingIp暴露
     *
     * @param enableFipExposure
     */
    public FipExposure enableFipExposure(Boolean enableFipExposure) {
        this.enableFipExposure = enableFipExposure;
        return this;
    }


    /**
     * set 带宽
     *
     * @param bandwidthMbps
     */
    public FipExposure bandwidthMbps(Integer bandwidthMbps) {
        this.bandwidthMbps = bandwidthMbps;
        return this;
    }


}