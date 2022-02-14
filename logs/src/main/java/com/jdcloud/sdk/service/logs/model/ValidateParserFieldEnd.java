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


/**
 * validateParserFieldEnd
 */
public class ValidateParserFieldEnd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * fieldValue
     */
    private String fieldValue;

    /**
     * index
     */
    private Long index;

    /**
     * name
     */
    private String name;


    /**
     * get fieldValue
     *
     * @return
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * set fieldValue
     *
     * @param fieldValue
     */
    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    /**
     * get index
     *
     * @return
     */
    public Long getIndex() {
        return index;
    }

    /**
     * set index
     *
     * @param index
     */
    public void setIndex(Long index) {
        this.index = index;
    }

    /**
     * get name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * set fieldValue
     *
     * @param fieldValue
     */
    public ValidateParserFieldEnd fieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }

    /**
     * set index
     *
     * @param index
     */
    public ValidateParserFieldEnd index(Long index) {
        this.index = index;
        return this;
    }

    /**
     * set name
     *
     * @param name
     */
    public ValidateParserFieldEnd name(String name) {
        this.name = name;
        return this;
    }


}