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

import java.util.List;
import java.util.ArrayList;

/**
 * 开放设备数据信息列表
 */
public class OpenDevicesData  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备编码
     */
    private String deviceCode;

    /**
     * 数据点集合
     */
    private List<Point> points;


    /**
     * get 设备编码
     *
     * @return
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * set 设备编码
     *
     * @param deviceCode
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * get 数据点集合
     *
     * @return
     */
    public List<Point> getPoints() {
        return points;
    }

    /**
     * set 数据点集合
     *
     * @param points
     */
    public void setPoints(List<Point> points) {
        this.points = points;
    }


    /**
     * set 设备编码
     *
     * @param deviceCode
     */
    public OpenDevicesData deviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }

    /**
     * set 数据点集合
     *
     * @param points
     */
    public OpenDevicesData points(List<Point> points) {
        this.points = points;
        return this;
    }


    /**
     * add item to 数据点集合
     *
     * @param point
     */
    public void addPoint(Point point) {
        if (this.points == null) {
            this.points = new ArrayList<>();
        }
        this.points.add(point);
    }

}