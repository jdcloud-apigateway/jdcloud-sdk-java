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
 * jtlasSearchDetailResp
 */
public class JtlasSearchDetailResp  implements java.io.Serializable {

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
    private JtlasSearchTable result;



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
    public JtlasSearchTable getResult() {
        return result;
    }

    /**
     * set 节点数据
     *
     * @param result
     */
    public void setResult(JtlasSearchTable result) {
        this.result = result;
    }



    /**
     * set 业务响应码
     *
     * @param code
     */
    public JtlasSearchDetailResp code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 响应消息
     *
     * @param message
     */
    public JtlasSearchDetailResp message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set 节点数据
     *
     * @param result
     */
    public JtlasSearchDetailResp result(JtlasSearchTable result) {
        this.result = result;
        return this;
    }


}