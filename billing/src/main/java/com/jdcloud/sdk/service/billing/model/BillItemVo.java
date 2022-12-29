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

package com.jdcloud.sdk.service.billing.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * billItemVo
 */
public class BillItemVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 计费项明细账单唯一标识，不可重复
     * Required:true
     */
    @Required
    private String itemSourceId;

    /**
     * 计费项Code
     * Required:true
     */
    @Required
    private String property;

    /**
     * 计费项名称
     * Required:true
     */
    @Required
    private String propertyName;

    /**
     * 实际用量
     * Required:true
     */
    @Required
    private Double actualUsage;

    /**
     * 抵扣用量
     */
    private Double deductUsage;

    /**
     * 计费用量， 计费用量 &#x3D; 实际用量 - 抵扣用量
     */
    private Double billingUsage;

    /**
     * 计费项原价，6位精度
     * Required:true
     */
    @Required
    private Double billFee;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 用量单位
     */
    private String usageUnit;

    /**
     * 折扣金额，6位精度
     */
    private Double discountFee;

    /**
     * 应付金额，2位精度
     * Required:true
     */
    @Required
    private Double actualFee;

    /**
     * 代金券支付金额，2位精度
     */
    private Double cashCouponFee;

    /**
     * 余额支付金额：2位精度
     */
    private Double balancePayFee;

    /**
     * 现金支付金额：2位精度
     */
    private Double cashPayFee;

    /**
     * 单价
     */
    private Double unitPrice;

    /**
     * 单价单位
     */
    private String priceUnit;

    /**
     * 计费项支付状态 0、未支付 1、己支付
     * Required:true
     */
    @Required
    private Integer payState;

    /**
     * 支付时间
     */
    private String payTime;

    /**
     * 属性类型
     */
    private String propertyType;

    /**
     * 属性单位
     */
    private String propertyUnit;

    /**
     * 属性量
     */
    private Double propertyQuantity;

    /**
     * 数量
     */
    private Double number;

    /**
     * 单位用量
     */
    private Double unitUsage;

    /**
     * 月累计用量
     */
    private Double monthTotalUsage;

    /**
     * 优惠信息
     */
    private String favorableInfo;



    /**
     * get 计费项明细账单唯一标识，不可重复
     *
     * @return
     */
    public String getItemSourceId() {
        return itemSourceId;
    }

    /**
     * set 计费项明细账单唯一标识，不可重复
     *
     * @param itemSourceId
     */
    public void setItemSourceId(String itemSourceId) {
        this.itemSourceId = itemSourceId;
    }


    /**
     * get 计费项Code
     *
     * @return
     */
    public String getProperty() {
        return property;
    }

    /**
     * set 计费项Code
     *
     * @param property
     */
    public void setProperty(String property) {
        this.property = property;
    }


    /**
     * get 计费项名称
     *
     * @return
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * set 计费项名称
     *
     * @param propertyName
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }


    /**
     * get 实际用量
     *
     * @return
     */
    public Double getActualUsage() {
        return actualUsage;
    }

    /**
     * set 实际用量
     *
     * @param actualUsage
     */
    public void setActualUsage(Double actualUsage) {
        this.actualUsage = actualUsage;
    }


    /**
     * get 抵扣用量
     *
     * @return
     */
    public Double getDeductUsage() {
        return deductUsage;
    }

    /**
     * set 抵扣用量
     *
     * @param deductUsage
     */
    public void setDeductUsage(Double deductUsage) {
        this.deductUsage = deductUsage;
    }


    /**
     * get 计费用量， 计费用量 &#x3D; 实际用量 - 抵扣用量
     *
     * @return
     */
    public Double getBillingUsage() {
        return billingUsage;
    }

    /**
     * set 计费用量， 计费用量 &#x3D; 实际用量 - 抵扣用量
     *
     * @param billingUsage
     */
    public void setBillingUsage(Double billingUsage) {
        this.billingUsage = billingUsage;
    }


    /**
     * get 计费项原价，6位精度
     *
     * @return
     */
    public Double getBillFee() {
        return billFee;
    }

    /**
     * set 计费项原价，6位精度
     *
     * @param billFee
     */
    public void setBillFee(Double billFee) {
        this.billFee = billFee;
    }


    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }


    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    /**
     * get 用量单位
     *
     * @return
     */
    public String getUsageUnit() {
        return usageUnit;
    }

    /**
     * set 用量单位
     *
     * @param usageUnit
     */
    public void setUsageUnit(String usageUnit) {
        this.usageUnit = usageUnit;
    }


    /**
     * get 折扣金额，6位精度
     *
     * @return
     */
    public Double getDiscountFee() {
        return discountFee;
    }

    /**
     * set 折扣金额，6位精度
     *
     * @param discountFee
     */
    public void setDiscountFee(Double discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * get 应付金额，2位精度
     *
     * @return
     */
    public Double getActualFee() {
        return actualFee;
    }

    /**
     * set 应付金额，2位精度
     *
     * @param actualFee
     */
    public void setActualFee(Double actualFee) {
        this.actualFee = actualFee;
    }


    /**
     * get 代金券支付金额，2位精度
     *
     * @return
     */
    public Double getCashCouponFee() {
        return cashCouponFee;
    }

    /**
     * set 代金券支付金额，2位精度
     *
     * @param cashCouponFee
     */
    public void setCashCouponFee(Double cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
    }


    /**
     * get 余额支付金额：2位精度
     *
     * @return
     */
    public Double getBalancePayFee() {
        return balancePayFee;
    }

    /**
     * set 余额支付金额：2位精度
     *
     * @param balancePayFee
     */
    public void setBalancePayFee(Double balancePayFee) {
        this.balancePayFee = balancePayFee;
    }


    /**
     * get 现金支付金额：2位精度
     *
     * @return
     */
    public Double getCashPayFee() {
        return cashPayFee;
    }

    /**
     * set 现金支付金额：2位精度
     *
     * @param cashPayFee
     */
    public void setCashPayFee(Double cashPayFee) {
        this.cashPayFee = cashPayFee;
    }


    /**
     * get 单价
     *
     * @return
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * set 单价
     *
     * @param unitPrice
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * get 单价单位
     *
     * @return
     */
    public String getPriceUnit() {
        return priceUnit;
    }

    /**
     * set 单价单位
     *
     * @param priceUnit
     */
    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }


    /**
     * get 计费项支付状态 0、未支付 1、己支付
     *
     * @return
     */
    public Integer getPayState() {
        return payState;
    }

    /**
     * set 计费项支付状态 0、未支付 1、己支付
     *
     * @param payState
     */
    public void setPayState(Integer payState) {
        this.payState = payState;
    }


    /**
     * get 支付时间
     *
     * @return
     */
    public String getPayTime() {
        return payTime;
    }

    /**
     * set 支付时间
     *
     * @param payTime
     */
    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }


    /**
     * get 属性类型
     *
     * @return
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * set 属性类型
     *
     * @param propertyType
     */
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }


    /**
     * get 属性单位
     *
     * @return
     */
    public String getPropertyUnit() {
        return propertyUnit;
    }

    /**
     * set 属性单位
     *
     * @param propertyUnit
     */
    public void setPropertyUnit(String propertyUnit) {
        this.propertyUnit = propertyUnit;
    }


    /**
     * get 属性量
     *
     * @return
     */
    public Double getPropertyQuantity() {
        return propertyQuantity;
    }

    /**
     * set 属性量
     *
     * @param propertyQuantity
     */
    public void setPropertyQuantity(Double propertyQuantity) {
        this.propertyQuantity = propertyQuantity;
    }


    /**
     * get 数量
     *
     * @return
     */
    public Double getNumber() {
        return number;
    }

    /**
     * set 数量
     *
     * @param number
     */
    public void setNumber(Double number) {
        this.number = number;
    }


    /**
     * get 单位用量
     *
     * @return
     */
    public Double getUnitUsage() {
        return unitUsage;
    }

    /**
     * set 单位用量
     *
     * @param unitUsage
     */
    public void setUnitUsage(Double unitUsage) {
        this.unitUsage = unitUsage;
    }


    /**
     * get 月累计用量
     *
     * @return
     */
    public Double getMonthTotalUsage() {
        return monthTotalUsage;
    }

    /**
     * set 月累计用量
     *
     * @param monthTotalUsage
     */
    public void setMonthTotalUsage(Double monthTotalUsage) {
        this.monthTotalUsage = monthTotalUsage;
    }


    /**
     * get 优惠信息
     *
     * @return
     */
    public String getFavorableInfo() {
        return favorableInfo;
    }

    /**
     * set 优惠信息
     *
     * @param favorableInfo
     */
    public void setFavorableInfo(String favorableInfo) {
        this.favorableInfo = favorableInfo;
    }



    /**
     * set 计费项明细账单唯一标识，不可重复
     *
     * @param itemSourceId
     */
    public BillItemVo itemSourceId(String itemSourceId) {
        this.itemSourceId = itemSourceId;
        return this;
    }


    /**
     * set 计费项Code
     *
     * @param property
     */
    public BillItemVo property(String property) {
        this.property = property;
        return this;
    }


    /**
     * set 计费项名称
     *
     * @param propertyName
     */
    public BillItemVo propertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }


    /**
     * set 实际用量
     *
     * @param actualUsage
     */
    public BillItemVo actualUsage(Double actualUsage) {
        this.actualUsage = actualUsage;
        return this;
    }


    /**
     * set 抵扣用量
     *
     * @param deductUsage
     */
    public BillItemVo deductUsage(Double deductUsage) {
        this.deductUsage = deductUsage;
        return this;
    }


    /**
     * set 计费用量， 计费用量 &#x3D; 实际用量 - 抵扣用量
     *
     * @param billingUsage
     */
    public BillItemVo billingUsage(Double billingUsage) {
        this.billingUsage = billingUsage;
        return this;
    }


    /**
     * set 计费项原价，6位精度
     *
     * @param billFee
     */
    public BillItemVo billFee(Double billFee) {
        this.billFee = billFee;
        return this;
    }


    /**
     * set 开始时间
     *
     * @param startTime
     */
    public BillItemVo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }


    /**
     * set 结束时间
     *
     * @param endTime
     */
    public BillItemVo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }


    /**
     * set 用量单位
     *
     * @param usageUnit
     */
    public BillItemVo usageUnit(String usageUnit) {
        this.usageUnit = usageUnit;
        return this;
    }


    /**
     * set 折扣金额，6位精度
     *
     * @param discountFee
     */
    public BillItemVo discountFee(Double discountFee) {
        this.discountFee = discountFee;
        return this;
    }


    /**
     * set 应付金额，2位精度
     *
     * @param actualFee
     */
    public BillItemVo actualFee(Double actualFee) {
        this.actualFee = actualFee;
        return this;
    }


    /**
     * set 代金券支付金额，2位精度
     *
     * @param cashCouponFee
     */
    public BillItemVo cashCouponFee(Double cashCouponFee) {
        this.cashCouponFee = cashCouponFee;
        return this;
    }


    /**
     * set 余额支付金额：2位精度
     *
     * @param balancePayFee
     */
    public BillItemVo balancePayFee(Double balancePayFee) {
        this.balancePayFee = balancePayFee;
        return this;
    }


    /**
     * set 现金支付金额：2位精度
     *
     * @param cashPayFee
     */
    public BillItemVo cashPayFee(Double cashPayFee) {
        this.cashPayFee = cashPayFee;
        return this;
    }


    /**
     * set 单价
     *
     * @param unitPrice
     */
    public BillItemVo unitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }


    /**
     * set 单价单位
     *
     * @param priceUnit
     */
    public BillItemVo priceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }


    /**
     * set 计费项支付状态 0、未支付 1、己支付
     *
     * @param payState
     */
    public BillItemVo payState(Integer payState) {
        this.payState = payState;
        return this;
    }


    /**
     * set 支付时间
     *
     * @param payTime
     */
    public BillItemVo payTime(String payTime) {
        this.payTime = payTime;
        return this;
    }


    /**
     * set 属性类型
     *
     * @param propertyType
     */
    public BillItemVo propertyType(String propertyType) {
        this.propertyType = propertyType;
        return this;
    }


    /**
     * set 属性单位
     *
     * @param propertyUnit
     */
    public BillItemVo propertyUnit(String propertyUnit) {
        this.propertyUnit = propertyUnit;
        return this;
    }


    /**
     * set 属性量
     *
     * @param propertyQuantity
     */
    public BillItemVo propertyQuantity(Double propertyQuantity) {
        this.propertyQuantity = propertyQuantity;
        return this;
    }


    /**
     * set 数量
     *
     * @param number
     */
    public BillItemVo number(Double number) {
        this.number = number;
        return this;
    }


    /**
     * set 单位用量
     *
     * @param unitUsage
     */
    public BillItemVo unitUsage(Double unitUsage) {
        this.unitUsage = unitUsage;
        return this;
    }


    /**
     * set 月累计用量
     *
     * @param monthTotalUsage
     */
    public BillItemVo monthTotalUsage(Double monthTotalUsage) {
        this.monthTotalUsage = monthTotalUsage;
        return this;
    }


    /**
     * set 优惠信息
     *
     * @param favorableInfo
     */
    public BillItemVo favorableInfo(String favorableInfo) {
        this.favorableInfo = favorableInfo;
        return this;
    }


}