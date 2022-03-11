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
 * Slow-Log
 * 慢日志相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.smartdba.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.smartdba.model.SlowDigestLog;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取当前实例指定时间的慢SQL统计
 */
public class DescribeSlowDigestLogResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * data
     */
    private List<SlowDigestLog> data;

    /**
     * 总数
     */
    private Integer totalCount;


    /**
     * get data
     *
     * @return
     */
    public List<SlowDigestLog> getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(List<SlowDigestLog> data) {
        this.data = data;
    }

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
     * set data
     *
     * @param data
     */
    public DescribeSlowDigestLogResult data(List<SlowDigestLog> data) {
        this.data = data;
        return this;
    }

    /**
     * set 总数
     *
     * @param totalCount
     */
    public DescribeSlowDigestLogResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to data
     *
     * @param data
     */
    public void addData(SlowDigestLog data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }

}