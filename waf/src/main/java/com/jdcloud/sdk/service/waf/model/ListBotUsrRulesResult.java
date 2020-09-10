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
 * 网站防护类接口
 * 京东云WAF-OpenAPI网站防护类接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.service.waf.model.UsrBotRules;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取网站自定义类型bot规则
 */
public class ListBotUsrRulesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 页码
     */
    private Integer pageIndex;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 配置总数
     */
    private Integer totalCount;

    /**
     * 自定义类型bot规则
     */
    private UsrBotRules list;


    /**
     * get 页码
     *
     * @return
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * set 页码
     *
     * @param pageIndex
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    /**
     * get 页大小
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 配置总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 配置总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 自定义类型bot规则
     *
     * @return
     */
    public UsrBotRules getList() {
        return list;
    }

    /**
     * set 自定义类型bot规则
     *
     * @param list
     */
    public void setList(UsrBotRules list) {
        this.list = list;
    }


    /**
     * set 页码
     *
     * @param pageIndex
     */
    public ListBotUsrRulesResult pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public ListBotUsrRulesResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 配置总数
     *
     * @param totalCount
     */
    public ListBotUsrRulesResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 自定义类型bot规则
     *
     * @param list
     */
    public ListBotUsrRulesResult list(UsrBotRules list) {
        this.list = list;
        return this;
    }


}