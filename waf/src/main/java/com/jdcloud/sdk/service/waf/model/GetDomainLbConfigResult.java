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
 * Domain
 * Domain API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.service.waf.model.LbConfig;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取网站lb配置
 */
public class GetDomainLbConfigResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例id
     */
    private String wafInstanceId;

    /**
     * 网站lb配置
     */
    private LbConfig config;



    /**
     * get 实例id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * get 网站lb配置
     *
     * @return
     */
    public LbConfig getConfig() {
        return config;
    }

    /**
     * set 网站lb配置
     *
     * @param config
     */
    public void setConfig(LbConfig config) {
        this.config = config;
    }



    /**
     * set 实例id
     *
     * @param wafInstanceId
     */
    public GetDomainLbConfigResult wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


    /**
     * set 网站lb配置
     *
     * @param config
     */
    public GetDomainLbConfigResult config(LbConfig config) {
        this.config = config;
        return this;
    }


}