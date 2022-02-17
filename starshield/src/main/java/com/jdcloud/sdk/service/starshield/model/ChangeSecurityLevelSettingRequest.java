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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 为你的网站选择适当的安全配置文件，这将自动调整每个安全设置。如果你选择定制一个单独的安全设置，该配置文件将成为自定义。

 */
public class ChangeSecurityLevelSettingRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 该设置的有效值
     */
    private String value;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;


    /**
     * get 该设置的有效值
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 该设置的有效值
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * get zone_identifier
     *
     * @return
     */
    public String getZone_identifier() {
        return zone_identifier;
    }

    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public void setZone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
    }


    /**
     * set 该设置的有效值
     *
     * @param value
     */
    public ChangeSecurityLevelSettingRequest value(String value) {
        this.value = value;
        return this;
    }

    /**
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public ChangeSecurityLevelSettingRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }


}