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
 * Instance-Operation
 * 实例接入、取消接入、实例列表等接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.smartdba.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.smartdba.model.InstancesInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取已接入mysql实例列表
 */
public class DescribeClusterListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总数
     */
    private Integer totalCount;

    /**
     * 连接正常数
     */
    private Integer checkOkCount;

    /**
     * 连接异常数
     */
    private Integer checkFailCount;

    /**
     * data
     */
    private List<InstancesInfo> data;


    /**
     * get 总数
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 连接正常数
     *
     * @return
     */
    public Integer getCheckOkCount() {
        return checkOkCount;
    }

    /**
     * set 连接正常数
     *
     * @param checkOkCount
     */
    public void setCheckOkCount(Integer checkOkCount) {
        this.checkOkCount = checkOkCount;
    }

    /**
     * get 连接异常数
     *
     * @return
     */
    public Integer getCheckFailCount() {
        return checkFailCount;
    }

    /**
     * set 连接异常数
     *
     * @param checkFailCount
     */
    public void setCheckFailCount(Integer checkFailCount) {
        this.checkFailCount = checkFailCount;
    }

    /**
     * get data
     *
     * @return
     */
    public List<InstancesInfo> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<InstancesInfo> data) {
        this.data = data;
    }


    /**
     * set 总数
     *
     * @param totalCount
     */
    public DescribeClusterListResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 连接正常数
     *
     * @param checkOkCount
     */
    public DescribeClusterListResult checkOkCount(Integer checkOkCount) {
        this.checkOkCount = checkOkCount;
        return this;
    }

    /**
     * set 连接异常数
     *
     * @param checkFailCount
     */
    public DescribeClusterListResult checkFailCount(Integer checkFailCount) {
        this.checkFailCount = checkFailCount;
        return this;
    }

    /**
     * set data
     *
     * @param data
     */
    public DescribeClusterListResult data(List<InstancesInfo> data) {
        this.data = data;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(InstancesInfo data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}