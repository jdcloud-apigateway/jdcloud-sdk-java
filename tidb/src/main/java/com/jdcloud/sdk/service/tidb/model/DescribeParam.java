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
 * describeParam
 */
public class DescribeParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 参数名称
     */
    private String name;

    /**
     * 参数的描述
     */
    private String description;

    /**
     * 参数的节点类型，包括TiKV,TiDB,PD,TiFlash
     */
    private String nodeType;

    /**
     * 参数的默认数值
     */
    private String defaultValue;

    /**
     * 参数的当前值
     */
    private String currentValue;

    /**
     * 参数修改是否需要重启生效，大小写敏感 -true:参数需要重启才能生效 -false:参数无需重启生效
     */
    private Boolean needRestart;



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
     * get 参数的描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 参数的描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * get 参数的默认数值
     *
     * @return
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * set 参数的默认数值
     *
     * @param defaultValue
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * get 参数的当前值
     *
     * @return
     */
    public String getCurrentValue() {
        return currentValue;
    }

    /**
     * set 参数的当前值
     *
     * @param currentValue
     */
    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }


    /**
     * get 参数修改是否需要重启生效，大小写敏感 -true:参数需要重启才能生效 -false:参数无需重启生效
     *
     * @return
     */
    public Boolean getNeedRestart() {
        return needRestart;
    }

    /**
     * set 参数修改是否需要重启生效，大小写敏感 -true:参数需要重启才能生效 -false:参数无需重启生效
     *
     * @param needRestart
     */
    public void setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
    }



    /**
     * set 参数名称
     *
     * @param name
     */
    public DescribeParam name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 参数的描述
     *
     * @param description
     */
    public DescribeParam description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 参数的节点类型，包括TiKV,TiDB,PD,TiFlash
     *
     * @param nodeType
     */
    public DescribeParam nodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }


    /**
     * set 参数的默认数值
     *
     * @param defaultValue
     */
    public DescribeParam defaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }


    /**
     * set 参数的当前值
     *
     * @param currentValue
     */
    public DescribeParam currentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }


    /**
     * set 参数修改是否需要重启生效，大小写敏感 -true:参数需要重启才能生效 -false:参数无需重启生效
     *
     * @param needRestart
     */
    public DescribeParam needRestart(Boolean needRestart) {
        this.needRestart = needRestart;
        return this;
    }


}