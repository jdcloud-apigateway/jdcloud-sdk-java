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


/**
 * accountingRuleVo
 */
public class AccountingRuleVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Number id;

    /**
     * 站点
     */
    private Integer site;

    /**
     * 产品线
     */
    private String appCode;

    /**
     * 出账对象类型    1：通用   2：用户
     */
    private Integer targetType;

    /**
     * 产品
     */
    private String serviceCode;

    /**
     * pin
     */
    private String pin;

    /**
     * 出账类型  1：实时出账    2：定期出账
     */
    private Integer outAccountType;

    /**
     * 出账周期：限制范围 1-28
     */
    private Integer outAccountDay;

    /**
     * 定期出账  时间表达式
     */
    private String timeCron;

    /**
     * 出账对象类型名称
     */
    private String targetTypeName;

    /**
     * 产品线名称
     */
    private String appCodeName;

    /**
     * 产品名称
     */
    private String serviceCodeName;

    /**
     * 出账类型名称
     */
    private String outAccountTypeName;



    /**
     * get id
     *
     * @return
     */
    public Number getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Number id) {
        this.id = id;
    }


    /**
     * get 站点
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 站点
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }


    /**
     * get 产品线
     *
     * @return
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * set 产品线
     *
     * @param appCode
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }


    /**
     * get 出账对象类型    1：通用   2：用户
     *
     * @return
     */
    public Integer getTargetType() {
        return targetType;
    }

    /**
     * set 出账对象类型    1：通用   2：用户
     *
     * @param targetType
     */
    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }


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
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 出账类型  1：实时出账    2：定期出账
     *
     * @return
     */
    public Integer getOutAccountType() {
        return outAccountType;
    }

    /**
     * set 出账类型  1：实时出账    2：定期出账
     *
     * @param outAccountType
     */
    public void setOutAccountType(Integer outAccountType) {
        this.outAccountType = outAccountType;
    }


    /**
     * get 出账周期：限制范围 1-28
     *
     * @return
     */
    public Integer getOutAccountDay() {
        return outAccountDay;
    }

    /**
     * set 出账周期：限制范围 1-28
     *
     * @param outAccountDay
     */
    public void setOutAccountDay(Integer outAccountDay) {
        this.outAccountDay = outAccountDay;
    }


    /**
     * get 定期出账  时间表达式
     *
     * @return
     */
    public String getTimeCron() {
        return timeCron;
    }

    /**
     * set 定期出账  时间表达式
     *
     * @param timeCron
     */
    public void setTimeCron(String timeCron) {
        this.timeCron = timeCron;
    }


    /**
     * get 出账对象类型名称
     *
     * @return
     */
    public String getTargetTypeName() {
        return targetTypeName;
    }

    /**
     * set 出账对象类型名称
     *
     * @param targetTypeName
     */
    public void setTargetTypeName(String targetTypeName) {
        this.targetTypeName = targetTypeName;
    }


    /**
     * get 产品线名称
     *
     * @return
     */
    public String getAppCodeName() {
        return appCodeName;
    }

    /**
     * set 产品线名称
     *
     * @param appCodeName
     */
    public void setAppCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
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
     * get 出账类型名称
     *
     * @return
     */
    public String getOutAccountTypeName() {
        return outAccountTypeName;
    }

    /**
     * set 出账类型名称
     *
     * @param outAccountTypeName
     */
    public void setOutAccountTypeName(String outAccountTypeName) {
        this.outAccountTypeName = outAccountTypeName;
    }



    /**
     * set id
     *
     * @param id
     */
    public AccountingRuleVo id(Number id) {
        this.id = id;
        return this;
    }


    /**
     * set 站点
     *
     * @param site
     */
    public AccountingRuleVo site(Integer site) {
        this.site = site;
        return this;
    }


    /**
     * set 产品线
     *
     * @param appCode
     */
    public AccountingRuleVo appCode(String appCode) {
        this.appCode = appCode;
        return this;
    }


    /**
     * set 出账对象类型    1：通用   2：用户
     *
     * @param targetType
     */
    public AccountingRuleVo targetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }


    /**
     * set 产品
     *
     * @param serviceCode
     */
    public AccountingRuleVo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public AccountingRuleVo pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 出账类型  1：实时出账    2：定期出账
     *
     * @param outAccountType
     */
    public AccountingRuleVo outAccountType(Integer outAccountType) {
        this.outAccountType = outAccountType;
        return this;
    }


    /**
     * set 出账周期：限制范围 1-28
     *
     * @param outAccountDay
     */
    public AccountingRuleVo outAccountDay(Integer outAccountDay) {
        this.outAccountDay = outAccountDay;
        return this;
    }


    /**
     * set 定期出账  时间表达式
     *
     * @param timeCron
     */
    public AccountingRuleVo timeCron(String timeCron) {
        this.timeCron = timeCron;
        return this;
    }


    /**
     * set 出账对象类型名称
     *
     * @param targetTypeName
     */
    public AccountingRuleVo targetTypeName(String targetTypeName) {
        this.targetTypeName = targetTypeName;
        return this;
    }


    /**
     * set 产品线名称
     *
     * @param appCodeName
     */
    public AccountingRuleVo appCodeName(String appCodeName) {
        this.appCodeName = appCodeName;
        return this;
    }


    /**
     * set 产品名称
     *
     * @param serviceCodeName
     */
    public AccountingRuleVo serviceCodeName(String serviceCodeName) {
        this.serviceCodeName = serviceCodeName;
        return this;
    }


    /**
     * set 出账类型名称
     *
     * @param outAccountTypeName
     */
    public AccountingRuleVo outAccountTypeName(String outAccountTypeName) {
        this.outAccountTypeName = outAccountTypeName;
        return this;
    }


}