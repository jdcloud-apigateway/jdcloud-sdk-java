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

package com.jdcloud.sdk.service.ydsms.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * modifySmsAppReqVO
 */
public class ModifySmsAppReqVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用描述
     * Required:true
     */
    @Required
    private Integer appDesc;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private Integer appName;


    /**
     * get 应用描述
     *
     * @return
     */
    public Integer getAppDesc() {
        return appDesc;
    }

    /**
     * set 应用描述
     *
     * @param appDesc
     */
    public void setAppDesc(Integer appDesc) {
        this.appDesc = appDesc;
    }

    /**
     * get 应用名称
     *
     * @return
     */
    public Integer getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(Integer appName) {
        this.appName = appName;
    }


    /**
     * set 应用描述
     *
     * @param appDesc
     */
    public ModifySmsAppReqVO appDesc(Integer appDesc) {
        this.appDesc = appDesc;
        return this;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public ModifySmsAppReqVO appName(Integer appName) {
        this.appName = appName;
        return this;
    }


}