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
 * 限制参数类接口
 * 京东云内容安全-OpenAPI限制参数类接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.censor.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除限制参数配置
 */
public class DeleteLimitRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 限制参数配置id
     * Required:true
     */
    @Required
    private String limitId;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 限制参数配置id
     *
     * @return
     */
    public String getLimitId() {
        return limitId;
    }

    /**
     * set 限制参数配置id
     *
     * @param limitId
     */
    public void setLimitId(String limitId) {
        this.limitId = limitId;
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
     * set 限制参数配置id
     *
     * @param limitId
     */
    public DeleteLimitRequest limitId(String limitId) {
        this.limitId = limitId;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public DeleteLimitRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}