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
 * gpdjmcLoopListParam
 */
public class GpdjmcLoopListParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数key
     */
    private String paramKey;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 值分隔符
     */
    private String valueDelimiter;



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
     * get 参数值
     *
     * @return
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * set 参数值
     *
     * @param paramValue
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }


    /**
     * get 值分隔符
     *
     * @return
     */
    public String getValueDelimiter() {
        return valueDelimiter;
    }

    /**
     * set 值分隔符
     *
     * @param valueDelimiter
     */
    public void setValueDelimiter(String valueDelimiter) {
        this.valueDelimiter = valueDelimiter;
    }



    /**
     * set 参数key
     *
     * @param paramKey
     */
    public GpdjmcLoopListParam paramKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }


    /**
     * set 参数值
     *
     * @param paramValue
     */
    public GpdjmcLoopListParam paramValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }


    /**
     * set 值分隔符
     *
     * @param valueDelimiter
     */
    public GpdjmcLoopListParam valueDelimiter(String valueDelimiter) {
        this.valueDelimiter = valueDelimiter;
        return this;
    }


}