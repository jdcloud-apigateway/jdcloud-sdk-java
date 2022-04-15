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

import java.util.List;
import java.util.ArrayList;

/**
 * vpc
 */
public class Vpc  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Vpc的Id
     */
    private String vpcId;

    /**
     * 如果为空，则不限制网段，如果不为空，10.0.0.0/8、172.16.0.0/12和192.168.0.0/16及它们包含的子网，且子网掩码长度为16-28之间
     */
    private String addressPrefix;

    /**
     * VPC 描述，取值范围：1~120个字符
     */
    private String description;

    /**
     * 私有网络名称，取值范围：1-60个中文、英文大小写的字母、数字和下划线分隔符
     */
    private String vpcName;

    /**
     * 同一vpc下的acl id 列表
     */
    private List<String> aclIds;

    /**
     * routeTableIds
     */
    private List<String> routeTableIds;

    /**
     * 私有网络包含的子网列表
     */
    private List<Subnet> subnets;

    /**
     * vpc创建时间
     */
    private String createdTime;

    /**
     * VPC az类型，取值：standard(标准VPC)，edge(边缘VPC)
     */
    private String azType;

    /**
     * VPC可用区, 标准VPC为&quot;&quot;， 边缘VPC为边缘az
     */
    private String az;


    /**
     * get Vpc的Id
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set Vpc的Id
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 如果为空，则不限制网段，如果不为空，10.0.0.0/8、172.16.0.0/12和192.168.0.0/16及它们包含的子网，且子网掩码长度为16-28之间
     *
     * @return
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * set 如果为空，则不限制网段，如果不为空，10.0.0.0/8、172.16.0.0/12和192.168.0.0/16及它们包含的子网，且子网掩码长度为16-28之间
     *
     * @param addressPrefix
     */
    public void setAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
    }

    /**
     * get VPC 描述，取值范围：1~120个字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set VPC 描述，取值范围：1~120个字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 私有网络名称，取值范围：1-60个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @return
     */
    public String getVpcName() {
        return vpcName;
    }

    /**
     * set 私有网络名称，取值范围：1-60个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param vpcName
     */
    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    /**
     * get 同一vpc下的acl id 列表
     *
     * @return
     */
    public List<String> getAclIds() {
        return aclIds;
    }

    /**
     * set 同一vpc下的acl id 列表
     *
     * @param aclIds
     */
    public void setAclIds(List<String> aclIds) {
        this.aclIds = aclIds;
    }

    /**
     * get routeTableIds
     *
     * @return
     */
    public List<String> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * set routeTableIds
     *
     * @param routeTableIds
     */
    public void setRouteTableIds(List<String> routeTableIds) {
        this.routeTableIds = routeTableIds;
    }

    /**
     * get 私有网络包含的子网列表
     *
     * @return
     */
    public List<Subnet> getSubnets() {
        return subnets;
    }

    /**
     * set 私有网络包含的子网列表
     *
     * @param subnets
     */
    public void setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
    }

    /**
     * get vpc创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set vpc创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get VPC az类型，取值：standard(标准VPC)，edge(边缘VPC)
     *
     * @return
     */
    public String getAzType() {
        return azType;
    }

    /**
     * set VPC az类型，取值：standard(标准VPC)，edge(边缘VPC)
     *
     * @param azType
     */
    public void setAzType(String azType) {
        this.azType = azType;
    }

    /**
     * get VPC可用区, 标准VPC为&quot;&quot;， 边缘VPC为边缘az
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set VPC可用区, 标准VPC为&quot;&quot;， 边缘VPC为边缘az
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }


    /**
     * set Vpc的Id
     *
     * @param vpcId
     */
    public Vpc vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 如果为空，则不限制网段，如果不为空，10.0.0.0/8、172.16.0.0/12和192.168.0.0/16及它们包含的子网，且子网掩码长度为16-28之间
     *
     * @param addressPrefix
     */
    public Vpc addressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * set VPC 描述，取值范围：1~120个字符
     *
     * @param description
     */
    public Vpc description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 私有网络名称，取值范围：1-60个中文、英文大小写的字母、数字和下划线分隔符
     *
     * @param vpcName
     */
    public Vpc vpcName(String vpcName) {
        this.vpcName = vpcName;
        return this;
    }

    /**
     * set 同一vpc下的acl id 列表
     *
     * @param aclIds
     */
    public Vpc aclIds(List<String> aclIds) {
        this.aclIds = aclIds;
        return this;
    }

    /**
     * set routeTableIds
     *
     * @param routeTableIds
     */
    public Vpc routeTableIds(List<String> routeTableIds) {
        this.routeTableIds = routeTableIds;
        return this;
    }

    /**
     * set 私有网络包含的子网列表
     *
     * @param subnets
     */
    public Vpc subnets(List<Subnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * set vpc创建时间
     *
     * @param createdTime
     */
    public Vpc createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set VPC az类型，取值：standard(标准VPC)，edge(边缘VPC)
     *
     * @param azType
     */
    public Vpc azType(String azType) {
        this.azType = azType;
        return this;
    }

    /**
     * set VPC可用区, 标准VPC为&quot;&quot;， 边缘VPC为边缘az
     *
     * @param az
     */
    public Vpc az(String az) {
        this.az = az;
        return this;
    }


    /**
     * add item to 同一vpc下的acl id 列表
     *
     * @param aclId
     */
    public void addAclId(String aclId) {
        if (this.aclIds == null) {
            this.aclIds = new ArrayList<>();
        }
        this.aclIds.add(aclId);
    }

    /**
     * add item to routeTableIds
     *
     * @param routeTableId
     */
    public void addRouteTableId(String routeTableId) {
        if (this.routeTableIds == null) {
            this.routeTableIds = new ArrayList<>();
        }
        this.routeTableIds.add(routeTableId);
    }

    /**
     * add item to 私有网络包含的子网列表
     *
     * @param subnet
     */
    public void addSubnet(Subnet subnet) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnet);
    }

}