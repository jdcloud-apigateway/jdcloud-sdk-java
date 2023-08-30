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
 * LogConfig
 * 用户日志相关配置
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.assistant.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 
配置用户日志信息。

详细操作说明请参考帮助文档：[用户自定义命令概述](https://docs.jdcloud.com/cn/virtual-machines/assistant-overview)

## 接口说明
- 该接口用于配置用户日志信息。

 */
public class AddLogConfigRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户日志集名字

     */
    private String logset;

    /**
     * 用户日志主题名字

     * Required:true
     */
    @Required
    private String logtopic;

    /**
     * 地域ID。
     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 用户日志集名字

     *
     * @return
     */
    public String getLogset() {
        return logset;
    }

    /**
     * set 用户日志集名字

     *
     * @param logset
     */
    public void setLogset(String logset) {
        this.logset = logset;
    }


    /**
     * get 用户日志主题名字

     *
     * @return
     */
    public String getLogtopic() {
        return logtopic;
    }

    /**
     * set 用户日志主题名字

     *
     * @param logtopic
     */
    public void setLogtopic(String logtopic) {
        this.logtopic = logtopic;
    }


    /**
     * get 地域ID。
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 用户日志集名字

     *
     * @param logset
     */
    public AddLogConfigRequest logset(String logset) {
        this.logset = logset;
        return this;
    }


    /**
     * set 用户日志主题名字

     *
     * @param logtopic
     */
    public AddLogConfigRequest logtopic(String logtopic) {
        this.logtopic = logtopic;
        return this;
    }


    /**
     * set 地域ID。
     *
     * @param regionId
     */
    public AddLogConfigRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}