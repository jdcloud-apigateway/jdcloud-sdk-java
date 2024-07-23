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
 * Partner Summary APIs
 * 计费费用/账单汇总相关服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.partner.model;


/**
 * 查询费用汇总明细结果
 */
public class BillSummaryDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品
     */
    private String serviceCode;

    /**
     * 产品名称
     */
    private String serviceCodeName;

    /**
     * 原价
     */
    private Number billFee;

    /**
     * 优惠金额
     */
    private Number discountFee;

    /**
     * 应付费用
     */
    private Number actualFee;

    /**
     * 现金支付金额
     */
    private Number cashPayFee;

    /**
     * 付费代金券
     */
    private Number payCouponFee;

    /**
     * 免费代金券
     */
    private Number freeCouponFee;

    /**
     * 消费占比
     */
    private String percent;

    /**
     * 欠费金额
     */
    private Number arrearFee;



    /**
     * get 产品
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }


    /**
     * get 产品名称
     *
     * @return
     */
    public String getServiceCodeName() {
        return serviceCodeName;
    }

    /**
     * set 产品名称
     *
     * @param serviceCodeName
     */
    public void setServiceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
    }


    /**
     * get 原价
     *
     * @return
     */
    public Number getBillFee() {
        return billFee;
    }

    /**
     * set 原价
     *
     * @param billFee
     */
    public void setBillFee(Number billFee) {
        this.billFee = billFee;
    }


    /**
     * get 优惠金额
     *
     * @return
     */
    public Number getDiscountFee() {
        return discountFee;
    }

    /**
     * set 优惠金额
     *
     * @param discountFee
     */
    public void setDiscountFee(Number discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * get 应付费用
     *
     * @return
     */
    public Number getActualFee() {
        return actualFee;
    }

    /**
     * set 应付费用
     *
     * @param actualFee
     */
    public void setActualFee(Number actualFee) {
        this.actualFee = actualFee;
    }


    /**
     * get 现金支付金额
     *
     * @return
     */
    public Number getCashPayFee() {
        return cashPayFee;
    }

    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public void setCashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
    }


    /**
     * get 付费代金券
     *
     * @return
     */
    public Number getPayCouponFee() {
        return payCouponFee;
    }

    /**
     * set 付费代金券
     *
     * @param payCouponFee
     */
    public void setPayCouponFee(Number payCouponFee) {
        this.payCouponFee = payCouponFee;
    }


    /**
     * get 免费代金券
     *
     * @return
     */
    public Number getFreeCouponFee() {
        return freeCouponFee;
    }

    /**
     * set 免费代金券
     *
     * @param freeCouponFee
     */
    public void setFreeCouponFee(Number freeCouponFee) {
        this.freeCouponFee = freeCouponFee;
    }


    /**
     * get 消费占比
     *
     * @return
     */
    public String getPercent() {
        return percent;
    }

    /**
     * set 消费占比
     *
     * @param percent
     */
    public void setPercent(String percent) {
        this.percent = percent;
    }


    /**
     * get 欠费金额
     *
     * @return
     */
    public Number getArrearFee() {
        return arrearFee;
    }

    /**
     * set 欠费金额
     *
     * @param arrearFee
     */
    public void setArrearFee(Number arrearFee) {
        this.arrearFee = arrearFee;
    }



    /**
     * set 产品
     *
     * @param serviceCode
     */
    public BillSummaryDetail serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 产品名称
     *
     * @param serviceCodeName
     */
    public BillSummaryDetail serviceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
        return this;
    }


    /**
     * set 原价
     *
     * @param billFee
     */
    public BillSummaryDetail billFee(Number billFee) {
        this.billFee = billFee;
        return this;
    }


    /**
     * set 优惠金额
     *
     * @param discountFee
     */
    public BillSummaryDetail discountFee(Number discountFee) {
        this.discountFee = discountFee;
        return this;
    }


    /**
     * set 应付费用
     *
     * @param actualFee
     */
    public BillSummaryDetail actualFee(Number actualFee) {
        this.actualFee = actualFee;
        return this;
    }


    /**
     * set 现金支付金额
     *
     * @param cashPayFee
     */
    public BillSummaryDetail cashPayFee(Number cashPayFee) {
        this.cashPayFee = cashPayFee;
        return this;
    }


    /**
     * set 付费代金券
     *
     * @param payCouponFee
     */
    public BillSummaryDetail payCouponFee(Number payCouponFee) {
        this.payCouponFee = payCouponFee;
        return this;
    }


    /**
     * set 免费代金券
     *
     * @param freeCouponFee
     */
    public BillSummaryDetail freeCouponFee(Number freeCouponFee) {
        this.freeCouponFee = freeCouponFee;
        return this;
    }


    /**
     * set 消费占比
     *
     * @param percent
     */
    public BillSummaryDetail percent(String percent) {
        this.percent = percent;
        return this;
    }


    /**
     * set 欠费金额
     *
     * @param arrearFee
     */
    public BillSummaryDetail arrearFee(Number arrearFee) {
        this.arrearFee = arrearFee;
        return this;
    }


}