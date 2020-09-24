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
 * Domain-Protection
 * Domain-Protection API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.waf.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.waf.model.DelRulesReq;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除网站黑白名单ip配置
 */
public class DelIpsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 请求
     * Required:true
     */
    @Required
    private DelRulesReq req;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 实例Id
     * Required:true
     */
    @Required
    private String wafInstanceId;


    /**
     * get 请求
     *
     * @return
     */
    public DelRulesReq getReq() {
        return req;
    }

    /**
     * set 请求
     *
     * @param req
     */
    public void setReq(DelRulesReq req) {
        this.req = req;
    }

    /**
     * get 实例所属的地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 实例Id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例Id
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * set 请求
     *
     * @param req
     */
    public DelIpsRequest req(DelRulesReq req) {
        this.req = req;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public DelIpsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 实例Id
     *
     * @param wafInstanceId
     */
    public DelIpsRequest wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


}