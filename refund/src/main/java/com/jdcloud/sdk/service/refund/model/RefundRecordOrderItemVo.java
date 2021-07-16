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
 * refundRecordOrderItemVo
 */
public class RefundRecordOrderItemVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 退款单号
     */
    private String refundId;

    /**
     * 资源id
     */
    private String resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 子订单号
     */
    private String orderSubNumber;

    /**
     * 订单商品编号
     */
    private String orderItemNumber;

    /**
     * 总订单金额
     */
    private Number totalFee;

    /**
     * 订单优惠金额
     */
    private Number discountFee;

    /**
     * 实际订单金额
     */
    private Number actualFee;

    /**
     * 优惠券支付金额
     */
    private Number couponFee;

    /**
     * 余额支付金额
     */
    private Number balanceFee;

    /**
     * 现金支付金额
     */
    private Number cashFee;

    /**
     * 代金券退款金额
     */
    private Number couponRefundFee;

    /**
     * 余额退款金额
     */
    private Number balanceRefundFee;

    /**
     * 现金退款金额
     */
    private Number cashRefundFee;

    /**
     * 总退款金额
     */
    private Number refundFee;

    /**
     * 选中标记 0-未选中 1-选中
     */
    private Integer chooseFlag;

    /**
     * 订单类型 来源于order 1-新购，2-续费，3-配置变更
     */
    private Integer orderType;

    /**
     * 订单计费类型：来源于order 1-按配置，2-按用量，3-按包年/包月，4-一次性付费
     */
    private Integer chargeMode;

    /**
     * 台账业务编号
     */
    private Integer merchantId;

    /**
     * 现金退款渠道 1-企业网银，2-个人网银，3-微信支付，4-京东支付，5-线下汇款
     */
    private Integer cashRefundChannel;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * 产品类目
     */
    private String appCode;


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
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * get 订单号
     *
     * @return
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * set 订单号
     *
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * get 子订单号
     *
     * @return
     */
    public String getOrderSubNumber() {
        return orderSubNumber;
    }

    /**
     * set 子订单号
     *
     * @param orderSubNumber
     */
    public void setOrderSubNumber(String orderSubNumber) {
        this.orderSubNumber = orderSubNumber;
    }

    /**
     * get 订单商品编号
     *
     * @return
     */
    public String getOrderItemNumber() {
        return orderItemNumber;
    }

    /**
     * set 订单商品编号
     *
     * @param orderItemNumber
     */
    public void setOrderItemNumber(String orderItemNumber) {
        this.orderItemNumber = orderItemNumber;
    }

    /**
     * get 总订单金额
     *
     * @return
     */
    public Number getTotalFee() {
        return totalFee;
    }

    /**
     * set 总订单金额
     *
     * @param totalFee
     */
    public void setTotalFee(Number totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * get 订单优惠金额
     *
     * @return
     */
    public Number getDiscountFee() {
        return discountFee;
    }

    /**
     * set 订单优惠金额
     *
     * @param discountFee
     */
    public void setDiscountFee(Number discountFee) {
        this.discountFee = discountFee;
    }

    /**
     * get 实际订单金额
     *
     * @return
     */
    public Number getActualFee() {
        return actualFee;
    }

    /**
     * set 实际订单金额
     *
     * @param actualFee
     */
    public void setActualFee(Number actualFee) {
        this.actualFee = actualFee;
    }

    /**
     * get 优惠券支付金额
     *
     * @return
     */
    public Number getCouponFee() {
        return couponFee;
    }

    /**
     * set 优惠券支付金额
     *
     * @param couponFee
     */
    public void setCouponFee(Number couponFee) {
        this.couponFee = couponFee;
    }

    /**
     * get 余额支付金额
     *
     * @return
     */
    public Number getBalanceFee() {
        return balanceFee;
    }

    /**
     * set 余额支付金额
     *
     * @param balanceFee
     */
    public void setBalanceFee(Number balanceFee) {
        this.balanceFee = balanceFee;
    }

    /**
     * get 现金支付金额
     *
     * @return
     */
    public Number getCashFee() {
        return cashFee;
    }

    /**
     * set 现金支付金额
     *
     * @param cashFee
     */
    public void setCashFee(Number cashFee) {
        this.cashFee = cashFee;
    }

    /**
     * get 代金券退款金额
     *
     * @return
     */
    public Number getCouponRefundFee() {
        return couponRefundFee;
    }

    /**
     * set 代金券退款金额
     *
     * @param couponRefundFee
     */
    public void setCouponRefundFee(Number couponRefundFee) {
        this.couponRefundFee = couponRefundFee;
    }

    /**
     * get 余额退款金额
     *
     * @return
     */
    public Number getBalanceRefundFee() {
        return balanceRefundFee;
    }

    /**
     * set 余额退款金额
     *
     * @param balanceRefundFee
     */
    public void setBalanceRefundFee(Number balanceRefundFee) {
        this.balanceRefundFee = balanceRefundFee;
    }

    /**
     * get 现金退款金额
     *
     * @return
     */
    public Number getCashRefundFee() {
        return cashRefundFee;
    }

    /**
     * set 现金退款金额
     *
     * @param cashRefundFee
     */
    public void setCashRefundFee(Number cashRefundFee) {
        this.cashRefundFee = cashRefundFee;
    }

    /**
     * get 总退款金额
     *
     * @return
     */
    public Number getRefundFee() {
        return refundFee;
    }

    /**
     * set 总退款金额
     *
     * @param refundFee
     */
    public void setRefundFee(Number refundFee) {
        this.refundFee = refundFee;
    }

    /**
     * get 选中标记 0-未选中 1-选中
     *
     * @return
     */
    public Integer getChooseFlag() {
        return chooseFlag;
    }

    /**
     * set 选中标记 0-未选中 1-选中
     *
     * @param chooseFlag
     */
    public void setChooseFlag(Integer chooseFlag) {
        this.chooseFlag = chooseFlag;
    }

    /**
     * get 订单类型 来源于order 1-新购，2-续费，3-配置变更
     *
     * @return
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * set 订单类型 来源于order 1-新购，2-续费，3-配置变更
     *
     * @param orderType
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * get 订单计费类型：来源于order 1-按配置，2-按用量，3-按包年/包月，4-一次性付费
     *
     * @return
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    /**
     * set 订单计费类型：来源于order 1-按配置，2-按用量，3-按包年/包月，4-一次性付费
     *
     * @param chargeMode
     */
    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    /**
     * get 台账业务编号
     *
     * @return
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * set 台账业务编号
     *
     * @param merchantId
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * get 现金退款渠道 1-企业网银，2-个人网银，3-微信支付，4-京东支付，5-线下汇款
     *
     * @return
     */
    public Integer getCashRefundChannel() {
        return cashRefundChannel;
    }

    /**
     * set 现金退款渠道 1-企业网银，2-个人网银，3-微信支付，4-京东支付，5-线下汇款
     *
     * @param cashRefundChannel
     */
    public void setCashRefundChannel(Integer cashRefundChannel) {
        this.cashRefundChannel = cashRefundChannel;
    }

    /**
     * get 产品线
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 产品类目
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 产品类目
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }


    /**
     * set 退款单号
     *
     * @param refundId
     */
    public RefundRecordOrderItemVo refundId(String refundId) {
        this.refundId = refundId;
        return this;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public RefundRecordOrderItemVo resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public RefundRecordOrderItemVo resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * set 订单号
     *
     * @param orderNumber
     */
    public RefundRecordOrderItemVo orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * set 子订单号
     *
     * @param orderSubNumber
     */
    public RefundRecordOrderItemVo orderSubNumber(String orderSubNumber) {
        this.orderSubNumber = orderSubNumber;
        return this;
    }

    /**
     * set 订单商品编号
     *
     * @param orderItemNumber
     */
    public RefundRecordOrderItemVo orderItemNumber(String orderItemNumber) {
        this.orderItemNumber = orderItemNumber;
        return this;
    }

    /**
     * set 总订单金额
     *
     * @param totalFee
     */
    public RefundRecordOrderItemVo totalFee(Number totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    /**
     * set 订单优惠金额
     *
     * @param discountFee
     */
    public RefundRecordOrderItemVo discountFee(Number discountFee) {
        this.discountFee = discountFee;
        return this;
    }

    /**
     * set 实际订单金额
     *
     * @param actualFee
     */
    public RefundRecordOrderItemVo actualFee(Number actualFee) {
        this.actualFee = actualFee;
        return this;
    }

    /**
     * set 优惠券支付金额
     *
     * @param couponFee
     */
    public RefundRecordOrderItemVo couponFee(Number couponFee) {
        this.couponFee = couponFee;
        return this;
    }

    /**
     * set 余额支付金额
     *
     * @param balanceFee
     */
    public RefundRecordOrderItemVo balanceFee(Number balanceFee) {
        this.balanceFee = balanceFee;
        return this;
    }

    /**
     * set 现金支付金额
     *
     * @param cashFee
     */
    public RefundRecordOrderItemVo cashFee(Number cashFee) {
        this.cashFee = cashFee;
        return this;
    }

    /**
     * set 代金券退款金额
     *
     * @param couponRefundFee
     */
    public RefundRecordOrderItemVo couponRefundFee(Number couponRefundFee) {
        this.couponRefundFee = couponRefundFee;
        return this;
    }

    /**
     * set 余额退款金额
     *
     * @param balanceRefundFee
     */
    public RefundRecordOrderItemVo balanceRefundFee(Number balanceRefundFee) {
        this.balanceRefundFee = balanceRefundFee;
        return this;
    }

    /**
     * set 现金退款金额
     *
     * @param cashRefundFee
     */
    public RefundRecordOrderItemVo cashRefundFee(Number cashRefundFee) {
        this.cashRefundFee = cashRefundFee;
        return this;
    }

    /**
     * set 总退款金额
     *
     * @param refundFee
     */
    public RefundRecordOrderItemVo refundFee(Number refundFee) {
        this.refundFee = refundFee;
        return this;
    }

    /**
     * set 选中标记 0-未选中 1-选中
     *
     * @param chooseFlag
     */
    public RefundRecordOrderItemVo chooseFlag(Integer chooseFlag) {
        this.chooseFlag = chooseFlag;
        return this;
    }

    /**
     * set 订单类型 来源于order 1-新购，2-续费，3-配置变更
     *
     * @param orderType
     */
    public RefundRecordOrderItemVo orderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * set 订单计费类型：来源于order 1-按配置，2-按用量，3-按包年/包月，4-一次性付费
     *
     * @param chargeMode
     */
    public RefundRecordOrderItemVo chargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * set 台账业务编号
     *
     * @param merchantId
     */
    public RefundRecordOrderItemVo merchantId(Integer merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    /**
     * set 现金退款渠道 1-企业网银，2-个人网银，3-微信支付，4-京东支付，5-线下汇款
     *
     * @param cashRefundChannel
     */
    public RefundRecordOrderItemVo cashRefundChannel(Integer cashRefundChannel) {
        this.cashRefundChannel = cashRefundChannel;
        return this;
    }

    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public RefundRecordOrderItemVo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 产品类目
     *
     * @param appCode
     */
    public RefundRecordOrderItemVo appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


}