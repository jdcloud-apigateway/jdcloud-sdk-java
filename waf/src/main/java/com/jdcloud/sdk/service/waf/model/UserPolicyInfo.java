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

package com.jdcloud.sdk.service.waf.model;

import java.util.List;
import java.util.ArrayList;

/**
 * userPolicyInfo
 */
public class UserPolicyInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则组id
     */
    private Long id;

    /**
     * 规则组名字
     */
    private String name;

    /**
     * 规则组里的规则个数
     */
    private Integer count;

    /**
     * 规则组应用的域名个数
     */
    private Integer domainCnt;

    /**
     * 规则是否自动更新, 0/1
     */
    private Integer autoAdd;

    /**
     * 导入规则集的等级，0/1/2/-1
     */
    private Integer importLevel;

    /**
     * 规则id
     */
    private List<Integer> ruleIds;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 自定义规则集应用的域名信息
     */
    private List<UserPolicyWafDomain> wafDomains;


    /**
     * get 规则组id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 规则组id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get 规则组名字
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 规则组名字
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 规则组里的规则个数
     *
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * set 规则组里的规则个数
     *
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * get 规则组应用的域名个数
     *
     * @return
     */
    public Integer getDomainCnt() {
        return domainCnt;
    }

    /**
     * set 规则组应用的域名个数
     *
     * @param domainCnt
     */
    public void setDomainCnt(Integer domainCnt) {
        this.domainCnt = domainCnt;
    }

    /**
     * get 规则是否自动更新, 0/1
     *
     * @return
     */
    public Integer getAutoAdd() {
        return autoAdd;
    }

    /**
     * set 规则是否自动更新, 0/1
     *
     * @param autoAdd
     */
    public void setAutoAdd(Integer autoAdd) {
        this.autoAdd = autoAdd;
    }

    /**
     * get 导入规则集的等级，0/1/2/-1
     *
     * @return
     */
    public Integer getImportLevel() {
        return importLevel;
    }

    /**
     * set 导入规则集的等级，0/1/2/-1
     *
     * @param importLevel
     */
    public void setImportLevel(Integer importLevel) {
        this.importLevel = importLevel;
    }

    /**
     * get 规则id
     *
     * @return
     */
    public List<Integer> getRuleIds() {
        return ruleIds;
    }

    /**
     * set 规则id
     *
     * @param ruleIds
     */
    public void setRuleIds(List<Integer> ruleIds) {
        this.ruleIds = ruleIds;
    }

    /**
     * get 更新时间
     *
     * @return
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 自定义规则集应用的域名信息
     *
     * @return
     */
    public List<UserPolicyWafDomain> getWafDomains() {
        return wafDomains;
    }

    /**
     * set 自定义规则集应用的域名信息
     *
     * @param wafDomains
     */
    public void setWafDomains(List<UserPolicyWafDomain> wafDomains) {
        this.wafDomains = wafDomains;
    }


    /**
     * set 规则组id
     *
     * @param id
     */
    public UserPolicyInfo id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 规则组名字
     *
     * @param name
     */
    public UserPolicyInfo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 规则组里的规则个数
     *
     * @param count
     */
    public UserPolicyInfo count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * set 规则组应用的域名个数
     *
     * @param domainCnt
     */
    public UserPolicyInfo domainCnt(Integer domainCnt) {
        this.domainCnt = domainCnt;
        return this;
    }

    /**
     * set 规则是否自动更新, 0/1
     *
     * @param autoAdd
     */
    public UserPolicyInfo autoAdd(Integer autoAdd) {
        this.autoAdd = autoAdd;
        return this;
    }

    /**
     * set 导入规则集的等级，0/1/2/-1
     *
     * @param importLevel
     */
    public UserPolicyInfo importLevel(Integer importLevel) {
        this.importLevel = importLevel;
        return this;
    }

    /**
     * set 规则id
     *
     * @param ruleIds
     */
    public UserPolicyInfo ruleIds(List<Integer> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public UserPolicyInfo updateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 自定义规则集应用的域名信息
     *
     * @param wafDomains
     */
    public UserPolicyInfo wafDomains(List<UserPolicyWafDomain> wafDomains) {
        this.wafDomains = wafDomains;
        return this;
    }


    /**
     * add item to 规则id
     *
     * @param ruleId
     */
    public void addRuleId(Integer ruleId) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        this.ruleIds.add(ruleId);
    }

    /**
     * add item to 自定义规则集应用的域名信息
     *
     * @param wafDomain
     */
    public void addWafDomain(UserPolicyWafDomain wafDomain) {
        if (this.wafDomains == null) {
            this.wafDomains = new ArrayList<>();
        }
        this.wafDomains.add(wafDomain);
    }

}