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
 * JDCLOUD quota API
 * API JDCLOUD quota API
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.quota.model;

import com.jdcloud.sdk.service.quota.model.UserQuotaResVo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 校验配额 
 */
public class GetUserQuotaDetailResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * success
     */
    private Boolean success;

    /**
     * code
     */
    private Integer code;

    /**
     * message
     */
    private String message;

    /**
     * data
     */
    private UserQuotaResVo data;

    /**
     * requestId
     */
    private String requestId;


    /**
     * get success
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set success
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * get code
     *
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * set code
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * get message
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set message
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * get data
     *
     * @return
     */
    public UserQuotaResVo getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(UserQuotaResVo data) {
        this.data = data;
    }

    /**
     * get requestId
     *
     * @return
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * set requestId
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * set success
     *
     * @param success
     */
    public GetUserQuotaDetailResult success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * set code
     *
     * @param code
     */
    public GetUserQuotaDetailResult code(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * set message
     *
     * @param message
     */
    public GetUserQuotaDetailResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * set data
     *
     * @param data
     */
    public GetUserQuotaDetailResult data(UserQuotaResVo data) {
        this.data = data;
        return this;
    }

    /**
     * set requestId
     *
     * @param requestId
     */
    public GetUserQuotaDetailResult requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }


}