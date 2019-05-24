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

package com.jdcloud.sdk.service.iothub.model;


/**
 * dataVO
 */
public class DataVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 系统流水号
     */
    private String id;

    /**
     * 实例名称
     */
    private String name;

    /**
     * 子网编号
     */
    private String subNetId;

    /**
     * 子网名称
     */
    private String subNetName;

    /**
     * VPC编号
     */
    private String vpcId;

    /**
     * VPC名称
     */
    private String vpcName;

    /**
     * 可用区名称
     */
    private String azName;

    /**
     * 公网域名
     */
    private String pubDomain;

    /**
     * 内网域名
     */
    private String priDomain;

    /**
     * 实例状态[0-创建中，1-运行中，2-停止]
     */
    private String status;

    /**
     * 资费形式
     */
    private String feetype;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 实例编号
     */
    private String instanceId;


    /**
     * get 系统流水号
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 系统流水号
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get 实例名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 子网编号
     *
     * @return
     */
    public String getSubNetId() {
        return subNetId;
    }

    /**
     * set 子网编号
     *
     * @param subNetId
     */
    public void setSubNetId(String subNetId) {
        this.subNetId = subNetId;
    }

    /**
     * get 子网名称
     *
     * @return
     */
    public String getSubNetName() {
        return subNetName;
    }

    /**
     * set 子网名称
     *
     * @param subNetName
     */
    public void setSubNetName(String subNetName) {
        this.subNetName = subNetName;
    }

    /**
     * get VPC编号
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set VPC编号
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get VPC名称
     *
     * @return
     */
    public String getVpcName() {
        return vpcName;
    }

    /**
     * set VPC名称
     *
     * @param vpcName
     */
    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    /**
     * get 可用区名称
     *
     * @return
     */
    public String getAzName() {
        return azName;
    }

    /**
     * set 可用区名称
     *
     * @param azName
     */
    public void setAzName(String azName) {
        this.azName = azName;
    }

    /**
     * get 公网域名
     *
     * @return
     */
    public String getPubDomain() {
        return pubDomain;
    }

    /**
     * set 公网域名
     *
     * @param pubDomain
     */
    public void setPubDomain(String pubDomain) {
        this.pubDomain = pubDomain;
    }

    /**
     * get 内网域名
     *
     * @return
     */
    public String getPriDomain() {
        return priDomain;
    }

    /**
     * set 内网域名
     *
     * @param priDomain
     */
    public void setPriDomain(String priDomain) {
        this.priDomain = priDomain;
    }

    /**
     * get 实例状态[0-创建中，1-运行中，2-停止]
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 实例状态[0-创建中，1-运行中，2-停止]
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 资费形式
     *
     * @return
     */
    public String getFeetype() {
        return feetype;
    }

    /**
     * set 资费形式
     *
     * @param feetype
     */
    public void setFeetype(String feetype) {
        this.feetype = feetype;
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
     * get 实例编号
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例编号
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 系统流水号
     *
     * @param id
     */
    public DataVO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param name
     */
    public DataVO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 子网编号
     *
     * @param subNetId
     */
    public DataVO subNetId(String subNetId) {
        this.subNetId = subNetId;
        return this;
    }

    /**
     * set 子网名称
     *
     * @param subNetName
     */
    public DataVO subNetName(String subNetName) {
        this.subNetName = subNetName;
        return this;
    }

    /**
     * set VPC编号
     *
     * @param vpcId
     */
    public DataVO vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set VPC名称
     *
     * @param vpcName
     */
    public DataVO vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set 可用区名称
     *
     * @param azName
     */
    public DataVO azName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set 公网域名
     *
     * @param pubDomain
     */
    public DataVO pubDomain(String pubDomain) {
        this.pubDomain = pubDomain;
        return this;
    }

    /**
     * set 内网域名
     *
     * @param priDomain
     */
    public DataVO priDomain(String priDomain) {
        this.priDomain = priDomain;
        return this;
    }

    /**
     * set 实例状态[0-创建中，1-运行中，2-停止]
     *
     * @param status
     */
    public DataVO status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 资费形式
     *
     * @param feetype
     */
    public DataVO feetype(String feetype) {
        this.feetype = feetype;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public DataVO createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 实例编号
     *
     * @param instanceId
     */
    public DataVO instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


}