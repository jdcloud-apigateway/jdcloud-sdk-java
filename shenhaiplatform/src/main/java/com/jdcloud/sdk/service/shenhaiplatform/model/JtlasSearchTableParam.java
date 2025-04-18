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

package com.jdcloud.sdk.service.shenhaiplatform.model;


/**
 * jtlasSearchTableParam
 */
public class JtlasSearchTableParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数key
     */
    private String paramKey;

    /**
     * 参数value
     */
    private String paramValue;



    /**
     * get 参数key
     *
     * @return
     */
    public String getParamKey() {
        return paramKey;
    }

    /**
     * set 参数key
     *
     * @param paramKey
     */
    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }


    /**
     * get 参数value
     *
     * @return
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * set 参数value
     *
     * @param paramValue
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }



    /**
     * set 参数key
     *
     * @param paramKey
     */
    public JtlasSearchTableParam paramKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }


    /**
     * set 参数value
     *
     * @param paramValue
     */
    public JtlasSearchTableParam paramValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }


}