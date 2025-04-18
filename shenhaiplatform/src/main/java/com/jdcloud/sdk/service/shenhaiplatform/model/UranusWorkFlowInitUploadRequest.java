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
 * ShenHaiPlatform Admin Manage APIs
 * 流程画布目录树管理
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 分片上传初始化
 */
public class UranusWorkFlowInitUploadRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件类型
     */
    private Integer fileType;

    /**
     * 是否spark-jar的管理模块,spark-jar操作hdfs通过字段区分
     */
    private Boolean isJarManagement;

    /**
     * 文件Code
     */
    private String fileCode;

    /**
     * 父节点 Code
     */
    private String parentCode;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 任务流Code
     * Required:true
     */
    @Required
    private String flowCode;

    /**
     * 文件夹上传的时候文件的相对路径属性
     */
    private String relativePath;

    /**
     * 是否上传完成 0 上传取消 1 上传完成
     */
    private Integer isUpload;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;



    /**
     * get 文件类型
     *
     * @return
     */
    public Integer getFileType() {
        return fileType;
    }

    /**
     * set 文件类型
     *
     * @param fileType
     */
    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }


    /**
     * get 是否spark-jar的管理模块,spark-jar操作hdfs通过字段区分
     *
     * @return
     */
    public Boolean getIsJarManagement() {
        return isJarManagement;
    }

    /**
     * set 是否spark-jar的管理模块,spark-jar操作hdfs通过字段区分
     *
     * @param isJarManagement
     */
    public void setIsJarManagement(Boolean isJarManagement) {
        this.isJarManagement = isJarManagement;
    }


    /**
     * get 文件Code
     *
     * @return
     */
    public String getFileCode() {
        return fileCode;
    }

    /**
     * set 文件Code
     *
     * @param fileCode
     */
    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }


    /**
     * get 父节点 Code
     *
     * @return
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * set 父节点 Code
     *
     * @param parentCode
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }


    /**
     * get 文件名称
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 文件名称
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * get 任务流Code
     *
     * @return
     */
    public String getFlowCode() {
        return flowCode;
    }

    /**
     * set 任务流Code
     *
     * @param flowCode
     */
    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode;
    }


    /**
     * get 文件夹上传的时候文件的相对路径属性
     *
     * @return
     */
    public String getRelativePath() {
        return relativePath;
    }

    /**
     * set 文件夹上传的时候文件的相对路径属性
     *
     * @param relativePath
     */
    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }


    /**
     * get 是否上传完成 0 上传取消 1 上传完成
     *
     * @return
     */
    public Integer getIsUpload() {
        return isUpload;
    }

    /**
     * set 是否上传完成 0 上传取消 1 上传完成
     *
     * @param isUpload
     */
    public void setIsUpload(Integer isUpload) {
        this.isUpload = isUpload;
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
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }



    /**
     * set 文件类型
     *
     * @param fileType
     */
    public UranusWorkFlowInitUploadRequest fileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }


    /**
     * set 是否spark-jar的管理模块,spark-jar操作hdfs通过字段区分
     *
     * @param isJarManagement
     */
    public UranusWorkFlowInitUploadRequest isJarManagement(Boolean isJarManagement) {
        this.isJarManagement = isJarManagement;
        return this;
    }


    /**
     * set 文件Code
     *
     * @param fileCode
     */
    public UranusWorkFlowInitUploadRequest fileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }


    /**
     * set 父节点 Code
     *
     * @param parentCode
     */
    public UranusWorkFlowInitUploadRequest parentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }


    /**
     * set 文件名称
     *
     * @param fileName
     */
    public UranusWorkFlowInitUploadRequest fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }


    /**
     * set 任务流Code
     *
     * @param flowCode
     */
    public UranusWorkFlowInitUploadRequest flowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }


    /**
     * set 文件夹上传的时候文件的相对路径属性
     *
     * @param relativePath
     */
    public UranusWorkFlowInitUploadRequest relativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }


    /**
     * set 是否上传完成 0 上传取消 1 上传完成
     *
     * @param isUpload
     */
    public UranusWorkFlowInitUploadRequest isUpload(Integer isUpload) {
        this.isUpload = isUpload;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UranusWorkFlowInitUploadRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public UranusWorkFlowInitUploadRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}