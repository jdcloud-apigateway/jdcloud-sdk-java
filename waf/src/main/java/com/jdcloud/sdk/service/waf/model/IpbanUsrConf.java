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

package com.jdcloud.sdk.service.waf.model;


/**
 * ipbanUsrConf
 */
public class IpbanUsrConf  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 是否使能 0表示否
     */
    private Integer enable;

    /**
     * 封禁时间，秒
     */
    private Integer ipbanTime;

    /**
     * 检测时间，秒
     */
    private Integer detectTime;

    /**
     * 封禁阈值
     */
    private Integer threshold;

    /**
     * 动作配置
     */
    private DenyActionCfg action;


    /**
     * get 是否使能 0表示否
     *
     * @return
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * get 封禁时间，秒
     *
     * @return
     */
    public Integer getIpbanTime() {
        return ipbanTime;
    }

    /**
     * set 封禁时间，秒
     *
     * @param ipbanTime
     */
    public void setIpbanTime(Integer ipbanTime) {
        this.ipbanTime = ipbanTime;
    }

    /**
     * get 检测时间，秒
     *
     * @return
     */
    public Integer getDetectTime() {
        return detectTime;
    }

    /**
     * set 检测时间，秒
     *
     * @param detectTime
     */
    public void setDetectTime(Integer detectTime) {
        this.detectTime = detectTime;
    }

    /**
     * get 封禁阈值
     *
     * @return
     */
    public Integer getThreshold() {
        return threshold;
    }

    /**
     * set 封禁阈值
     *
     * @param threshold
     */
    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    /**
     * get 动作配置
     *
     * @return
     */
    public DenyActionCfg getAction() {
        return action;
    }

    /**
     * set 动作配置
     *
     * @param action
     */
    public void setAction(DenyActionCfg action) {
        this.action = action;
    }


    /**
     * set 是否使能 0表示否
     *
     * @param enable
     */
    public IpbanUsrConf enable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * set 封禁时间，秒
     *
     * @param ipbanTime
     */
    public IpbanUsrConf ipbanTime(Integer ipbanTime) {
        this.ipbanTime = ipbanTime;
        return this;
    }

    /**
     * set 检测时间，秒
     *
     * @param detectTime
     */
    public IpbanUsrConf detectTime(Integer detectTime) {
        this.detectTime = detectTime;
        return this;
    }

    /**
     * set 封禁阈值
     *
     * @param threshold
     */
    public IpbanUsrConf threshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * set 动作配置
     *
     * @param action
     */
    public IpbanUsrConf action(DenyActionCfg action) {
        this.action = action;
        return this;
    }


}