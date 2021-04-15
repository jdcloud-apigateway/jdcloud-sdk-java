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

package com.jdcloud.sdk.service.monitor.model;


/**
 * alarmUsage
 */
public class AlarmUsage  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规则类型：resourceMonitor资源监控；customMetric自定义监控；oneclickAlarm一键报警
     */
    private String alarmType;

    /**
     * 总个数
     */
    private Long allCount;

    /**
     * 启用个数
     */
    private Long enableCount;


    /**
     * get 规则类型：resourceMonitor资源监控；customMetric自定义监控；oneclickAlarm一键报警
     *
     * @return
     */
    public String getAlarmType() {
        return alarmType;
    }

    /**
     * set 规则类型：resourceMonitor资源监控；customMetric自定义监控；oneclickAlarm一键报警
     *
     * @param alarmType
     */
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    /**
     * get 总个数
     *
     * @return
     */
    public Long getAllCount() {
        return allCount;
    }

    /**
     * set 总个数
     *
     * @param allCount
     */
    public void setAllCount(Long allCount) {
        this.allCount = allCount;
    }

    /**
     * get 启用个数
     *
     * @return
     */
    public Long getEnableCount() {
        return enableCount;
    }

    /**
     * set 启用个数
     *
     * @param enableCount
     */
    public void setEnableCount(Long enableCount) {
        this.enableCount = enableCount;
    }


    /**
     * set 规则类型：resourceMonitor资源监控；customMetric自定义监控；oneclickAlarm一键报警
     *
     * @param alarmType
     */
    public AlarmUsage alarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    /**
     * set 总个数
     *
     * @param allCount
     */
    public AlarmUsage allCount(Long allCount) {
        this.allCount = allCount;
        return this;
    }

    /**
     * set 启用个数
     *
     * @param enableCount
     */
    public AlarmUsage enableCount(Long enableCount) {
        this.enableCount = enableCount;
        return this;
    }


}