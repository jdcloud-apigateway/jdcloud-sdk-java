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
 * Instance APIs
 * Anti DDoS Protection Package Instance APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.antipro.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.antipro.model.ModifyAclPrioritySpec;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改访问控制规则
 */
public class ModifyAclPriorityRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 修改访问控制规则请求参数
     * Required:true
     */
    @Required
    private ModifyAclPrioritySpec modifyAclPrioritySpec;

    /**
     * 地域 Id, DDoS 防护包目前支持华北-北京, 华东-宿迁, 华东-上海
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 防护包实例 Id
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 访问控制规则 Id
     * Required:true
     */
    @Required
    private String aclId;


    /**
     * get 修改访问控制规则请求参数
     *
     * @return
     */
    public ModifyAclPrioritySpec getModifyAclPrioritySpec() {
        return modifyAclPrioritySpec;
    }

    /**
     * set 修改访问控制规则请求参数
     *
     * @param modifyAclPrioritySpec
     */
    public void setModifyAclPrioritySpec(ModifyAclPrioritySpec modifyAclPrioritySpec) {
        this.modifyAclPrioritySpec = modifyAclPrioritySpec;
    }

    /**
     * get 地域 Id, DDoS 防护包目前支持华北-北京, 华东-宿迁, 华东-上海
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id, DDoS 防护包目前支持华北-北京, 华东-宿迁, 华东-上海
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 防护包实例 Id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 防护包实例 Id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 访问控制规则 Id
     *
     * @return
     */
    public String getAclId() {
        return aclId;
    }

    /**
     * set 访问控制规则 Id
     *
     * @param aclId
     */
    public void setAclId(String aclId) {
        this.aclId = aclId;
    }


    /**
     * set 修改访问控制规则请求参数
     *
     * @param modifyAclPrioritySpec
     */
    public ModifyAclPriorityRequest modifyAclPrioritySpec(ModifyAclPrioritySpec modifyAclPrioritySpec) {
        this.modifyAclPrioritySpec = modifyAclPrioritySpec;
        return this;
    }

    /**
     * set 地域 Id, DDoS 防护包目前支持华北-北京, 华东-宿迁, 华东-上海
     *
     * @param regionId
     */
    public ModifyAclPriorityRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 防护包实例 Id
     *
     * @param instanceId
     */
    public ModifyAclPriorityRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 访问控制规则 Id
     *
     * @param aclId
     */
    public ModifyAclPriorityRequest aclId(String aclId) {
        this.aclId = aclId;
        return this;
    }


}