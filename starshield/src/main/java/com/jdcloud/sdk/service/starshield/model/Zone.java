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
 * zone
 */
public class Zone  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * plan_pending
     */
    private Plan_pending plan_pending;

    /**
     * 切换到星盾时的DNS主机
     */
    private String original_dnshost;

    /**
     * 当前用户在域上的可用权限
     */
    
    private List<String> permissions;
    /**
     * 域的开发模式过期（正整数）或上次过期（负整数）的时间间隔（秒）。如果从未启用过开发模式，则此值为0。

     */
    private Number development_mode;

    /**
     * verification_key
     */
    private String verification_key;

    /**
     * plan
     */
    private Plan plan;

    /**
     * 迁移到星盾之前的原始域名服务器
     */
    
    private List<String> original_name_servers;
    /**
     * 域名
     */
    private String name;

    /**
     * account
     */
    private Account account;

    /**
     * 最后一次检测到所有权证明和该域激活的时间
     */
    private String activated_on;

    /**
     * 指示域是否仅使用星盾DNS服务。如果值为真，则表示该域将不会获得安全或性能方面的好处。
     */
    private Boolean paused;

    /**
     * 域的状态
     */
    private String status;

    /**
     * owner
     */
    private Owner owner;

    /**
     * 上次修改域的时间
     */
    private String modified_on;

    /**
     * 创建域的时间
     */
    private String created_on;

    /**
     * 全接入的域意味着DNS由星盾托管。半接入的域通常是合作伙伴托管的域或CNAME设置。
     */
    private String ty_pe;

    /**
     * 域标识符标签
     */
    private String id;

    /**
     * 星盾分配的域名服务器。这仅适用于使用星盾DNS的域
     */
    
    private List<String> name_servers;
    /**
     * 切换到星盾时的域注册商
     */
    private String original_registrar;

    /**
     * cname解析状态。0为解析到云端VIP，1为解析到回源地址
     */
    private Integer enableCname2Rs;

    /**
     * CNAME后缀
     */
    private String cname_suffix;



    /**
     * get plan_pending
     *
     * @return
     */
    public Plan_pending getPlan_pending() {
        return plan_pending;
    }

    /**
     * set plan_pending
     *
     * @param plan_pending
     */
    public void setPlan_pending(Plan_pending plan_pending) {
        this.plan_pending = plan_pending;
    }


    /**
     * get 切换到星盾时的DNS主机
     *
     * @return
     */
    public String getOriginal_dnshost() {
        return original_dnshost;
    }

    /**
     * set 切换到星盾时的DNS主机
     *
     * @param original_dnshost
     */
    public void setOriginal_dnshost(String original_dnshost) {
        this.original_dnshost = original_dnshost;
    }


    /**
    * get 当前用户在域上的可用权限
    *
    * @return
    */
    public List<String> getPermissions() {
        return permissions;
    }

    /**
    * set 当前用户在域上的可用权限
    *
    * @param permissions
    */
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }


    /**
     * get 域的开发模式过期（正整数）或上次过期（负整数）的时间间隔（秒）。如果从未启用过开发模式，则此值为0。

     *
     * @return
     */
    public Number getDevelopment_mode() {
        return development_mode;
    }

    /**
     * set 域的开发模式过期（正整数）或上次过期（负整数）的时间间隔（秒）。如果从未启用过开发模式，则此值为0。

     *
     * @param development_mode
     */
    public void setDevelopment_mode(Number development_mode) {
        this.development_mode = development_mode;
    }


    /**
     * get verification_key
     *
     * @return
     */
    public String getVerification_key() {
        return verification_key;
    }

    /**
     * set verification_key
     *
     * @param verification_key
     */
    public void setVerification_key(String verification_key) {
        this.verification_key = verification_key;
    }


    /**
     * get plan
     *
     * @return
     */
    public Plan getPlan() {
        return plan;
    }

    /**
     * set plan
     *
     * @param plan
     */
    public void setPlan(Plan plan) {
        this.plan = plan;
    }


    /**
    * get 迁移到星盾之前的原始域名服务器
    *
    * @return
    */
    public List<String> getOriginal_name_servers() {
        return original_name_servers;
    }

    /**
    * set 迁移到星盾之前的原始域名服务器
    *
    * @param original_name_servers
    */
    public void setOriginal_name_servers(List<String> original_name_servers) {
        this.original_name_servers = original_name_servers;
    }


    /**
     * get 域名
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 域名
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get account
     *
     * @return
     */
    public Account getAccount() {
        return account;
    }

    /**
     * set account
     *
     * @param account
     */
    public void setAccount(Account account) {
        this.account = account;
    }


    /**
     * get 最后一次检测到所有权证明和该域激活的时间
     *
     * @return
     */
    public String getActivated_on() {
        return activated_on;
    }

    /**
     * set 最后一次检测到所有权证明和该域激活的时间
     *
     * @param activated_on
     */
    public void setActivated_on(String activated_on) {
        this.activated_on = activated_on;
    }


    /**
     * get 指示域是否仅使用星盾DNS服务。如果值为真，则表示该域将不会获得安全或性能方面的好处。
     *
     * @return
     */
    public Boolean getPaused() {
        return paused;
    }

    /**
     * set 指示域是否仅使用星盾DNS服务。如果值为真，则表示该域将不会获得安全或性能方面的好处。
     *
     * @param paused
     */
    public void setPaused(Boolean paused) {
        this.paused = paused;
    }


    /**
     * get 域的状态
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 域的状态
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get owner
     *
     * @return
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * set owner
     *
     * @param owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }


    /**
     * get 上次修改域的时间
     *
     * @return
     */
    public String getModified_on() {
        return modified_on;
    }

    /**
     * set 上次修改域的时间
     *
     * @param modified_on
     */
    public void setModified_on(String modified_on) {
        this.modified_on = modified_on;
    }


    /**
     * get 创建域的时间
     *
     * @return
     */
    public String getCreated_on() {
        return created_on;
    }

    /**
     * set 创建域的时间
     *
     * @param created_on
     */
    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }


    /**
     * get 全接入的域意味着DNS由星盾托管。半接入的域通常是合作伙伴托管的域或CNAME设置。
     *
     * @return
     */
    public String getTy_pe() {
        return ty_pe;
    }

    /**
     * set 全接入的域意味着DNS由星盾托管。半接入的域通常是合作伙伴托管的域或CNAME设置。
     *
     * @param ty_pe
     */
    public void setTy_pe(String ty_pe) {
        this.ty_pe = ty_pe;
    }


    /**
     * get 域标识符标签
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set 域标识符标签
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
    * get 星盾分配的域名服务器。这仅适用于使用星盾DNS的域
    *
    * @return
    */
    public List<String> getName_servers() {
        return name_servers;
    }

    /**
    * set 星盾分配的域名服务器。这仅适用于使用星盾DNS的域
    *
    * @param name_servers
    */
    public void setName_servers(List<String> name_servers) {
        this.name_servers = name_servers;
    }


    /**
     * get 切换到星盾时的域注册商
     *
     * @return
     */
    public String getOriginal_registrar() {
        return original_registrar;
    }

    /**
     * set 切换到星盾时的域注册商
     *
     * @param original_registrar
     */
    public void setOriginal_registrar(String original_registrar) {
        this.original_registrar = original_registrar;
    }


    /**
     * get cname解析状态。0为解析到云端VIP，1为解析到回源地址
     *
     * @return
     */
    public Integer getEnableCname2Rs() {
        return enableCname2Rs;
    }

    /**
     * set cname解析状态。0为解析到云端VIP，1为解析到回源地址
     *
     * @param enableCname2Rs
     */
    public void setEnableCname2Rs(Integer enableCname2Rs) {
        this.enableCname2Rs = enableCname2Rs;
    }


    /**
     * get CNAME后缀
     *
     * @return
     */
    public String getCname_suffix() {
        return cname_suffix;
    }

    /**
     * set CNAME后缀
     *
     * @param cname_suffix
     */
    public void setCname_suffix(String cname_suffix) {
        this.cname_suffix = cname_suffix;
    }



    /**
     * set plan_pending
     *
     * @param plan_pending
     */
    public Zone plan_pending(Plan_pending plan_pending) {
        this.plan_pending = plan_pending;
        return this;
    }


    /**
     * set 切换到星盾时的DNS主机
     *
     * @param original_dnshost
     */
    public Zone original_dnshost(String original_dnshost) {
        this.original_dnshost = original_dnshost;
        return this;
    }


    /**
    * set 当前用户在域上的可用权限
    *
    * @param permissions
    */
    public Zone permissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }


    /**
     * set 域的开发模式过期（正整数）或上次过期（负整数）的时间间隔（秒）。如果从未启用过开发模式，则此值为0。

     *
     * @param development_mode
     */
    public Zone development_mode(Number development_mode) {
        this.development_mode = development_mode;
        return this;
    }


    /**
     * set verification_key
     *
     * @param verification_key
     */
    public Zone verification_key(String verification_key) {
        this.verification_key = verification_key;
        return this;
    }


    /**
     * set plan
     *
     * @param plan
     */
    public Zone plan(Plan plan) {
        this.plan = plan;
        return this;
    }


    /**
    * set 迁移到星盾之前的原始域名服务器
    *
    * @param original_name_servers
    */
    public Zone original_name_servers(List<String> original_name_servers) {
        this.original_name_servers = original_name_servers;
        return this;
    }


    /**
     * set 域名
     *
     * @param name
     */
    public Zone name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set account
     *
     * @param account
     */
    public Zone account(Account account) {
        this.account = account;
        return this;
    }


    /**
     * set 最后一次检测到所有权证明和该域激活的时间
     *
     * @param activated_on
     */
    public Zone activated_on(String activated_on) {
        this.activated_on = activated_on;
        return this;
    }


    /**
     * set 指示域是否仅使用星盾DNS服务。如果值为真，则表示该域将不会获得安全或性能方面的好处。
     *
     * @param paused
     */
    public Zone paused(Boolean paused) {
        this.paused = paused;
        return this;
    }


    /**
     * set 域的状态
     *
     * @param status
     */
    public Zone status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set owner
     *
     * @param owner
     */
    public Zone owner(Owner owner) {
        this.owner = owner;
        return this;
    }


    /**
     * set 上次修改域的时间
     *
     * @param modified_on
     */
    public Zone modified_on(String modified_on) {
        this.modified_on = modified_on;
        return this;
    }


    /**
     * set 创建域的时间
     *
     * @param created_on
     */
    public Zone created_on(String created_on) {
        this.created_on = created_on;
        return this;
    }


    /**
     * set 全接入的域意味着DNS由星盾托管。半接入的域通常是合作伙伴托管的域或CNAME设置。
     *
     * @param ty_pe
     */
    public Zone ty_pe(String ty_pe) {
        this.ty_pe = ty_pe;
        return this;
    }


    /**
     * set 域标识符标签
     *
     * @param id
     */
    public Zone id(String id) {
        this.id = id;
        return this;
    }


    /**
    * set 星盾分配的域名服务器。这仅适用于使用星盾DNS的域
    *
    * @param name_servers
    */
    public Zone name_servers(List<String> name_servers) {
        this.name_servers = name_servers;
        return this;
    }


    /**
     * set 切换到星盾时的域注册商
     *
     * @param original_registrar
     */
    public Zone original_registrar(String original_registrar) {
        this.original_registrar = original_registrar;
        return this;
    }


    /**
     * set cname解析状态。0为解析到云端VIP，1为解析到回源地址
     *
     * @param enableCname2Rs
     */
    public Zone enableCname2Rs(Integer enableCname2Rs) {
        this.enableCname2Rs = enableCname2Rs;
        return this;
    }


    /**
     * set CNAME后缀
     *
     * @param cname_suffix
     */
    public Zone cname_suffix(String cname_suffix) {
        this.cname_suffix = cname_suffix;
        return this;
    }



    /**
     * add item to 当前用户在域上的可用权限
     *
     * @param permission
     */
    public void addPermission(String permission) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permission);
    }

    /**
     * add item to 迁移到星盾之前的原始域名服务器
     *
     * @param original_name_server
     */
    public void addOriginal_name_server(String original_name_server) {
        if (this.original_name_servers == null) {
            this.original_name_servers = new ArrayList<>();
        }
        this.original_name_servers.add(original_name_server);
    }

    /**
     * add item to 星盾分配的域名服务器。这仅适用于使用星盾DNS的域
     *
     * @param name_server
     */
    public void addName_server(String name_server) {
        if (this.name_servers == null) {
            this.name_servers = new ArrayList<>();
        }
        this.name_servers.add(name_server);
    }
}