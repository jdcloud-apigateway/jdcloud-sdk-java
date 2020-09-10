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
 * PCdn统计查询接口
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
 * 无线宝按条件查询的统计接口
 */
public class QueryJDBoxStatisticsDataRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 查询起始时间,时间戳
     */
    private Long startTime;

    /**
     * 查询截止时间,时间戳
     */
    private Long endTime;

    /**
     * 查询的字段，取值范围(avgbandwidth,pv,flow)。多个用逗号分隔。默认为空，表示查询带宽流量
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
     * 查询周期，当前取值范围：“oneMin,fiveMin”，分别表示1min，5min。默认为空，表示fiveMin
     */
    private String period;

    /**
     * 业务类型
     */
    private String category;

    /**
     * 设备id
     */
    private String macAddr;

    /**
     * 插件pin
     */
    private String pluginPin;


    /**
     * get 查询起始时间,时间戳
     *
     * @return
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * set 查询起始时间,时间戳
     *
     * @param startTime
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * get 查询截止时间,时间戳
     *
     * @return
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * set 查询截止时间,时间戳
     *
     * @param endTime
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * get 查询的字段，取值范围(avgbandwidth,pv,flow)。多个用逗号分隔。默认为空，表示查询带宽流量
     *
     * @return
     */
    public String getFields() {
        return fields;
    }

    /**
     * set 查询的字段，取值范围(avgbandwidth,pv,flow)。多个用逗号分隔。默认为空，表示查询带宽流量
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
     * get 查询周期，当前取值范围：“oneMin,fiveMin”，分别表示1min，5min。默认为空，表示fiveMin
     *
     * @return
     */
    public String getPeriod() {
        return period;
    }

    /**
     * set 查询周期，当前取值范围：“oneMin,fiveMin”，分别表示1min，5min。默认为空，表示fiveMin
     *
     * @param period
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * get 业务类型
     *
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * set 业务类型
     *
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * get 设备id
     *
     * @return
     */
    public String getMacAddr() {
        return macAddr;
    }

    /**
     * set 设备id
     *
     * @param macAddr
     */
    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    /**
     * get 插件pin
     *
     * @return
     */
    public String getPluginPin() {
        return pluginPin;
    }

    /**
     * set 插件pin
     *
     * @param pluginPin
     */
    public void setPluginPin(String pluginPin) {
        this.pluginPin = pluginPin;
    }


    /**
     * set 查询起始时间,时间戳
     *
     * @param startTime
     */
    public QueryJDBoxStatisticsDataRequest startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 查询截止时间,时间戳
     *
     * @param endTime
     */
    public QueryJDBoxStatisticsDataRequest endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 查询的字段，取值范围(avgbandwidth,pv,flow)。多个用逗号分隔。默认为空，表示查询带宽流量
     *
     * @param fields
     */
    public QueryJDBoxStatisticsDataRequest fields(String fields) {
        this.fields = fields;
        return this;
    }

    /**
     * set area
     *
     * @param area
     */
    public QueryJDBoxStatisticsDataRequest area(String area) {
        this.area = area;
        return this;
    }

    /**
     * set isp
     *
     * @param isp
     */
    public QueryJDBoxStatisticsDataRequest isp(String isp) {
        this.isp = isp;
        return this;
    }

    /**
     * set 查询周期，当前取值范围：“oneMin,fiveMin”，分别表示1min，5min。默认为空，表示fiveMin
     *
     * @param period
     */
    public QueryJDBoxStatisticsDataRequest period(String period) {
        this.period = period;
        return this;
    }

    /**
     * set 业务类型
     *
     * @param category
     */
    public QueryJDBoxStatisticsDataRequest category(String category) {
        this.category = category;
        return this;
    }

    /**
     * set 设备id
     *
     * @param macAddr
     */
    public QueryJDBoxStatisticsDataRequest macAddr(String macAddr) {
        this.macAddr = macAddr;
        return this;
    }

    /**
     * set 插件pin
     *
     * @param pluginPin
     */
    public QueryJDBoxStatisticsDataRequest pluginPin(String pluginPin) {
        this.pluginPin = pluginPin;
        return this;
    }


}