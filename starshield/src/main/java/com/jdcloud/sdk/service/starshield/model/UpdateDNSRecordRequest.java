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
 * DNS-Record-Service
 * Documentation for JDC StarShield DNS records
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.starshield.model.SRVdata;
import com.jdcloud.sdk.service.starshield.model.CAAdata;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * updateDNSRecordRequest
 */
public class UpdateDNSRecordRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * DNS记录类型
     */
    private String ty_pe;

    /**
     * DNS记录名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * DNS记录内容
     * Required:true
     */
    @Required
    private String content;

    /**
     * DNS记录的生存时间。值为1是 &quot;自动&quot;。
     * Required:true
     */
    @Required
    private Number ttl;

    /**
     * 是否利用星盾的性能和安全优势
     */
    private Boolean proxied;

    /**
     * 如果是MX记录，该属性是必需的
     */
    private Integer priority;

    /**
     * srvData
     */
    private SRVdata srvData;

    /**
     * caaData
     */
    private CAAdata caaData;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;

    /**
     * identifier
     * Required:true
     */
    @Required
    private String identifier;



    /**
     * get DNS记录类型
     *
     * @return
     */
    public String getTy_pe() {
        return ty_pe;
    }

    /**
     * set DNS记录类型
     *
     * @param ty_pe
     */
    public void setTy_pe(String ty_pe) {
        this.ty_pe = ty_pe;
    }


    /**
     * get DNS记录名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set DNS记录名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get DNS记录内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set DNS记录内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * get DNS记录的生存时间。值为1是 &quot;自动&quot;。
     *
     * @return
     */
    public Number getTtl() {
        return ttl;
    }

    /**
     * set DNS记录的生存时间。值为1是 &quot;自动&quot;。
     *
     * @param ttl
     */
    public void setTtl(Number ttl) {
        this.ttl = ttl;
    }


    /**
     * get 是否利用星盾的性能和安全优势
     *
     * @return
     */
    public Boolean getProxied() {
        return proxied;
    }

    /**
     * set 是否利用星盾的性能和安全优势
     *
     * @param proxied
     */
    public void setProxied(Boolean proxied) {
        this.proxied = proxied;
    }


    /**
     * get 如果是MX记录，该属性是必需的
     *
     * @return
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * set 如果是MX记录，该属性是必需的
     *
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    /**
     * get srvData
     *
     * @return
     */
    public SRVdata getSrvData() {
        return srvData;
    }

    /**
     * set srvData
     *
     * @param srvData
     */
    public void setSrvData(SRVdata srvData) {
        this.srvData = srvData;
    }


    /**
     * get caaData
     *
     * @return
     */
    public CAAdata getCaaData() {
        return caaData;
    }

    /**
     * set caaData
     *
     * @param caaData
     */
    public void setCaaData(CAAdata caaData) {
        this.caaData = caaData;
    }


    /**
     * get zone_identifier
     *
     * @return
     */
    public String getZone_identifier() {
        return zone_identifier;
    }

    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public void setZone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
    }


    /**
     * get identifier
     *
     * @return
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * set identifier
     *
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }



    /**
     * set DNS记录类型
     *
     * @param ty_pe
     */
    public UpdateDNSRecordRequest ty_pe(String ty_pe) {
        this.ty_pe = ty_pe;
        return this;
    }


    /**
     * set DNS记录名称
     *
     * @param name
     */
    public UpdateDNSRecordRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set DNS记录内容
     *
     * @param content
     */
    public UpdateDNSRecordRequest content(String content) {
        this.content = content;
        return this;
    }


    /**
     * set DNS记录的生存时间。值为1是 &quot;自动&quot;。
     *
     * @param ttl
     */
    public UpdateDNSRecordRequest ttl(Number ttl) {
        this.ttl = ttl;
        return this;
    }


    /**
     * set 是否利用星盾的性能和安全优势
     *
     * @param proxied
     */
    public UpdateDNSRecordRequest proxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }


    /**
     * set 如果是MX记录，该属性是必需的
     *
     * @param priority
     */
    public UpdateDNSRecordRequest priority(Integer priority) {
        this.priority = priority;
        return this;
    }


    /**
     * set srvData
     *
     * @param srvData
     */
    public UpdateDNSRecordRequest srvData(SRVdata srvData) {
        this.srvData = srvData;
        return this;
    }


    /**
     * set caaData
     *
     * @param caaData
     */
    public UpdateDNSRecordRequest caaData(CAAdata caaData) {
        this.caaData = caaData;
        return this;
    }


    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public UpdateDNSRecordRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }


    /**
     * set identifier
     *
     * @param identifier
     */
    public UpdateDNSRecordRequest identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }


}