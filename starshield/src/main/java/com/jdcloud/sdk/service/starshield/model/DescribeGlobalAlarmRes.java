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
 * describeGlobalAlarmRes
 */
public class DescribeGlobalAlarmRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 告警规则ID
     */
    private Long id;

    /**
     * 告警类型 WEB_ATTACK-&gt;网站攻击 CC_ATTACK-&gt;CC攻击 DDOS_ATTACK-&gt;DDOS攻击 STATUS_CODE_ERROR-&gt;状态码错误
     */
    private String alarmType;

    /**
     * 统计周期
     */
    private Integer statCycle;

    /**
     * 统计周期单位
     */
    private String statCycleUnit;

    /**
     * 统计阈值
     */
    private Long statThreshold;

    /**
     * 告警次数限制
     */
    private Integer alarmTimesLimit;

    /**
     * 发送短信开关
     */
    private Boolean smsEnable;

    /**
     * 发送邮件开关
     */
    private Boolean emailEnable;

    /**
     * 发送站内信开关
     */
    private Boolean webMsEnable;

    /**
     * 规则开关
     */
    private Boolean enable;

    /**
     * 告警联系人
     */
    private List<Long> contactUsers;

    /**
     * 告警联系组
     */
    private List<Long> contactGroups;


    /**
     * get 告警规则ID
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 告警规则ID
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get 告警类型 WEB_ATTACK-&gt;网站攻击 CC_ATTACK-&gt;CC攻击 DDOS_ATTACK-&gt;DDOS攻击 STATUS_CODE_ERROR-&gt;状态码错误
     *
     * @return
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * set 告警类型 WEB_ATTACK-&gt;网站攻击 CC_ATTACK-&gt;CC攻击 DDOS_ATTACK-&gt;DDOS攻击 STATUS_CODE_ERROR-&gt;状态码错误
     *
     * @param alarmType
     */
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    /**
     * get 统计周期
     *
     * @return
     */
    public Integer getStatCycle() {
        return statCycle;
    }

    /**
     * set 统计周期
     *
     * @param statCycle
     */
    public void setStatCycle(Integer statCycle) {
        this.statCycle = statCycle;
    }

    /**
     * get 统计周期单位
     *
     * @return
     */
    public String getStatCycleUnit() {
        return statCycleUnit;
    }

    /**
     * set 统计周期单位
     *
     * @param statCycleUnit
     */
    public void setStatCycleUnit(String statCycleUnit) {
        this.statCycleUnit = statCycleUnit;
    }

    /**
     * get 统计阈值
     *
     * @return
     */
    public Long getStatThreshold() {
        return statThreshold;
    }

    /**
     * set 统计阈值
     *
     * @param statThreshold
     */
    public void setStatThreshold(Long statThreshold) {
        this.statThreshold = statThreshold;
    }

    /**
     * get 告警次数限制
     *
     * @return
     */
    public Integer getAlarmTimesLimit() {
        return alarmTimesLimit;
    }

    /**
     * set 告警次数限制
     *
     * @param alarmTimesLimit
     */
    public void setAlarmTimesLimit(Integer alarmTimesLimit) {
        this.alarmTimesLimit = alarmTimesLimit;
    }

    /**
     * get 发送短信开关
     *
     * @return
     */
    public Boolean getSmsEnable() {
        return smsEnable;
    }

    /**
     * set 发送短信开关
     *
     * @param smsEnable
     */
    public void setSmsEnable(Boolean smsEnable) {
        this.smsEnable = smsEnable;
    }

    /**
     * get 发送邮件开关
     *
     * @return
     */
    public Boolean getEmailEnable() {
        return emailEnable;
    }

    /**
     * set 发送邮件开关
     *
     * @param emailEnable
     */
    public void setEmailEnable(Boolean emailEnable) {
        this.emailEnable = emailEnable;
    }

    /**
     * get 发送站内信开关
     *
     * @return
     */
    public Boolean getWebMsEnable() {
        return webMsEnable;
    }

    /**
     * set 发送站内信开关
     *
     * @param webMsEnable
     */
    public void setWebMsEnable(Boolean webMsEnable) {
        this.webMsEnable = webMsEnable;
    }

    /**
     * get 规则开关
     *
     * @return
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * set 规则开关
     *
     * @param enable
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * get 告警联系人
     *
     * @return
     */
    public List<Long> getContactUsers() {
        return contactUsers;
    }

    /**
     * set 告警联系人
     *
     * @param contactUsers
     */
    public void setContactUsers(List<Long> contactUsers) {
        this.contactUsers = contactUsers;
    }

    /**
     * get 告警联系组
     *
     * @return
     */
    public List<Long> getContactGroups() {
        return contactGroups;
    }

    /**
     * set 告警联系组
     *
     * @param contactGroups
     */
    public void setContactGroups(List<Long> contactGroups) {
        this.contactGroups = contactGroups;
    }


    /**
     * set 告警规则ID
     *
     * @param id
     */
    public DescribeGlobalAlarmRes id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 告警类型 WEB_ATTACK-&gt;网站攻击 CC_ATTACK-&gt;CC攻击 DDOS_ATTACK-&gt;DDOS攻击 STATUS_CODE_ERROR-&gt;状态码错误
     *
     * @param alarmType
     */
    public DescribeGlobalAlarmRes alarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * set 统计周期
     *
     * @param statCycle
     */
    public DescribeGlobalAlarmRes statCycle(Integer statCycle) {
        this.statCycle = statCycle;
        return this;
    }

    /**
     * set 统计周期单位
     *
     * @param statCycleUnit
     */
    public DescribeGlobalAlarmRes statCycleUnit(String statCycleUnit) {
        this.statCycleUnit = statCycleUnit;
        return this;
    }

    /**
     * set 统计阈值
     *
     * @param statThreshold
     */
    public DescribeGlobalAlarmRes statThreshold(Long statThreshold) {
        this.statThreshold = statThreshold;
        return this;
    }

    /**
     * set 告警次数限制
     *
     * @param alarmTimesLimit
     */
    public DescribeGlobalAlarmRes alarmTimesLimit(Integer alarmTimesLimit) {
        this.alarmTimesLimit = alarmTimesLimit;
        return this;
    }

    /**
     * set 发送短信开关
     *
     * @param smsEnable
     */
    public DescribeGlobalAlarmRes smsEnable(Boolean smsEnable) {
        this.smsEnable = smsEnable;
        return this;
    }

    /**
     * set 发送邮件开关
     *
     * @param emailEnable
     */
    public DescribeGlobalAlarmRes emailEnable(Boolean emailEnable) {
        this.emailEnable = emailEnable;
        return this;
    }

    /**
     * set 发送站内信开关
     *
     * @param webMsEnable
     */
    public DescribeGlobalAlarmRes webMsEnable(Boolean webMsEnable) {
        this.webMsEnable = webMsEnable;
        return this;
    }

    /**
     * set 规则开关
     *
     * @param enable
     */
    public DescribeGlobalAlarmRes enable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * set 告警联系人
     *
     * @param contactUsers
     */
    public DescribeGlobalAlarmRes contactUsers(List<Long> contactUsers) {
        this.contactUsers = contactUsers;
        return this;
    }

    /**
     * set 告警联系组
     *
     * @param contactGroups
     */
    public DescribeGlobalAlarmRes contactGroups(List<Long> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }


    /**
     * add item to 告警联系人
     *
     * @param contactUser
     */
    public void addContactUser(Long contactUser) {
        if (this.contactUsers == null) {
            this.contactUsers = new ArrayList<>();
        }
        this.contactUsers.add(contactUser);
    }

    /**
     * add item to 告警联系组
     *
     * @param contactGroup
     */
    public void addContactGroup(Long contactGroup) {
        if (this.contactGroups == null) {
            this.contactGroups = new ArrayList<>();
        }
        this.contactGroups.add(contactGroup);
    }

}