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
 * 分布式云物理服务器子网操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.edcps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.edcps.model.SubnetSpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建子网
 */
public class CreateSubnetRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     */
    private String clientToken;

    /**
     * 子网配置
     * Required:true
     */
    @Required
    private SubnetSpec subnetSpec;

    /**
     * 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * get 子网配置
     *
     * @return
     */
    public SubnetSpec getSubnetSpec() {
        return subnetSpec;
    }

    /**
     * set 子网配置
     *
     * @param subnetSpec
     */
    public void setSubnetSpec(SubnetSpec subnetSpec) {
        this.subnetSpec = subnetSpec;
    }

    /**
     * get 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 由客户端生成，用于保证请求的幂等性，长度不能超过36个字符；&lt;br/&gt;
如果多个请求使用了相同的clientToken，只会执行第一个请求，之后的请求直接返回第一个请求的结果&lt;br/&gt;

     *
     * @param clientToken
     */
    public CreateSubnetRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * set 子网配置
     *
     * @param subnetSpec
     */
    public CreateSubnetRequest subnetSpec(SubnetSpec subnetSpec) {
        this.subnetSpec = subnetSpec;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeEdCPSRegions）获取分布式云物理服务器支持的地域
     *
     * @param regionId
     */
    public CreateSubnetRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}