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
 * 统计查询类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询目录带宽，仅有部分用户支持该功能
 */
public class QueryDirBandwidthRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String startTime;

    /**
     * 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     */
    private String endTime;

    /**
     * 需要查询的域名, 必须为用户pin下有权限的域名，该接口仅支持单域名查询
     */
    private String domain;

    /**
     * 需要过滤的目录
     */
    private String dirs;

    /**
     * 需要过滤的地区
     */
    private String regions;

    /**
     * 查询节点层级，可选值:[all,edge,mid],默认查询all,edge边缘 mid中间
     */
    private String cacheType;



    /**
     * get 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 需要查询的域名, 必须为用户pin下有权限的域名，该接口仅支持单域名查询
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 需要查询的域名, 必须为用户pin下有权限的域名，该接口仅支持单域名查询
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 需要过滤的目录
     *
     * @return
     */
    public String getDirs() {
        return dirs;
    }

    /**
     * set 需要过滤的目录
     *
     * @param dirs
     */
    public void setDirs(String dirs) {
        this.dirs = dirs;
    }


    /**
     * get 需要过滤的地区
     *
     * @return
     */
    public String getRegions() {
        return regions;
    }

    /**
     * set 需要过滤的地区
     *
     * @param regions
     */
    public void setRegions(String regions) {
        this.regions = regions;
    }


    /**
     * get 查询节点层级，可选值:[all,edge,mid],默认查询all,edge边缘 mid中间
     *
     * @return
     */
    public String getCacheType() {
        return cacheType;
    }

    /**
     * set 查询节点层级，可选值:[all,edge,mid],默认查询all,edge边缘 mid中间
     *
     * @param cacheType
     */
    public void setCacheType(String cacheType) {
        this.cacheType = cacheType;
    }



    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public QueryDirBandwidthRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public QueryDirBandwidthRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 需要查询的域名, 必须为用户pin下有权限的域名，该接口仅支持单域名查询
     *
     * @param domain
     */
    public QueryDirBandwidthRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 需要过滤的目录
     *
     * @param dirs
     */
    public QueryDirBandwidthRequest dirs(String dirs) {
        this.dirs = dirs;
        return this;
    }


    /**
     * set 需要过滤的地区
     *
     * @param regions
     */
    public QueryDirBandwidthRequest regions(String regions) {
        this.regions = regions;
        return this;
    }


    /**
     * set 查询节点层级，可选值:[all,edge,mid],默认查询all,edge边缘 mid中间
     *
     * @param cacheType
     */
    public QueryDirBandwidthRequest cacheType(String cacheType) {
        this.cacheType = cacheType;
        return this;
    }


}