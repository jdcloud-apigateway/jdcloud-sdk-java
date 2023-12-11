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
 * Role Management
 * Role Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.iam.model.CopyRoleInfo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 复制角色
 */
public class CopyRoleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色信息
     * Required:true
     */
    @Required
    private CopyRoleInfo copyRoleInfo;



    /**
     * get 角色信息
     *
     * @return
     */
    public CopyRoleInfo getCopyRoleInfo() {
        return copyRoleInfo;
    }

    /**
     * set 角色信息
     *
     * @param copyRoleInfo
     */
    public void setCopyRoleInfo(CopyRoleInfo copyRoleInfo) {
        this.copyRoleInfo = copyRoleInfo;
    }



    /**
     * set 角色信息
     *
     * @param copyRoleInfo
     */
    public CopyRoleRequest copyRoleInfo(CopyRoleInfo copyRoleInfo) {
        this.copyRoleInfo = copyRoleInfo;
        return this;
    }


}