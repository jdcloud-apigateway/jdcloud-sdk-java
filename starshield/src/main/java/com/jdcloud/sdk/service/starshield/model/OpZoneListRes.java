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

package com.jdcloud.sdk.service.starshield.model;

import java.util.List;
import java.util.ArrayList;

/**
 * opZoneListRes
 */
public class OpZoneListRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 实例id
     */
    private String instanceId;

    /**
     * 域名
     */
    private String zone;

    /**
     * 域名id
     */
    private String zoneId;

    /**
     * 用户pin
     */
    private String pin;

    /**
     * 接入方式(full-&gt;全接入 partial-&gt;半接入)
     */
    private String ty_pe;

    /**
     * 状态(active-&gt;已激活 deleted-&gt;已删除 pending-&gt;未激活)
     */
    private String status;

    /**
     * NS/CNAME记录
     */
    
    private List<String> nameServers;
    /**
     * TXT记录
     */
    private String verificationKey;

    /**
     * 域名对应的ip信息
     */
    
    private List<String> ips;
    /**
     * ip类型
     */
    private String ipType;

    /**
     * 用于查找ips的id
     */
    private Long internalId;



    /**
     * get id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


    /**
     * get 实例id
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例id
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * get 域名
     *
     * @return
     */
    public String getZone() {
        return zone;
    }

    /**
     * set 域名
     *
     * @param zone
     */
    public void setZone(String zone) {
        this.zone = zone;
    }


    /**
     * get 域名id
     *
     * @return
     */
    public String getZoneId() {
        return zoneId;
    }

    /**
     * set 域名id
     *
     * @param zoneId
     */
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }


    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }


    /**
     * get 接入方式(full-&gt;全接入 partial-&gt;半接入)
     *
     * @return
     */
    public String getTy_pe() {
        return ty_pe;
    }

    /**
     * set 接入方式(full-&gt;全接入 partial-&gt;半接入)
     *
     * @param ty_pe
     */
    public void setTy_pe(String ty_pe) {
        this.ty_pe = ty_pe;
    }


    /**
     * get 状态(active-&gt;已激活 deleted-&gt;已删除 pending-&gt;未激活)
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 状态(active-&gt;已激活 deleted-&gt;已删除 pending-&gt;未激活)
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
    * get NS/CNAME记录
    *
    * @return
    */
    public List<String> getNameServers() {
        return nameServers;
    }

    /**
    * set NS/CNAME记录
    *
    * @param nameServers
    */
    public void setNameServers(List<String> nameServers) {
        this.nameServers = nameServers;
    }


    /**
     * get TXT记录
     *
     * @return
     */
    public String getVerificationKey() {
        return verificationKey;
    }

    /**
     * set TXT记录
     *
     * @param verificationKey
     */
    public void setVerificationKey(String verificationKey) {
        this.verificationKey = verificationKey;
    }


    /**
    * get 域名对应的ip信息
    *
    * @return
    */
    public List<String> getIps() {
        return ips;
    }

    /**
    * set 域名对应的ip信息
    *
    * @param ips
    */
    public void setIps(List<String> ips) {
        this.ips = ips;
    }


    /**
     * get ip类型
     *
     * @return
     */
    public String getIpType() {
        return ipType;
    }

    /**
     * set ip类型
     *
     * @param ipType
     */
    public void setIpType(String ipType) {
        this.ipType = ipType;
    }


    /**
     * get 用于查找ips的id
     *
     * @return
     */
    public Long getInternalId() {
        return internalId;
    }

    /**
     * set 用于查找ips的id
     *
     * @param internalId
     */
    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }



    /**
     * set id
     *
     * @param id
     */
    public OpZoneListRes id(Long id) {
        this.id = id;
        return this;
    }


    /**
     * set 实例id
     *
     * @param instanceId
     */
    public OpZoneListRes instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * set 域名
     *
     * @param zone
     */
    public OpZoneListRes zone(String zone) {
        this.zone = zone;
        return this;
    }


    /**
     * set 域名id
     *
     * @param zoneId
     */
    public OpZoneListRes zoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }


    /**
     * set 用户pin
     *
     * @param pin
     */
    public OpZoneListRes pin(String pin) {
        this.pin = pin;
        return this;
    }


    /**
     * set 接入方式(full-&gt;全接入 partial-&gt;半接入)
     *
     * @param ty_pe
     */
    public OpZoneListRes ty_pe(String ty_pe) {
        this.ty_pe = ty_pe;
        return this;
    }


    /**
     * set 状态(active-&gt;已激活 deleted-&gt;已删除 pending-&gt;未激活)
     *
     * @param status
     */
    public OpZoneListRes status(String status) {
        this.status = status;
        return this;
    }


    /**
    * set NS/CNAME记录
    *
    * @param nameServers
    */
    public OpZoneListRes nameServers(List<String> nameServers) {
        this.nameServers = nameServers;
        return this;
    }


    /**
     * set TXT记录
     *
     * @param verificationKey
     */
    public OpZoneListRes verificationKey(String verificationKey) {
        this.verificationKey = verificationKey;
        return this;
    }


    /**
    * set 域名对应的ip信息
    *
    * @param ips
    */
    public OpZoneListRes ips(List<String> ips) {
        this.ips = ips;
        return this;
    }


    /**
     * set ip类型
     *
     * @param ipType
     */
    public OpZoneListRes ipType(String ipType) {
        this.ipType = ipType;
        return this;
    }


    /**
     * set 用于查找ips的id
     *
     * @param internalId
     */
    public OpZoneListRes internalId(Long internalId) {
        this.internalId = internalId;
        return this;
    }



    /**
     * add item to NS/CNAME记录
     *
     * @param nameServer
     */
    public void addNameServer(String nameServer) {
        if (this.nameServers == null) {
            this.nameServers = new ArrayList<>();
        }
        this.nameServers.add(nameServer);
    }

    /**
     * add item to 域名对应的ip信息
     *
     * @param ip
     */
    public void addIp(String ip) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ip);
    }
}