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
 * Object
 */
public class UranusColumnReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 列名称
     */
    private String columnName;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 字段备注
     */
    private String commentV;



    /**
     * get 列名称
     *
     * @return
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * set 列名称
     *
     * @param columnName
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }


    /**
     * get 类型名称
     *
     * @return
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * set 类型名称
     *
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


    /**
     * get 字段备注
     *
     * @return
     */
    public String getCommentV() {
        return commentV;
    }

    /**
     * set 字段备注
     *
     * @param commentV
     */
    public void setCommentV(String commentV) {
        this.commentV = commentV;
    }



    /**
     * set 列名称
     *
     * @param columnName
     */
    public UranusColumnReq columnName(String columnName) {
        this.columnName = columnName;
        return this;
    }


    /**
     * set 类型名称
     *
     * @param typeName
     */
    public UranusColumnReq typeName(String typeName) {
        this.typeName = typeName;
        return this;
    }


    /**
     * set 字段备注
     *
     * @param commentV
     */
    public UranusColumnReq commentV(String commentV) {
        this.commentV = commentV;
        return this;
    }


}