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
 * WorkspaceController
 * 工作空间WorkspaceController接口
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
 * 获取云仓项目被绑定的工作空间
 */
public class WorkspaceGetProjectBundleRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * workspaceCode
     */
    private String workspaceCode;

    /**
     * projectCode
     */
    private String projectCode;

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
     * get id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get workspaceCode
     *
     * @return
     */
    public String getWorkspaceCode() {
        return workspaceCode;
    }

    /**
     * set workspaceCode
     *
     * @param workspaceCode
     */
    public void setWorkspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
    }


    /**
     * get projectCode
     *
     * @return
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * set projectCode
     *
     * @param projectCode
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
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
     * set id
     *
     * @param id
     */
    public WorkspaceGetProjectBundleRequest id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set workspaceCode
     *
     * @param workspaceCode
     */
    public WorkspaceGetProjectBundleRequest workspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
        return this;
    }


    /**
     * set projectCode
     *
     * @param projectCode
     */
    public WorkspaceGetProjectBundleRequest projectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public WorkspaceGetProjectBundleRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public WorkspaceGetProjectBundleRequest appName(String appName) {
        this.appName = appName;
        return this;
    }


}