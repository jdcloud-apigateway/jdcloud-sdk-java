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
 * uranusAnalysisScriptReq
 */
public class UranusAnalysisScriptReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前作业名称
     */
    private String currentJobName;

    /**
     * 文件业务CODE
     */
    private String fileCode;

    /**
     * sql内容
     */
    private String sqlContent;



    /**
     * get 当前作业名称
     *
     * @return
     */
    public String getCurrentJobName() {
        return currentJobName;
    }

    /**
     * set 当前作业名称
     *
     * @param currentJobName
     */
    public void setCurrentJobName(String currentJobName) {
        this.currentJobName = currentJobName;
    }


    /**
     * get 文件业务CODE
     *
     * @return
     */
    public String getFileCode() {
        return fileCode;
    }

    /**
     * set 文件业务CODE
     *
     * @param fileCode
     */
    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }


    /**
     * get sql内容
     *
     * @return
     */
    public String getSqlContent() {
        return sqlContent;
    }

    /**
     * set sql内容
     *
     * @param sqlContent
     */
    public void setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent;
    }



    /**
     * set 当前作业名称
     *
     * @param currentJobName
     */
    public UranusAnalysisScriptReq currentJobName(String currentJobName) {
        this.currentJobName = currentJobName;
        return this;
    }


    /**
     * set 文件业务CODE
     *
     * @param fileCode
     */
    public UranusAnalysisScriptReq fileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }


    /**
     * set sql内容
     *
     * @param sqlContent
     */
    public UranusAnalysisScriptReq sqlContent(String sqlContent) {
        this.sqlContent = sqlContent;
        return this;
    }


}