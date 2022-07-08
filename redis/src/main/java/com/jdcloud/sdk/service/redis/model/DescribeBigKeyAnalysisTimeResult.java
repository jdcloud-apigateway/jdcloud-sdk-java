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
 * 获取大key自动缓存分析时间
 */
public class DescribeBigKeyAnalysisTimeResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * -表示为关闭，HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点
     */
    private String time;


    /**
     * get -表示为关闭，HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点
     *
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * set -表示为关闭，HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }


    /**
     * set -表示为关闭，HH:mm-HH:mm 时区，例如&quot;01:00-02:00 +0800&quot;，表示东八区的1点到2点
     *
     * @param time
     */
    public DescribeBigKeyAnalysisTimeResult time(String time) {
        this.time = time;
        return this;
    }


}