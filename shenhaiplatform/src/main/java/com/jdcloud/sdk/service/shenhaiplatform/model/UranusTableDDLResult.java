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
 * 流程画布-表管理
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取具体表的建表语句
 */
public class UranusTableDDLResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回状态码
     */
    private String code;

    /**
     * 错误Title
     */
    private String errorTitle;

    /**
     * 返回状态信息
     */
    private String errorMsg;

    /**
     * Object
     */
    private String result;

    /**
     * 业务码
     */
    private String subCode;

    /**
     * successed
     */
    private Boolean successed;



    /**
     * get 返回状态码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 返回状态码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 错误Title
     *
     * @return
     */
    public String getErrorTitle() {
        return errorTitle;
    }

    /**
     * set 错误Title
     *
     * @param errorTitle
     */
    public void setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
    }


    /**
     * get 返回状态信息
     *
     * @return
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * set 返回状态信息
     *
     * @param errorMsg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }


    /**
     * get Object
     *
     * @return
     */
    public String getResult() {
        return result;
    }

    /**
     * set Object
     *
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }


    /**
     * get 业务码
     *
     * @return
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * set 业务码
     *
     * @param subCode
     */
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }


    /**
     * get successed
     *
     * @return
     */
    public Boolean getSuccessed() {
        return successed;
    }

    /**
     * set successed
     *
     * @param successed
     */
    public void setSuccessed(Boolean successed) {
        this.successed = successed;
    }



    /**
     * set 返回状态码
     *
     * @param code
     */
    public UranusTableDDLResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 错误Title
     *
     * @param errorTitle
     */
    public UranusTableDDLResult errorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
        return this;
    }


    /**
     * set 返回状态信息
     *
     * @param errorMsg
     */
    public UranusTableDDLResult errorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }


    /**
     * set Object
     *
     * @param result
     */
    public UranusTableDDLResult result(String result) {
        this.result = result;
        return this;
    }


    /**
     * set 业务码
     *
     * @param subCode
     */
    public UranusTableDDLResult subCode(String subCode) {
        this.subCode = subCode;
        return this;
    }


    /**
     * set successed
     *
     * @param successed
     */
    public UranusTableDDLResult successed(Boolean successed) {
        this.successed = successed;
        return this;
    }


}