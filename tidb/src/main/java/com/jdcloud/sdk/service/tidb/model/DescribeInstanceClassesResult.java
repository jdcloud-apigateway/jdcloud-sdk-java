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
 * Instance-Management
 * 实例管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import com.jdcloud.sdk.service.tidb.model.NodeFlavor;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 规格获取接口
 */
public class DescribeInstanceClassesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * tidbFlavors
     */
    private NodeFlavor tidbFlavors;

    /**
     * tikvFlavors
     */
    private NodeFlavor tikvFlavors;

    /**
     * pdFlavors
     */
    private NodeFlavor pdFlavors;

    /**
     * monitorFlavors
     */
    private NodeFlavor monitorFlavors;

    /**
     * tiflashFlavors
     */
    private NodeFlavor tiflashFlavors;

    /**
     * ticdcFlavors
     */
    private NodeFlavor ticdcFlavors;


    /**
     * get tidbFlavors
     *
     * @return
     */
    public NodeFlavor getTidbFlavors() {
        return tidbFlavors;
    }

    /**
     * set tidbFlavors
     *
     * @param tidbFlavors
     */
    public void setTidbFlavors(NodeFlavor tidbFlavors) {
        this.tidbFlavors = tidbFlavors;
    }

    /**
     * get tikvFlavors
     *
     * @return
     */
    public NodeFlavor getTikvFlavors() {
        return tikvFlavors;
    }

    /**
     * set tikvFlavors
     *
     * @param tikvFlavors
     */
    public void setTikvFlavors(NodeFlavor tikvFlavors) {
        this.tikvFlavors = tikvFlavors;
    }

    /**
     * get pdFlavors
     *
     * @return
     */
    public NodeFlavor getPdFlavors() {
        return pdFlavors;
    }

    /**
     * set pdFlavors
     *
     * @param pdFlavors
     */
    public void setPdFlavors(NodeFlavor pdFlavors) {
        this.pdFlavors = pdFlavors;
    }

    /**
     * get monitorFlavors
     *
     * @return
     */
    public NodeFlavor getMonitorFlavors() {
        return monitorFlavors;
    }

    /**
     * set monitorFlavors
     *
     * @param monitorFlavors
     */
    public void setMonitorFlavors(NodeFlavor monitorFlavors) {
        this.monitorFlavors = monitorFlavors;
    }

    /**
     * get tiflashFlavors
     *
     * @return
     */
    public NodeFlavor getTiflashFlavors() {
        return tiflashFlavors;
    }

    /**
     * set tiflashFlavors
     *
     * @param tiflashFlavors
     */
    public void setTiflashFlavors(NodeFlavor tiflashFlavors) {
        this.tiflashFlavors = tiflashFlavors;
    }

    /**
     * get ticdcFlavors
     *
     * @return
     */
    public NodeFlavor getTicdcFlavors() {
        return ticdcFlavors;
    }

    /**
     * set ticdcFlavors
     *
     * @param ticdcFlavors
     */
    public void setTicdcFlavors(NodeFlavor ticdcFlavors) {
        this.ticdcFlavors = ticdcFlavors;
    }


    /**
     * set tidbFlavors
     *
     * @param tidbFlavors
     */
    public DescribeInstanceClassesResult tidbFlavors(NodeFlavor tidbFlavors) {
        this.tidbFlavors = tidbFlavors;
        return this;
    }

    /**
     * set tikvFlavors
     *
     * @param tikvFlavors
     */
    public DescribeInstanceClassesResult tikvFlavors(NodeFlavor tikvFlavors) {
        this.tikvFlavors = tikvFlavors;
        return this;
    }

    /**
     * set pdFlavors
     *
     * @param pdFlavors
     */
    public DescribeInstanceClassesResult pdFlavors(NodeFlavor pdFlavors) {
        this.pdFlavors = pdFlavors;
        return this;
    }

    /**
     * set monitorFlavors
     *
     * @param monitorFlavors
     */
    public DescribeInstanceClassesResult monitorFlavors(NodeFlavor monitorFlavors) {
        this.monitorFlavors = monitorFlavors;
        return this;
    }

    /**
     * set tiflashFlavors
     *
     * @param tiflashFlavors
     */
    public DescribeInstanceClassesResult tiflashFlavors(NodeFlavor tiflashFlavors) {
        this.tiflashFlavors = tiflashFlavors;
        return this;
    }

    /**
     * set ticdcFlavors
     *
     * @param ticdcFlavors
     */
    public DescribeInstanceClassesResult ticdcFlavors(NodeFlavor ticdcFlavors) {
        this.ticdcFlavors = ticdcFlavors;
        return this;
    }


}