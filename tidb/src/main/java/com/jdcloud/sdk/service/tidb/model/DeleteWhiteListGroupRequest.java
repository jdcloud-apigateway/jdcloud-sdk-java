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
 * White-List
 * 白名单相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除白名单分组。
 */
public class DeleteWhiteListGroupRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 白名单分组名
     * Required:true
     */
    @Required
    private String name;

    /**
     * 地域代码
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例ID
     * Required:true
     */
    @Required
    private String instanceId;



    /**
     * get 白名单分组名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 白名单分组名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 地域代码
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域代码
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }



    /**
     * set 白名单分组名
     *
     * @param name
     */
    public DeleteWhiteListGroupRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 地域代码
     *
     * @param regionId
     */
    public DeleteWhiteListGroupRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public DeleteWhiteListGroupRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}