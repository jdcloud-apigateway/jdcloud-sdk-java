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
 * instance
 * 轻量应用云主机实例的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lavm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改轻量应用云主机的属性信息。

 */
public class UpdateInstanceAttributeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新的服务器密码

     */
    private String password;

    /**
     * 服务器名称

     */
    private String instanceName;

    /**
     * 轻量应用云主机的实例ID

     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * regionId

     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 新的服务器密码

     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 新的服务器密码

     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * get 服务器名称

     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 服务器名称

     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }


    /**
     * get 轻量应用云主机的实例ID

     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 轻量应用云主机的实例ID

     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get regionId

     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId

     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 新的服务器密码

     *
     * @param password
     */
    public UpdateInstanceAttributeRequest password(String password) {
        this.password = password;
        return this;
    }


    /**
     * set 服务器名称

     *
     * @param instanceName
     */
    public UpdateInstanceAttributeRequest instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }


    /**
     * set 轻量应用云主机的实例ID

     *
     * @param instanceId
     */
    public UpdateInstanceAttributeRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set regionId

     *
     * @param regionId
     */
    public UpdateInstanceAttributeRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}