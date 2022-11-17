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
 * 物联网卡移动实名登记接口
 */
public class SimRealNameRegRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物联网卡移动实名登记请求参数
     * Required:true
     */
    @Required
    private String requestParam;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 物联网卡移动实名登记请求参数
     *
     * @return
     */
    public String getRequestParam() {
        return requestParam;
    }

    /**
     * set 物联网卡移动实名登记请求参数
     *
     * @param requestParam
     */
    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
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
     * set 物联网卡移动实名登记请求参数
     *
     * @param requestParam
     */
    public SimRealNameRegRequest requestParam(String requestParam) {
        this.requestParam = requestParam;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public SimRealNameRegRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}