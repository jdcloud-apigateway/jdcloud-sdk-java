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

package com.jdcloud.sdk.service.tidb.model;


/**
 * modifyParam
 */
public class ModifyParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数名称
     */
    private String name;

    /**
     * 参数修改值
     */
    private String value;

    /**
     * 参数的节点类型，包括TiKV,TiDB,PD,TiFlash
     */
    private String nodeType;



    /**
     * get 参数名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 参数名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 参数修改值
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 参数修改值
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * get 参数的节点类型，包括TiKV,TiDB,PD,TiFlash
     *
     * @return
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * set 参数的节点类型，包括TiKV,TiDB,PD,TiFlash
     *
     * @param nodeType
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }



    /**
     * set 参数名称
     *
     * @param name
     */
    public ModifyParam name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 参数修改值
     *
     * @param value
     */
    public ModifyParam value(String value) {
        this.value = value;
        return this;
    }


    /**
     * set 参数的节点类型，包括TiKV,TiDB,PD,TiFlash
     *
     * @param nodeType
     */
    public ModifyParam nodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }


}