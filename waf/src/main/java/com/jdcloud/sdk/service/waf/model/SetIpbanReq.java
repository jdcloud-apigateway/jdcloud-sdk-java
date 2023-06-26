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
 * setIpbanReq
 */
public class SetIpbanReq  implements java.io.Serializable {

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
     * 防护模式 1宽松模式，2正常模式，3严格模式
     * Required:true
     */
    @Required
    private Integer ipbanMode;

    /**
     * 动作配置
     * Required:true
     */
    @Required
    private DenyActionCfg action;



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
     * get 防护模式 1宽松模式，2正常模式，3严格模式
     *
     * @return
     */
    public Integer getIpbanMode() {
        return ipbanMode;
    }

    /**
     * set 防护模式 1宽松模式，2正常模式，3严格模式
     *
     * @param ipbanMode
     */
    public void setIpbanMode(Integer ipbanMode) {
        this.ipbanMode = ipbanMode;
    }


    /**
     * get 动作配置
     *
     * @return
     */
    public DenyActionCfg getAction() {
        return action;
    }

    /**
     * set 动作配置
     *
     * @param action
     */
    public void setAction(DenyActionCfg action) {
        this.action = action;
    }



    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public SetIpbanReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 域名
     *
     * @param domain
     */
    public SetIpbanReq domain(String domain) {
        this.domain = domain;
        return this;
    }


    /**
     * set 防护模式 1宽松模式，2正常模式，3严格模式
     *
     * @param ipbanMode
     */
    public SetIpbanReq ipbanMode(Integer ipbanMode) {
        this.ipbanMode = ipbanMode;
        return this;
    }


    /**
     * set 动作配置
     *
     * @param action
     */
    public SetIpbanReq action(DenyActionCfg action) {
        this.action = action;
        return this;
    }


}