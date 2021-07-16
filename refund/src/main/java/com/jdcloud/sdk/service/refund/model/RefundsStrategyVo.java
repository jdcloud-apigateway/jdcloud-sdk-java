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

package com.jdcloud.sdk.service.refund.model;


/**
 * refundsStrategyVo
 */
public class RefundsStrategyVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 退款策略主键id
     */
    private Integer strategyId;

    /**
     * 策略来源类型 0-运营后台退款策略  1-控制台退款策略 2-openapi退款策略 3-外部服务上云退款策略 4-产品线退款 5-出货失败退款策略
     */
    private Integer strategyType;

    /**
     * 退款方式策略 1 原支付方式返回  2 退款至余额
     */
    private Integer refundChannelSwitch;

    /**
     * 退款类型策略 0-退款退货 1-退款不退货
     */
    private Integer refundWaySwitch;

    /**
     * 退款范围策略  0-仅退现金  1-全部退款（含代金券）
     */
    private Integer refundAreaSwitch;

    /**
     * 发票允许的状态   0-未开票 1-已退票  2-欠票补扣
     */
    private Integer invoiceStatusSwitch;

    /**
     * 审批策略 0-关闭 1-开启
     */
    private Integer approveSwitch;

    /**
     * 退款订单默认策略   0-退全部可退订单  1-退最后一笔订单 2-仅退新购订单 3-仅退续费订单
     */
    private Integer refundOrderSwitch;

    /**
     * 业务产品线(如vm)
     */
    private String serviceCode;

    /**
     * 优先级 0-兜底策略  1-策略类型策略 2-service_code策略
     */
    private Integer priority;

    /**
     * 状态  0-无效 1-生效
     */
    private Integer status;

    /**
     * 退款类型 1-订单退款 2-充值单退款 3-线下退款（人工退款）
     */
    private Integer refundType;


    /**
     * get 退款策略主键id
     *
     * @return
     */
    public Integer getStrategyId() {
        return strategyId;
    }

    /**
     * set 退款策略主键id
     *
     * @param strategyId
     */
    public void setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
    }

    /**
     * get 策略来源类型 0-运营后台退款策略  1-控制台退款策略 2-openapi退款策略 3-外部服务上云退款策略 4-产品线退款 5-出货失败退款策略
     *
     * @return
     */
    public Integer getStrategyType() {
        return strategyType;
    }

    /**
     * set 策略来源类型 0-运营后台退款策略  1-控制台退款策略 2-openapi退款策略 3-外部服务上云退款策略 4-产品线退款 5-出货失败退款策略
     *
     * @param strategyType
     */
    public void setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
    }

    /**
     * get 退款方式策略 1 原支付方式返回  2 退款至余额
     *
     * @return
     */
    public Integer getRefundChannelSwitch() {
        return refundChannelSwitch;
    }

    /**
     * set 退款方式策略 1 原支付方式返回  2 退款至余额
     *
     * @param refundChannelSwitch
     */
    public void setRefundChannelSwitch(Integer refundChannelSwitch) {
        this.refundChannelSwitch = refundChannelSwitch;
    }

    /**
     * get 退款类型策略 0-退款退货 1-退款不退货
     *
     * @return
     */
    public Integer getRefundWaySwitch() {
        return refundWaySwitch;
    }

    /**
     * set 退款类型策略 0-退款退货 1-退款不退货
     *
     * @param refundWaySwitch
     */
    public void setRefundWaySwitch(Integer refundWaySwitch) {
        this.refundWaySwitch = refundWaySwitch;
    }

    /**
     * get 退款范围策略  0-仅退现金  1-全部退款（含代金券）
     *
     * @return
     */
    public Integer getRefundAreaSwitch() {
        return refundAreaSwitch;
    }

    /**
     * set 退款范围策略  0-仅退现金  1-全部退款（含代金券）
     *
     * @param refundAreaSwitch
     */
    public void setRefundAreaSwitch(Integer refundAreaSwitch) {
        this.refundAreaSwitch = refundAreaSwitch;
    }

    /**
     * get 发票允许的状态   0-未开票 1-已退票  2-欠票补扣
     *
     * @return
     */
    public Integer getInvoiceStatusSwitch() {
        return invoiceStatusSwitch;
    }

    /**
     * set 发票允许的状态   0-未开票 1-已退票  2-欠票补扣
     *
     * @param invoiceStatusSwitch
     */
    public void setInvoiceStatusSwitch(Integer invoiceStatusSwitch) {
        this.invoiceStatusSwitch = invoiceStatusSwitch;
    }

    /**
     * get 审批策略 0-关闭 1-开启
     *
     * @return
     */
    public Integer getApproveSwitch() {
        return approveSwitch;
    }

    /**
     * set 审批策略 0-关闭 1-开启
     *
     * @param approveSwitch
     */
    public void setApproveSwitch(Integer approveSwitch) {
        this.approveSwitch = approveSwitch;
    }

    /**
     * get 退款订单默认策略   0-退全部可退订单  1-退最后一笔订单 2-仅退新购订单 3-仅退续费订单
     *
     * @return
     */
    public Integer getRefundOrderSwitch() {
        return refundOrderSwitch;
    }

    /**
     * set 退款订单默认策略   0-退全部可退订单  1-退最后一笔订单 2-仅退新购订单 3-仅退续费订单
     *
     * @param refundOrderSwitch
     */
    public void setRefundOrderSwitch(Integer refundOrderSwitch) {
        this.refundOrderSwitch = refundOrderSwitch;
    }

    /**
     * get 业务产品线(如vm)
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 业务产品线(如vm)
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 优先级 0-兜底策略  1-策略类型策略 2-service_code策略
     *
     * @return
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * set 优先级 0-兜底策略  1-策略类型策略 2-service_code策略
     *
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * get 状态  0-无效 1-生效
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 状态  0-无效 1-生效
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 退款类型 1-订单退款 2-充值单退款 3-线下退款（人工退款）
     *
     * @return
     */
    public Integer getRefundType() {
        return refundType;
    }

    /**
     * set 退款类型 1-订单退款 2-充值单退款 3-线下退款（人工退款）
     *
     * @param refundType
     */
    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }


    /**
     * set 退款策略主键id
     *
     * @param strategyId
     */
    public RefundsStrategyVo strategyId(Integer strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    /**
     * set 策略来源类型 0-运营后台退款策略  1-控制台退款策略 2-openapi退款策略 3-外部服务上云退款策略 4-产品线退款 5-出货失败退款策略
     *
     * @param strategyType
     */
    public RefundsStrategyVo strategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }

    /**
     * set 退款方式策略 1 原支付方式返回  2 退款至余额
     *
     * @param refundChannelSwitch
     */
    public RefundsStrategyVo refundChannelSwitch(Integer refundChannelSwitch) {
        this.refundChannelSwitch = refundChannelSwitch;
        return this;
    }

    /**
     * set 退款类型策略 0-退款退货 1-退款不退货
     *
     * @param refundWaySwitch
     */
    public RefundsStrategyVo refundWaySwitch(Integer refundWaySwitch) {
        this.refundWaySwitch = refundWaySwitch;
        return this;
    }

    /**
     * set 退款范围策略  0-仅退现金  1-全部退款（含代金券）
     *
     * @param refundAreaSwitch
     */
    public RefundsStrategyVo refundAreaSwitch(Integer refundAreaSwitch) {
        this.refundAreaSwitch = refundAreaSwitch;
        return this;
    }

    /**
     * set 发票允许的状态   0-未开票 1-已退票  2-欠票补扣
     *
     * @param invoiceStatusSwitch
     */
    public RefundsStrategyVo invoiceStatusSwitch(Integer invoiceStatusSwitch) {
        this.invoiceStatusSwitch = invoiceStatusSwitch;
        return this;
    }

    /**
     * set 审批策略 0-关闭 1-开启
     *
     * @param approveSwitch
     */
    public RefundsStrategyVo approveSwitch(Integer approveSwitch) {
        this.approveSwitch = approveSwitch;
        return this;
    }

    /**
     * set 退款订单默认策略   0-退全部可退订单  1-退最后一笔订单 2-仅退新购订单 3-仅退续费订单
     *
     * @param refundOrderSwitch
     */
    public RefundsStrategyVo refundOrderSwitch(Integer refundOrderSwitch) {
        this.refundOrderSwitch = refundOrderSwitch;
        return this;
    }

    /**
     * set 业务产品线(如vm)
     *
     * @param serviceCode
     */
    public RefundsStrategyVo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 优先级 0-兜底策略  1-策略类型策略 2-service_code策略
     *
     * @param priority
     */
    public RefundsStrategyVo priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * set 状态  0-无效 1-生效
     *
     * @param status
     */
    public RefundsStrategyVo status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 退款类型 1-订单退款 2-充值单退款 3-线下退款（人工退款）
     *
     * @param refundType
     */
    public RefundsStrategyVo refundType(Integer refundType) {
        this.refundType = refundType;
        return this;
    }


}