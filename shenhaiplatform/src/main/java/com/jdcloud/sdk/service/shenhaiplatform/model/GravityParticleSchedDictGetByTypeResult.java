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
 * 数据字典管理
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.shenhaiplatform.model.GpsdalueDict;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据类型获取数据字典
 */
public class GravityParticleSchedDictGetByTypeResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功标识，1成功，0失败
     */
    private Integer success;

    /**
     * result
     */
    
    private List<GpsdalueDict> result;
    /**
     * 返回状态码
     */
    private String code;

    /**
     * 返回状态信息
     */
    private String msg;

    /**
     * 返回请求流水号
     */
    private String _REQ_SEQ_NO_;



    /**
     * get 成功标识，1成功，0失败
     *
     * @return
     */
    public Integer getSuccess() {
        return success;
    }

    /**
     * set 成功标识，1成功，0失败
     *
     * @param success
     */
    public void setSuccess(Integer success) {
        this.success = success;
    }


    /**
    * get result
    *
    * @return
    */
    public List<GpsdalueDict> getResult() {
        return result;
    }

    /**
    * set result
    *
    * @param result
    */
    public void setResult(List<GpsdalueDict> result) {
        this.result = result;
    }


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
     * get 返回状态信息
     *
     * @return
     */
    public String getMsg() {
        return msg;
    }

    /**
     * set 返回状态信息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }


    /**
     * get 返回请求流水号
     *
     * @return
     */
    public String get_REQ_SEQ_NO_() {
        return _REQ_SEQ_NO_;
    }

    /**
     * set 返回请求流水号
     *
     * @param _REQ_SEQ_NO_
     */
    public void set_REQ_SEQ_NO_(String _REQ_SEQ_NO_) {
        this._REQ_SEQ_NO_ = _REQ_SEQ_NO_;
    }



    /**
     * set 成功标识，1成功，0失败
     *
     * @param success
     */
    public GravityParticleSchedDictGetByTypeResult success(Integer success) {
        this.success = success;
        return this;
    }


    /**
    * set result
    *
    * @param result
    */
    public GravityParticleSchedDictGetByTypeResult result(List<GpsdalueDict> result) {
        this.result = result;
        return this;
    }


    /**
     * set 返回状态码
     *
     * @param code
     */
    public GravityParticleSchedDictGetByTypeResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 返回状态信息
     *
     * @param msg
     */
    public GravityParticleSchedDictGetByTypeResult msg(String msg) {
        this.msg = msg;
        return this;
    }


    /**
     * set 返回请求流水号
     *
     * @param _REQ_SEQ_NO_
     */
    public GravityParticleSchedDictGetByTypeResult _REQ_SEQ_NO_(String _REQ_SEQ_NO_) {
        this._REQ_SEQ_NO_ = _REQ_SEQ_NO_;
        return this;
    }



    /**
     * add item to result
     *
     * @param result
     */
    public void addResult(GpsdalueDict result) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(result);
    }
}