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
 * 作业提供RPC接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 脚本校验
 */
public class GravityParticleDubboJobManagerVerifyScriptFileResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * success
     */
    private Integer success;

    /**
     * code
     */
    private String code;

    /**
     * msg
     */
    private String msg;

    /**
     * result
     */
    private Boolean result;



    /**
     * get success
     *
     * @return
     */
    public Integer getSuccess() {
        return success;
    }

    /**
     * set success
     *
     * @param success
     */
    public void setSuccess(Integer success) {
        this.success = success;
    }


    /**
     * get code
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set code
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get msg
     *
     * @return
     */
    public String getMsg() {
        return msg;
    }

    /**
     * set msg
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }


    /**
     * get result
     *
     * @return
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * set result
     *
     * @param result
     */
    public void setResult(Boolean result) {
        this.result = result;
    }



    /**
     * set success
     *
     * @param success
     */
    public GravityParticleDubboJobManagerVerifyScriptFileResult success(Integer success) {
        this.success = success;
        return this;
    }


    /**
     * set code
     *
     * @param code
     */
    public GravityParticleDubboJobManagerVerifyScriptFileResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set msg
     *
     * @param msg
     */
    public GravityParticleDubboJobManagerVerifyScriptFileResult msg(String msg) {
        this.msg = msg;
        return this;
    }


    /**
     * set result
     *
     * @param result
     */
    public GravityParticleDubboJobManagerVerifyScriptFileResult result(Boolean result) {
        this.result = result;
        return this;
    }


}