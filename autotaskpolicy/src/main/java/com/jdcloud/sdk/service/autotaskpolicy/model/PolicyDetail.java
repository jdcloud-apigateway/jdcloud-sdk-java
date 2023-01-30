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

package com.jdcloud.sdk.service.autotaskpolicy.model;

import java.util.List;
import java.util.ArrayList;

/**
 * policyDetail
 */
public class PolicyDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略类型
     */
    private String policyType;

    /**
     * 策略触发条件/周期
     */
    private String fireCondition;

    /**
     * 触发时间
     */
    private String fireTime;

    /**
     * 上一次触发时间
     */
    private String prevFireTime;

    /**
     * 下一次触发时间
     */
    private String nextFireTime;

    /**
     * 策略触发执行累计次数的上限数。
     */
    private Integer execNumLimit;

    /**
     * 该策略绑定的资源。
     */
    private Resource execResource;

    /**
     * 该策略执行时的额外条件。
     */
    
    private List<Config> execConfig;
    /**
     * 日志配置
     */
    private Log log;



    /**
     * get 策略类型
     *
     * @return
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * set 策略类型
     *
     * @param policyType
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }


    /**
     * get 策略触发条件/周期
     *
     * @return
     */
    public String getFireCondition() {
        return fireCondition;
    }

    /**
     * set 策略触发条件/周期
     *
     * @param fireCondition
     */
    public void setFireCondition(String fireCondition) {
        this.fireCondition = fireCondition;
    }


    /**
     * get 触发时间
     *
     * @return
     */
    public String getFireTime() {
        return fireTime;
    }

    /**
     * set 触发时间
     *
     * @param fireTime
     */
    public void setFireTime(String fireTime) {
        this.fireTime = fireTime;
    }


    /**
     * get 上一次触发时间
     *
     * @return
     */
    public String getPrevFireTime() {
        return prevFireTime;
    }

    /**
     * set 上一次触发时间
     *
     * @param prevFireTime
     */
    public void setPrevFireTime(String prevFireTime) {
        this.prevFireTime = prevFireTime;
    }


    /**
     * get 下一次触发时间
     *
     * @return
     */
    public String getNextFireTime() {
        return nextFireTime;
    }

    /**
     * set 下一次触发时间
     *
     * @param nextFireTime
     */
    public void setNextFireTime(String nextFireTime) {
        this.nextFireTime = nextFireTime;
    }


    /**
     * get 策略触发执行累计次数的上限数。
     *
     * @return
     */
    public Integer getExecNumLimit() {
        return execNumLimit;
    }

    /**
     * set 策略触发执行累计次数的上限数。
     *
     * @param execNumLimit
     */
    public void setExecNumLimit(Integer execNumLimit) {
        this.execNumLimit = execNumLimit;
    }


    /**
     * get 该策略绑定的资源。
     *
     * @return
     */
    public Resource getExecResource() {
        return execResource;
    }

    /**
     * set 该策略绑定的资源。
     *
     * @param execResource
     */
    public void setExecResource(Resource execResource) {
        this.execResource = execResource;
    }


    /**
    * get 该策略执行时的额外条件。
    *
    * @return
    */
    public List<Config> getExecConfig() {
        return execConfig;
    }

    /**
    * set 该策略执行时的额外条件。
    *
    * @param execConfig
    */
    public void setExecConfig(List<Config> execConfig) {
        this.execConfig = execConfig;
    }


    /**
     * get 日志配置
     *
     * @return
     */
    public Log getLog() {
        return log;
    }

    /**
     * set 日志配置
     *
     * @param log
     */
    public void setLog(Log log) {
        this.log = log;
    }



    /**
     * set 策略类型
     *
     * @param policyType
     */
    public PolicyDetail policyType(String policyType) {
        this.policyType = policyType;
        return this;
    }


    /**
     * set 策略触发条件/周期
     *
     * @param fireCondition
     */
    public PolicyDetail fireCondition(String fireCondition) {
        this.fireCondition = fireCondition;
        return this;
    }


    /**
     * set 触发时间
     *
     * @param fireTime
     */
    public PolicyDetail fireTime(String fireTime) {
        this.fireTime = fireTime;
        return this;
    }


    /**
     * set 上一次触发时间
     *
     * @param prevFireTime
     */
    public PolicyDetail prevFireTime(String prevFireTime) {
        this.prevFireTime = prevFireTime;
        return this;
    }


    /**
     * set 下一次触发时间
     *
     * @param nextFireTime
     */
    public PolicyDetail nextFireTime(String nextFireTime) {
        this.nextFireTime = nextFireTime;
        return this;
    }


    /**
     * set 策略触发执行累计次数的上限数。
     *
     * @param execNumLimit
     */
    public PolicyDetail execNumLimit(Integer execNumLimit) {
        this.execNumLimit = execNumLimit;
        return this;
    }


    /**
     * set 该策略绑定的资源。
     *
     * @param execResource
     */
    public PolicyDetail execResource(Resource execResource) {
        this.execResource = execResource;
        return this;
    }


    /**
    * set 该策略执行时的额外条件。
    *
    * @param execConfig
    */
    public PolicyDetail execConfig(List<Config> execConfig) {
        this.execConfig = execConfig;
        return this;
    }


    /**
     * set 日志配置
     *
     * @param log
     */
    public PolicyDetail log(Log log) {
        this.log = log;
        return this;
    }



    /**
     * add item to 该策略执行时的额外条件。
     *
     * @param execConfig
     */
    public void addExecConfig(Config execConfig) {
        if (this.execConfig == null) {
            this.execConfig = new ArrayList<>();
        }
        this.execConfig.add(execConfig);
    }
}