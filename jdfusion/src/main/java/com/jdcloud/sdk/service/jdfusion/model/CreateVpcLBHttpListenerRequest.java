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
 * Vpc-LbHttpListener
 * 与HTTP监听器相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.jdfusion.model.CreateLoadBalancerHTTPListenerReq;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建HTTP监听器
 */
public class CreateVpcLBHttpListenerRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建HTTP监听器
     * Required:true
     */
    @Required
    private CreateLoadBalancerHTTPListenerReq body;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 创建HTTP监听器
     *
     * @return
     */
    public CreateLoadBalancerHTTPListenerReq getBody() {
        return body;
    }

    /**
     * set 创建HTTP监听器
     *
     * @param body
     */
    public void setBody(CreateLoadBalancerHTTPListenerReq body) {
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
     * set 创建HTTP监听器
     *
     * @param body
     */
    public CreateVpcLBHttpListenerRequest body(CreateLoadBalancerHTTPListenerReq body) {
        this.body = body;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateVpcLBHttpListenerRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}