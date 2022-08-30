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
 * SCDN相关接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除WAF白名单
 */
public class DeleteWafWhiteRulesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ruleType
     * Required:true
     */
    @Required
    private String ruleType;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;

    /**
     * ids
     * Required:true
     */
    @Required
    private String ids;



    /**
     * get ruleType
     *
     * @return
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * set ruleType
     *
     * @param ruleType
     */
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }


    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * get ids
     *
     * @return
     */
    public String getIds() {
        return ids;
    }

    /**
     * set ids
     *
     * @param ids
     */
    public void setIds(String ids) {
        this.ids = ids;
    }



    /**
     * set ruleType
     *
     * @param ruleType
     */
    public DeleteWafWhiteRulesRequest ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }


    /**
     * set 用户域名
     *
     * @param domain
     */
    public DeleteWafWhiteRulesRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set ids
     *
     * @param ids
     */
    public DeleteWafWhiteRulesRequest ids(String ids) {
        this.ids = ids;
        return this;
    }


}