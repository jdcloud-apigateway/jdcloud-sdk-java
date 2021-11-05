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
 * 私有域名统计
 * 私有域名统计API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.privatezone.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 统计zone的流量

 */
public class ZoneFlowCountResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * time
     */
    private List<Long> time;

    /**
     * 数据序列的单位
     */
    private String unit;

    /**
     * traffic
     */
    private List<Double> traffic;


    /**
     * get time
     *
     * @return
     */
    public List<Long> getTime() {
        return time;
    }

    /**
     * set time
     *
     * @param time
     */
    public void setTime(List<Long> time) {
        this.time = time;
    }

    /**
     * get 数据序列的单位
     *
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * set 数据序列的单位
     *
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * get traffic
     *
     * @return
     */
    public List<Double> getTraffic() {
        return traffic;
    }

    /**
     * set traffic
     *
     * @param traffic
     */
    public void setTraffic(List<Double> traffic) {
        this.traffic = traffic;
    }


    /**
     * set time
     *
     * @param time
     */
    public ZoneFlowCountResult time(List<Long> time) {
        this.time = time;
        return this;
    }

    /**
     * set 数据序列的单位
     *
     * @param unit
     */
    public ZoneFlowCountResult unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * set traffic
     *
     * @param traffic
     */
    public ZoneFlowCountResult traffic(List<Double> traffic) {
        this.traffic = traffic;
        return this;
    }


    /**
     * add item to time
     *
     * @param time
     */
    public void addTime(Long time) {
        if (this.time == null) {
            this.time = new ArrayList<>();
        }
        this.time.add(time);
    }

    /**
     * add item to traffic
     *
     * @param traffic
     */
    public void addTraffic(Double traffic) {
        if (this.traffic == null) {
            this.traffic = new ArrayList<>();
        }
        this.traffic.add(traffic);
    }

}