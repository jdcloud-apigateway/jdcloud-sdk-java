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
 * 资源预留型实例抵扣券参数
 */
public class ReservedVoucher  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例规格
     */
    private String instanceType;

    /**
     * 可用区
     */
    private String az;

    /**
     * 购买数量
     */
    private Integer unitCount;


    /**
     * get 实例规格
     *
     * @return
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * set 实例规格
     *
     * @param instanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * get 可用区
     *
     * @return
     */
    public String getAz() {
        return az;
    }

    /**
     * set 可用区
     *
     * @param az
     */
    public void setAz(String az) {
        this.az = az;
    }

    /**
     * get 购买数量
     *
     * @return
     */
    public Integer getUnitCount() {
        return unitCount;
    }

    /**
     * set 购买数量
     *
     * @param unitCount
     */
    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }


    /**
     * set 实例规格
     *
     * @param instanceType
     */
    public ReservedVoucher instanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * set 可用区
     *
     * @param az
     */
    public ReservedVoucher az(String az) {
        this.az = az;
        return this;
    }

    /**
     * set 购买数量
     *
     * @param unitCount
     */
    public ReservedVoucher unitCount(Integer unitCount) {
        this.unitCount = unitCount;
        return this;
    }


}