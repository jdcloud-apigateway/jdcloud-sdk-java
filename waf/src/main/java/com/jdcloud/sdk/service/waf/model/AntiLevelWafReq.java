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
 * antiLevelWafReq
 */
public class AntiLevelWafReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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
     * 0表示宽松，1表示正常，2表示严格, 3表示自定义
     */
    private Integer wafLevel;

    /**
     * 自定义规则集id，wafLevel为3时可以设置
     */
    private Long usrPolicy;


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
     * get 0表示宽松，1表示正常，2表示严格, 3表示自定义
     *
     * @return
     */
    public Integer getWafLevel() {
        return wafLevel;
    }

    /**
     * set 0表示宽松，1表示正常，2表示严格, 3表示自定义
     *
     * @param wafLevel
     */
    public void setWafLevel(Integer wafLevel) {
        this.wafLevel = wafLevel;
    }

    /**
     * get 自定义规则集id，wafLevel为3时可以设置
     *
     * @return
     */
    public Long getUsrPolicy() {
        return usrPolicy;
    }

    /**
     * set 自定义规则集id，wafLevel为3时可以设置
     *
     * @param usrPolicy
     */
    public void setUsrPolicy(Long usrPolicy) {
        this.usrPolicy = usrPolicy;
    }


    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public AntiLevelWafReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public AntiLevelWafReq domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 0表示宽松，1表示正常，2表示严格, 3表示自定义
     *
     * @param wafLevel
     */
    public AntiLevelWafReq wafLevel(Integer wafLevel) {
        this.wafLevel = wafLevel;
        return this;
    }

    /**
     * set 自定义规则集id，wafLevel为3时可以设置
     *
     * @param usrPolicy
     */
    public AntiLevelWafReq usrPolicy(Long usrPolicy) {
        this.usrPolicy = usrPolicy;
        return this;
    }


}