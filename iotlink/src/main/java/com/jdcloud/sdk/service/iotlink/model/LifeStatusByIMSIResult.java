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
 * Iotlink-Related-API
 * 物联网卡服务相关API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotlink.model;

import com.jdcloud.sdk.service.iotlink.model.LifeStatusResp;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 根据物联网卡imsi查询该卡的生命周期信息
 */
public class LifeStatusByIMSIResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 请求状态(0:成功;1:失败)
     */
    private String status;

    /**
     * 消息描述
     */
    private String message;

    /**
     * 指定物联网卡的生命周期信息
     */
    private LifeStatusResp result;



    /**
     * get 请求状态(0:成功;1:失败)
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 请求状态(0:成功;1:失败)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 消息描述
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set 消息描述
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get 指定物联网卡的生命周期信息
     *
     * @return
     */
    public LifeStatusResp getResult() {
        return result;
    }

    /**
     * set 指定物联网卡的生命周期信息
     *
     * @param result
     */
    public void setResult(LifeStatusResp result) {
        this.result = result;
    }



    /**
     * set 请求状态(0:成功;1:失败)
     *
     * @param status
     */
    public LifeStatusByIMSIResult status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 消息描述
     *
     * @param message
     */
    public LifeStatusByIMSIResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set 指定物联网卡的生命周期信息
     *
     * @param result
     */
    public LifeStatusByIMSIResult result(LifeStatusResp result) {
        this.result = result;
        return this;
    }


}