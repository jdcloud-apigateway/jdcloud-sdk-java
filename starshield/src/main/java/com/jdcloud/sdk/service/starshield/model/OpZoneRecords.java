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

package com.jdcloud.sdk.service.starshield.model;


/**
 * opZoneRecords
 */
public class OpZoneRecords  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 解析记录ID
     */
    private String recordId;

    /**
     * 域名id
     */
    private String zoneId;

    /**
     * 主机名
     */
    private String name;

    /**
     * 记录类型
     */
    private String type;

    /**
     * 记录值
     */
    private String content;

    /**
     * TTL
     */
    private Integer ttl;

    /**
     * 代理状态
     */
    private Boolean proxied;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 是否可代理
     */
    private Boolean proxiable;

    /**
     * 优先级
     */
    private String priority;



    /**
     * get 解析记录ID
     *
     * @return
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * set 解析记录ID
     *
     * @param recordId
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }


    /**
     * get 域名id
     *
     * @return
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * set 域名id
     *
     * @param zoneId
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }


    /**
     * get 主机名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 主机名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 记录类型
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 记录类型
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * get 记录值
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 记录值
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * get TTL
     *
     * @return
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * set TTL
     *
     * @param ttl
     */
    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }


    /**
     * get 代理状态
     *
     * @return
     */
    public Boolean getProxied() {
        return proxied;
    }

    /**
     * set 代理状态
     *
     * @param proxied
     */
    public void setProxied(Boolean proxied) {
        this.proxied = proxied;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 是否可代理
     *
     * @return
     */
    public Boolean getProxiable() {
        return proxiable;
    }

    /**
     * set 是否可代理
     *
     * @param proxiable
     */
    public void setProxiable(Boolean proxiable) {
        this.proxiable = proxiable;
    }


    /**
     * get 优先级
     *
     * @return
     */
    public String getPriority() {
        return priority;
    }

    /**
     * set 优先级
     *
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }



    /**
     * set 解析记录ID
     *
     * @param recordId
     */
    public OpZoneRecords recordId(String recordId) {
        this.recordId = recordId;
        return this;
    }


    /**
     * set 域名id
     *
     * @param zoneId
     */
    public OpZoneRecords zoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }


    /**
     * set 主机名
     *
     * @param name
     */
    public OpZoneRecords name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 记录类型
     *
     * @param type
     */
    public OpZoneRecords type(String type) {
        this.type = type;
        return this;
    }


    /**
     * set 记录值
     *
     * @param content
     */
    public OpZoneRecords content(String content) {
        this.content = content;
        return this;
    }


    /**
     * set TTL
     *
     * @param ttl
     */
    public OpZoneRecords ttl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }


    /**
     * set 代理状态
     *
     * @param proxied
     */
    public OpZoneRecords proxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public OpZoneRecords createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public OpZoneRecords updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 是否可代理
     *
     * @param proxiable
     */
    public OpZoneRecords proxiable(Boolean proxiable) {
        this.proxiable = proxiable;
        return this;
    }


    /**
     * set 优先级
     *
     * @param priority
     */
    public OpZoneRecords priority(String priority) {
        this.priority = priority;
        return this;
    }


}