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
 * 集群管理
 * JMR集群管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询用户的集群列表及相关服务的一些信息
 */
public class IdataClusterRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 地域信息
     * Required:true
     */
    @Required
    private String dataCenter;


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
     * get 地域信息
     *
     * @return
     */
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * set 地域信息
     *
     * @param dataCenter
     */
    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public IdataClusterRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 地域信息
     *
     * @param dataCenter
     */
    public IdataClusterRequest dataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }


}