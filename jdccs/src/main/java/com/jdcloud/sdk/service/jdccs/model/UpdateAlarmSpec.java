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

package com.jdcloud.sdk.service.jdccs.model;


/**
 * 修改报警规则
 */
public class UpdateAlarmSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则名称
     */
    private String name;

    /**
     * 监控项，bandwidthTrafficIn:上行实时流量 bandwidthTrafficOut:下行实时流量
     */
    private String metric;

    /**
     * 统计周期（单位：分钟）
     */
    private Integer period;

    /**
     * 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     */
    private String statisticMethod;

    /**
     * 计算方式 &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;、！&#x3D;
     */
    private String operator;

    /**
     * 阈值
     */
    private Double threshold;

    /**
     * 连续多少次后报警
     */
    private Integer times;

    /**
     * 通知周期 单位：小时
     */
    private Integer noticePeriod;

    /**
     * 规则状态 disabled:禁用 enabled:启用
     */
    private String status;

    /**
     * 通知方式 all:全部 sms：短信 email:邮件
     */
    private String noticeMethod;

    /**
     * 通知对象用户ID,若多个用逗号分隔
     */
    private String userId;

    /**
     * 通知对象组ID
     */
    private String groupId;



    /**
     * get 规则名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 规则名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * get 监控项，bandwidthTrafficIn:上行实时流量 bandwidthTrafficOut:下行实时流量
     *
     * @return
     */
    public String getMetric() {
        return metric;
    }

    /**
     * set 监控项，bandwidthTrafficIn:上行实时流量 bandwidthTrafficOut:下行实时流量
     *
     * @param metric
     */
    public void setMetric(String metric) {
        this.metric = metric;
    }


    /**
     * get 统计周期（单位：分钟）
     *
     * @return
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * set 统计周期（单位：分钟）
     *
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }


    /**
     * get 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     *
     * @return
     */
    public String getStatisticMethod() {
        return statisticMethod;
    }

    /**
     * set 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     *
     * @param statisticMethod
     */
    public void setStatisticMethod(String statisticMethod) {
        this.statisticMethod = statisticMethod;
    }


    /**
     * get 计算方式 &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;、！&#x3D;
     *
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * set 计算方式 &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;、！&#x3D;
     *
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * get 阈值
     *
     * @return
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * set 阈值
     *
     * @param threshold
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }


    /**
     * get 连续多少次后报警
     *
     * @return
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * set 连续多少次后报警
     *
     * @param times
     */
    public void setTimes(Integer times) {
        this.times = times;
    }


    /**
     * get 通知周期 单位：小时
     *
     * @return
     */
    public Integer getNoticePeriod() {
        return noticePeriod;
    }

    /**
     * set 通知周期 单位：小时
     *
     * @param noticePeriod
     */
    public void setNoticePeriod(Integer noticePeriod) {
        this.noticePeriod = noticePeriod;
    }


    /**
     * get 规则状态 disabled:禁用 enabled:启用
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set 规则状态 disabled:禁用 enabled:启用
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    /**
     * get 通知方式 all:全部 sms：短信 email:邮件
     *
     * @return
     */
    public String getNoticeMethod() {
        return noticeMethod;
    }

    /**
     * set 通知方式 all:全部 sms：短信 email:邮件
     *
     * @param noticeMethod
     */
    public void setNoticeMethod(String noticeMethod) {
        this.noticeMethod = noticeMethod;
    }


    /**
     * get 通知对象用户ID,若多个用逗号分隔
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 通知对象用户ID,若多个用逗号分隔
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }


    /**
     * get 通知对象组ID
     *
     * @return
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * set 通知对象组ID
     *
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }



    /**
     * set 规则名称
     *
     * @param name
     */
    public UpdateAlarmSpec name(String name) {
        this.name = name;
        return this;
    }


    /**
     * set 监控项，bandwidthTrafficIn:上行实时流量 bandwidthTrafficOut:下行实时流量
     *
     * @param metric
     */
    public UpdateAlarmSpec metric(String metric) {
        this.metric = metric;
        return this;
    }


    /**
     * set 统计周期（单位：分钟）
     *
     * @param period
     */
    public UpdateAlarmSpec period(Integer period) {
        this.period = period;
        return this;
    }


    /**
     * set 统计方法：平均值&#x3D;avg、最大值&#x3D;max、最小值&#x3D;min
     *
     * @param statisticMethod
     */
    public UpdateAlarmSpec statisticMethod(String statisticMethod) {
        this.statisticMethod = statisticMethod;
        return this;
    }


    /**
     * set 计算方式 &gt;&#x3D;、&gt;、&lt;、&lt;&#x3D;、&#x3D;、！&#x3D;
     *
     * @param operator
     */
    public UpdateAlarmSpec operator(String operator) {
        this.operator = operator;
        return this;
    }


    /**
     * set 阈值
     *
     * @param threshold
     */
    public UpdateAlarmSpec threshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }


    /**
     * set 连续多少次后报警
     *
     * @param times
     */
    public UpdateAlarmSpec times(Integer times) {
        this.times = times;
        return this;
    }


    /**
     * set 通知周期 单位：小时
     *
     * @param noticePeriod
     */
    public UpdateAlarmSpec noticePeriod(Integer noticePeriod) {
        this.noticePeriod = noticePeriod;
        return this;
    }


    /**
     * set 规则状态 disabled:禁用 enabled:启用
     *
     * @param status
     */
    public UpdateAlarmSpec status(String status) {
        this.status = status;
        return this;
    }


    /**
     * set 通知方式 all:全部 sms：短信 email:邮件
     *
     * @param noticeMethod
     */
    public UpdateAlarmSpec noticeMethod(String noticeMethod) {
        this.noticeMethod = noticeMethod;
        return this;
    }


    /**
     * set 通知对象用户ID,若多个用逗号分隔
     *
     * @param userId
     */
    public UpdateAlarmSpec userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * set 通知对象组ID
     *
     * @param groupId
     */
    public UpdateAlarmSpec groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }


}