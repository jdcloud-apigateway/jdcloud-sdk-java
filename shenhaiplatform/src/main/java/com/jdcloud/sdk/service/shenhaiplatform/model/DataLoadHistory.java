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

import com.jdcloud.sdk.annotation.Required;

/**
 * dataLoadHistory
 */
public class DataLoadHistory  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     * Required:true
     */
    @Required
    private Integer id;

    /**
     * 文件名称
     * Required:true
     */
    @Required
    private String fileName;

    /**
     * 项目编码
     * Required:true
     */
    @Required
    private String projectCode;

    /**
     * 目标表名
     * Required:true
     */
    @Required
    private String tableName;

    /**
     * 任务id
     * Required:true
     */
    @Required
    private String applicationId;

    /**
     * 任务状态
     * Required:true
     */
    @Required
    private String state;

    /**
     * 任务状态描述
     * Required:true
     */
    @Required
    private String stateDesc;

    /**
     * 创建时间
     * Required:true
     */
    @Required
    private Integer createdDate;



    /**
     * get 主键ID
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 主键ID
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * get 项目编码
     *
     * @return
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * set 项目编码
     *
     * @param projectCode
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }


    /**
     * get 目标表名
     *
     * @return
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * set 目标表名
     *
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    /**
     * get 任务id
     *
     * @return
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * set 任务id
     *
     * @param applicationId
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * get 任务状态
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * set 任务状态
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * get 任务状态描述
     *
     * @return
     */
    public String getStateDesc() {
        return stateDesc;
    }

    /**
     * set 任务状态描述
     *
     * @param stateDesc
     */
    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public Integer getCreatedDate() {
        return createdDate;
    }

    /**
     * set 创建时间
     *
     * @param createdDate
     */
    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }



    /**
     * set 主键ID
     *
     * @param id
     */
    public DataLoadHistory id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 文件名称
     *
     * @param fileName
     */
    public DataLoadHistory fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }


    /**
     * set 项目编码
     *
     * @param projectCode
     */
    public DataLoadHistory projectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }


    /**
     * set 目标表名
     *
     * @param tableName
     */
    public DataLoadHistory tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }


    /**
     * set 任务id
     *
     * @param applicationId
     */
    public DataLoadHistory applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }


    /**
     * set 任务状态
     *
     * @param state
     */
    public DataLoadHistory state(String state) {
        this.state = state;
        return this;
    }


    /**
     * set 任务状态描述
     *
     * @param stateDesc
     */
    public DataLoadHistory stateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createdDate
     */
    public DataLoadHistory createdDate(Integer createdDate) {
        this.createdDate = createdDate;
        return this;
    }


}