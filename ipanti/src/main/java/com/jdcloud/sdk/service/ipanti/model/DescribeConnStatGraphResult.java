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
 * Anti DDoS Pro Flow APIs
 * Anti DDoS Pro Flow APIs
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ipanti.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 新建与并发连接数统计报表
 */
public class DescribeConnStatGraphResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * newConn
     */
    private List<Long> newConn;

    /**
     * activeConn
     */
    private List<Long> activeConn;

    /**
     * inactiveConn
     */
    private List<Long> inactiveConn;

    /**
     * time
     */
    private List<String> time;


    /**
     * get newConn
     *
     * @return
     */
    public List<Long> getNewConn() {
        return newConn;
    }

    /**
     * set newConn
     *
     * @param newConn
     */
    public void setNewConn(List<Long> newConn) {
        this.newConn = newConn;
    }

    /**
     * get activeConn
     *
     * @return
     */
    public List<Long> getActiveConn() {
        return activeConn;
    }

    /**
     * set activeConn
     *
     * @param activeConn
     */
    public void setActiveConn(List<Long> activeConn) {
        this.activeConn = activeConn;
    }

    /**
     * get inactiveConn
     *
     * @return
     */
    public List<Long> getInactiveConn() {
        return inactiveConn;
    }

    /**
     * set inactiveConn
     *
     * @param inactiveConn
     */
    public void setInactiveConn(List<Long> inactiveConn) {
        this.inactiveConn = inactiveConn;
    }

    /**
     * get time
     *
     * @return
     */
    public List<String> getTime() {
        return time;
    }

    /**
     * set time
     *
     * @param time
     */
    public void setTime(List<String> time) {
        this.time = time;
    }


    /**
     * set newConn
     *
     * @param newConn
     */
    public DescribeConnStatGraphResult newConn(List<Long> newConn) {
        this.newConn = newConn;
        return this;
    }

    /**
     * set activeConn
     *
     * @param activeConn
     */
    public DescribeConnStatGraphResult activeConn(List<Long> activeConn) {
        this.activeConn = activeConn;
        return this;
    }

    /**
     * set inactiveConn
     *
     * @param inactiveConn
     */
    public DescribeConnStatGraphResult inactiveConn(List<Long> inactiveConn) {
        this.inactiveConn = inactiveConn;
        return this;
    }

    /**
     * set time
     *
     * @param time
     */
    public DescribeConnStatGraphResult time(List<String> time) {
        this.time = time;
        return this;
    }


    /**
     * add item to newConn
     *
     * @param newConn
     */
    public void addNewConn(Long newConn) {
        if (this.newConn == null) {
            this.newConn = new ArrayList<>();
        }
        this.newConn.add(newConn);
    }

    /**
     * add item to activeConn
     *
     * @param activeConn
     */
    public void addActiveConn(Long activeConn) {
        if (this.activeConn == null) {
            this.activeConn = new ArrayList<>();
        }
        this.activeConn.add(activeConn);
    }

    /**
     * add item to inactiveConn
     *
     * @param inactiveConn
     */
    public void addInactiveConn(Long inactiveConn) {
        if (this.inactiveConn == null) {
            this.inactiveConn = new ArrayList<>();
        }
        this.inactiveConn.add(inactiveConn);
    }

    /**
     * add item to time
     *
     * @param time
     */
    public void addTime(String time) {
        if (this.time == null) {
            this.time = new ArrayList<>();
        }
        this.time.add(time);
    }

}