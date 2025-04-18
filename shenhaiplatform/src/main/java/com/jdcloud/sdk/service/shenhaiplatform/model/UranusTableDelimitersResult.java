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

import com.jdcloud.sdk.service.shenhaiplatform.model.TableDelimitersVo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 表分隔符信息
 */
public class UranusTableDelimitersResult extends JdcloudResult implements java.io.Serializable {

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
     * result
     */
    private TableDelimitersVo result;

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
     * get result
     *
     * @return
     */
    public TableDelimitersVo getResult() {
        return result;
    }

    /**
     * set result
     *
     * @param result
     */
    public void setResult(TableDelimitersVo result) {
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
    public UranusTableDelimitersResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 错误Title
     *
     * @param errorTitle
     */
    public UranusTableDelimitersResult errorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
        return this;
    }


    /**
     * set 返回状态信息
     *
     * @param errorMsg
     */
    public UranusTableDelimitersResult errorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }


    /**
     * set result
     *
     * @param result
     */
    public UranusTableDelimitersResult result(TableDelimitersVo result) {
        this.result = result;
        return this;
    }


    /**
     * set 业务码
     *
     * @param subCode
     */
    public UranusTableDelimitersResult subCode(String subCode) {
        this.subCode = subCode;
        return this;
    }


    /**
     * set successed
     *
     * @param successed
     */
    public UranusTableDelimitersResult successed(Boolean successed) {
        this.successed = successed;
        return this;
    }


}