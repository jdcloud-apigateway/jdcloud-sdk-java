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
 * Function
 * 函数 相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.fc.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * functionName 名称校验。

 */
public class CheckFunctionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * Service Name
     * Required:true
     */
    @Required
    private String serviceName;

    /**
     * Function Name
     * Required:true
     */
    @Required
    private String functionName;



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
     * get Service Name
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set Service Name
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * get Function Name
     *
     * @return
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * set Function Name
     *
     * @param functionName
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }



    /**
     * set Region ID
     *
     * @param regionId
     */
    public CheckFunctionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set Service Name
     *
     * @param serviceName
     */
    public CheckFunctionRequest serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }


    /**
     * set Function Name
     *
     * @param functionName
     */
    public CheckFunctionRequest functionName(String functionName) {
        this.functionName = functionName;
        return this;
    }


}