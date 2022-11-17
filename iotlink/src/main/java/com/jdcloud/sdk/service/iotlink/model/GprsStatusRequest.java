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
 * 根据物联网卡iccid查询该卡的gprs状态信息
 */
public class GprsStatusRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物联网卡iccid
     * Required:true
     */
    @Required
    private String iccid;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 物联网卡iccid
     *
     * @return
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * set 物联网卡iccid
     *
     * @param iccid
     */
    public void setIccid(String iccid) {
        this.iccid = iccid;
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
     * set 物联网卡iccid
     *
     * @param iccid
     */
    public GprsStatusRequest iccid(String iccid) {
        this.iccid = iccid;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public GprsStatusRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}