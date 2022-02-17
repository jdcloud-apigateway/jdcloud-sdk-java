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
 * logParserFieldEnd
 */
public class LogParserFieldEnd  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * fieldFormat
     */
    private String fieldFormat;

    /**
     * fieldName
     */
    private String fieldName;

    /**
     * fieldType
     */
    private String fieldType;

    /**
     * index
     */
    private Long index;


    /**
     * get fieldFormat
     *
     * @return
     */
    public String getFieldFormat() {
        return fieldFormat;
    }

    /**
     * set fieldFormat
     *
     * @param fieldFormat
     */
    public void setFieldFormat(String fieldFormat) {
        this.fieldFormat = fieldFormat;
    }

    /**
     * get fieldName
     *
     * @return
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * set fieldName
     *
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * get fieldType
     *
     * @return
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * set fieldType
     *
     * @param fieldType
     */
    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
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
     * set fieldFormat
     *
     * @param fieldFormat
     */
    public LogParserFieldEnd fieldFormat(String fieldFormat) {
        this.fieldFormat = fieldFormat;
        return this;
    }

    /**
     * set fieldName
     *
     * @param fieldName
     */
    public LogParserFieldEnd fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * set fieldType
     *
     * @param fieldType
     */
    public LogParserFieldEnd fieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * set index
     *
     * @param index
     */
    public LogParserFieldEnd index(Long index) {
        this.index = index;
        return this;
    }


}