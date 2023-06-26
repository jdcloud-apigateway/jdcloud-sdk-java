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
 * ipsetlistCfg
 */
public class IpsetlistCfg  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ip集名称
     */
    private String policyName;

    /**
     * 规则更新时间，秒级时间戳, 0 表示历史数据无记录
     */
    private Integer updateTime;

    /**
     * 备注
     */
    private String tag;



    /**
     * get ip集名称
     *
     * @return
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * set ip集名称
     *
     * @param policyName
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }


    /**
     * get 规则更新时间，秒级时间戳, 0 表示历史数据无记录
     *
     * @return
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * set 规则更新时间，秒级时间戳, 0 表示历史数据无记录
     *
     * @param updateTime
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * get 备注
     *
     * @return
     */
    public String getTag() {
        return tag;
    }

    /**
     * set 备注
     *
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }



    /**
     * set ip集名称
     *
     * @param policyName
     */
    public IpsetlistCfg policyName(String policyName) {
        this.policyName = policyName;
        return this;
    }


    /**
     * set 规则更新时间，秒级时间戳, 0 表示历史数据无记录
     *
     * @param updateTime
     */
    public IpsetlistCfg updateTime(Integer updateTime) {
        this.updateTime = updateTime;
        return this;
    }


    /**
     * set 备注
     *
     * @param tag
     */
    public IpsetlistCfg tag(String tag) {
        this.tag = tag;
        return this;
    }


}