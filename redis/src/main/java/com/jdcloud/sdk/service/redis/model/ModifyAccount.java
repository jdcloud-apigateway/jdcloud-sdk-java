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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 修改账号
 */
public class ModifyAccount  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 账号名称
     * Required:true
     */
    @Required
    private String accountName;

    /**
     * 账号密码
     */
    private String accountPassword;

    /**
     * 账号权限。支持RoleReadOnly（只读权限）、RoleReadWrite（读写权限）
     */
    private String accountPrivilege;

    /**
     * 账号描述
     */
    private String accountDescription;



    /**
     * get 账号名称
     *
     * @return
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * set 账号名称
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    /**
     * get 账号密码
     *
     * @return
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * set 账号密码
     *
     * @param accountPassword
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }


    /**
     * get 账号权限。支持RoleReadOnly（只读权限）、RoleReadWrite（读写权限）
     *
     * @return
     */
    public String getAccountPrivilege() {
        return accountPrivilege;
    }

    /**
     * set 账号权限。支持RoleReadOnly（只读权限）、RoleReadWrite（读写权限）
     *
     * @param accountPrivilege
     */
    public void setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
    }


    /**
     * get 账号描述
     *
     * @return
     */
    public String getAccountDescription() {
        return accountDescription;
    }

    /**
     * set 账号描述
     *
     * @param accountDescription
     */
    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }



    /**
     * set 账号名称
     *
     * @param accountName
     */
    public ModifyAccount accountName(String accountName) {
        this.accountName = accountName;
        return this;
    }


    /**
     * set 账号密码
     *
     * @param accountPassword
     */
    public ModifyAccount accountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }


    /**
     * set 账号权限。支持RoleReadOnly（只读权限）、RoleReadWrite（读写权限）
     *
     * @param accountPrivilege
     */
    public ModifyAccount accountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }


    /**
     * set 账号描述
     *
     * @param accountDescription
     */
    public ModifyAccount accountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }


}