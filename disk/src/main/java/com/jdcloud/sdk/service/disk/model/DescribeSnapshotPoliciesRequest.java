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
 * 快照策略相关接口
 * 云硬盘相关接口，快照策略的创建，更新，删除，查询，绑定/解绑磁盘等接口。
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.disk.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.disk.model.OrderItem;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询快照策略
 */
public class DescribeSnapshotPoliciesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略名称
     */
    private String name;

    /**
     * 策略ID
     */
    private List<String> policyId;

    /**
     * 策略状态。1: 启用 2：禁用
     */
    private List<Integer> status;

    /**
     * 排序字段，只支持create_time和update_time字段
     */
    private OrderItem order;

    /**
     * 页码, 默认为1, 取值范围：[1,∞)
     */
    private Integer pageNumber;

    /**
     * 分页大小，默认为20，取值范围：[10,100]
     */
    private Integer pageSize;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;


    /**
     * get 策略名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 策略名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 策略ID
     *
     * @return
     */
    public List<String> getPolicyId() {
        return policyId;
    }

    /**
     * set 策略ID
     *
     * @param policyId
     */
    public void setPolicyId(List<String> policyId) {
        this.policyId = policyId;
    }

    /**
     * get 策略状态。1: 启用 2：禁用
     *
     * @return
     */
    public List<Integer> getStatus() {
        return status;
    }

    /**
     * set 策略状态。1: 启用 2：禁用
     *
     * @param status
     */
    public void setStatus(List<Integer> status) {
        this.status = status;
    }

    /**
     * get 排序字段，只支持create_time和update_time字段
     *
     * @return
     */
    public OrderItem getOrder() {
        return order;
    }

    /**
     * set 排序字段，只支持create_time和update_time字段
     *
     * @param order
     */
    public void setOrder(OrderItem order) {
        this.order = order;
    }

    /**
     * get 页码, 默认为1, 取值范围：[1,∞)
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 分页大小，默认为20，取值范围：[10,100]
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * set 策略名称
     *
     * @param name
     */
    public DescribeSnapshotPoliciesRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 策略ID
     *
     * @param policyId
     */
    public DescribeSnapshotPoliciesRequest policyId(List<String> policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * set 策略状态。1: 启用 2：禁用
     *
     * @param status
     */
    public DescribeSnapshotPoliciesRequest status(List<Integer> status) {
        this.status = status;
        return this;
    }

    /**
     * set 排序字段，只支持create_time和update_time字段
     *
     * @param order
     */
    public DescribeSnapshotPoliciesRequest order(OrderItem order) {
        this.order = order;
        return this;
    }

    /**
     * set 页码, 默认为1, 取值范围：[1,∞)
     *
     * @param pageNumber
     */
    public DescribeSnapshotPoliciesRequest pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 分页大小，默认为20，取值范围：[10,100]
     *
     * @param pageSize
     */
    public DescribeSnapshotPoliciesRequest pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribeSnapshotPoliciesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * add item to 策略ID
     *
     * @param policyId
     */
    public void addPolicyId(String policyId) {
        if (this.policyId == null) {
            this.policyId = new ArrayList<>();
        }
        this.policyId.add(policyId);
    }

    /**
     * add item to 策略状态。1: 启用 2：禁用
     *
     * @param statu
     */
    public void addStatu(Integer statu) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statu);
    }

}