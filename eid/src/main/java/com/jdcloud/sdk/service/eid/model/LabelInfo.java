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

package com.jdcloud.sdk.service.eid.model;


/**
 * labelInfo
 */
public class LabelInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签id
     */
    private Integer id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 标签编码
     */
    private String code;

    /**
     * 描述
     */
    private String desc;

    /**
     * 是否开启 0关闭 1开启
     */
    private Integer status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;



    /**
     * get 标签id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 标签id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get 标签名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 标签名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 标签编码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 标签编码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }


    /**
     * get 是否开启 0关闭 1开启
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 是否开启 0关闭 1开启
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    /**
     * set 标签id
     *
     * @param id
     */
    public LabelInfo id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 标签名称
     *
     * @param name
     */
    public LabelInfo name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 标签编码
     *
     * @param code
     */
    public LabelInfo code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 描述
     *
     * @param desc
     */
    public LabelInfo desc(String desc) {
        this.desc = desc;
        return this;
    }


    /**
     * set 是否开启 0关闭 1开启
     *
     * @param status
     */
    public LabelInfo status(Integer status) {
        this.status = status;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public LabelInfo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public LabelInfo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}