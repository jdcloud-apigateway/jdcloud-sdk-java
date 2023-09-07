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
 * Read-Write-Proxy-Management
 * 读写分离代理管理
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.rds.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建数据库读写分离代理服务&lt;br&gt;- 仅支持MySQL、PostgreSQL
 */
public class CreateReadWriteProxyResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * RDS 读写分离代理服务ID
     */
    private String readWriteProxyId;



    /**
     * get RDS 读写分离代理服务ID
     *
     * @return
     */
    public String getReadWriteProxyId() {
        return readWriteProxyId;
    }

    /**
     * set RDS 读写分离代理服务ID
     *
     * @param readWriteProxyId
     */
    public void setReadWriteProxyId(String readWriteProxyId) {
        this.readWriteProxyId = readWriteProxyId;
    }



    /**
     * set RDS 读写分离代理服务ID
     *
     * @param readWriteProxyId
     */
    public CreateReadWriteProxyResult readWriteProxyId(String readWriteProxyId) {
        this.readWriteProxyId = readWriteProxyId;
        return this;
    }


}