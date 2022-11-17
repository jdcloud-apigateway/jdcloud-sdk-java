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
 * Iotlink-Related-API
 * 物联网卡服务相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotlink.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据物联网卡IMSI查询该卡的GPRS状态信息
 */
public class GprsStatusByIMSIRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物联网卡IMSI
     * Required:true
     */
    @Required
    private String imsi;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 物联网卡IMSI
     *
     * @return
     */
    public String getImsi() {
        return imsi;
    }

    /**
     * set 物联网卡IMSI
     *
     * @param imsi
     */
    public void setImsi(String imsi) {
        this.imsi = imsi;
    }


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 物联网卡IMSI
     *
     * @param imsi
     */
    public GprsStatusByIMSIRequest imsi(String imsi) {
        this.imsi = imsi;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public GprsStatusByIMSIRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}