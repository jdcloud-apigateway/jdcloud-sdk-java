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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.cdn.model.ListDomainItemByFilter;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 通过标签查询加速域名接口
 */
public class GetDomainListByFilterResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * totalCount
     */
    private Integer totalCount;

    /**
     * pageSize
     */
    private Integer pageSize;

    /**
     * pageNumber
     */
    private Integer pageNumber;

    /**
     * domains
     */
    
    private List<ListDomainItemByFilter> domains;


    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * get pageSize
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set pageSize
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * get pageNumber
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set pageNumber
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }


    /**
    * get domains
    *
    * @return
    */
    public List<ListDomainItemByFilter> getDomains() {
        return domains;
    }

    /**
    * set domains
    *
    * @param domains
    */
    public void setDomains(List<ListDomainItemByFilter> domains) {
        this.domains = domains;
    }



    /**
     * set totalCount
     *
     * @param totalCount
     */
    public GetDomainListByFilterResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * set pageSize
     *
     * @param pageSize
     */
    public GetDomainListByFilterResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }


    /**
     * set pageNumber
     *
     * @param pageNumber
     */
    public GetDomainListByFilterResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }


    /**
    * set domains
    *
    * @param domains
    */
    public GetDomainListByFilterResult domains(List<ListDomainItemByFilter> domains) {
        this.domains = domains;
        return this;
    }



    /**
     * add item to domains
     *
     * @param domain
     */
    public void addDomain(ListDomainItemByFilter domain) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domain);
    }
}