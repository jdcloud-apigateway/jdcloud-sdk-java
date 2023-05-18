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
 * Instance-Reporting
 * 实例级报表
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 总流量。查询范围最近6个月、查询最大跨度1个月。
 */
public class InstanceTrafficSumResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 单指标的值
如果是带宽，值的单位是bps（bit per second）
如果是流量，值的单位是Byte
如果是请求量，值的单位是次数

     */
    private Double value;



    /**
     * get 单指标的值
如果是带宽，值的单位是bps（bit per second）
如果是流量，值的单位是Byte
如果是请求量，值的单位是次数

     *
     * @return
     */
    public Double getValue() {
        return value;
    }

    /**
     * set 单指标的值
如果是带宽，值的单位是bps（bit per second）
如果是流量，值的单位是Byte
如果是请求量，值的单位是次数

     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }



    /**
     * set 单指标的值
如果是带宽，值的单位是bps（bit per second）
如果是流量，值的单位是Byte
如果是请求量，值的单位是次数

     *
     * @param value
     */
    public InstanceTrafficSumResult value(Double value) {
        this.value = value;
        return this;
    }


}