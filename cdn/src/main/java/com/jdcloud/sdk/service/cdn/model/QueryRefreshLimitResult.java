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
 * CDN刷新预热类接口
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
import com.jdcloud.sdk.service.cdn.model.SubUserRefreshLimit;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询用户刷新预热限额
 */
public class QueryRefreshLimitResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主账号
     */
    private String user;

    /**
     * 主账号刷新个数
     */
    private Long refreshCount;

    /**
     * 主账号目录个数
     */
    private Long dirCount;

    /**
     * 主账号预热个数
     */
    private Long prefetchCount;

    /**
     * 默认为1
     */
    private Integer pageNumber;

    /**
     * 默认为10，最大100
     */
    private Integer pageSize;

    /**
     * 默认为10，最大100
     */
    private Integer total;

    /**
     * subUserQuota
     */
    private List<SubUserRefreshLimit> subUserQuota;


    /**
     * get 主账号
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     * set 主账号
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * get 主账号刷新个数
     *
     * @return
     */
    public Long getRefreshCount() {
        return refreshCount;
    }

    /**
     * set 主账号刷新个数
     *
     * @param refreshCount
     */
    public void setRefreshCount(Long refreshCount) {
        this.refreshCount = refreshCount;
    }

    /**
     * get 主账号目录个数
     *
     * @return
     */
    public Long getDirCount() {
        return dirCount;
    }

    /**
     * set 主账号目录个数
     *
     * @param dirCount
     */
    public void setDirCount(Long dirCount) {
        this.dirCount = dirCount;
    }

    /**
     * get 主账号预热个数
     *
     * @return
     */
    public Long getPrefetchCount() {
        return prefetchCount;
    }

    /**
     * set 主账号预热个数
     *
     * @param prefetchCount
     */
    public void setPrefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
    }

    /**
     * get 默认为1
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 默认为1
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 默认为10，最大100
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 默认为10，最大100
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 默认为10，最大100
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set 默认为10，最大100
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * get subUserQuota
     *
     * @return
     */
    public List<SubUserRefreshLimit> getSubUserQuota() {
        return subUserQuota;
    }

    /**
     * set subUserQuota
     *
     * @param subUserQuota
     */
    public void setSubUserQuota(List<SubUserRefreshLimit> subUserQuota) {
        this.subUserQuota = subUserQuota;
    }


    /**
     * set 主账号
     *
     * @param user
     */
    public QueryRefreshLimitResult user(String user) {
        this.user = user;
        return this;
    }

    /**
     * set 主账号刷新个数
     *
     * @param refreshCount
     */
    public QueryRefreshLimitResult refreshCount(Long refreshCount) {
        this.refreshCount = refreshCount;
        return this;
    }

    /**
     * set 主账号目录个数
     *
     * @param dirCount
     */
    public QueryRefreshLimitResult dirCount(Long dirCount) {
        this.dirCount = dirCount;
        return this;
    }

    /**
     * set 主账号预热个数
     *
     * @param prefetchCount
     */
    public QueryRefreshLimitResult prefetchCount(Long prefetchCount) {
        this.prefetchCount = prefetchCount;
        return this;
    }

    /**
     * set 默认为1
     *
     * @param pageNumber
     */
    public QueryRefreshLimitResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 默认为10，最大100
     *
     * @param pageSize
     */
    public QueryRefreshLimitResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 默认为10，最大100
     *
     * @param total
     */
    public QueryRefreshLimitResult total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * set subUserQuota
     *
     * @param subUserQuota
     */
    public QueryRefreshLimitResult subUserQuota(List<SubUserRefreshLimit> subUserQuota) {
        this.subUserQuota = subUserQuota;
        return this;
    }


    /**
     * add item to subUserQuota
     *
     * @param subUserQuota
     */
    public void addSubUserQuota(SubUserRefreshLimit subUserQuota) {
        if (this.subUserQuota == null) {
            this.subUserQuota = new ArrayList<>();
        }
        this.subUserQuota.add(subUserQuota);
    }

}