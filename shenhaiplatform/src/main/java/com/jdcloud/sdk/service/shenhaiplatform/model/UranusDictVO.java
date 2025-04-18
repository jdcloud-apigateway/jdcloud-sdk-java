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
public class UranusDictVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类型id
     */
    private Long id;

    /**
     * 字典编码
     */
    private String dictCode;

    /**
     * 父编码
     */
    private String pDictCode;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 备份信息
     */
    private String bak;

    /**
     * 序号
     */
    private Long sort;

    /**
     * 描述
     */
    private String dictDesc;



    /**
     * get 类型id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 类型id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * get 字典编码
     *
     * @return
     */
    public String getDictCode() {
        return dictCode;
    }

    /**
     * set 字典编码
     *
     * @param dictCode
     */
    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }


    /**
     * get 父编码
     *
     * @return
     */
    public String getPDictCode() {
        return pDictCode;
    }

    /**
     * set 父编码
     *
     * @param pDictCode
     */
    public void setPDictCode(String pDictCode) {
        this.pDictCode = pDictCode;
    }


    /**
     * get 字典名称
     *
     * @return
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * set 字典名称
     *
     * @param dictName
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }


    /**
     * get 备份信息
     *
     * @return
     */
    public String getBak() {
        return bak;
    }

    /**
     * set 备份信息
     *
     * @param bak
     */
    public void setBak(String bak) {
        this.bak = bak;
    }


    /**
     * get 序号
     *
     * @return
     */
    public Long getSort() {
        return sort;
    }

    /**
     * set 序号
     *
     * @param sort
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }


    /**
     * get 描述
     *
     * @return
     */
    public String getDictDesc() {
        return dictDesc;
    }

    /**
     * set 描述
     *
     * @param dictDesc
     */
    public void setDictDesc(String dictDesc) {
        this.dictDesc = dictDesc;
    }



    /**
     * set 类型id
     *
     * @param id
     */
    public UranusDictVO id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * set 字典编码
     *
     * @param dictCode
     */
    public UranusDictVO dictCode(String dictCode) {
        this.dictCode = dictCode;
        return this;
    }


    /**
     * set 父编码
     *
     * @param pDictCode
     */
    public UranusDictVO pDictCode(String pDictCode) {
        this.pDictCode = pDictCode;
        return this;
    }


    /**
     * set 字典名称
     *
     * @param dictName
     */
    public UranusDictVO dictName(String dictName) {
        this.dictName = dictName;
        return this;
    }


    /**
     * set 备份信息
     *
     * @param bak
     */
    public UranusDictVO bak(String bak) {
        this.bak = bak;
        return this;
    }


    /**
     * set 序号
     *
     * @param sort
     */
    public UranusDictVO sort(Long sort) {
        this.sort = sort;
        return this;
    }


    /**
     * set 描述
     *
     * @param dictDesc
     */
    public UranusDictVO dictDesc(String dictDesc) {
        this.dictDesc = dictDesc;
        return this;
    }


}