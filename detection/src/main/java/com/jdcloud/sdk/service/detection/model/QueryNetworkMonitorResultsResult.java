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
 * Task related APIs
 * 云拔测-任务相关接口
 *
 * OpenAPI spec version: v3
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.detection.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.detection.model.Net;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询网络类型任务拨测结果
 */
public class QueryNetworkMonitorResultsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * success
     */
    private Boolean success;

    /**
     * message
     */
    private String message;

    /**
     * total
     */
    private Integer total;

    /**
     * data
     */
    
    private List<Net> data;


    /**
     * get success
     *
     * @return
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * set success
     *
     * @param success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }


    /**
     * get message
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * set message
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }


    /**
     * get total
     *
     * @return
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * set total
     *
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }


    /**
    * get data
    *
    * @return
    */
    public List<Net> getData() {
        return data;
    }

    /**
    * set data
    *
    * @param data
    */
    public void setData(List<Net> data) {
        this.data = data;
    }



    /**
     * set success
     *
     * @param success
     */
    public QueryNetworkMonitorResultsResult success(Boolean success) {
        this.success = success;
        return this;
    }


    /**
     * set message
     *
     * @param message
     */
    public QueryNetworkMonitorResultsResult message(String message) {
        this.message = message;
        return this;
    }


    /**
     * set total
     *
     * @param total
     */
    public QueryNetworkMonitorResultsResult total(Integer total) {
        this.total = total;
        return this;
    }


    /**
    * set data
    *
    * @param data
    */
    public QueryNetworkMonitorResultsResult data(List<Net> data) {
        this.data = data;
        return this;
    }



    /**
     * add item to data
     *
     * @param data
     */
    public void addData(Net data) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(data);
    }
}