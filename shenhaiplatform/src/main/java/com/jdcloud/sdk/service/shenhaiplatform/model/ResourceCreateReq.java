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
 * 新建资源（包括资源文件和资源目录）
 */
public class ResourceCreateReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源名称（支持中文、字母、数字、下划线，不超过50个字符）
     */
    private String resourceName;

    /**
     * 原始资源名称（上传的原始文件在本地客户端的文件名称）
     */
    private String originalName;

    /**
     * 父资源code（目录的根目录的父资源code为ROOT）
     */
    private String parentCode;

    /**
     * 资源类型（DIRECTORY：目录；JAR：java的jar文件；FILE：其他普通文件；ARCHIVE：其他压缩文件/归档文件）
     */
    private String resourceType;

    /**
     * 关联引擎（默认为JCW）
     */
    private String relativeEngine;

    /**
     * 文件上传方式（默认为本地上传）
     */
    private String uploadMode;

    /**
     * 环境信息（prod：生产环境；dev：开发环境），简单模式默认为prod
     */
    private String env;

    /**
     * 负责人
     */
    
    private List<String> managers;


    /**
     * get 资源名称（支持中文、字母、数字、下划线，不超过50个字符）
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称（支持中文、字母、数字、下划线，不超过50个字符）
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * get 原始资源名称（上传的原始文件在本地客户端的文件名称）
     *
     * @return
     */
    public String getOriginalName() {
        return originalName;
    }

    /**
     * set 原始资源名称（上传的原始文件在本地客户端的文件名称）
     *
     * @param originalName
     */
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }


    /**
     * get 父资源code（目录的根目录的父资源code为ROOT）
     *
     * @return
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * set 父资源code（目录的根目录的父资源code为ROOT）
     *
     * @param parentCode
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }


    /**
     * get 资源类型（DIRECTORY：目录；JAR：java的jar文件；FILE：其他普通文件；ARCHIVE：其他压缩文件/归档文件）
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 资源类型（DIRECTORY：目录；JAR：java的jar文件；FILE：其他普通文件；ARCHIVE：其他压缩文件/归档文件）
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * get 关联引擎（默认为JCW）
     *
     * @return
     */
    public String getRelativeEngine() {
        return relativeEngine;
    }

    /**
     * set 关联引擎（默认为JCW）
     *
     * @param relativeEngine
     */
    public void setRelativeEngine(String relativeEngine) {
        this.relativeEngine = relativeEngine;
    }


    /**
     * get 文件上传方式（默认为本地上传）
     *
     * @return
     */
    public String getUploadMode() {
        return uploadMode;
    }

    /**
     * set 文件上传方式（默认为本地上传）
     *
     * @param uploadMode
     */
    public void setUploadMode(String uploadMode) {
        this.uploadMode = uploadMode;
    }


    /**
     * get 环境信息（prod：生产环境；dev：开发环境），简单模式默认为prod
     *
     * @return
     */
    public String getEnv() {
        return env;
    }

    /**
     * set 环境信息（prod：生产环境；dev：开发环境），简单模式默认为prod
     *
     * @param env
     */
    public void setEnv(String env) {
        this.env = env;
    }


    /**
    * get 负责人
    *
    * @return
    */
    public List<String> getManagers() {
        return managers;
    }

    /**
    * set 负责人
    *
    * @param managers
    */
    public void setManagers(List<String> managers) {
        this.managers = managers;
    }



    /**
     * set 资源名称（支持中文、字母、数字、下划线，不超过50个字符）
     *
     * @param resourceName
     */
    public ResourceCreateReq resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }


    /**
     * set 原始资源名称（上传的原始文件在本地客户端的文件名称）
     *
     * @param originalName
     */
    public ResourceCreateReq originalName(String originalName) {
        this.originalName = originalName;
        return this;
    }


    /**
     * set 父资源code（目录的根目录的父资源code为ROOT）
     *
     * @param parentCode
     */
    public ResourceCreateReq parentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }


    /**
     * set 资源类型（DIRECTORY：目录；JAR：java的jar文件；FILE：其他普通文件；ARCHIVE：其他压缩文件/归档文件）
     *
     * @param resourceType
     */
    public ResourceCreateReq resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }


    /**
     * set 关联引擎（默认为JCW）
     *
     * @param relativeEngine
     */
    public ResourceCreateReq relativeEngine(String relativeEngine) {
        this.relativeEngine = relativeEngine;
        return this;
    }


    /**
     * set 文件上传方式（默认为本地上传）
     *
     * @param uploadMode
     */
    public ResourceCreateReq uploadMode(String uploadMode) {
        this.uploadMode = uploadMode;
        return this;
    }


    /**
     * set 环境信息（prod：生产环境；dev：开发环境），简单模式默认为prod
     *
     * @param env
     */
    public ResourceCreateReq env(String env) {
        this.env = env;
        return this;
    }


    /**
    * set 负责人
    *
    * @param managers
    */
    public ResourceCreateReq managers(List<String> managers) {
        this.managers = managers;
        return this;
    }



    /**
     * add item to 负责人
     *
     * @param manager
     */
    public void addManager(String manager) {
        if (this.managers == null) {
            this.managers = new ArrayList<>();
        }
        this.managers.add(manager);
    }
}