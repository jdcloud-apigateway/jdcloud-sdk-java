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
 * setRiskRuleReq
 */
public class SetRiskRuleReq  implements java.io.Serializable {

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
     * 规则名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * uri 以/开头
     * Required:true
     */
    @Required
    private String uri;

    /**
     * 动作 支持 verify@captcha / verify@jscookie / forbidden / notice / redirect
     * Required:true
     */
    @Required
    private String action;

    /**
     * 请求方法 支持 POST:1,GET:1,PUT:1
     * Required:true
     */
    @Required
    private String methods;

    /**
     * 场景 支持 account_login / account_register / data_risk_control
     * Required:true
     */
    @Required
    private String sceneRef;

    /**
     * 事件 支持 passwd:BODY.passwd,username:ARGS.username
     * Required:true
     */
    @Required
    private String event;

    /**
     * 跳转地址，Action为redirect时必须为当前实例下的域名的url，forbidden时为自定义页面名称
     * Required:true
     */
    @Required
    private String redirection;


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
     * get 规则名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 规则名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * get 动作 支持 verify@captcha / verify@jscookie / forbidden / notice / redirect
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 动作 支持 verify@captcha / verify@jscookie / forbidden / notice / redirect
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 请求方法 支持 POST:1,GET:1,PUT:1
     *
     * @return
     */
    public String getMethods() {
        return methods;
    }

    /**
     * set 请求方法 支持 POST:1,GET:1,PUT:1
     *
     * @param methods
     */
    public void setMethods(String methods) {
        this.methods = methods;
    }

    /**
     * get 场景 支持 account_login / account_register / data_risk_control
     *
     * @return
     */
    public String getSceneRef() {
        return sceneRef;
    }

    /**
     * set 场景 支持 account_login / account_register / data_risk_control
     *
     * @param sceneRef
     */
    public void setSceneRef(String sceneRef) {
        this.sceneRef = sceneRef;
    }

    /**
     * get 事件 支持 passwd:BODY.passwd,username:ARGS.username
     *
     * @return
     */
    public String getEvent() {
        return event;
    }

    /**
     * set 事件 支持 passwd:BODY.passwd,username:ARGS.username
     *
     * @param event
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * get 跳转地址，Action为redirect时必须为当前实例下的域名的url，forbidden时为自定义页面名称
     *
     * @return
     */
    public String getRedirection() {
        return redirection;
    }

    /**
     * set 跳转地址，Action为redirect时必须为当前实例下的域名的url，forbidden时为自定义页面名称
     *
     * @param redirection
     */
    public void setRedirection(String redirection) {
        this.redirection = redirection;
    }


    /**
     * set 规则id,新增时传0
     *
     * @param id
     */
    public SetRiskRuleReq id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public SetRiskRuleReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public SetRiskRuleReq domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 规则名称
     *
     * @param name
     */
    public SetRiskRuleReq name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set uri 以/开头
     *
     * @param uri
     */
    public SetRiskRuleReq uri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * set 动作 支持 verify@captcha / verify@jscookie / forbidden / notice / redirect
     *
     * @param action
     */
    public SetRiskRuleReq action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 请求方法 支持 POST:1,GET:1,PUT:1
     *
     * @param methods
     */
    public SetRiskRuleReq methods(String methods) {
        this.methods = methods;
        return this;
    }

    /**
     * set 场景 支持 account_login / account_register / data_risk_control
     *
     * @param sceneRef
     */
    public SetRiskRuleReq sceneRef(String sceneRef) {
        this.sceneRef = sceneRef;
        return this;
    }

    /**
     * set 事件 支持 passwd:BODY.passwd,username:ARGS.username
     *
     * @param event
     */
    public SetRiskRuleReq event(String event) {
        this.event = event;
        return this;
    }

    /**
     * set 跳转地址，Action为redirect时必须为当前实例下的域名的url，forbidden时为自定义页面名称
     *
     * @param redirection
     */
    public SetRiskRuleReq redirection(String redirection) {
        this.redirection = redirection;
        return this;
    }


}