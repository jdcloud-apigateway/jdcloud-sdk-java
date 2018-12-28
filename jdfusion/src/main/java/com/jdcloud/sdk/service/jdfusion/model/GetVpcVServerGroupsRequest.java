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
 * Vpc-VserverGroup
 * 与服务器组相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jdfusion.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据过滤条件，取得服务器组的信息
 */
public class GetVpcVServerGroupsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 负载均衡id
     */
    private String slbid;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 负载均衡id
     *
     * @return
     */
    public String getSlbid() {
        return slbid;
    }

    /**
     * set 负载均衡id
     *
     * @param slbid
     */
    public void setSlbid(String slbid) {
        this.slbid = slbid;
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
     * set 负载均衡id
     *
     * @param slbid
     */
    public GetVpcVServerGroupsRequest slbid(String slbid) {
        this.slbid = slbid;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public GetVpcVServerGroupsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}