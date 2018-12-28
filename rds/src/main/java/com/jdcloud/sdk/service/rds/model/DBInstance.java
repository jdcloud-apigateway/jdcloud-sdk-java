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

package com.jdcloud.sdk.service.rds.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;

/**
 * dBInstance
 */
public class DBInstance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     */
    private String instanceName;

    /**
     * 实例类别，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String instanceType;

    /**
     * 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String engine;

    /**
     * 实例引擎版本，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String engineVersion;

    /**
     * 地域ID，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     */
    private String regionId;

    /**
     * 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     */
    private List<String> azId;

    /**
     * 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     */
    private String instanceStatus;

    /**
     * 实例创建时间
     */
    private String createTime;

    /**
     * 计费配置
     */
    private Charge charge;

    /**
     * 标签信息
     */
    private List<Tag> tags;


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
     * get 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get 实例类别，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例类别，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getEngine() {
        return engine;
    }

    /**
     * set 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * get 实例引擎版本，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * set 实例引擎版本，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engineVersion
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * get 地域ID，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @return
     */
    public List<String> getAzId() {
        return azId;
    }

    /**
     * set 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param azId
     */
    public void setAzId(List<String> azId) {
        this.azId = azId;
    }

    /**
     * get 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @return
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * set 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * get 实例创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 实例创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 计费配置
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    /**
     * get 标签信息
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set 标签信息
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public DBInstance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称，具体规则可参见帮助中心文档:[名称及密码限制](../../../documentation/Cloud-Database-and-Cache/RDS/Introduction/Restrictions/SQLServer-Restrictions.md)
     *
     * @param instanceName
     */
    public DBInstance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set 实例类别，例如主实例，只读实例等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceType
     */
    public DBInstance instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 实例引擎类型，如MySQL或SQL Server等，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engine
     */
    public DBInstance engine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * set 实例引擎版本，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param engineVersion
     */
    public DBInstance engineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * set 地域ID，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param regionId
     */
    public DBInstance regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param azId
     */
    public DBInstance azId(List<String> azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set 实例状态，参见[枚举参数定义](../Enum-Definitions/Enum-Definitions.md)
     *
     * @param instanceStatus
     */
    public DBInstance instanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set 实例创建时间
     *
     * @param createTime
     */
    public DBInstance createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 计费配置
     *
     * @param charge
     */
    public DBInstance charge(Charge charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set 标签信息
     *
     * @param tags
     */
    public DBInstance tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }


    /**
     * add item to 可用区ID，第一个为主实例在的可用区，参见[地域及可用区对照表](../Enum-Definitions/Regions-AZ.md)
     *
     * @param azId
     */
    public void addAzId(String azId) {
        if (this.azId == null) {
            this.azId = new ArrayList<>();
        }
        this.azId.add(azId);
    }

    /**
     * add item to 标签信息
     *
     * @param tag
     */
    public void addTag(Tag tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

}