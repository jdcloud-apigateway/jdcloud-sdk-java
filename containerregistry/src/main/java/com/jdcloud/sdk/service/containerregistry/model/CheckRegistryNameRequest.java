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
 * 查询指定注册表名称是否已经存在以及是否符合命名规范。

 */
public class CheckRegistryNameRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 待验证的注册表名。
     * Required:true
     */
    @Required
    private String registryName;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 待验证的注册表名。
     *
     * @return
     */
    public String getRegistryName() {
        return registryName;
    }

    /**
     * set 待验证的注册表名。
     *
     * @param registryName
     */
    public void setRegistryName(String registryName) {
        this.registryName = registryName;
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
     * set 待验证的注册表名。
     *
     * @param registryName
     */
    public CheckRegistryNameRequest registryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public CheckRegistryNameRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}