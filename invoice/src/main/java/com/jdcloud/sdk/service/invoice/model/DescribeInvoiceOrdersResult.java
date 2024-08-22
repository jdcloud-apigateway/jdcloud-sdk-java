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
 * JDCLOUD Invoice API
 * 京东云发票
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.invoice.model;

import com.jdcloud.sdk.service.invoice.model.InvoiceOrderItem;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 开票单据列表
 */
public class DescribeInvoiceOrdersResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 可开票金额
     */
    private Number enableInvoiceFee;

    /**
     * 可开票总金额
     */
    private Number enableAllInvoiceFee;

    /**
     * 发票金额
     */
    private Number oweInvoiceFee;

    /**
     * 是否设置过有效的发票信息
     */
    private Boolean isSetInvoiceMSGTemplate;

    /**
     * invoiceOrderList
     */
    private InvoiceOrderItem invoiceOrderList;



    /**
     * get 可开票金额
     *
     * @return
     */
    public Number getEnableInvoiceFee() {
        return enableInvoiceFee;
    }

    /**
     * set 可开票金额
     *
     * @param enableInvoiceFee
     */
    public void setEnableInvoiceFee(Number enableInvoiceFee) {
        this.enableInvoiceFee = enableInvoiceFee;
    }


    /**
     * get 可开票总金额
     *
     * @return
     */
    public Number getEnableAllInvoiceFee() {
        return enableAllInvoiceFee;
    }

    /**
     * set 可开票总金额
     *
     * @param enableAllInvoiceFee
     */
    public void setEnableAllInvoiceFee(Number enableAllInvoiceFee) {
        this.enableAllInvoiceFee = enableAllInvoiceFee;
    }


    /**
     * get 发票金额
     *
     * @return
     */
    public Number getOweInvoiceFee() {
        return oweInvoiceFee;
    }

    /**
     * set 发票金额
     *
     * @param oweInvoiceFee
     */
    public void setOweInvoiceFee(Number oweInvoiceFee) {
        this.oweInvoiceFee = oweInvoiceFee;
    }


    /**
     * get 是否设置过有效的发票信息
     *
     * @return
     */
    public Boolean getIsSetInvoiceMSGTemplate() {
        return isSetInvoiceMSGTemplate;
    }

    /**
     * set 是否设置过有效的发票信息
     *
     * @param isSetInvoiceMSGTemplate
     */
    public void setIsSetInvoiceMSGTemplate(Boolean isSetInvoiceMSGTemplate) {
        this.isSetInvoiceMSGTemplate = isSetInvoiceMSGTemplate;
    }


    /**
     * get invoiceOrderList
     *
     * @return
     */
    public InvoiceOrderItem getInvoiceOrderList() {
        return invoiceOrderList;
    }

    /**
     * set invoiceOrderList
     *
     * @param invoiceOrderList
     */
    public void setInvoiceOrderList(InvoiceOrderItem invoiceOrderList) {
        this.invoiceOrderList = invoiceOrderList;
    }



    /**
     * set 可开票金额
     *
     * @param enableInvoiceFee
     */
    public DescribeInvoiceOrdersResult enableInvoiceFee(Number enableInvoiceFee) {
        this.enableInvoiceFee = enableInvoiceFee;
        return this;
    }


    /**
     * set 可开票总金额
     *
     * @param enableAllInvoiceFee
     */
    public DescribeInvoiceOrdersResult enableAllInvoiceFee(Number enableAllInvoiceFee) {
        this.enableAllInvoiceFee = enableAllInvoiceFee;
        return this;
    }


    /**
     * set 发票金额
     *
     * @param oweInvoiceFee
     */
    public DescribeInvoiceOrdersResult oweInvoiceFee(Number oweInvoiceFee) {
        this.oweInvoiceFee = oweInvoiceFee;
        return this;
    }


    /**
     * set 是否设置过有效的发票信息
     *
     * @param isSetInvoiceMSGTemplate
     */
    public DescribeInvoiceOrdersResult isSetInvoiceMSGTemplate(Boolean isSetInvoiceMSGTemplate) {
        this.isSetInvoiceMSGTemplate = isSetInvoiceMSGTemplate;
        return this;
    }


    /**
     * set invoiceOrderList
     *
     * @param invoiceOrderList
     */
    public DescribeInvoiceOrdersResult invoiceOrderList(InvoiceOrderItem invoiceOrderList) {
        this.invoiceOrderList = invoiceOrderList;
        return this;
    }


}