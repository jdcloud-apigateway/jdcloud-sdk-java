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
 * 套餐包管理模块
 * 套餐包管理模块
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 套餐包详情查询
 */
public class DescribePackageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 套餐类型
     * Required:true
     */
    @Required
    private Integer packType;


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 套餐类型
     *
     * @return
     */
    public Integer getPackType() {
        return packType;
    }

    /**
     * set 套餐类型
     *
     * @param packType
     */
    public void setPackType(Integer packType) {
        this.packType = packType;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DescribePackageRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 套餐类型
     *
     * @param packType
     */
    public DescribePackageRequest packType(Integer packType) {
        this.packType = packType;
        return this;
    }


}