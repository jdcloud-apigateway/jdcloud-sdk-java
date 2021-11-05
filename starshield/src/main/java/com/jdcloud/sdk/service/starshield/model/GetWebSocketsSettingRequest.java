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
 * WebSockets是客户端和源服务器之间持续的开放连接。在WebSockets连接中，客户端和源服务器可以来回传递数据，而不需要重新建立会话。
这使得在WebSockets连接中的数据交换非常快。WebSockets经常被用于实时应用，如即时聊天和游戏。

 */
public class GetWebSocketsSettingRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * zone_identifier
     * Required:true
     */
    @Required
    private String zone_identifier;


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
     * set zone_identifier
     *
     * @param zone_identifier
     */
    public GetWebSocketsSettingRequest zone_identifier(String zone_identifier) {
        this.zone_identifier = zone_identifier;
        return this;
    }


}