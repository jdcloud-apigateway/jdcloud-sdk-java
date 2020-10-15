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
 * 敏感库管理类接口
 * 京东云内容安全-OpenAPI敏感库管理类接口
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
 * 删除敏感库
 */
public class DeleteCensorLibRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 敏感库id
     * Required:true
     */
    @Required
    private String libId;

    /**
     * 实例所属的地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 敏感库id
     *
     * @return
     */
    public String getLibId() {
        return libId;
    }

    /**
     * set 敏感库id
     *
     * @param libId
     */
    public void setLibId(String libId) {
        this.libId = libId;
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
     * set 敏感库id
     *
     * @param libId
     */
    public DeleteCensorLibRequest libId(String libId) {
        this.libId = libId;
        return this;
    }

    /**
     * set 实例所属的地域ID
     *
     * @param regionId
     */
    public DeleteCensorLibRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}