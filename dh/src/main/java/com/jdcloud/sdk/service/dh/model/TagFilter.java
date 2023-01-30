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

package com.jdcloud.sdk.service.dh.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 自定义标签过滤器。
 */
public class TagFilter  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签key。
     */
    private String key;

    /**
     * 标签value。
     */
    
    private List<String> values;


    /**
     * get 标签key。
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 标签key。
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
    * get 标签value。
    *
    * @return
    */
    public List<String> getValues() {
        return values;
    }

    /**
    * set 标签value。
    *
    * @param values
    */
    public void setValues(List<String> values) {
        this.values = values;
    }



    /**
     * set 标签key。
     *
     * @param key
     */
    public TagFilter key(String key) {
        this.key = key;
        return this;
    }


    /**
    * set 标签value。
    *
    * @param values
    */
    public TagFilter values(List<String> values) {
        this.values = values;
        return this;
    }



    /**
     * add item to 标签value。
     *
     * @param value
     */
    public void addValue(String value) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(value);
    }
}