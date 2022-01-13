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

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * blackIpSetSpec
 */
public class BlackIpSetSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * IP 黑名单名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * IP 或 IP 段的数组
     * Required:true
     */
    @Required
    private List<String> ip;


    /**
     * get IP 黑名单名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set IP 黑名单名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get IP 或 IP 段的数组
     *
     * @return
     */
    public List<String> getIp() {
        return ip;
    }

    /**
     * set IP 或 IP 段的数组
     *
     * @param ip
     */
    public void setIp(List<String> ip) {
        this.ip = ip;
    }


    /**
     * set IP 黑名单名称
     *
     * @param name
     */
    public BlackIpSetSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set IP 或 IP 段的数组
     *
     * @param ip
     */
    public BlackIpSetSpec ip(List<String> ip) {
        this.ip = ip;
        return this;
    }


    /**
     * add item to IP 或 IP 段的数组
     *
     * @param ip
     */
    public void addIp(String ip) {
        if (this.ip == null) {
            this.ip = new ArrayList<>();
        }
        this.ip.add(ip);
    }

}