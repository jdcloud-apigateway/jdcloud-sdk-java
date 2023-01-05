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
 * routeTable
 */
public class RouteTable  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 路由表ID
     */
    private String routeTableId;

    /**
     * 路由表名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     */
    private String routeTableName;

    /**
     * 路由表类型，default：默认路由表，custom：自定义路由表
     */
    private String routeTableType;

    /**
     * 绑定资源类型，取值：subnet，gateway
     */
    private String associateType;

    /**
     * 路由表描述信息，允许输入UTF-8编码下的全部字符，不超过256字符。
     */
    private String description;

    /**
     * 私有网络ID
     */
    private String vpcId;

    /**
     * 路由表规则信息
     */
    
    private List<RouteTableRule> routeTableRules;
    /**
     * 路由传播列表
     */
    
    private List<RoutePropagation> routePropagations;
    /**
     * 路由表绑定的子网列表
     */
    
    private List<String> subnetIds;
    /**
     * 路由表az类型，取值：standard(标准路由表)，edge(边缘路由表)
     */
    private String azType;

    /**
     * 路由表可用区
     */
    private String az;

    /**
     * 路由表创建时间
     */
    private String createdTime;



    /**
     * get 路由表ID
     *
     * @return
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * set 路由表ID
     *
     * @param routeTableId
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }


    /**
     * get 路由表名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @return
     */
    public String getRouteTableName() {
        return routeTableName;
    }

    /**
     * set 路由表名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param routeTableName
     */
    public void setRouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
    }


    /**
     * get 路由表类型，default：默认路由表，custom：自定义路由表
     *
     * @return
     */
    public String getRouteTableType() {
        return routeTableType;
    }

    /**
     * set 路由表类型，default：默认路由表，custom：自定义路由表
     *
     * @param routeTableType
     */
    public void setRouteTableType(String routeTableType) {
        this.routeTableType = routeTableType;
    }


    /**
     * get 绑定资源类型，取值：subnet，gateway
     *
     * @return
     */
    public String getAssociateType() {
        return associateType;
    }

    /**
     * set 绑定资源类型，取值：subnet，gateway
     *
     * @param associateType
     */
    public void setAssociateType(String associateType) {
        this.associateType = associateType;
    }


    /**
     * get 路由表描述信息，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 路由表描述信息，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * get 私有网络ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }


    /**
    * get 路由表规则信息
    *
    * @return
    */
    public List<RouteTableRule> getRouteTableRules() {
        return routeTableRules;
    }

    /**
    * set 路由表规则信息
    *
    * @param routeTableRules
    */
    public void setRouteTableRules(List<RouteTableRule> routeTableRules) {
        this.routeTableRules = routeTableRules;
    }


    /**
    * get 路由传播列表
    *
    * @return
    */
    public List<RoutePropagation> getRoutePropagations() {
        return routePropagations;
    }

    /**
    * set 路由传播列表
    *
    * @param routePropagations
    */
    public void setRoutePropagations(List<RoutePropagation> routePropagations) {
        this.routePropagations = routePropagations;
    }


    /**
    * get 路由表绑定的子网列表
    *
    * @return
    */
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
    * set 路由表绑定的子网列表
    *
    * @param subnetIds
    */
    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }


    /**
     * get 路由表az类型，取值：standard(标准路由表)，edge(边缘路由表)
     *
     * @return
     */
    public String getAzType() {
        return azType;
    }

    /**
     * set 路由表az类型，取值：standard(标准路由表)，edge(边缘路由表)
     *
     * @param azType
     */
    public void setAzType(String azType) {
        this.azType = azType;
    }


    /**
     * get 路由表可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 路由表可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }


    /**
     * get 路由表创建时间
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 路由表创建时间
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }



    /**
     * set 路由表ID
     *
     * @param routeTableId
     */
    public RouteTable routeTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }


    /**
     * set 路由表名称，只允许输入中文、数字、大小写字母、英文下划线“_”及中划线“-”，不允许为空且不超过32字符。
     *
     * @param routeTableName
     */
    public RouteTable routeTableName(String routeTableName) {
        this.routeTableName = routeTableName;
        return this;
    }


    /**
     * set 路由表类型，default：默认路由表，custom：自定义路由表
     *
     * @param routeTableType
     */
    public RouteTable routeTableType(String routeTableType) {
        this.routeTableType = routeTableType;
        return this;
    }


    /**
     * set 绑定资源类型，取值：subnet，gateway
     *
     * @param associateType
     */
    public RouteTable associateType(String associateType) {
        this.associateType = associateType;
        return this;
    }


    /**
     * set 路由表描述信息，允许输入UTF-8编码下的全部字符，不超过256字符。
     *
     * @param description
     */
    public RouteTable description(String description) {
        this.description = description;
        return this;
    }


    /**
     * set 私有网络ID
     *
     * @param vpcId
     */
    public RouteTable vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }


    /**
    * set 路由表规则信息
    *
    * @param routeTableRules
    */
    public RouteTable routeTableRules(List<RouteTableRule> routeTableRules) {
        this.routeTableRules = routeTableRules;
        return this;
    }


    /**
    * set 路由传播列表
    *
    * @param routePropagations
    */
    public RouteTable routePropagations(List<RoutePropagation> routePropagations) {
        this.routePropagations = routePropagations;
        return this;
    }


    /**
    * set 路由表绑定的子网列表
    *
    * @param subnetIds
    */
    public RouteTable subnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }


    /**
     * set 路由表az类型，取值：standard(标准路由表)，edge(边缘路由表)
     *
     * @param azType
     */
    public RouteTable azType(String azType) {
        this.azType = azType;
        return this;
    }


    /**
     * set 路由表可用区
     *
     * @param az
     */
    public RouteTable az(String az) {
        this.az = az;
        return this;
    }


    /**
     * set 路由表创建时间
     *
     * @param createdTime
     */
    public RouteTable createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }



    /**
     * add item to 路由表规则信息
     *
     * @param routeTableRule
     */
    public void addRouteTableRule(RouteTableRule routeTableRule) {
        if (this.routeTableRules == null) {
            this.routeTableRules = new ArrayList<>();
        }
        this.routeTableRules.add(routeTableRule);
    }

    /**
     * add item to 路由传播列表
     *
     * @param routePropagation
     */
    public void addRoutePropagation(RoutePropagation routePropagation) {
        if (this.routePropagations == null) {
            this.routePropagations = new ArrayList<>();
        }
        this.routePropagations.add(routePropagation);
    }

    /**
     * add item to 路由表绑定的子网列表
     *
     * @param subnetId
     */
    public void addSubnetId(String subnetId) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetId);
    }
}