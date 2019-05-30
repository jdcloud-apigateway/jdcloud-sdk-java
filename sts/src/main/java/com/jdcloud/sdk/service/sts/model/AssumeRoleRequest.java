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
 * Security Token Service
 * Security Token Service API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.sts.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.sts.model.AssumeRoleInfo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 扮演用户角色，获取临时凭证
 */
public class AssumeRoleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 扮演角色参数
     * Required:true
     */
    @Required
    private AssumeRoleInfo assumeRoleInfo;


    /**
     * get 扮演角色参数
     *
     * @return
     */
    public AssumeRoleInfo getAssumeRoleInfo() {
        return assumeRoleInfo;
    }

    /**
     * set 扮演角色参数
     *
     * @param assumeRoleInfo
     */
    public void setAssumeRoleInfo(AssumeRoleInfo assumeRoleInfo) {
        this.assumeRoleInfo = assumeRoleInfo;
    }


    /**
     * set 扮演角色参数
     *
     * @param assumeRoleInfo
     */
    public AssumeRoleRequest assumeRoleInfo(AssumeRoleInfo assumeRoleInfo) {
        this.assumeRoleInfo = assumeRoleInfo;
        return this;
    }


}