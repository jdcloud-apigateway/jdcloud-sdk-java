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
 * jtlasSearchTableColumn
 */
public class JtlasSearchTableColumn  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 字段id
     */
    private String id;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 字段描述
     */
    private String comment;

    /**
     * 字段类型
     */
    private String type;

    /**
     * 是否是分区字段
     */
    private Boolean isPartition;

    /**
     * 字段长度
     */
    private Integer length;

    /**
     * 字段位置
     */
    private Integer position;



    /**
     * get 字段id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 字段id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * get 字段名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 字段名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 字段描述
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     * set 字段描述
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * get 字段类型
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 字段类型
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * get 是否是分区字段
     *
     * @return
     */
    public Boolean getIsPartition() {
        return isPartition;
    }

    /**
     * set 是否是分区字段
     *
     * @param isPartition
     */
    public void setIsPartition(Boolean isPartition) {
        this.isPartition = isPartition;
    }


    /**
     * get 字段长度
     *
     * @return
     */
    public Integer getLength() {
        return length;
    }

    /**
     * set 字段长度
     *
     * @param length
     */
    public void setLength(Integer length) {
        this.length = length;
    }


    /**
     * get 字段位置
     *
     * @return
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * set 字段位置
     *
     * @param position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }



    /**
     * set 字段id
     *
     * @param id
     */
    public JtlasSearchTableColumn id(String id) {
        this.id = id;
        return this;
    }


    /**
     * set 字段名称
     *
     * @param name
     */
    public JtlasSearchTableColumn name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 字段描述
     *
     * @param comment
     */
    public JtlasSearchTableColumn comment(String comment) {
        this.comment = comment;
        return this;
    }


    /**
     * set 字段类型
     *
     * @param type
     */
    public JtlasSearchTableColumn type(String type) {
        this.type = type;
        return this;
    }


    /**
     * set 是否是分区字段
     *
     * @param isPartition
     */
    public JtlasSearchTableColumn isPartition(Boolean isPartition) {
        this.isPartition = isPartition;
        return this;
    }


    /**
     * set 字段长度
     *
     * @param length
     */
    public JtlasSearchTableColumn length(Integer length) {
        this.length = length;
        return this;
    }


    /**
     * set 字段位置
     *
     * @param position
     */
    public JtlasSearchTableColumn position(Integer position) {
        this.position = position;
        return this;
    }


}