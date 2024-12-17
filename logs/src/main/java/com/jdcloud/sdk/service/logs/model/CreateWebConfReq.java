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

package com.jdcloud.sdk.service.logs.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * createWebConfReq
 */
public class CreateWebConfReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ConfType 配置类型，前端自定义
     * Required:true
     */
    @Required
    private String confType;

    /**
     * Data 配置内容
     * Required:true
     */
    @Required
    private String data;

    /**
     * LogsetUID 日志集维度。如果要控制该配置文件在日志集级别生效，则传LogsetUID，不传LogtopicUID
     */
    private String logsetUID;

    /**
     * LogtopicUID 日志主题维度。如果要控制该配置文件在日志主题级别生效，则传LogtopicUID，不传LogsetUID
     */
    private String logtopicUID;

    /**
     * Region 地域维度. 如果要控制该配置文件在地域级别生效，则传入该参数。
     */
    private String region;



    /**
     * get ConfType 配置类型，前端自定义
     *
     * @return
     */
    public String getConfType() {
        return confType;
    }

    /**
     * set ConfType 配置类型，前端自定义
     *
     * @param confType
     */
    public void setConfType(String confType) {
        this.confType = confType;
    }


    /**
     * get Data 配置内容
     *
     * @return
     */
    public String getData() {
        return data;
    }

    /**
     * set Data 配置内容
     *
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }


    /**
     * get LogsetUID 日志集维度。如果要控制该配置文件在日志集级别生效，则传LogsetUID，不传LogtopicUID
     *
     * @return
     */
    public String getLogsetUID() {
        return logsetUID;
    }

    /**
     * set LogsetUID 日志集维度。如果要控制该配置文件在日志集级别生效，则传LogsetUID，不传LogtopicUID
     *
     * @param logsetUID
     */
    public void setLogsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
    }


    /**
     * get LogtopicUID 日志主题维度。如果要控制该配置文件在日志主题级别生效，则传LogtopicUID，不传LogsetUID
     *
     * @return
     */
    public String getLogtopicUID() {
        return logtopicUID;
    }

    /**
     * set LogtopicUID 日志主题维度。如果要控制该配置文件在日志主题级别生效，则传LogtopicUID，不传LogsetUID
     *
     * @param logtopicUID
     */
    public void setLogtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
    }


    /**
     * get Region 地域维度. 如果要控制该配置文件在地域级别生效，则传入该参数。
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set Region 地域维度. 如果要控制该配置文件在地域级别生效，则传入该参数。
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }



    /**
     * set ConfType 配置类型，前端自定义
     *
     * @param confType
     */
    public CreateWebConfReq confType(String confType) {
        this.confType = confType;
        return this;
    }


    /**
     * set Data 配置内容
     *
     * @param data
     */
    public CreateWebConfReq data(String data) {
        this.data = data;
        return this;
    }


    /**
     * set LogsetUID 日志集维度。如果要控制该配置文件在日志集级别生效，则传LogsetUID，不传LogtopicUID
     *
     * @param logsetUID
     */
    public CreateWebConfReq logsetUID(String logsetUID) {
        this.logsetUID = logsetUID;
        return this;
    }


    /**
     * set LogtopicUID 日志主题维度。如果要控制该配置文件在日志主题级别生效，则传LogtopicUID，不传LogsetUID
     *
     * @param logtopicUID
     */
    public CreateWebConfReq logtopicUID(String logtopicUID) {
        this.logtopicUID = logtopicUID;
        return this;
    }


    /**
     * set Region 地域维度. 如果要控制该配置文件在地域级别生效，则传入该参数。
     *
     * @param region
     */
    public CreateWebConfReq region(String region) {
        this.region = region;
        return this;
    }


}