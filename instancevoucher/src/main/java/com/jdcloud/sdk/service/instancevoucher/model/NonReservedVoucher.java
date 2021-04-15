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

package com.jdcloud.sdk.service.instancevoucher.model;


/**
 * 非资源预留型实例抵扣券参数
 */
public class NonReservedVoucher  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格族
     */
    private String instanceTypeFamily;

    /**
     * cpu 核数 / gpu 卡数
     */
    private Integer unitCount;


    /**
     * get 实例规格族
     *
     * @return
     */
    public String getInstanceTypeFamily() {
        return instanceTypeFamily;
    }

    /**
     * set 实例规格族
     *
     * @param instanceTypeFamily
     */
    public void setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
    }

    /**
     * get cpu 核数 / gpu 卡数
     *
     * @return
     */
    public Integer getUnitCount() {
        return unitCount;
    }

    /**
     * set cpu 核数 / gpu 卡数
     *
     * @param unitCount
     */
    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }


    /**
     * set 实例规格族
     *
     * @param instanceTypeFamily
     */
    public NonReservedVoucher instanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }

    /**
     * set cpu 核数 / gpu 卡数
     *
     * @param unitCount
     */
    public NonReservedVoucher unitCount(Integer unitCount) {
        this.unitCount = unitCount;
        return this;
    }


}