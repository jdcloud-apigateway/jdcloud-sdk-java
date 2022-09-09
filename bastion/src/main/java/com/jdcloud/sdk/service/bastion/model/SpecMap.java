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

package com.jdcloud.sdk.service.bastion.model;


/**
 * specMap
 */
public class SpecMap  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规格id
     */
    private String value;

    /**
     * 规格名
     */
    private String label;

    /**
     * 硬盘信息
     */
    private String disk;

    /**
     * 规格描述
     */
    private String describe;



    /**
     * get 规格id
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 规格id
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * get 规格名
     *
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * set 规格名
     *
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }


    /**
     * get 硬盘信息
     *
     * @return
     */
    public String getDisk() {
        return disk;
    }

    /**
     * set 硬盘信息
     *
     * @param disk
     */
    public void setDisk(String disk) {
        this.disk = disk;
    }


    /**
     * get 规格描述
     *
     * @return
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * set 规格描述
     *
     * @param describe
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }



    /**
     * set 规格id
     *
     * @param value
     */
    public SpecMap value(String value) {
        this.value = value;
        return this;
    }


    /**
     * set 规格名
     *
     * @param label
     */
    public SpecMap label(String label) {
        this.label = label;
        return this;
    }


    /**
     * set 硬盘信息
     *
     * @param disk
     */
    public SpecMap disk(String disk) {
        this.disk = disk;
        return this;
    }


    /**
     * set 规格描述
     *
     * @param describe
     */
    public SpecMap describe(String describe) {
        this.describe = describe;
        return this;
    }


}