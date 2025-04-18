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
 * Jtlas Search API
 * 数据图谱-元数据查询 API
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询表分区
 */
public class JtlasPageSearchTablePartitionsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 业务响应码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 节点数据
     */
    private Object result;



    /**
     * get 业务响应码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 业务响应码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 响应消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 响应消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get 节点数据
     *
     * @return
     */
    public Object getResult() {
        return result;
    }

    /**
     * set 节点数据
     *
     * @param result
     */
    public void setResult(Object result) {
        this.result = result;
    }



    /**
     * set 业务响应码
     *
     * @param code
     */
    public JtlasPageSearchTablePartitionsResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 响应消息
     *
     * @param message
     */
    public JtlasPageSearchTablePartitionsResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set 节点数据
     *
     * @param result
     */
    public JtlasPageSearchTablePartitionsResult result(Object result) {
        this.result = result;
        return this;
    }


}