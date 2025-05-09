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
 * 实名认证-服务管理接口
 * 实名认证-服务管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cloudauth.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 银行卡OCR
 */
public class BankCardOCRResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 识别状态
     */
    private String status;

    /**
     * 状态码
     */
    private String code;

    /**
     * 卡号
     */
    private String number;

    /**
     * 银行卡类型
     */
    private String cardType;

    /**
     * 银行卡名称
     */
    private String name;

    /**
     * 银行名称
     */
    private String bank;

    /**
     * 有效日期
     */
    private String date;

    /**
     * 1收费，0不收费
     */
    private String chargeFlag;



    /**
     * get 识别状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 识别状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 状态码
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     * set 状态码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }


    /**
     * get 卡号
     *
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     * set 卡号
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }


    /**
     * get 银行卡类型
     *
     * @return
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * set 银行卡类型
     *
     * @param cardType
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }


    /**
     * get 银行卡名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 银行卡名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 银行名称
     *
     * @return
     */
    public String getBank() {
        return bank;
    }

    /**
     * set 银行名称
     *
     * @param bank
     */
    public void setBank(String bank) {
        this.bank = bank;
    }


    /**
     * get 有效日期
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * set 有效日期
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }


    /**
     * get 1收费，0不收费
     *
     * @return
     */
    public String getChargeFlag() {
        return chargeFlag;
    }

    /**
     * set 1收费，0不收费
     *
     * @param chargeFlag
     */
    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
    }



    /**
     * set 识别状态
     *
     * @param status
     */
    public BankCardOCRResult status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 状态码
     *
     * @param code
     */
    public BankCardOCRResult code(String code) {
        this.code = code;
        return this;
    }


    /**
     * set 卡号
     *
     * @param number
     */
    public BankCardOCRResult number(String number) {
        this.number = number;
        return this;
    }


    /**
     * set 银行卡类型
     *
     * @param cardType
     */
    public BankCardOCRResult cardType(String cardType) {
        this.cardType = cardType;
        return this;
    }


    /**
     * set 银行卡名称
     *
     * @param name
     */
    public BankCardOCRResult name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 银行名称
     *
     * @param bank
     */
    public BankCardOCRResult bank(String bank) {
        this.bank = bank;
        return this;
    }


    /**
     * set 有效日期
     *
     * @param date
     */
    public BankCardOCRResult date(String date) {
        this.date = date;
        return this;
    }


    /**
     * set 1收费，0不收费
     *
     * @param chargeFlag
     */
    public BankCardOCRResult chargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
        return this;
    }


}