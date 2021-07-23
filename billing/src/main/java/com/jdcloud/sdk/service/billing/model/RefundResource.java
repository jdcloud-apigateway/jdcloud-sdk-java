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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * refundResource
 */
public class RefundResource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源ID
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 订单编号列表
     * Required:true
     */
    @Required
    private List<String> orderNumbers;


    /**
     * get 资源ID
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 订单编号列表
     *
     * @return
     */
    public List<String> getOrderNumbers() {
        return orderNumbers;
    }

    /**
     * set 订单编号列表
     *
     * @param orderNumbers
     */
    public void setOrderNumbers(List<String> orderNumbers) {
        this.orderNumbers = orderNumbers;
    }


    /**
     * set 资源ID
     *
     * @param resourceId
     */
    public RefundResource resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 订单编号列表
     *
     * @param orderNumbers
     */
    public RefundResource orderNumbers(List<String> orderNumbers) {
        this.orderNumbers = orderNumbers;
        return this;
    }


    /**
     * add item to 订单编号列表
     *
     * @param orderNumber
     */
    public void addOrderNumber(String orderNumber) {
        if (this.orderNumbers == null) {
            this.orderNumbers = new ArrayList<>();
        }
        this.orderNumbers.add(orderNumber);
    }

}