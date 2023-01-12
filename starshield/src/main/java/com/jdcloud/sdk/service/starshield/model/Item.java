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

package com.jdcloud.sdk.service.starshield.model;


/**
 * item
 */
public class Item  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 项的名称
     */
    private String name;

    /**
     * 项的值。
如果是带宽，值的单位是bps（bit per second）
如果是流量，值的单位是Byte
如果是请求量，值的单位是次数

     */
    private Number value;

    /**
     * unit
     */
    private String unit;



    /**
     * get 项的名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 项的名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 项的值。
如果是带宽，值的单位是bps（bit per second）
如果是流量，值的单位是Byte
如果是请求量，值的单位是次数

     *
     * @return
     */
    public Number getValue() {
        return value;
    }

    /**
     * set 项的值。
如果是带宽，值的单位是bps（bit per second）
如果是流量，值的单位是Byte
如果是请求量，值的单位是次数

     *
     * @param value
     */
    public void setValue(Number value) {
        this.value = value;
    }


    /**
     * get unit
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set unit
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }



    /**
     * set 项的名称
     *
     * @param name
     */
    public Item name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 项的值。
如果是带宽，值的单位是bps（bit per second）
如果是流量，值的单位是Byte
如果是请求量，值的单位是次数

     *
     * @param value
     */
    public Item value(Number value) {
        this.value = value;
        return this;
    }


    /**
     * set unit
     *
     * @param unit
     */
    public Item unit(String unit) {
        this.unit = unit;
        return this;
    }


}