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
 * back source configuration openapi
 * back source configuration openapi
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ossopenapi.model;


/**
 * backSourceRuleCondition
 */
public class BackSourceRuleCondition  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前缀为指定的前缀时开启回源
     */
    private String keyPrefixEquals;

    /**
     * 当http错误码为指定错误码时开启回源
     */
    private Integer httpErrorCodeReturnedEquals;


    /**
     * get 当前缀为指定的前缀时开启回源
     *
     * @return
     */
    public String getKeyPrefixEquals() {
        return keyPrefixEquals;
    }

    /**
     * set 当前缀为指定的前缀时开启回源
     *
     * @param keyPrefixEquals
     */
    public void setKeyPrefixEquals(String keyPrefixEquals) {
        this.keyPrefixEquals = keyPrefixEquals;
    }

    /**
     * get 当http错误码为指定错误码时开启回源
     *
     * @return
     */
    public Integer getHttpErrorCodeReturnedEquals() {
        return httpErrorCodeReturnedEquals;
    }

    /**
     * set 当http错误码为指定错误码时开启回源
     *
     * @param httpErrorCodeReturnedEquals
     */
    public void setHttpErrorCodeReturnedEquals(Integer httpErrorCodeReturnedEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
    }


    /**
     * set 当前缀为指定的前缀时开启回源
     *
     * @param keyPrefixEquals
     */
    public BackSourceRuleCondition keyPrefixEquals(String keyPrefixEquals) {
        this.keyPrefixEquals = keyPrefixEquals;
        return this;
    }

    /**
     * set 当http错误码为指定错误码时开启回源
     *
     * @param httpErrorCodeReturnedEquals
     */
    public BackSourceRuleCondition httpErrorCodeReturnedEquals(Integer httpErrorCodeReturnedEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
        return this;
    }


}