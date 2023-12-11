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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.iam.model.ListRoleInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询角色列表
 */
public class DescribeRolesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总数
     */
    private Integer total;

    /**
     * roles
     */
    
    private List<ListRoleInfo> roles;


    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set 总数
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }


    /**
    * get roles
    *
    * @return
    */
    public List<ListRoleInfo> getRoles() {
        return roles;
    }

    /**
    * set roles
    *
    * @param roles
    */
    public void setRoles(List<ListRoleInfo> roles) {
        this.roles = roles;
    }



    /**
     * set 总数
     *
     * @param total
     */
    public DescribeRolesResult total(Integer total) {
        this.total = total;
        return this;
    }


    /**
    * set roles
    *
    * @param roles
    */
    public DescribeRolesResult roles(List<ListRoleInfo> roles) {
        this.roles = roles;
        return this;
    }



    /**
     * add item to roles
     *
     * @param role
     */
    public void addRole(ListRoleInfo role) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(role);
    }
}