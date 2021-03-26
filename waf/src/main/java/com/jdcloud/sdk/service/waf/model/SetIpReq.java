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
import com.jdcloud.sdk.annotation.Required;

/**
 * setIpReq
 */
public class SetIpReq  implements java.io.Serializable {

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
     * 0表示黑名单，1表示白名单
     */
    private Integer iswhite;

    /**
     * 0默认关闭，1默认打开
     */
    private Integer isEnable;

    /**
     * ip配置
     * Required:true
     */
    @Required
    private List<IpCfg> ips;


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
     * get 0表示黑名单，1表示白名单
     *
     * @return
     */
    public Integer getIswhite() {
        return iswhite;
    }

    /**
     * set 0表示黑名单，1表示白名单
     *
     * @param iswhite
     */
    public void setIswhite(Integer iswhite) {
        this.iswhite = iswhite;
    }

    /**
     * get 0默认关闭，1默认打开
     *
     * @return
     */
    public Integer getIsEnable() {
        return isEnable;
    }

    /**
     * set 0默认关闭，1默认打开
     *
     * @param isEnable
     */
    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    /**
     * get ip配置
     *
     * @return
     */
    public List<IpCfg> getIps() {
        return ips;
    }

    /**
     * set ip配置
     *
     * @param ips
     */
    public void setIps(List<IpCfg> ips) {
        this.ips = ips;
    }


    /**
     * set WAF实例id
     *
     * @param wafInstanceId
     */
    public SetIpReq wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }

    /**
     * set 域名
     *
     * @param domain
     */
    public SetIpReq domain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * set 0表示黑名单，1表示白名单
     *
     * @param iswhite
     */
    public SetIpReq iswhite(Integer iswhite) {
        this.iswhite = iswhite;
        return this;
    }

    /**
     * set 0默认关闭，1默认打开
     *
     * @param isEnable
     */
    public SetIpReq isEnable(Integer isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    /**
     * set ip配置
     *
     * @param ips
     */
    public SetIpReq ips(List<IpCfg> ips) {
        this.ips = ips;
        return this;
    }


    /**
     * add item to ip配置
     *
     * @param ip
     */
    public void addIp(IpCfg ip) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ip);
    }

}