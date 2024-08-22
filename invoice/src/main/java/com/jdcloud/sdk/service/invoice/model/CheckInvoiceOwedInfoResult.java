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

import com.jdcloud.sdk.service.invoice.model.CheckResult;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 批量查询订单是否有欠票状态
 */
public class CheckInvoiceOwedInfoResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * true-有欠票, false-无欠票
     */
    private CheckResult result;



    /**
     * get true-有欠票, false-无欠票
     *
     * @return
     */
    public CheckResult getResult() {
        return result;
    }

    /**
     * set true-有欠票, false-无欠票
     *
     * @param result
     */
    public void setResult(CheckResult result) {
        this.result = result;
    }



    /**
     * set true-有欠票, false-无欠票
     *
     * @param result
     */
    public CheckInvoiceOwedInfoResult result(CheckResult result) {
        this.result = result;
        return this;
    }


}