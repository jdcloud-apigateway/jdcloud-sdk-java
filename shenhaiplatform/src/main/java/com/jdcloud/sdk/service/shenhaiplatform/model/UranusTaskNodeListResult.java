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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.shenhaiplatform.model.UranusTaskNodeRes;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 流程画布-节点管理列表
 */
public class UranusTaskNodeListResult extends JdcloudResult implements java.io.Serializable {

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
    
    private List<UranusTaskNodeRes> result;
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
    public List<UranusTaskNodeRes> getResult() {
        return result;
    }

    /**
    * set Object
    *
    * @param result
    */
    public void setResult(List<UranusTaskNodeRes> result) {
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
    public UranusTaskNodeListResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 错误Title
     *
     * @param errorTitle
     */
    public UranusTaskNodeListResult errorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
        return this;
    }


    /**
     * set 返回状态信息
     *
     * @param errorMsg
     */
    public UranusTaskNodeListResult errorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }


    /**
    * set Object
    *
    * @param result
    */
    public UranusTaskNodeListResult result(List<UranusTaskNodeRes> result) {
        this.result = result;
        return this;
    }


    /**
     * set 业务码
     *
     * @param subCode
     */
    public UranusTaskNodeListResult subCode(String subCode) {
        this.subCode = subCode;
        return this;
    }


    /**
     * set successed
     *
     * @param successed
     */
    public UranusTaskNodeListResult successed(Boolean successed) {
        this.successed = successed;
        return this;
    }



    /**
     * add item to Object
     *
     * @param result
     */
    public void addResult(UranusTaskNodeRes result) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(result);
    }
}