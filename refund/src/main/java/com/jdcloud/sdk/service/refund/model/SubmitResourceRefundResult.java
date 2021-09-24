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
 * 退款
 * 退款服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.refund.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 退款并删除资源
 */
public class SubmitResourceRefundResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * true-请求成功，false-请求失败
     */
    private Boolean success;

    /**
     * 结果code
     */
    private Integer code;

    /**
     * 退款单号
     */
    private String data;

    /**
     * 失败时显示原因
     */
    private String message;


    /**
     * get true-请求成功，false-请求失败
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set true-请求成功，false-请求失败
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * get 结果code
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set 结果code
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * get 退款单号
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * set 退款单号
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * get 失败时显示原因
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 失败时显示原因
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set true-请求成功，false-请求失败
     *
     * @param success
     */
    public SubmitResourceRefundResult success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * set 结果code
     *
     * @param code
     */
    public SubmitResourceRefundResult code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set 退款单号
     *
     * @param data
     */
    public SubmitResourceRefundResult data(String data) {
        this.data = data;
        return this;
    }

    /**
     * set 失败时显示原因
     *
     * @param message
     */
    public SubmitResourceRefundResult message(String message) {
        this.message = message;
        return this;
    }


}