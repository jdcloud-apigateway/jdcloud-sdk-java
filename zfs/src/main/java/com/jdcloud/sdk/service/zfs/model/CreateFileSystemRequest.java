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
 * File-System
 * 文件系统相关接口。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.zfs.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * - 创建一个新的文件系统，为这个文件系统分配一个Id

 */
public class CreateFileSystemRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件系统名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * 文件系统描述
     * Required:true
     */
    @Required
    private String description;

    /**
     * 幂等性参数(只支持数字、大小写字母，且不能超过64字符)
     * Required:true
     */
    @Required
    private String clientToken;

    /**
     * 文件系统类型(通用型:gp1,容量型:std1),默认为通用型
     */
    private String fileSystemType;

    /**
     * 文件系统的serviceCode，默认为zfs
     */
    private String serviceCode;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 文件系统名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 文件系统名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 文件系统描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 文件系统描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 幂等性参数(只支持数字、大小写字母，且不能超过64字符)
     *
     * @return
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * set 幂等性参数(只支持数字、大小写字母，且不能超过64字符)
     *
     * @param clientToken
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }


    /**
     * get 文件系统类型(通用型:gp1,容量型:std1),默认为通用型
     *
     * @return
     */
    public String getFileSystemType() {
        return fileSystemType;
    }

    /**
     * set 文件系统类型(通用型:gp1,容量型:std1),默认为通用型
     *
     * @param fileSystemType
     */
    public void setFileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
    }


    /**
     * get 文件系统的serviceCode，默认为zfs
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 文件系统的serviceCode，默认为zfs
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 文件系统名称
     *
     * @param name
     */
    public CreateFileSystemRequest name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 文件系统描述
     *
     * @param description
     */
    public CreateFileSystemRequest description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 幂等性参数(只支持数字、大小写字母，且不能超过64字符)
     *
     * @param clientToken
     */
    public CreateFileSystemRequest clientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


    /**
     * set 文件系统类型(通用型:gp1,容量型:std1),默认为通用型
     *
     * @param fileSystemType
     */
    public CreateFileSystemRequest fileSystemType(String fileSystemType) {
        this.fileSystemType = fileSystemType;
        return this;
    }


    /**
     * set 文件系统的serviceCode，默认为zfs
     *
     * @param serviceCode
     */
    public CreateFileSystemRequest serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public CreateFileSystemRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}