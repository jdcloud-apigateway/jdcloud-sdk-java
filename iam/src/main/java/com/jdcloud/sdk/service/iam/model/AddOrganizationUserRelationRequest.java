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
 * Organization Management
 * Organization Management API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iam.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.iam.model.AddOrganizationUserRelationInfo;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 新建组织用户关联关系
 */
public class AddOrganizationUserRelationRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 新建组织用户关联子用户关系参数
     * Required:true
     */
    @Required
    private AddOrganizationUserRelationInfo addOrganizationUserRelationInfo;

    /**
     * 组织ID
     * Required:true
     */
    @Required
    private String orgId;



    /**
     * get 新建组织用户关联子用户关系参数
     *
     * @return
     */
    public AddOrganizationUserRelationInfo getAddOrganizationUserRelationInfo() {
        return addOrganizationUserRelationInfo;
    }

    /**
     * set 新建组织用户关联子用户关系参数
     *
     * @param addOrganizationUserRelationInfo
     */
    public void setAddOrganizationUserRelationInfo(AddOrganizationUserRelationInfo addOrganizationUserRelationInfo) {
        this.addOrganizationUserRelationInfo = addOrganizationUserRelationInfo;
    }


    /**
     * get 组织ID
     *
     * @return
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * set 组织ID
     *
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }



    /**
     * set 新建组织用户关联子用户关系参数
     *
     * @param addOrganizationUserRelationInfo
     */
    public AddOrganizationUserRelationRequest addOrganizationUserRelationInfo(AddOrganizationUserRelationInfo addOrganizationUserRelationInfo) {
        this.addOrganizationUserRelationInfo = addOrganizationUserRelationInfo;
        return this;
    }


    /**
     * set 组织ID
     *
     * @param orgId
     */
    public AddOrganizationUserRelationRequest orgId(String orgId) {
        this.orgId = orgId;
        return this;
    }


}