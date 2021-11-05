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
 * Zone Settings
 * A Zone setting changes how the Zone works in relation to caching, security, or other features of JDC StarShield
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.service.starshield.model.IPGeolocation;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 启用IP地理定位，让星盾对您网站的访问者进行地理定位，并将国家代码传递给您。
 */
public class GetIPGeolocationSettingResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private IPGeolocation data;


    /**
     * get data
     *
     * @return
     */
    public IPGeolocation getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(IPGeolocation data) {
        this.data = data;
    }


    /**
     * set data
     *
     * @param data
     */
    public GetIPGeolocationSettingResult data(IPGeolocation data) {
        this.data = data;
        return this;
    }


}