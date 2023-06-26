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

import com.jdcloud.sdk.annotation.Required;

/**
 * setRiskJsReq
 */
public class SetRiskJsReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则id,新增时传0
     */
    private Integer id;

    /**
     * WAF实例id
     * Required:true
     */
    @Required
    private String wafInstanceId;

    /**
     * 域名
     * Required:true
     */
    @Required
    private String domain;

    /**
     * 匹配类型   完全匹配&quot;&quot; 前缀匹配:&quot;sw&quot;
     */
    private String matchOp;

    /**
     * uri 以/开头
     * Required:true
     */
    @Required
    private String uri;



    /**
     * get 规则id,新增时传0
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 规则id,新增时传0
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get WAF实例id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * get 域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get 匹配类型   完全匹配&quot;&quot; 前缀匹配:&quot;sw&quot;
     *
     * @return
     */
    public String getMatchOp() {
        return matchOp;
    }

    /**
     * set 匹配类型   完全匹配&quot;&quot; 前缀匹配:&quot;sw&quot;
     *
     * @param matchOp
     */
    public void setMatchOp(String matchOp) {
        this.matchOp = matchOp;
    }


    /**
     * get uri 以/开头
     *
     * @return
     */
    public String getUri() {
        return uri;
    }

    /**
     * set uri 以/开头
     *
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }



    /**
     * set 规则id,新增时传0
     *
     * @param id
     */
    public SetRiskJsReq id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public SetRiskJsReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public SetRiskJsReq domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 匹配类型   完全匹配&quot;&quot; 前缀匹配:&quot;sw&quot;
     *
     * @param matchOp
     */
    public SetRiskJsReq matchOp(String matchOp) {
        this.matchOp = matchOp;
        return this;
    }


    /**
     * set uri 以/开头
     *
     * @param uri
     */
    public SetRiskJsReq uri(String uri) {
        this.uri = uri;
        return this;
    }


}