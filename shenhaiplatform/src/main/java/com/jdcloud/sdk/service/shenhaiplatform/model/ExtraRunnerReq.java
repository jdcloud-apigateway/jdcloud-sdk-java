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

package com.jdcloud.sdk.service.shenhaiplatform.model;


/**
 * 临时查询执行请求
 */
public class ExtraRunnerReq  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 流程code
     */
    private String flowCode;

    /**
     * 脚本内容
     */
    private String content;

    /**
     * 执行引擎MapReduce,Spark,Tez,presto,Python2,Python3,auto,默认spark
     */
    private String execEngine;

    /**
     * 脚本内容的变量参数配置
     */
    private UranusTaskParamReq args;

    /**
     * 资源组名称
     */
    private String resourceName;

    /**
     * 资源组code
     */
    private String resourceCode;



    /**
     * get 流程code
     *
     * @return
     */
    public String getFlowCode() {
        return flowCode;
    }

    /**
     * set 流程code
     *
     * @param flowCode
     */
    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode;
    }


    /**
     * get 脚本内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 脚本内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * get 执行引擎MapReduce,Spark,Tez,presto,Python2,Python3,auto,默认spark
     *
     * @return
     */
    public String getExecEngine() {
        return execEngine;
    }

    /**
     * set 执行引擎MapReduce,Spark,Tez,presto,Python2,Python3,auto,默认spark
     *
     * @param execEngine
     */
    public void setExecEngine(String execEngine) {
        this.execEngine = execEngine;
    }


    /**
     * get 脚本内容的变量参数配置
     *
     * @return
     */
    public UranusTaskParamReq getArgs() {
        return args;
    }

    /**
     * set 脚本内容的变量参数配置
     *
     * @param args
     */
    public void setArgs(UranusTaskParamReq args) {
        this.args = args;
    }


    /**
     * get 资源组名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源组名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * get 资源组code
     *
     * @return
     */
    public String getResourceCode() {
        return resourceCode;
    }

    /**
     * set 资源组code
     *
     * @param resourceCode
     */
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }



    /**
     * set 流程code
     *
     * @param flowCode
     */
    public ExtraRunnerReq flowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }


    /**
     * set 脚本内容
     *
     * @param content
     */
    public ExtraRunnerReq content(String content) {
        this.content = content;
        return this;
    }


    /**
     * set 执行引擎MapReduce,Spark,Tez,presto,Python2,Python3,auto,默认spark
     *
     * @param execEngine
     */
    public ExtraRunnerReq execEngine(String execEngine) {
        this.execEngine = execEngine;
        return this;
    }


    /**
     * set 脚本内容的变量参数配置
     *
     * @param args
     */
    public ExtraRunnerReq args(UranusTaskParamReq args) {
        this.args = args;
        return this;
    }


    /**
     * set 资源组名称
     *
     * @param resourceName
     */
    public ExtraRunnerReq resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }


    /**
     * set 资源组code
     *
     * @param resourceCode
     */
    public ExtraRunnerReq resourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }


}