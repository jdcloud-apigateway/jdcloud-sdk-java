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

package com.jdcloud.sdk.service.user.model;


/**
 * contactPersonInfo
 */
public class ContactPersonInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联系人ID(联系人为所有者时，该字段为0)
     */
    private Long id;

    /**
     * 联系人姓名
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户邮箱验证状态
     */
    private Boolean emailVerified;

    /**
     * 是否为主联系人
     */
    private Boolean isPrimary;

    /**
     * 是否为账号所有者
     */
    private Boolean isOwner;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 修改时间
     */
    private String modifiedTime;



    /**
     * get 联系人ID(联系人为所有者时，该字段为0)
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 联系人ID(联系人为所有者时，该字段为0)
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * get 联系人姓名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 联系人姓名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 邮箱
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * set 邮箱
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * get 手机号
     *
     * @return
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * set 手机号
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    /**
     * get 用户邮箱验证状态
     *
     * @return
     */
    public Boolean getEmailVerified() {
        return emailVerified;
    }

    /**
     * set 用户邮箱验证状态
     *
     * @param emailVerified
     */
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }


    /**
     * get 是否为主联系人
     *
     * @return
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * set 是否为主联系人
     *
     * @param isPrimary
     */
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }


    /**
     * get 是否为账号所有者
     *
     * @return
     */
    public Boolean getIsOwner() {
        return isOwner;
    }

    /**
     * set 是否为账号所有者
     *
     * @param isOwner
     */
    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * get 修改时间
     *
     * @return
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    /**
     * set 修改时间
     *
     * @param modifiedTime
     */
    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }



    /**
     * set 联系人ID(联系人为所有者时，该字段为0)
     *
     * @param id
     */
    public ContactPersonInfo id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * set 联系人姓名
     *
     * @param name
     */
    public ContactPersonInfo name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 邮箱
     *
     * @param email
     */
    public ContactPersonInfo email(String email) {
        this.email = email;
        return this;
    }


    /**
     * set 手机号
     *
     * @param mobile
     */
    public ContactPersonInfo mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }


    /**
     * set 用户邮箱验证状态
     *
     * @param emailVerified
     */
    public ContactPersonInfo emailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
        return this;
    }


    /**
     * set 是否为主联系人
     *
     * @param isPrimary
     */
    public ContactPersonInfo isPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }


    /**
     * set 是否为账号所有者
     *
     * @param isOwner
     */
    public ContactPersonInfo isOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createdTime
     */
    public ContactPersonInfo createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


    /**
     * set 修改时间
     *
     * @param modifiedTime
     */
    public ContactPersonInfo modifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }


}