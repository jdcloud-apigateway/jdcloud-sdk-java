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

package com.jdcloud.sdk.service.baseanti.model;


/**
 * domainCname
 */
public class DomainCname  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * NP系统中的域名
     */
    private String domain;

    /**
     * 域名在 IP 高防系统中对应的 CNAME
     */
    private String cname;

    /**
     * 添加时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     */
    private String createTime;

    /**
     * 删除时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     */
    private String deleteTime;

    /**
     * 是否删除
     */
    private Boolean isDeleted;


    /**
     * get NP系统中的域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set NP系统中的域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get 域名在 IP 高防系统中对应的 CNAME
     *
     * @return
     */
    public String getCname() {
        return cname;
    }

    /**
     * set 域名在 IP 高防系统中对应的 CNAME
     *
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname;
    }

    /**
     * get 添加时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 添加时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 删除时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @return
     */
    public String getDeleteTime() {
        return deleteTime;
    }

    /**
     * set 删除时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param deleteTime
     */
    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * get 是否删除
     *
     * @return
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * set 是否删除
     *
     * @param isDeleted
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * set NP系统中的域名
     *
     * @param domain
     */
    public DomainCname domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 域名在 IP 高防系统中对应的 CNAME
     *
     * @param cname
     */
    public DomainCname cname(String cname) {
        this.cname = cname;
        return this;
    }

    /**
     * set 添加时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param createTime
     */
    public DomainCname createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 删除时间, UTC 时间, 格式: yyyy-MM-dd&#39;T&#39;HH:mm:ssZ
     *
     * @param deleteTime
     */
    public DomainCname deleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * set 是否删除
     *
     * @param isDeleted
     */
    public DomainCname isDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }


}