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
 * Domain
 * Domain API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.waf.model.DomainMainConfig;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取网站
 */
public class ListMainCfgResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例id
     */
    private String wafInstanceId;

    /**
     * list
     */
    private List<DomainMainConfig> list;

    /**
     * 页码
     */
    private Integer pageIndex;

    /**
     * 页大小
     */
    private Integer pageSize;

    /**
     * 最大支持的数目
     */
    private Integer maxLimit;


    /**
     * get 实例id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }

    /**
     * get list
     *
     * @return
     */
    public List<DomainMainConfig> getList() {
        return list;
    }

    /**
     * set list
     *
     * @param list
     */
    public void setList(List<DomainMainConfig> list) {
        this.list = list;
    }

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
     * get 最大支持的数目
     *
     * @return
     */
    public Integer getMaxLimit() {
        return maxLimit;
    }

    /**
     * set 最大支持的数目
     *
     * @param maxLimit
     */
    public void setMaxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
    }


    /**
     * set 实例id
     *
     * @param wafInstanceId
     */
    public ListMainCfgResult wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set list
     *
     * @param list
     */
    public ListMainCfgResult list(List<DomainMainConfig> list) {
        this.list = list;
        return this;
    }

    /**
     * set 页码
     *
     * @param pageIndex
     */
    public ListMainCfgResult pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * set 页大小
     *
     * @param pageSize
     */
    public ListMainCfgResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 最大支持的数目
     *
     * @param maxLimit
     */
    public ListMainCfgResult maxLimit(Integer maxLimit) {
        this.maxLimit = maxLimit;
        return this;
    }


    /**
     * add item to list
     *
     * @param list
     */
    public void addList(DomainMainConfig list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }

}