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

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * pair
 */
public class Pair  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * key
     * Required:true
     */
    @Required
    private String key;

    /**
     * value
     * Required:true
     */
    @Required
    private String value;



    /**
     * get key
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set key
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * get value
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set value
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }



    /**
     * set key
     *
     * @param key
     */
    public Pair key(String key) {
        this.key = key;
        return this;
    }


    /**
     * set value
     *
     * @param value
     */
    public Pair value(String value) {
        this.value = value;
        return this;
    }


}