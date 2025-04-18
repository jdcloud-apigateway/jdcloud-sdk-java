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
 * JobDetailController
 * 运营后台JobDetailController接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.service.shenhaiplatform.model.PageVoJobRelationVo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 分页查询父任务列表
 */
public class ManageHubGravityJobParentResult extends JdcloudResult implements java.io.Serializable {

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
    private PageVoJobRelationVo result;



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
    public PageVoJobRelationVo getResult() {
        return result;
    }

    /**
     * set result
     *
     * @param result
     */
    public void setResult(PageVoJobRelationVo result) {
        this.result = result;
    }



    /**
     * set 返回编码
     *
     * @param code
     */
    public ManageHubGravityJobParentResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 返回信息
     *
     * @param message
     */
    public ManageHubGravityJobParentResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set result
     *
     * @param result
     */
    public ManageHubGravityJobParentResult result(PageVoJobRelationVo result) {
        this.result = result;
        return this;
    }


}