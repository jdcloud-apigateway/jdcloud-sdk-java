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
 * Function OpenAPI
 * 
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.function.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取版本详情
 */
public class GetVersionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 函数名称
     * Required:true
     */
    @Required
    private String functionName;

    /**
     * 版本名称
     * Required:true
     */
    @Required
    private String versionName;


    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 函数名称
     *
     * @return
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * set 函数名称
     *
     * @param functionName
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * get 版本名称
     *
     * @return
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * set 版本名称
     *
     * @param versionName
     */
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }


    /**
     * set Region ID
     *
     * @param regionId
     */
    public GetVersionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 函数名称
     *
     * @param functionName
     */
    public GetVersionRequest functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * set 版本名称
     *
     * @param versionName
     */
    public GetVersionRequest versionName(String versionName) {
        this.versionName = versionName;
        return this;
    }


}