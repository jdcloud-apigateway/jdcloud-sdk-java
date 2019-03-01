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
 * Registry
 * 容器镜像服务注册表相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.containerregistry.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除指定用户下某个 registry.
 [MFA enabled]
 */
public class DeleteRegistryRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 注册表名称
     * Required:true
     */
    @Required
    private String registryName;


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
     * get 注册表名称
     *
     * @return
     */
    public String getRegistryName() {
        return registryName;
    }

    /**
     * set 注册表名称
     *
     * @param registryName
     */
    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public DeleteRegistryRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 注册表名称
     *
     * @param registryName
     */
    public DeleteRegistryRequest registryName(String registryName) {
        this.registryName = registryName;
        return this;
    }


}