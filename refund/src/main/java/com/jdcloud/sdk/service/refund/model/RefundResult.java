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
 * 退款
 * 退款服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.refund.model;

import java.util.Date;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * refundResult
 */
public class RefundResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 退款单号
     */
    private String refundId;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 退款单
     */
    private String recordNumberList;

    /**
     * 退款金额
     */
    private String refundAmount;

    /**
     * 退款状态
     */
    private String status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;


    /**
     * get id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 退款单号
     *
     * @return
     */
    public String getRefundId() {
        return refundId;
    }

    /**
     * set 退款单号
     *
     * @param refundId
     */
    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 退款单
     *
     * @return
     */
    public String getRecordNumberList() {
        return recordNumberList;
    }

    /**
     * set 退款单
     *
     * @param recordNumberList
     */
    public void setRecordNumberList(String recordNumberList) {
        this.recordNumberList = recordNumberList;
    }

    /**
     * get 退款金额
     *
     * @return
     */
    public String getRefundAmount() {
        return refundAmount;
    }

    /**
     * set 退款金额
     *
     * @param refundAmount
     */
    public void setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * get 退款状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 退款状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
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
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set id
     *
     * @param id
     */
    public RefundResult id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public RefundResult pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 退款单号
     *
     * @param refundId
     */
    public RefundResult refundId(String refundId) {
        this.refundId = refundId;
        return this;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public RefundResult resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 退款单
     *
     * @param recordNumberList
     */
    public RefundResult recordNumberList(String recordNumberList) {
        this.recordNumberList = recordNumberList;
        return this;
    }

    /**
     * set 退款金额
     *
     * @param refundAmount
     */
    public RefundResult refundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }

    /**
     * set 退款状态
     *
     * @param status
     */
    public RefundResult status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public RefundResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public RefundResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}