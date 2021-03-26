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

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;

/**
 * statusCodeData
 */
public class StatusCodeData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 异常状态码域名TOP10
     */
    private List<TopCodeValue> domainTop10;

    /**
     * 异常状态码URL的TOP10
     */
    private List<TopCodeValue> urlTop10;

    /**
     * 状态码响应统计，当请求字段isStaCode为true时返回
     */
    private ChartItemValue statusCodeTotal;

    /**
     * 状态码响应占比，当请求字段isStaCode为true时返回
     */
    private List<TopValue> statusCodePie;


    /**
     * get 异常状态码域名TOP10
     *
     * @return
     */
    public List<TopCodeValue> getDomainTop10() {
        return domainTop10;
    }

    /**
     * set 异常状态码域名TOP10
     *
     * @param domainTop10
     */
    public void setDomainTop10(List<TopCodeValue> domainTop10) {
        this.domainTop10 = domainTop10;
    }

    /**
     * get 异常状态码URL的TOP10
     *
     * @return
     */
    public List<TopCodeValue> getUrlTop10() {
        return urlTop10;
    }

    /**
     * set 异常状态码URL的TOP10
     *
     * @param urlTop10
     */
    public void setUrlTop10(List<TopCodeValue> urlTop10) {
        this.urlTop10 = urlTop10;
    }

    /**
     * get 状态码响应统计，当请求字段isStaCode为true时返回
     *
     * @return
     */
    public ChartItemValue getStatusCodeTotal() {
        return statusCodeTotal;
    }

    /**
     * set 状态码响应统计，当请求字段isStaCode为true时返回
     *
     * @param statusCodeTotal
     */
    public void setStatusCodeTotal(ChartItemValue statusCodeTotal) {
        this.statusCodeTotal = statusCodeTotal;
    }

    /**
     * get 状态码响应占比，当请求字段isStaCode为true时返回
     *
     * @return
     */
    public List<TopValue> getStatusCodePie() {
        return statusCodePie;
    }

    /**
     * set 状态码响应占比，当请求字段isStaCode为true时返回
     *
     * @param statusCodePie
     */
    public void setStatusCodePie(List<TopValue> statusCodePie) {
        this.statusCodePie = statusCodePie;
    }


    /**
     * set 异常状态码域名TOP10
     *
     * @param domainTop10
     */
    public StatusCodeData domainTop10(List<TopCodeValue> domainTop10) {
        this.domainTop10 = domainTop10;
        return this;
    }

    /**
     * set 异常状态码URL的TOP10
     *
     * @param urlTop10
     */
    public StatusCodeData urlTop10(List<TopCodeValue> urlTop10) {
        this.urlTop10 = urlTop10;
        return this;
    }

    /**
     * set 状态码响应统计，当请求字段isStaCode为true时返回
     *
     * @param statusCodeTotal
     */
    public StatusCodeData statusCodeTotal(ChartItemValue statusCodeTotal) {
        this.statusCodeTotal = statusCodeTotal;
        return this;
    }

    /**
     * set 状态码响应占比，当请求字段isStaCode为true时返回
     *
     * @param statusCodePie
     */
    public StatusCodeData statusCodePie(List<TopValue> statusCodePie) {
        this.statusCodePie = statusCodePie;
        return this;
    }


    /**
     * add item to 异常状态码域名TOP10
     *
     * @param domainTop10
     */
    public void addDomainTop10(TopCodeValue domainTop10) {
        if (this.domainTop10 == null) {
            this.domainTop10 = new ArrayList<>();
        }
        this.domainTop10.add(domainTop10);
    }

    /**
     * add item to 异常状态码URL的TOP10
     *
     * @param urlTop10
     */
    public void addUrlTop10(TopCodeValue urlTop10) {
        if (this.urlTop10 == null) {
            this.urlTop10 = new ArrayList<>();
        }
        this.urlTop10.add(urlTop10);
    }

    /**
     * add item to 状态码响应占比，当请求字段isStaCode为true时返回
     *
     * @param statusCodePie
     */
    public void addStatusCodePie(TopValue statusCodePie) {
        if (this.statusCodePie == null) {
            this.statusCodePie = new ArrayList<>();
        }
        this.statusCodePie.add(statusCodePie);
    }

}