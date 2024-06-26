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

package com.jdcloud.sdk.service.lavm.model;


/**
 * 轻量云主机的域名
 */
public class InstanceDomain  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 域名名称
     */
    private String domainName;

    /**
     * 创建时间
     */
    private String createTime;



    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 域名名称
     *
     * @return
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * set 域名名称
     *
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }


    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }



    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public InstanceDomain instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 域名名称
     *
     * @param domainName
     */
    public InstanceDomain domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }


    /**
     * set 创建时间
     *
     * @param createTime
     */
    public InstanceDomain createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}