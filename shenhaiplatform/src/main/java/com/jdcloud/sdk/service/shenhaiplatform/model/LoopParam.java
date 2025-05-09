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
 * 循环节点列表元素信息
 */
public class LoopParam  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 元素名称
     */
    private String elementName;

    /**
     * 元素取值列表
     */
    private String elementValues;

    /**
     * 元素取值列表分隔符
     */
    private TaskLoopElementDelimiterVo delimiter;



    /**
     * get 元素名称
     *
     * @return
     */
    public String getElementName() {
        return elementName;
    }

    /**
     * set 元素名称
     *
     * @param elementName
     */
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }


    /**
     * get 元素取值列表
     *
     * @return
     */
    public String getElementValues() {
        return elementValues;
    }

    /**
     * set 元素取值列表
     *
     * @param elementValues
     */
    public void setElementValues(String elementValues) {
        this.elementValues = elementValues;
    }


    /**
     * get 元素取值列表分隔符
     *
     * @return
     */
    public TaskLoopElementDelimiterVo getDelimiter() {
        return delimiter;
    }

    /**
     * set 元素取值列表分隔符
     *
     * @param delimiter
     */
    public void setDelimiter(TaskLoopElementDelimiterVo delimiter) {
        this.delimiter = delimiter;
    }



    /**
     * set 元素名称
     *
     * @param elementName
     */
    public LoopParam elementName(String elementName) {
        this.elementName = elementName;
        return this;
    }


    /**
     * set 元素取值列表
     *
     * @param elementValues
     */
    public LoopParam elementValues(String elementValues) {
        this.elementValues = elementValues;
        return this;
    }


    /**
     * set 元素取值列表分隔符
     *
     * @param delimiter
     */
    public LoopParam delimiter(TaskLoopElementDelimiterVo delimiter) {
        this.delimiter = delimiter;
        return this;
    }


}