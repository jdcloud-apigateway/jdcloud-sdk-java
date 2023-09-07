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

import com.jdcloud.sdk.service.rds.model.ReadWriteProxy;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查看指定RDS读写分离代理详情&lt;br&gt;- 仅支持MySQL、PostgreSQL
 */
public class DescribeReadWriteProxyAttributeResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * readWriteProxy
     */
    private ReadWriteProxy readWriteProxy;



    /**
     * get readWriteProxy
     *
     * @return
     */
    public ReadWriteProxy getReadWriteProxy() {
        return readWriteProxy;
    }

    /**
     * set readWriteProxy
     *
     * @param readWriteProxy
     */
    public void setReadWriteProxy(ReadWriteProxy readWriteProxy) {
        this.readWriteProxy = readWriteProxy;
    }



    /**
     * set readWriteProxy
     *
     * @param readWriteProxy
     */
    public DescribeReadWriteProxyAttributeResult readWriteProxy(ReadWriteProxy readWriteProxy) {
        this.readWriteProxy = readWriteProxy;
        return this;
    }


}