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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.invoice.model.RefundOweInvoice;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 批量查询订单是否有欠票状态
 */
public class CheckInvoiceOwedInfoRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 退款订单信息
     */
    
    private List<RefundOweInvoice> refundInfoList;
    /**
     * regionId
     * Required:true
     */
    @Required
    private String regionId;



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
    * get 退款订单信息
    *
    * @return
    */
    public List<RefundOweInvoice> getRefundInfoList() {
        return refundInfoList;
    }

    /**
    * set 退款订单信息
    *
    * @param refundInfoList
    */
    public void setRefundInfoList(List<RefundOweInvoice> refundInfoList) {
        this.refundInfoList = refundInfoList;
    }


    /**
     * get regionId
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set pin
     *
     * @param pin
     */
    public CheckInvoiceOwedInfoRequest pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
    * set 退款订单信息
    *
    * @param refundInfoList
    */
    public CheckInvoiceOwedInfoRequest refundInfoList(List<RefundOweInvoice> refundInfoList) {
        this.refundInfoList = refundInfoList;
        return this;
    }


    /**
     * set regionId
     *
     * @param regionId
     */
    public CheckInvoiceOwedInfoRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }



    /**
     * add item to 退款订单信息
     *
     * @param refundInfoList
     */
    public void addRefundInfoList(RefundOweInvoice refundInfoList) {
        if (this.refundInfoList == null) {
            this.refundInfoList = new ArrayList<>();
        }
        this.refundInfoList.add(refundInfoList);
    }
}