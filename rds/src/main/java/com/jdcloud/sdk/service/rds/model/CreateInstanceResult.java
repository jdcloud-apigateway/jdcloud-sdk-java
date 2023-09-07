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
 * 实例管理
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建一个RDS实例，用户可以使用相应的数据库客户端或者应用程序通过域名和端口链接到该RDS实例上，进行操作。
 */
public class CreateInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * instanceId
     */
    private String instanceId;

    /**
     * orderId
     */
    private String orderId;



    /**
     * get instanceId
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set instanceId
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get orderId
     *
     * @return
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * set orderId
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }



    /**
     * set instanceId
     *
     * @param instanceId
     */
    public CreateInstanceResult instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set orderId
     *
     * @param orderId
     */
    public CreateInstanceResult orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }


}