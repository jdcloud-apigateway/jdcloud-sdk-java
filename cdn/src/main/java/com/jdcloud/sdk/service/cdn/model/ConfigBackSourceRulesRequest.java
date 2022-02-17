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
 * 域名操作类接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 回源改写批量配置
 */
public class ConfigBackSourceRulesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * on/off，若为off则数组需为空，若为on则数组不可为空
     */
    private String status;

    /**
     * rules
     */
    private List<BackSourceRule> rules;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get on/off，若为off则数组需为空，若为on则数组不可为空
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set on/off，若为off则数组需为空，若为on则数组不可为空
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get rules
     *
     * @return
     */
    public List<BackSourceRule> getRules() {
        return rules;
    }

    /**
     * set rules
     *
     * @param rules
     */
    public void setRules(List<BackSourceRule> rules) {
        this.rules = rules;
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
     * set on/off，若为off则数组需为空，若为on则数组不可为空
     *
     * @param status
     */
    public ConfigBackSourceRulesRequest status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set rules
     *
     * @param rules
     */
    public ConfigBackSourceRulesRequest rules(List<BackSourceRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public ConfigBackSourceRulesRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * add item to rules
     *
     * @param rule
     */
    public void addRule(BackSourceRule rule) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rule);
    }

}