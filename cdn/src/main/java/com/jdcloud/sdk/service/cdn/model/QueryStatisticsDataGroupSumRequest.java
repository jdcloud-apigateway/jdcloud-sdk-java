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
 * 查询统计数据并进行汇总加和
 */
public class QueryStatisticsDataGroupSumRequest extends JdcloudRequest implements java.io.Serializable {

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
     * 需要查询的域名, 必须为用户pin下有权限的域名
     */
    private String domain;

    /**
     * 待查询的子域名
     */
    private String subDomain;

    /**
     * 需要查询的字段
     */
    private String fields;

    /**
     * area
     */
    private String area;

    /**
     * isp
     */
    private String isp;

    /**
     * origin
     */
    private String origin;

    /**
     * 时间粒度，可选值:[oneMin,fiveMin,followTime],followTime只会返回一个汇总后的数据
     */
    private String period;

    /**
     * 分组依据
     */
    private String groupBy;

    /**
     * true 代表查询境外数据，默认false查询境内数据
     */
    private Boolean abroad;


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
     * get 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * get 待查询的子域名
     *
     * @return
     */
    public String getSubDomain() {
        return subDomain;
    }

    /**
     * set 待查询的子域名
     *
     * @param subDomain
     */
    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    /**
     * get 需要查询的字段
     *
     * @return
     */
    public String getFields() {
        return fields;
    }

    /**
     * set 需要查询的字段
     *
     * @param fields
     */
    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     * get area
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * set area
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * get isp
     *
     * @return
     */
    public String getIsp() {
        return isp;
    }

    /**
     * set isp
     *
     * @param isp
     */
    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * get origin
     *
     * @return
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * set origin
     *
     * @param origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * get 时间粒度，可选值:[oneMin,fiveMin,followTime],followTime只会返回一个汇总后的数据
     *
     * @return
     */
    public String getPeriod() {
        return period;
    }

    /**
     * set 时间粒度，可选值:[oneMin,fiveMin,followTime],followTime只会返回一个汇总后的数据
     *
     * @param period
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * get 分组依据
     *
     * @return
     */
    public String getGroupBy() {
        return groupBy;
    }

    /**
     * set 分组依据
     *
     * @param groupBy
     */
    public void setGroupBy(String groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * get true 代表查询境外数据，默认false查询境内数据
     *
     * @return
     */
    public Boolean getAbroad() {
        return abroad;
    }

    /**
     * set true 代表查询境外数据，默认false查询境内数据
     *
     * @param abroad
     */
    public void setAbroad(Boolean abroad) {
        this.abroad = abroad;
    }


    /**
     * set 查询起始时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param startTime
     */
    public QueryStatisticsDataGroupSumRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间,UTC时间，格式为:yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;，示例:2018-10-21T10:00:00Z
     *
     * @param endTime
     */
    public QueryStatisticsDataGroupSumRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 需要查询的域名, 必须为用户pin下有权限的域名
     *
     * @param domain
     */
    public QueryStatisticsDataGroupSumRequest domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 待查询的子域名
     *
     * @param subDomain
     */
    public QueryStatisticsDataGroupSumRequest subDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }

    /**
     * set 需要查询的字段
     *
     * @param fields
     */
    public QueryStatisticsDataGroupSumRequest fields(String fields) {
        this.fields = fields;
        return this;
    }

    /**
     * set area
     *
     * @param area
     */
    public QueryStatisticsDataGroupSumRequest area(String area) {
        this.area = area;
        return this;
    }

    /**
     * set isp
     *
     * @param isp
     */
    public QueryStatisticsDataGroupSumRequest isp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * set origin
     *
     * @param origin
     */
    public QueryStatisticsDataGroupSumRequest origin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * set 时间粒度，可选值:[oneMin,fiveMin,followTime],followTime只会返回一个汇总后的数据
     *
     * @param period
     */
    public QueryStatisticsDataGroupSumRequest period(String period) {
        this.period = period;
        return this;
    }

    /**
     * set 分组依据
     *
     * @param groupBy
     */
    public QueryStatisticsDataGroupSumRequest groupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    /**
     * set true 代表查询境外数据，默认false查询境内数据
     *
     * @param abroad
     */
    public QueryStatisticsDataGroupSumRequest abroad(Boolean abroad) {
        this.abroad = abroad;
        return this;
    }


}