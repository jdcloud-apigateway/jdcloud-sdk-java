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
 * bundleProjectReq
 */
public class BundleProjectReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * workspaceCode
     */
    private String workspaceCode;

    /**
     * projectCode
     */
    private String projectCode;

    /**
     * projectName
     */
    private String projectName;

    /**
     * env
     */
    private String env;



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
     * get projectName
     *
     * @return
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * set projectName
     *
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    /**
     * get env
     *
     * @return
     */
    public String getEnv() {
        return env;
    }

    /**
     * set env
     *
     * @param env
     */
    public void setEnv(String env) {
        this.env = env;
    }



    /**
     * set workspaceCode
     *
     * @param workspaceCode
     */
    public BundleProjectReq workspaceCode(String workspaceCode) {
        this.workspaceCode = workspaceCode;
        return this;
    }


    /**
     * set projectCode
     *
     * @param projectCode
     */
    public BundleProjectReq projectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }


    /**
     * set projectName
     *
     * @param projectName
     */
    public BundleProjectReq projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }


    /**
     * set env
     *
     * @param env
     */
    public BundleProjectReq env(String env) {
        this.env = env;
        return this;
    }


}