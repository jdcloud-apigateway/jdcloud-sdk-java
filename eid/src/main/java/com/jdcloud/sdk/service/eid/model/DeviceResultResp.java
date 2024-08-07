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

package com.jdcloud.sdk.service.eid.model;


/**
 * deviceResultResp
 */
public class DeviceResultResp  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Id
     */
    private Integer id;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 操作系统
     */
    private String system;

    /**
     * Eid
     */
    private String eid;

    /**
     * 设备风险
     */
    private String riskTag;

    /**
     * 创建时间，毫秒级时间戳
     */
    private Integer createTime;

    /**
     * 最新采集时间，毫秒级时间戳
     */
    private Integer updateTime;

    /**
     * 采集次数
     */
    private Integer count;



    /**
     * get Id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set Id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }


    /**
     * get 操作系统
     *
     * @return
     */
    public String getSystem() {
        return system;
    }

    /**
     * set 操作系统
     *
     * @param system
     */
    public void setSystem(String system) {
        this.system = system;
    }


    /**
     * get Eid
     *
     * @return
     */
    public String getEid() {
        return eid;
    }

    /**
     * set Eid
     *
     * @param eid
     */
    public void setEid(String eid) {
        this.eid = eid;
    }


    /**
     * get 设备风险
     *
     * @return
     */
    public String getRiskTag() {
        return riskTag;
    }

    /**
     * set 设备风险
     *
     * @param riskTag
     */
    public void setRiskTag(String riskTag) {
        this.riskTag = riskTag;
    }


    /**
     * get 创建时间，毫秒级时间戳
     *
     * @return
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间，毫秒级时间戳
     *
     * @param createTime
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }


    /**
     * get 最新采集时间，毫秒级时间戳
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 最新采集时间，毫秒级时间戳
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 采集次数
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 采集次数
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }



    /**
     * set Id
     *
     * @param id
     */
    public DeviceResultResp id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public DeviceResultResp appName(String appName) {
        this.appName = appName;
        return this;
    }


    /**
     * set 操作系统
     *
     * @param system
     */
    public DeviceResultResp system(String system) {
        this.system = system;
        return this;
    }


    /**
     * set Eid
     *
     * @param eid
     */
    public DeviceResultResp eid(String eid) {
        this.eid = eid;
        return this;
    }


    /**
     * set 设备风险
     *
     * @param riskTag
     */
    public DeviceResultResp riskTag(String riskTag) {
        this.riskTag = riskTag;
        return this;
    }


    /**
     * set 创建时间，毫秒级时间戳
     *
     * @param createTime
     */
    public DeviceResultResp createTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 最新采集时间，毫秒级时间戳
     *
     * @param updateTime
     */
    public DeviceResultResp updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 采集次数
     *
     * @param count
     */
    public DeviceResultResp count(Integer count) {
        this.count = count;
        return this;
    }


}