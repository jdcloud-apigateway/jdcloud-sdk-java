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
 * Vpc-NetworkInterface
 * 与网卡相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.jdfusion.model.DetachNetInterfaceReq;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 卸载网卡
 */
public class DetachVpcNetworkInterfaceByIdRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 卸载网卡
     * Required:true
     */
    @Required
    private DetachNetInterfaceReq body;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 网卡 ID
     * Required:true
     */
    @Required
    private String id;


    /**
     * get 卸载网卡
     *
     * @return
     */
    public DetachNetInterfaceReq getBody() {
        return body;
    }

    /**
     * set 卸载网卡
     *
     * @param body
     */
    public void setBody(DetachNetInterfaceReq body) {
        this.body = body;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 网卡 ID
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 网卡 ID
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * set 卸载网卡
     *
     * @param body
     */
    public DetachVpcNetworkInterfaceByIdRequest body(DetachNetInterfaceReq body) {
        this.body = body;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DetachVpcNetworkInterfaceByIdRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 网卡 ID
     *
     * @param id
     */
    public DetachVpcNetworkInterfaceByIdRequest id(String id) {
        this.id = id;
        return this;
    }


}