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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建一个指定配置的缓存Redis实例：可选择版本、类型、规格（按CPU核数、内存容量、磁盘容量、带宽等划分），自定义分片规格可通过describeSpecConfig接口获取，老规格代码请参考，https://docs.jdcloud.com/cn/jcs-for-redis/specifications

 */
public class CreateCacheInstanceResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String cacheInstanceId;

    /**
     * 订单编号
     */
    private String orderNum;

    /**
     * 购买ID
     */
    private String buyId;



    /**
     * get 实例ID
     *
     * @return
     */
    public String getCacheInstanceId() {
        return cacheInstanceId;
    }

    /**
     * set 实例ID
     *
     * @param cacheInstanceId
     */
    public void setCacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
    }


    /**
     * get 订单编号
     *
     * @return
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * set 订单编号
     *
     * @param orderNum
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }


    /**
     * get 购买ID
     *
     * @return
     */
    public String getBuyId() {
        return buyId;
    }

    /**
     * set 购买ID
     *
     * @param buyId
     */
    public void setBuyId(String buyId) {
        this.buyId = buyId;
    }



    /**
     * set 实例ID
     *
     * @param cacheInstanceId
     */
    public CreateCacheInstanceResult cacheInstanceId(String cacheInstanceId) {
        this.cacheInstanceId = cacheInstanceId;
        return this;
    }


    /**
     * set 订单编号
     *
     * @param orderNum
     */
    public CreateCacheInstanceResult orderNum(String orderNum) {
        this.orderNum = orderNum;
        return this;
    }


    /**
     * set 购买ID
     *
     * @param buyId
     */
    public CreateCacheInstanceResult buyId(String buyId) {
        this.buyId = buyId;
        return this;
    }


}