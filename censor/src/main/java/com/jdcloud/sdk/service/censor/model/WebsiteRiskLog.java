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

package com.jdcloud.sdk.service.censor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * websiteRiskLog
 */
public class WebsiteRiskLog  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ids
     */
    private List<Integer> ids;

    /**
     * 实例ID
     */
    private String websiteInstanceId;

    /**
     * 域名，不含协议
     */
    private String host;

    /**
     * url
     */
    private String url;

    /**
     * 日志类型，1首页 2全站
     */
    private Integer logType;

    /**
     * riskTypes
     */
    private List<Integer> riskTypes;

    /**
     * 风险等级 1低 2中 3高
     */
    private Integer riskLevel;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 响应详情
     */
    private String response;

    /**
     * 处理状态 0未处理 1已处理
     */
    private Integer status;

    /**
     * 更新时间
     */
    private Integer updateTime;


    /**
     * get ids
     *
     * @return
     */
    public List<Integer> getIds() {
        return ids;
    }

    /**
     * set ids
     *
     * @param ids
     */
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    /**
     * get 实例ID
     *
     * @return
     */
    public String getWebsiteInstanceId() {
        return websiteInstanceId;
    }

    /**
     * set 实例ID
     *
     * @param websiteInstanceId
     */
    public void setWebsiteInstanceId(String websiteInstanceId) {
        this.websiteInstanceId = websiteInstanceId;
    }

    /**
     * get 域名，不含协议
     *
     * @return
     */
    public String getHost() {
        return host;
    }

    /**
     * set 域名，不含协议
     *
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * get url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get 日志类型，1首页 2全站
     *
     * @return
     */
    public Integer getLogType() {
        return logType;
    }

    /**
     * set 日志类型，1首页 2全站
     *
     * @param logType
     */
    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    /**
     * get riskTypes
     *
     * @return
     */
    public List<Integer> getRiskTypes() {
        return riskTypes;
    }

    /**
     * set riskTypes
     *
     * @param riskTypes
     */
    public void setRiskTypes(List<Integer> riskTypes) {
        this.riskTypes = riskTypes;
    }

    /**
     * get 风险等级 1低 2中 3高
     *
     * @return
     */
    public Integer getRiskLevel() {
        return riskLevel;
    }

    /**
     * set 风险等级 1低 2中 3高
     *
     * @param riskLevel
     */
    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * get 资源类型
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 资源类型
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 响应详情
     *
     * @return
     */
    public String getResponse() {
        return response;
    }

    /**
     * set 响应详情
     *
     * @param response
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * get 处理状态 0未处理 1已处理
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 处理状态 0未处理 1已处理
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set ids
     *
     * @param ids
     */
    public WebsiteRiskLog ids(List<Integer> ids) {
        this.ids = ids;
        return this;
    }

    /**
     * set 实例ID
     *
     * @param websiteInstanceId
     */
    public WebsiteRiskLog websiteInstanceId(String websiteInstanceId) {
        this.websiteInstanceId = websiteInstanceId;
        return this;
    }

    /**
     * set 域名，不含协议
     *
     * @param host
     */
    public WebsiteRiskLog host(String host) {
        this.host = host;
        return this;
    }

    /**
     * set url
     *
     * @param url
     */
    public WebsiteRiskLog url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set 日志类型，1首页 2全站
     *
     * @param logType
     */
    public WebsiteRiskLog logType(Integer logType) {
        this.logType = logType;
        return this;
    }

    /**
     * set riskTypes
     *
     * @param riskTypes
     */
    public WebsiteRiskLog riskTypes(List<Integer> riskTypes) {
        this.riskTypes = riskTypes;
        return this;
    }

    /**
     * set 风险等级 1低 2中 3高
     *
     * @param riskLevel
     */
    public WebsiteRiskLog riskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * set 资源类型
     *
     * @param resourceType
     */
    public WebsiteRiskLog resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 响应详情
     *
     * @param response
     */
    public WebsiteRiskLog response(String response) {
        this.response = response;
        return this;
    }

    /**
     * set 处理状态 0未处理 1已处理
     *
     * @param status
     */
    public WebsiteRiskLog status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public WebsiteRiskLog updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * add item to ids
     *
     * @param id
     */
    public void addId(Integer id) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(id);
    }

    /**
     * add item to riskTypes
     *
     * @param riskType
     */
    public void addRiskType(Integer riskType) {
        if (this.riskTypes == null) {
            this.riskTypes = new ArrayList<>();
        }
        this.riskTypes.add(riskType);
    }

}