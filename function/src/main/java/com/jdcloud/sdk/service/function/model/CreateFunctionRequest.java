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
 * Function OpenAPI
 * 
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.function.model;

import com.jdcloud.sdk.service.function.model.Code;
import com.jdcloud.sdk.service.function.model.Env;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 创建函数
 */
public class CreateFunctionRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 函数名称
     */
    private String name;

    /**
     * 函数描述信息
     */
    private String description;

    /**
     * 函数入口，格式为入口文件.入口函数名
     */
    private String entrance;

    /**
     * 函数运行最大内存
     */
    private Integer memory;

    /**
     * 函数运行环境
     */
    private String runTime;

    /**
     * 函数运行超时时间
     */
    private Integer overTime;

    /**
     * 函数版本，默认为LATEST
     */
    private String version;

    /**
     * 函数代码包
     */
    private Code code;

    /**
     * 函数运行时环境变量
     */
    private Env environment;

    /**
     * 函数指定的日志集Id
     */
    private String logSetId;

    /**
     * 函数指定的日志主题Id
     */
    private String logTopicId;

    /**
     * 函数配置的VPCId
     */
    private String vpcId;

    /**
     * 函数配置的子网Id
     */
    private String subnetId;

    /**
     * Region ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 函数名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 函数名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 函数描述信息
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 函数描述信息
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 函数入口，格式为入口文件.入口函数名
     *
     * @return
     */
    public String getEntrance() {
        return entrance;
    }

    /**
     * set 函数入口，格式为入口文件.入口函数名
     *
     * @param entrance
     */
    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    /**
     * get 函数运行最大内存
     *
     * @return
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * set 函数运行最大内存
     *
     * @param memory
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    /**
     * get 函数运行环境
     *
     * @return
     */
    public String getRunTime() {
        return runTime;
    }

    /**
     * set 函数运行环境
     *
     * @param runTime
     */
    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    /**
     * get 函数运行超时时间
     *
     * @return
     */
    public Integer getOverTime() {
        return overTime;
    }

    /**
     * set 函数运行超时时间
     *
     * @param overTime
     */
    public void setOverTime(Integer overTime) {
        this.overTime = overTime;
    }

    /**
     * get 函数版本，默认为LATEST
     *
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * set 函数版本，默认为LATEST
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * get 函数代码包
     *
     * @return
     */
    public Code getCode() {
        return code;
    }

    /**
     * set 函数代码包
     *
     * @param code
     */
    public void setCode(Code code) {
        this.code = code;
    }

    /**
     * get 函数运行时环境变量
     *
     * @return
     */
    public Env getEnvironment() {
        return environment;
    }

    /**
     * set 函数运行时环境变量
     *
     * @param environment
     */
    public void setEnvironment(Env environment) {
        this.environment = environment;
    }

    /**
     * get 函数指定的日志集Id
     *
     * @return
     */
    public String getLogSetId() {
        return logSetId;
    }

    /**
     * set 函数指定的日志集Id
     *
     * @param logSetId
     */
    public void setLogSetId(String logSetId) {
        this.logSetId = logSetId;
    }

    /**
     * get 函数指定的日志主题Id
     *
     * @return
     */
    public String getLogTopicId() {
        return logTopicId;
    }

    /**
     * set 函数指定的日志主题Id
     *
     * @param logTopicId
     */
    public void setLogTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
    }

    /**
     * get 函数配置的VPCId
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 函数配置的VPCId
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 函数配置的子网Id
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 函数配置的子网Id
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get Region ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 函数名称
     *
     * @param name
     */
    public CreateFunctionRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 函数描述信息
     *
     * @param description
     */
    public CreateFunctionRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 函数入口，格式为入口文件.入口函数名
     *
     * @param entrance
     */
    public CreateFunctionRequest entrance(String entrance) {
        this.entrance = entrance;
        return this;
    }

    /**
     * set 函数运行最大内存
     *
     * @param memory
     */
    public CreateFunctionRequest memory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * set 函数运行环境
     *
     * @param runTime
     */
    public CreateFunctionRequest runTime(String runTime) {
        this.runTime = runTime;
        return this;
    }

    /**
     * set 函数运行超时时间
     *
     * @param overTime
     */
    public CreateFunctionRequest overTime(Integer overTime) {
        this.overTime = overTime;
        return this;
    }

    /**
     * set 函数版本，默认为LATEST
     *
     * @param version
     */
    public CreateFunctionRequest version(String version) {
        this.version = version;
        return this;
    }

    /**
     * set 函数代码包
     *
     * @param code
     */
    public CreateFunctionRequest code(Code code) {
        this.code = code;
        return this;
    }

    /**
     * set 函数运行时环境变量
     *
     * @param environment
     */
    public CreateFunctionRequest environment(Env environment) {
        this.environment = environment;
        return this;
    }

    /**
     * set 函数指定的日志集Id
     *
     * @param logSetId
     */
    public CreateFunctionRequest logSetId(String logSetId) {
        this.logSetId = logSetId;
        return this;
    }

    /**
     * set 函数指定的日志主题Id
     *
     * @param logTopicId
     */
    public CreateFunctionRequest logTopicId(String logTopicId) {
        this.logTopicId = logTopicId;
        return this;
    }

    /**
     * set 函数配置的VPCId
     *
     * @param vpcId
     */
    public CreateFunctionRequest vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 函数配置的子网Id
     *
     * @param subnetId
     */
    public CreateFunctionRequest subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set Region ID
     *
     * @param regionId
     */
    public CreateFunctionRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}