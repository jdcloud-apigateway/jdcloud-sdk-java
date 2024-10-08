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

package com.jdcloud.sdk.service.invoice.model;


/**
 * taxInfo
 */
public class TaxInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 产品线
     */
    private String serviceCode;

    /**
     * 产品线名称
     */
    private String serviceName;

    /**
     * 税率(小数 如 0.06)
     */
    private Number taxRa;

    /**
     * 税号
     */
    private String taxCode;

    /**
     * 开票内容
     */
    private String content;

    /**
     * 收费主体
     */
    private String chargeSubject;



    /**
     * get 主键
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 主键
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * get 产品线名称
     *
     * @return
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * set 产品线名称
     *
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * get 税率(小数 如 0.06)
     *
     * @return
     */
    public Number getTaxRa() {
        return taxRa;
    }

    /**
     * set 税率(小数 如 0.06)
     *
     * @param taxRa
     */
    public void setTaxRa(Number taxRa) {
        this.taxRa = taxRa;
    }


    /**
     * get 税号
     *
     * @return
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * set 税号
     *
     * @param taxCode
     */
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * get 开票内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 开票内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * get 收费主体
     *
     * @return
     */
    public String getChargeSubject() {
        return chargeSubject;
    }

    /**
     * set 收费主体
     *
     * @param chargeSubject
     */
    public void setChargeSubject(String chargeSubject) {
        this.chargeSubject = chargeSubject;
    }



    /**
     * set 主键
     *
     * @param id
     */
    public TaxInfo id(Integer id) {
        this.id = id;
        return this;
    }


    /**
     * set 产品线
     *
     * @param serviceCode
     */
    public TaxInfo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }


    /**
     * set 产品线名称
     *
     * @param serviceName
     */
    public TaxInfo serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }


    /**
     * set 税率(小数 如 0.06)
     *
     * @param taxRa
     */
    public TaxInfo taxRa(Number taxRa) {
        this.taxRa = taxRa;
        return this;
    }


    /**
     * set 税号
     *
     * @param taxCode
     */
    public TaxInfo taxCode(String taxCode) {
        this.taxCode = taxCode;
        return this;
    }


    /**
     * set 开票内容
     *
     * @param content
     */
    public TaxInfo content(String content) {
        this.content = content;
        return this;
    }


    /**
     * set 收费主体
     *
     * @param chargeSubject
     */
    public TaxInfo chargeSubject(String chargeSubject) {
        this.chargeSubject = chargeSubject;
        return this;
    }


}