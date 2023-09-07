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

package com.jdcloud.sdk.service.rds.model;


/**
 * whiteList
 */
public class WhiteList  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 白名单名称
     */
    private String name;

    /**
     * IP或IP段，不同的IP/IP段之间用英文逗号分隔，例如0.0.0.0/0,192.168.0.10
     */
    private String ips;



    /**
     * get 白名单名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 白名单名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get IP或IP段，不同的IP/IP段之间用英文逗号分隔，例如0.0.0.0/0,192.168.0.10
     *
     * @return
     */
    public String getIps() {
        return ips;
    }

    /**
     * set IP或IP段，不同的IP/IP段之间用英文逗号分隔，例如0.0.0.0/0,192.168.0.10
     *
     * @param ips
     */
    public void setIps(String ips) {
        this.ips = ips;
    }



    /**
     * set 白名单名称
     *
     * @param name
     */
    public WhiteList name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set IP或IP段，不同的IP/IP段之间用英文逗号分隔，例如0.0.0.0/0,192.168.0.10
     *
     * @param ips
     */
    public WhiteList ips(String ips) {
        this.ips = ips;
        return this;
    }


}