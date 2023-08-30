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
 * NAT-Gateway
 * NAT网关相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改NAT网关接口，修改网关规格或带宽需要先停止网关
 */
public class ModifyNatGatewayRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * NAT网关名称
     */
    private String natGatewayName;

    /**
     * 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     */
    private String description;

    /**
     * NAT网关规格，取值small（100万并发连接数）,medium(300万并发连接数),large（1000万并发连接数）
     */
    private String natGatewaySpec;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * natGateway ID
     * Required:true
     */
    @Required
    private String natGatewayId;



    /**
     * get NAT网关名称
     *
     * @return
     */
    public String getNatGatewayName() {
        return natGatewayName;
    }

    /**
     * set NAT网关名称
     *
     * @param natGatewayName
     */
    public void setNatGatewayName(String natGatewayName) {
        this.natGatewayName = natGatewayName;
    }


    /**
     * get 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get NAT网关规格，取值small（100万并发连接数）,medium(300万并发连接数),large（1000万并发连接数）
     *
     * @return
     */
    public String getNatGatewaySpec() {
        return natGatewaySpec;
    }

    /**
     * set NAT网关规格，取值small（100万并发连接数）,medium(300万并发连接数),large（1000万并发连接数）
     *
     * @param natGatewaySpec
     */
    public void setNatGatewaySpec(String natGatewaySpec) {
        this.natGatewaySpec = natGatewaySpec;
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
     * get natGateway ID
     *
     * @return
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    /**
     * set natGateway ID
     *
     * @param natGatewayId
     */
    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }



    /**
     * set NAT网关名称
     *
     * @param natGatewayName
     */
    public ModifyNatGatewayRequest natGatewayName(String natGatewayName) {
        this.natGatewayName = natGatewayName;
        return this;
    }


    /**
     * set 描述,允许输入UTF-8编码下的全部字符，不超过256字符
     *
     * @param description
     */
    public ModifyNatGatewayRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set NAT网关规格，取值small（100万并发连接数）,medium(300万并发连接数),large（1000万并发连接数）
     *
     * @param natGatewaySpec
     */
    public ModifyNatGatewayRequest natGatewaySpec(String natGatewaySpec) {
        this.natGatewaySpec = natGatewaySpec;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public ModifyNatGatewayRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set natGateway ID
     *
     * @param natGatewayId
     */
    public ModifyNatGatewayRequest natGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }


}