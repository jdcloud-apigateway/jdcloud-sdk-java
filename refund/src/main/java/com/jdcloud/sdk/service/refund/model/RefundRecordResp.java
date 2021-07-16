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

package com.jdcloud.sdk.service.refund.model;


/**
 * refundRecordResp
 */
public class RefundRecordResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 成功标识
     */
    private Boolean isSuccess;

    /**
     * 请求ID
     */
    private String requestId;

    /**
     * 数据
     */
    private Object data;

    /**
     * 失败/错误原因
     */
    private String message;


    /**
     * get 成功标识
     *
     * @return
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * set 成功标识
     *
     * @param isSuccess
     */
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    /**
     * get 请求ID
     *
     * @return
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * set 请求ID
     *
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * get 数据
     *
     * @return
     */
    public Object getData() {
        return data;
    }

    /**
     * set 数据
     *
     * @param data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * get 失败/错误原因
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 失败/错误原因
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * set 成功标识
     *
     * @param isSuccess
     */
    public RefundRecordResp isSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * set 请求ID
     *
     * @param requestId
     */
    public RefundRecordResp requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * set 数据
     *
     * @param data
     */
    public RefundRecordResp data(Object data) {
        this.data = data;
        return this;
    }

    /**
     * set 失败/错误原因
     *
     * @param message
     */
    public RefundRecordResp message(String message) {
        this.message = message;
        return this;
    }


}