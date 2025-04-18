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

package com.jdcloud.sdk.service.rocketmq.model;


/**
 * endpointEntry
 */
public class EndpointEntry  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 协议
     */
    private String protocol;

    /**
     * 地址
     */
    private String address;



    /**
     * get 协议
     *
     * @return
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * set 协议
     *
     * @param protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


    /**
     * get 地址
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * set 地址
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }



    /**
     * set 协议
     *
     * @param protocol
     */
    public EndpointEntry protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }


    /**
     * set 地址
     *
     * @param address
     */
    public EndpointEntry address(String address) {
        this.address = address;
        return this;
    }


}