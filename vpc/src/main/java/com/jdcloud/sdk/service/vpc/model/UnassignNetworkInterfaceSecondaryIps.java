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

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * unassignNetworkInterfaceSecondaryIps
 */
public class UnassignNetworkInterfaceSecondaryIps  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 网卡ID
     * Required:true
     */
    @Required
    private String networkInterfaceId;

    /**
     * 指定删除的secondaryIp地址
     */
    private List<String> secondaryIps;

    /**
     * 指定删除的secondaryIp网段
     */
    private List<String> secondaryCidrs;


    /**
     * get 网卡ID
     *
     * @return
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * set 网卡ID
     *
     * @param networkInterfaceId
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * get 指定删除的secondaryIp地址
     *
     * @return
     */
    public List<String> getSecondaryIps() {
        return secondaryIps;
    }

    /**
     * set 指定删除的secondaryIp地址
     *
     * @param secondaryIps
     */
    public void setSecondaryIps(List<String> secondaryIps) {
        this.secondaryIps = secondaryIps;
    }

    /**
     * get 指定删除的secondaryIp网段
     *
     * @return
     */
    public List<String> getSecondaryCidrs() {
        return secondaryCidrs;
    }

    /**
     * set 指定删除的secondaryIp网段
     *
     * @param secondaryCidrs
     */
    public void setSecondaryCidrs(List<String> secondaryCidrs) {
        this.secondaryCidrs = secondaryCidrs;
    }


    /**
     * set 网卡ID
     *
     * @param networkInterfaceId
     */
    public UnassignNetworkInterfaceSecondaryIps networkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * set 指定删除的secondaryIp地址
     *
     * @param secondaryIps
     */
    public UnassignNetworkInterfaceSecondaryIps secondaryIps(List<String> secondaryIps) {
        this.secondaryIps = secondaryIps;
        return this;
    }

    /**
     * set 指定删除的secondaryIp网段
     *
     * @param secondaryCidrs
     */
    public UnassignNetworkInterfaceSecondaryIps secondaryCidrs(List<String> secondaryCidrs) {
        this.secondaryCidrs = secondaryCidrs;
        return this;
    }


    /**
     * add item to 指定删除的secondaryIp地址
     *
     * @param secondaryIp
     */
    public void addSecondaryIp(String secondaryIp) {
        if (this.secondaryIps == null) {
            this.secondaryIps = new ArrayList<>();
        }
        this.secondaryIps.add(secondaryIp);
    }

    /**
     * add item to 指定删除的secondaryIp网段
     *
     * @param secondaryCidr
     */
    public void addSecondaryCidr(String secondaryCidr) {
        if (this.secondaryCidrs == null) {
            this.secondaryCidrs = new ArrayList<>();
        }
        this.secondaryCidrs.add(secondaryCidr);
    }

}