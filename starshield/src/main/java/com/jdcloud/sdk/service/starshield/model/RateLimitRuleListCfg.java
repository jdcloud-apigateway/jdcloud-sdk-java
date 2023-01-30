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
 * rateLimitRuleListCfg
 */
public class RateLimitRuleListCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号id
     */
    private Integer id;

    /**
     * updateTime
     */
    private String updateTime;

    /**
     * 0-使用中 1-禁用
     */
    private Integer disable;

    /**
     * 规则名称
     */
    private String name;

    /**
     * 限速host配置
     */
    private MatchOpValCfg host;

    /**
     * 限速url配置
     */
    private MatchOpValCfg url;

    /**
     * ip配置
     */
    private String ip;

    /**
     * 限速大小
     */
    private Integer rate;

    /**
     * 限速burst大小
     */
    private Integer burst;

    /**
     * 匹配动作, 拦截:forbidden,redirect 人机识别:verify@jscookie,verify@captcha,verify@rdtcookie 观察:notice
     */
    private String matchAction;

    /**
     * 跳转地址，matchAction为redirect时必须为当前实例下的域名的url，forbidden时为自定义页面名称
     */
    private String redirection;



    /**
     * get 序号id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 序号id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get updateTime
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set updateTime
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 0-使用中 1-禁用
     *
     * @return
     */
    public Integer getDisable() {
        return disable;
    }

    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public void setDisable(Integer disable) {
        this.disable = disable;
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
     * get 限速host配置
     *
     * @return
     */
    public MatchOpValCfg getHost() {
        return host;
    }

    /**
     * set 限速host配置
     *
     * @param host
     */
    public void setHost(MatchOpValCfg host) {
        this.host = host;
    }


    /**
     * get 限速url配置
     *
     * @return
     */
    public MatchOpValCfg getUrl() {
        return url;
    }

    /**
     * set 限速url配置
     *
     * @param url
     */
    public void setUrl(MatchOpValCfg url) {
        this.url = url;
    }


    /**
     * get ip配置
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set ip配置
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }


    /**
     * get 限速大小
     *
     * @return
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * set 限速大小
     *
     * @param rate
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }


    /**
     * get 限速burst大小
     *
     * @return
     */
    public Integer getBurst() {
        return burst;
    }

    /**
     * set 限速burst大小
     *
     * @param burst
     */
    public void setBurst(Integer burst) {
        this.burst = burst;
    }


    /**
     * get 匹配动作, 拦截:forbidden,redirect 人机识别:verify@jscookie,verify@captcha,verify@rdtcookie 观察:notice
     *
     * @return
     */
    public String getMatchAction() {
        return matchAction;
    }

    /**
     * set 匹配动作, 拦截:forbidden,redirect 人机识别:verify@jscookie,verify@captcha,verify@rdtcookie 观察:notice
     *
     * @param matchAction
     */
    public void setMatchAction(String matchAction) {
        this.matchAction = matchAction;
    }


    /**
     * get 跳转地址，matchAction为redirect时必须为当前实例下的域名的url，forbidden时为自定义页面名称
     *
     * @return
     */
    public String getRedirection() {
        return redirection;
    }

    /**
     * set 跳转地址，matchAction为redirect时必须为当前实例下的域名的url，forbidden时为自定义页面名称
     *
     * @param redirection
     */
    public void setRedirection(String redirection) {
        this.redirection = redirection;
    }



    /**
     * set 序号id
     *
     * @param id
     */
    public RateLimitRuleListCfg id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set updateTime
     *
     * @param updateTime
     */
    public RateLimitRuleListCfg updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 0-使用中 1-禁用
     *
     * @param disable
     */
    public RateLimitRuleListCfg disable(Integer disable) {
        this.disable = disable;
        return this;
    }


    /**
     * set 规则名称
     *
     * @param name
     */
    public RateLimitRuleListCfg name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 限速host配置
     *
     * @param host
     */
    public RateLimitRuleListCfg host(MatchOpValCfg host) {
        this.host = host;
        return this;
    }


    /**
     * set 限速url配置
     *
     * @param url
     */
    public RateLimitRuleListCfg url(MatchOpValCfg url) {
        this.url = url;
        return this;
    }


    /**
     * set ip配置
     *
     * @param ip
     */
    public RateLimitRuleListCfg ip(String ip) {
        this.ip = ip;
        return this;
    }


    /**
     * set 限速大小
     *
     * @param rate
     */
    public RateLimitRuleListCfg rate(Integer rate) {
        this.rate = rate;
        return this;
    }


    /**
     * set 限速burst大小
     *
     * @param burst
     */
    public RateLimitRuleListCfg burst(Integer burst) {
        this.burst = burst;
        return this;
    }


    /**
     * set 匹配动作, 拦截:forbidden,redirect 人机识别:verify@jscookie,verify@captcha,verify@rdtcookie 观察:notice
     *
     * @param matchAction
     */
    public RateLimitRuleListCfg matchAction(String matchAction) {
        this.matchAction = matchAction;
        return this;
    }


    /**
     * set 跳转地址，matchAction为redirect时必须为当前实例下的域名的url，forbidden时为自定义页面名称
     *
     * @param redirection
     */
    public RateLimitRuleListCfg redirection(String redirection) {
        this.redirection = redirection;
        return this;
    }


}