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
 * 司马签印章管理接口
 * 电子签章-印章管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudsign.model;

import com.jdcloud.sdk.service.cloudsign.model.PageStampHistoryResp;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取印章列表
 */
public class DescribeStampHistoryListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * true 成功 false 失败
     */
    private Boolean success;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 状态码
     */
    private String code;

    /**
     * data
     */
    private PageStampHistoryResp data;



    /**
     * get true 成功 false 失败
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set true 成功 false 失败
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
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
     * get 状态码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 状态码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get data
     *
     * @return
     */
    public PageStampHistoryResp getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(PageStampHistoryResp data) {
        this.data = data;
    }



    /**
     * set true 成功 false 失败
     *
     * @param success
     */
    public DescribeStampHistoryListResult success(Boolean success) {
        this.success = success;
        return this;
    }


    /**
     * set 响应消息
     *
     * @param message
     */
    public DescribeStampHistoryListResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set 状态码
     *
     * @param code
     */
    public DescribeStampHistoryListResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set data
     *
     * @param data
     */
    public DescribeStampHistoryListResult data(PageStampHistoryResp data) {
        this.data = data;
        return this;
    }


}