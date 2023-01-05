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

package com.jdcloud.sdk.service.vpc.model;


/**
 * ipv6Info
 */
public class Ipv6Info  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 绑定资源所在私有网络的id
     */
    private String vpcId;

    /**
     * 绑定资源所在子网的id
     */
    private String subnetId;

    /**
     * 绑定资源的类型
     */
    private String instanceType;

    /**
     * 绑定资源所拥有的ipv6的地址
     */
    private String ipv6Address;

    /**
     * ip绑定资源创建时间
     */
    private String createdTime;



    /**
     * get 绑定资源所在私有网络的id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 绑定资源所在私有网络的id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
     * get 绑定资源所在子网的id
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 绑定资源所在子网的id
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }


    /**
     * get 绑定资源的类型
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 绑定资源的类型
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }


    /**
     * get 绑定资源所拥有的ipv6的地址
     *
     * @return
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * set 绑定资源所拥有的ipv6的地址
     *
     * @param ipv6Address
     */
    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }


    /**
     * get ip绑定资源创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set ip绑定资源创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }



    /**
     * set 绑定资源所在私有网络的id
     *
     * @param vpcId
     */
    public Ipv6Info vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
     * set 绑定资源所在子网的id
     *
     * @param subnetId
     */
    public Ipv6Info subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }


    /**
     * set 绑定资源的类型
     *
     * @param instanceType
     */
    public Ipv6Info instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }


    /**
     * set 绑定资源所拥有的ipv6的地址
     *
     * @param ipv6Address
     */
    public Ipv6Info ipv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }


    /**
     * set ip绑定资源创建时间
     *
     * @param createdTime
     */
    public Ipv6Info createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


}