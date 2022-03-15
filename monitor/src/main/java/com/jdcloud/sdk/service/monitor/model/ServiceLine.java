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

package com.jdcloud.sdk.service.monitor.model;

import java.util.List;
import java.util.ArrayList;

/**
 * serviceLine
 */
public class ServiceLine  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    private Integer id;

    /**
     * 业务线代码
     */
    private String serviceCode;

    /**
     * 业务线中文名
     */
    private String serviceNameCH;

    /**
     * 业务线中文名
     */
    private String serviceNameEN;

    /**
     * 数据上报延迟时间，单位s
     */
    private Integer metricsTimeDelay;

    /**
     * 数据上报时间间隔，单位s
     */
    private Integer timeInterval;

    /**
     * 维护者erp
     */
    private String owner;

    /**
     * 是否禁用报警
     */
    private Integer disableAlarmGroup;

    /**
     * 提交id
     */
    private String commitId;

    /**
     * 分组
     */
    private String groups;

    /**
     * 分组
     */
    private List<MetricGroup> groupList;

    /**
     * 排序字段
     */
    private String column;

    /**
     * 排序方式
     */
    private String dir;

    /**
     * 页码
     */
    private Integer number;

    /**
     * 查询条数
     */
    private Integer size;


    /**
     * get 自增id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 自增id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 业务线代码
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 业务线代码
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 业务线中文名
     *
     * @return
     */
    public String getServiceNameCH() {
        return serviceNameCH;
    }

    /**
     * set 业务线中文名
     *
     * @param serviceNameCH
     */
    public void setServiceNameCH(String serviceNameCH) {
        this.serviceNameCH = serviceNameCH;
    }

    /**
     * get 业务线中文名
     *
     * @return
     */
    public String getServiceNameEN() {
        return serviceNameEN;
    }

    /**
     * set 业务线中文名
     *
     * @param serviceNameEN
     */
    public void setServiceNameEN(String serviceNameEN) {
        this.serviceNameEN = serviceNameEN;
    }

    /**
     * get 数据上报延迟时间，单位s
     *
     * @return
     */
    public Integer getMetricsTimeDelay() {
        return metricsTimeDelay;
    }

    /**
     * set 数据上报延迟时间，单位s
     *
     * @param metricsTimeDelay
     */
    public void setMetricsTimeDelay(Integer metricsTimeDelay) {
        this.metricsTimeDelay = metricsTimeDelay;
    }

    /**
     * get 数据上报时间间隔，单位s
     *
     * @return
     */
    public Integer getTimeInterval() {
        return timeInterval;
    }

    /**
     * set 数据上报时间间隔，单位s
     *
     * @param timeInterval
     */
    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }

    /**
     * get 维护者erp
     *
     * @return
     */
    public String getOwner() {
        return owner;
    }

    /**
     * set 维护者erp
     *
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * get 是否禁用报警
     *
     * @return
     */
    public Integer getDisableAlarmGroup() {
        return disableAlarmGroup;
    }

    /**
     * set 是否禁用报警
     *
     * @param disableAlarmGroup
     */
    public void setDisableAlarmGroup(Integer disableAlarmGroup) {
        this.disableAlarmGroup = disableAlarmGroup;
    }

    /**
     * get 提交id
     *
     * @return
     */
    public String getCommitId() {
        return commitId;
    }

    /**
     * set 提交id
     *
     * @param commitId
     */
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * get 分组
     *
     * @return
     */
    public String getGroups() {
        return groups;
    }

    /**
     * set 分组
     *
     * @param groups
     */
    public void setGroups(String groups) {
        this.groups = groups;
    }

    /**
     * get 分组
     *
     * @return
     */
    public List<MetricGroup> getGroupList() {
        return groupList;
    }

    /**
     * set 分组
     *
     * @param groupList
     */
    public void setGroupList(List<MetricGroup> groupList) {
        this.groupList = groupList;
    }

    /**
     * get 排序字段
     *
     * @return
     */
    public String getColumn() {
        return column;
    }

    /**
     * set 排序字段
     *
     * @param column
     */
    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * get 排序方式
     *
     * @return
     */
    public String getDir() {
        return dir;
    }

    /**
     * set 排序方式
     *
     * @param dir
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * get 页码
     *
     * @return
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * set 页码
     *
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * get 查询条数
     *
     * @return
     */
    public Integer getSize() {
        return size;
    }

    /**
     * set 查询条数
     *
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }


    /**
     * set 自增id
     *
     * @param id
     */
    public ServiceLine id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 业务线代码
     *
     * @param serviceCode
     */
    public ServiceLine serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 业务线中文名
     *
     * @param serviceNameCH
     */
    public ServiceLine serviceNameCH(String serviceNameCH) {
        this.serviceNameCH = serviceNameCH;
        return this;
    }

    /**
     * set 业务线中文名
     *
     * @param serviceNameEN
     */
    public ServiceLine serviceNameEN(String serviceNameEN) {
        this.serviceNameEN = serviceNameEN;
        return this;
    }

    /**
     * set 数据上报延迟时间，单位s
     *
     * @param metricsTimeDelay
     */
    public ServiceLine metricsTimeDelay(Integer metricsTimeDelay) {
        this.metricsTimeDelay = metricsTimeDelay;
        return this;
    }

    /**
     * set 数据上报时间间隔，单位s
     *
     * @param timeInterval
     */
    public ServiceLine timeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * set 维护者erp
     *
     * @param owner
     */
    public ServiceLine owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * set 是否禁用报警
     *
     * @param disableAlarmGroup
     */
    public ServiceLine disableAlarmGroup(Integer disableAlarmGroup) {
        this.disableAlarmGroup = disableAlarmGroup;
        return this;
    }

    /**
     * set 提交id
     *
     * @param commitId
     */
    public ServiceLine commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * set 分组
     *
     * @param groups
     */
    public ServiceLine groups(String groups) {
        this.groups = groups;
        return this;
    }

    /**
     * set 分组
     *
     * @param groupList
     */
    public ServiceLine groupList(List<MetricGroup> groupList) {
        this.groupList = groupList;
        return this;
    }

    /**
     * set 排序字段
     *
     * @param column
     */
    public ServiceLine column(String column) {
        this.column = column;
        return this;
    }

    /**
     * set 排序方式
     *
     * @param dir
     */
    public ServiceLine dir(String dir) {
        this.dir = dir;
        return this;
    }

    /**
     * set 页码
     *
     * @param number
     */
    public ServiceLine number(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * set 查询条数
     *
     * @param size
     */
    public ServiceLine size(Integer size) {
        this.size = size;
        return this;
    }


    /**
     * add item to 分组
     *
     * @param groupList
     */
    public void addGroupList(MetricGroup groupList) {
        if (this.groupList == null) {
            this.groupList = new ArrayList<>();
        }
        this.groupList.add(groupList);
    }

}