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

import java.util.List;
import java.util.ArrayList;

/**
 * Object
 */
public class UranusFunctionManagerRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类型id
     */
    private Long id;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 是否是目录
     */
    private Boolean dir;

    /**
     * 环境信息（prod：生产；dev：开发）
     */
    private String env;

    /**
     * 子集
     */
    
    private List<Object> children;
    /**
     * pid
     */
    private Long pid;



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
     * get 是否是目录
     *
     * @return
     */
    public Boolean getDir() {
        return dir;
    }

    /**
     * set 是否是目录
     *
     * @param dir
     */
    public void setDir(Boolean dir) {
        this.dir = dir;
    }


    /**
     * get 环境信息（prod：生产；dev：开发）
     *
     * @return
     */
    public String getEnv() {
        return env;
    }

    /**
     * set 环境信息（prod：生产；dev：开发）
     *
     * @param env
     */
    public void setEnv(String env) {
        this.env = env;
    }


    /**
    * get 子集
    *
    * @return
    */
    public List<Object> getChildren() {
        return children;
    }

    /**
    * set 子集
    *
    * @param children
    */
    public void setChildren(List<Object> children) {
        this.children = children;
    }


    /**
     * get pid
     *
     * @return
     */
    public Long getPid() {
        return pid;
    }

    /**
     * set pid
     *
     * @param pid
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }



    /**
     * set 类型id
     *
     * @param id
     */
    public UranusFunctionManagerRes id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * set 类型名称
     *
     * @param typeName
     */
    public UranusFunctionManagerRes typeName(String typeName) {
        this.typeName = typeName;
        return this;
    }


    /**
     * set 是否是目录
     *
     * @param dir
     */
    public UranusFunctionManagerRes dir(Boolean dir) {
        this.dir = dir;
        return this;
    }


    /**
     * set 环境信息（prod：生产；dev：开发）
     *
     * @param env
     */
    public UranusFunctionManagerRes env(String env) {
        this.env = env;
        return this;
    }


    /**
    * set 子集
    *
    * @param children
    */
    public UranusFunctionManagerRes children(List<Object> children) {
        this.children = children;
        return this;
    }


    /**
     * set pid
     *
     * @param pid
     */
    public UranusFunctionManagerRes pid(Long pid) {
        this.pid = pid;
        return this;
    }



    /**
     * add item to 子集
     *
     * @param children
     */
    public void addChildren(Object children) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(children);
    }
}