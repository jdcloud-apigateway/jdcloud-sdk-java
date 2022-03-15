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
 * Metrics
 * 实时性能、性能够趋相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.smartdba.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.smartdba.model.DataPoint;
import com.jdcloud.sdk.service.smartdba.model.Metric;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询监控值
 */
public class DescribeMetricValueByGidResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * itemData
     */
    private List<DataPoint> itemData;

    /**
     * metric元信息
     */
    private Metric metricInfo;


    /**
     * get itemData
     *
     * @return
     */
    public List<DataPoint> getItemData() {
        return itemData;
    }

    /**
     * set itemData
     *
     * @param itemData
     */
    public void setItemData(List<DataPoint> itemData) {
        this.itemData = itemData;
    }

    /**
     * get metric元信息
     *
     * @return
     */
    public Metric getMetricInfo() {
        return metricInfo;
    }

    /**
     * set metric元信息
     *
     * @param metricInfo
     */
    public void setMetricInfo(Metric metricInfo) {
        this.metricInfo = metricInfo;
    }


    /**
     * set itemData
     *
     * @param itemData
     */
    public DescribeMetricValueByGidResult itemData(List<DataPoint> itemData) {
        this.itemData = itemData;
        return this;
    }

    /**
     * set metric元信息
     *
     * @param metricInfo
     */
    public DescribeMetricValueByGidResult metricInfo(Metric metricInfo) {
        this.metricInfo = metricInfo;
        return this;
    }


    /**
     * add item to itemData
     *
     * @param itemData
     */
    public void addItemData(DataPoint itemData) {
        if (this.itemData == null) {
            this.itemData = new ArrayList<>();
        }
        this.itemData.add(itemData);
    }

}