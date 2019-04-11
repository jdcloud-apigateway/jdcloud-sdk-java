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
 * 域名
 * 云解析OpenAPI域名接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.clouddnsservice.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.clouddnsservice.model.Domain;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取用户所属的主域名列表。   
请在调用域名相关的接口之前，调用此接口获取相关的domainId和domainName。  
主域名的相关概念，请查阅&lt;a href&#x3D;&quot;https://docs.jdcloud.com/cn/jd-cloud-dns/product-overview&quot;&gt;云解析文档&lt;/a&gt;

 */
public class GetDomainsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dataList
     */
    private List<Domain> dataList;

    /**
     * 当前页的域名列表里域名的个数
     */
    private Integer currentCount;

    /**
     * 所有匹配的域名列表的个数
     */
    private Integer totalCount;

    /**
     * 所有匹配的域名列表按照分页参数一共的页数
     */
    private Integer totalPage;


    /**
     * get dataList
     *
     * @return
     */
    public List<Domain> getDataList() {
        return dataList;
    }

    /**
     * set dataList
     *
     * @param dataList
     */
    public void setDataList(List<Domain> dataList) {
        this.dataList = dataList;
    }

    /**
     * get 当前页的域名列表里域名的个数
     *
     * @return
     */
    public Integer getCurrentCount() {
        return currentCount;
    }

    /**
     * set 当前页的域名列表里域名的个数
     *
     * @param currentCount
     */
    public void setCurrentCount(Integer currentCount) {
        this.currentCount = currentCount;
    }

    /**
     * get 所有匹配的域名列表的个数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 所有匹配的域名列表的个数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 所有匹配的域名列表按照分页参数一共的页数
     *
     * @return
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    /**
     * set 所有匹配的域名列表按照分页参数一共的页数
     *
     * @param totalPage
     */
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }


    /**
     * set dataList
     *
     * @param dataList
     */
    public GetDomainsResult dataList(List<Domain> dataList) {
        this.dataList = dataList;
        return this;
    }

    /**
     * set 当前页的域名列表里域名的个数
     *
     * @param currentCount
     */
    public GetDomainsResult currentCount(Integer currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * set 所有匹配的域名列表的个数
     *
     * @param totalCount
     */
    public GetDomainsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 所有匹配的域名列表按照分页参数一共的页数
     *
     * @param totalPage
     */
    public GetDomainsResult totalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }


    /**
     * add item to dataList
     *
     * @param dataList
     */
    public void addDataList(Domain dataList) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataList);
    }

}