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

package com.jdcloud.sdk.service.kafka.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.charge.model.Charge;
import com.jdcloud.sdk.service.resourcetag.model.Tag;

/**
 * instance
 */
public class Instance  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例名称
     */
    private String instanceName;

    /**
     * kafka实例版本
     */
    private String instanceVersion;

    /**
     * 实例状态，running：运行，error：错误，creating：创建中，changing：变配，stop：停止
     */
    private String instanceStatus;

    /**
     * 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     */
    private String createTime;

    /**
     * 所属VPC的ID
     */
    private String vpcId;

    /**
     * 所属子网的ID
     */
    private String subnetId;

    /**
     * ipVersion，空(代表v4)或者v4&amp;v6
     */
    private String ipVersion;

    /**
     * azId
     */
    private List<String> azId;

    /**
     * 集群规格信息
     */
    private List<InstanceClass> instanceClass;

    /**
     * 计费信息
     */
    private Charge charge;

    /**
     * Tag信息
     */
    private List<Tag> tags;

    /**
     * 扩展参数
     */
    private RespExtension extension;


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
     * get 实例名称
     *
     * @return
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * get kafka实例版本
     *
     * @return
     */
    public String getInstanceVersion() {
        return instanceVersion;
    }

    /**
     * set kafka实例版本
     *
     * @param instanceVersion
     */
    public void setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
    }

    /**
     * get 实例状态，running：运行，error：错误，creating：创建中，changing：变配，stop：停止
     *
     * @return
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    /**
     * set 实例状态，running：运行，error：错误，creating：创建中，changing：变配，stop：停止
     *
     * @param instanceStatus
     */
    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * get 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 所属VPC的ID
     *
     * @return
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * set 所属VPC的ID
     *
     * @param vpcId
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * get 所属子网的ID
     *
     * @return
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * set 所属子网的ID
     *
     * @param subnetId
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * get ipVersion，空(代表v4)或者v4&amp;v6
     *
     * @return
     */
    public String getIpVersion() {
        return ipVersion;
    }

    /**
     * set ipVersion，空(代表v4)或者v4&amp;v6
     *
     * @param ipVersion
     */
    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }

    /**
     * get azId
     *
     * @return
     */
    public List<String> getAzId() {
        return azId;
    }

    /**
     * set azId
     *
     * @param azId
     */
    public void setAzId(List<String> azId) {
        this.azId = azId;
    }

    /**
     * get 集群规格信息
     *
     * @return
     */
    public List<InstanceClass> getInstanceClass() {
        return instanceClass;
    }

    /**
     * set 集群规格信息
     *
     * @param instanceClass
     */
    public void setInstanceClass(List<InstanceClass> instanceClass) {
        this.instanceClass = instanceClass;
    }

    /**
     * get 计费信息
     *
     * @return
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    /**
     * get Tag信息
     *
     * @return
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * get 扩展参数
     *
     * @return
     */
    public RespExtension getExtension() {
        return extension;
    }

    /**
     * set 扩展参数
     *
     * @param extension
     */
    public void setExtension(RespExtension extension) {
        this.extension = extension;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public Instance instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例名称
     *
     * @param instanceName
     */
    public Instance instanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set kafka实例版本
     *
     * @param instanceVersion
     */
    public Instance instanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }

    /**
     * set 实例状态，running：运行，error：错误，creating：创建中，changing：变配，stop：停止
     *
     * @param instanceStatus
     */
    public Instance instanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * set 创建时间，遵循ISO8601标准，使用UTC时间，格式为：YYYY-MM-DDTHH:mm:ssZ
     *
     * @param createTime
     */
    public Instance createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 所属VPC的ID
     *
     * @param vpcId
     */
    public Instance vpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * set 所属子网的ID
     *
     * @param subnetId
     */
    public Instance subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * set ipVersion，空(代表v4)或者v4&amp;v6
     *
     * @param ipVersion
     */
    public Instance ipVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * set azId
     *
     * @param azId
     */
    public Instance azId(List<String> azId) {
        this.azId = azId;
        return this;
    }

    /**
     * set 集群规格信息
     *
     * @param instanceClass
     */
    public Instance instanceClass(List<InstanceClass> instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }

    /**
     * set 计费信息
     *
     * @param charge
     */
    public Instance charge(Charge charge) {
        this.charge = charge;
        return this;
    }

    /**
     * set Tag信息
     *
     * @param tags
     */
    public Instance tags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 扩展参数
     *
     * @param extension
     */
    public Instance extension(RespExtension extension) {
        this.extension = extension;
        return this;
    }


    /**
     * add item to azId
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
     * add item to 集群规格信息
     *
     * @param instanceClas
     */
    public void addInstanceClas(InstanceClass instanceClas) {
        if (this.instanceClass == null) {
            this.instanceClass = new ArrayList<>();
        }
        this.instanceClass.add(instanceClas);
    }

    /**
     * add item to Tag信息
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