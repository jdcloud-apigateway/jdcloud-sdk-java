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
 * OneClickRerunController
 * 运营后台JobOpsController接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.service.shenhaiplatform.model.OneClickRerunPreviewVo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 一键重跑预览
 */
public class ManageHubGravityOneClickRerunPreviewResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 返回编码
     */
    private String code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * result
     */
    private OneClickRerunPreviewVo result;



    /**
     * get 返回编码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 返回编码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 返回信息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 返回信息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get result
     *
     * @return
     */
    public OneClickRerunPreviewVo getResult() {
        return result;
    }

    /**
     * set result
     *
     * @param result
     */
    public void setResult(OneClickRerunPreviewVo result) {
        this.result = result;
    }



    /**
     * set 返回编码
     *
     * @param code
     */
    public ManageHubGravityOneClickRerunPreviewResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 返回信息
     *
     * @param message
     */
    public ManageHubGravityOneClickRerunPreviewResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set result
     *
     * @param result
     */
    public ManageHubGravityOneClickRerunPreviewResult result(OneClickRerunPreviewVo result) {
        this.result = result;
        return this;
    }


}