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
 * Zone-Settings
 * A Zone setting changes how the Zone works in relation to caching, security, or other features of JDC StarShield
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.starshield.model;

import com.jdcloud.sdk.service.starshield.model.IPv6;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 在所有启用星盾的子域上启用 IPv6。
 */
public class ChangeIPv6SettingResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private IPv6 data;



    /**
     * get data
     *
     * @return
     */
    public IPv6 getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(IPv6 data) {
        this.data = data;
    }



    /**
     * set data
     *
     * @param data
     */
    public ChangeIPv6SettingResult data(IPv6 data) {
        this.data = data;
        return this;
    }


}