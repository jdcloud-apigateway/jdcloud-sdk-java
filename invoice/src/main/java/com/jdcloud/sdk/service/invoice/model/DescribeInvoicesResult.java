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

import com.jdcloud.sdk.service.invoice.model.InvoiceList;
import com.jdcloud.sdk.service.invoice.model.Invoices;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 发票列表
 */
public class DescribeInvoicesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 可开票金额
     */
    private Number enableInvoiceFee;

    /**
     * 发票金额
     */
    private Number invoicedFee;

    /**
     * 是否设置过有效的发票信息
     */
    private Boolean isSetInvoiceMSGTemplate;

    /**
     * invoiceList
     */
    private InvoiceList invoiceList;

    /**
     * 是否可开票
     */
    private Boolean isApplyInvoice;

    /**
     * invoiceSearch
     */
    private Invoices invoiceSearch;



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
     * get 发票金额
     *
     * @return
     */
    public Number getInvoicedFee() {
        return invoicedFee;
    }

    /**
     * set 发票金额
     *
     * @param invoicedFee
     */
    public void setInvoicedFee(Number invoicedFee) {
        this.invoicedFee = invoicedFee;
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
     * get invoiceList
     *
     * @return
     */
    public InvoiceList getInvoiceList() {
        return invoiceList;
    }

    /**
     * set invoiceList
     *
     * @param invoiceList
     */
    public void setInvoiceList(InvoiceList invoiceList) {
        this.invoiceList = invoiceList;
    }


    /**
     * get 是否可开票
     *
     * @return
     */
    public Boolean getIsApplyInvoice() {
        return isApplyInvoice;
    }

    /**
     * set 是否可开票
     *
     * @param isApplyInvoice
     */
    public void setIsApplyInvoice(Boolean isApplyInvoice) {
        this.isApplyInvoice = isApplyInvoice;
    }


    /**
     * get invoiceSearch
     *
     * @return
     */
    public Invoices getInvoiceSearch() {
        return invoiceSearch;
    }

    /**
     * set invoiceSearch
     *
     * @param invoiceSearch
     */
    public void setInvoiceSearch(Invoices invoiceSearch) {
        this.invoiceSearch = invoiceSearch;
    }



    /**
     * set 可开票金额
     *
     * @param enableInvoiceFee
     */
    public DescribeInvoicesResult enableInvoiceFee(Number enableInvoiceFee) {
        this.enableInvoiceFee = enableInvoiceFee;
        return this;
    }


    /**
     * set 发票金额
     *
     * @param invoicedFee
     */
    public DescribeInvoicesResult invoicedFee(Number invoicedFee) {
        this.invoicedFee = invoicedFee;
        return this;
    }


    /**
     * set 是否设置过有效的发票信息
     *
     * @param isSetInvoiceMSGTemplate
     */
    public DescribeInvoicesResult isSetInvoiceMSGTemplate(Boolean isSetInvoiceMSGTemplate) {
        this.isSetInvoiceMSGTemplate = isSetInvoiceMSGTemplate;
        return this;
    }


    /**
     * set invoiceList
     *
     * @param invoiceList
     */
    public DescribeInvoicesResult invoiceList(InvoiceList invoiceList) {
        this.invoiceList = invoiceList;
        return this;
    }


    /**
     * set 是否可开票
     *
     * @param isApplyInvoice
     */
    public DescribeInvoicesResult isApplyInvoice(Boolean isApplyInvoice) {
        this.isApplyInvoice = isApplyInvoice;
        return this;
    }


    /**
     * set invoiceSearch
     *
     * @param invoiceSearch
     */
    public DescribeInvoicesResult invoiceSearch(Invoices invoiceSearch) {
        this.invoiceSearch = invoiceSearch;
        return this;
    }


}