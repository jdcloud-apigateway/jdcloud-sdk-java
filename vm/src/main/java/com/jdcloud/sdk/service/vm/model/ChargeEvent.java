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

package com.jdcloud.sdk.service.vm.model;


/**
 * chargeEvent
 */
public class ChargeEvent  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开机时间，格式 2020-03-19 00:24:02
     */
    private String startTime;

    /**
     * 关机时间，格式 2020-03-19 00:24:02
     */
    private String stopTime;


    /**
     * get 开机时间，格式 2020-03-19 00:24:02
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开机时间，格式 2020-03-19 00:24:02
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 关机时间，格式 2020-03-19 00:24:02
     *
     * @return
     */
    public String getStopTime() {
        return stopTime;
    }

    /**
     * set 关机时间，格式 2020-03-19 00:24:02
     *
     * @param stopTime
     */
    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }


    /**
     * set 开机时间，格式 2020-03-19 00:24:02
     *
     * @param startTime
     */
    public ChargeEvent startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 关机时间，格式 2020-03-19 00:24:02
     *
     * @param stopTime
     */
    public ChargeEvent stopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }


}