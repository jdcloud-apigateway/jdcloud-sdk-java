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
 * 集群管理
 * JMR集群管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.jmr.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.jmr.model.MonitorLabelDetail;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询JMR的监控模板信息
 */
public class MonitorLabelListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private List<MonitorLabelDetail> data;

    /**
     * status
     */
    private Boolean status;


    /**
     * get data
     *
     * @return
     */
    public List<MonitorLabelDetail> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<MonitorLabelDetail> data) {
        this.data = data;
    }

    /**
     * get status
     *
     * @return
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * set status
     *
     * @param status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }


    /**
     * set data
     *
     * @param data
     */
    public MonitorLabelListResult data(List<MonitorLabelDetail> data) {
        this.data = data;
        return this;
    }

    /**
     * set status
     *
     * @param status
     */
    public MonitorLabelListResult status(Boolean status) {
        this.status = status;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(MonitorLabelDetail data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}