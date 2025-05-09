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
 * 列出资源简要信息（只包含资源文件）
 */
public class ResourceBriefInfoVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源code
     */
    private String resourceCode;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源类型
     */
    private String resourceType;

    /**
     * 资源文件相对路径
     */
    private String relativePath;

    /**
     * 资源文件挂载路径
     */
    private String mountPath;



    /**
     * get 资源code
     *
     * @return
     */
    public String getResourceCode() {
        return resourceCode;
    }

    /**
     * set 资源code
     *
     * @param resourceCode
     */
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }


    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * get 资源类型
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 资源类型
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * get 资源文件相对路径
     *
     * @return
     */
    public String getRelativePath() {
        return relativePath;
    }

    /**
     * set 资源文件相对路径
     *
     * @param relativePath
     */
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }


    /**
     * get 资源文件挂载路径
     *
     * @return
     */
    public String getMountPath() {
        return mountPath;
    }

    /**
     * set 资源文件挂载路径
     *
     * @param mountPath
     */
    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }



    /**
     * set 资源code
     *
     * @param resourceCode
     */
    public ResourceBriefInfoVo resourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }


    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public ResourceBriefInfoVo resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }


    /**
     * set 资源类型
     *
     * @param resourceType
     */
    public ResourceBriefInfoVo resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }


    /**
     * set 资源文件相对路径
     *
     * @param relativePath
     */
    public ResourceBriefInfoVo relativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }


    /**
     * set 资源文件挂载路径
     *
     * @param mountPath
     */
    public ResourceBriefInfoVo mountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }


}