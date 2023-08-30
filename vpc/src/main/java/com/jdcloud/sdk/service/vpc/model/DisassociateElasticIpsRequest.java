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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 解绑NAT网关上的公网IP接口
 */
public class DisassociateElasticIpsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网IP ID，当为弹性公网IP时，为elasticIpId。
     * Required:true
     */
    @Required
    
    private List<String> elasticIpIds;
    /**
     * 解绑后是否删除公网IP，取值范围：true、false,默认为false.true表示解绑公网IP时删除该公网IP;false表示解绑公网IP时不删除公网IP
     */
    private Boolean deleteElasticIp;

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
    * get 公网IP ID，当为弹性公网IP时，为elasticIpId。
    *
    * @return
    */
    public List<String> getElasticIpIds() {
        return elasticIpIds;
    }

    /**
    * set 公网IP ID，当为弹性公网IP时，为elasticIpId。
    *
    * @param elasticIpIds
    */
    public void setElasticIpIds(List<String> elasticIpIds) {
        this.elasticIpIds = elasticIpIds;
    }


    /**
     * get 解绑后是否删除公网IP，取值范围：true、false,默认为false.true表示解绑公网IP时删除该公网IP;false表示解绑公网IP时不删除公网IP
     *
     * @return
     */
    public Boolean getDeleteElasticIp() {
        return deleteElasticIp;
    }

    /**
     * set 解绑后是否删除公网IP，取值范围：true、false,默认为false.true表示解绑公网IP时删除该公网IP;false表示解绑公网IP时不删除公网IP
     *
     * @param deleteElasticIp
     */
    public void setDeleteElasticIp(Boolean deleteElasticIp) {
        this.deleteElasticIp = deleteElasticIp;
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
    * set 公网IP ID，当为弹性公网IP时，为elasticIpId。
    *
    * @param elasticIpIds
    */
    public DisassociateElasticIpsRequest elasticIpIds(List<String> elasticIpIds) {
        this.elasticIpIds = elasticIpIds;
        return this;
    }


    /**
     * set 解绑后是否删除公网IP，取值范围：true、false,默认为false.true表示解绑公网IP时删除该公网IP;false表示解绑公网IP时不删除公网IP
     *
     * @param deleteElasticIp
     */
    public DisassociateElasticIpsRequest deleteElasticIp(Boolean deleteElasticIp) {
        this.deleteElasticIp = deleteElasticIp;
        return this;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DisassociateElasticIpsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set natGateway ID
     *
     * @param natGatewayId
     */
    public DisassociateElasticIpsRequest natGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }



    /**
     * add item to 公网IP ID，当为弹性公网IP时，为elasticIpId。
     *
     * @param elasticIpId
     */
    public void addElasticIpId(String elasticIpId) {
        if (this.elasticIpIds == null) {
            this.elasticIpIds = new ArrayList<>();
        }
        this.elasticIpIds.add(elasticIpId);
    }
}