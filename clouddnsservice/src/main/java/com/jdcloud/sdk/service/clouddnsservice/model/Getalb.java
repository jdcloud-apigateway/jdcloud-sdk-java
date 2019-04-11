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

package com.jdcloud.sdk.service.clouddnsservice.model;

import java.util.List;
import java.util.ArrayList;

/**
 * getalb
 */
public class Getalb  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 负载均衡的解析记录的列表中解析记录是否是相同的权重 
true: 均等负载 
false: 按权重分配负载

     */
    private Boolean balance;

    /**
     * 主机记录
     */
    private String record;

    /**
     * 解析的类型
     */
    private String type;

    /**
     * 解析线路的名称
     */
    private String viewName;

    /**
     * 解析线路的ID
     */
    private Integer viewValue;

    /**
     * 负载均衡的解析记录的列表
     */
    private List<HostRRlb> items;


    /**
     * get 负载均衡的解析记录的列表中解析记录是否是相同的权重 
true: 均等负载 
false: 按权重分配负载

     *
     * @return
     */
    public Boolean getBalance() {
        return balance;
    }

    /**
     * set 负载均衡的解析记录的列表中解析记录是否是相同的权重 
true: 均等负载 
false: 按权重分配负载

     *
     * @param balance
     */
    public void setBalance(Boolean balance) {
        this.balance = balance;
    }

    /**
     * get 主机记录
     *
     * @return
     */
    public String getRecord() {
        return record;
    }

    /**
     * set 主机记录
     *
     * @param record
     */
    public void setRecord(String record) {
        this.record = record;
    }

    /**
     * get 解析的类型
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 解析的类型
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get 解析线路的名称
     *
     * @return
     */
    public String getViewName() {
        return viewName;
    }

    /**
     * set 解析线路的名称
     *
     * @param viewName
     */
    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    /**
     * get 解析线路的ID
     *
     * @return
     */
    public Integer getViewValue() {
        return viewValue;
    }

    /**
     * set 解析线路的ID
     *
     * @param viewValue
     */
    public void setViewValue(Integer viewValue) {
        this.viewValue = viewValue;
    }

    /**
     * get 负载均衡的解析记录的列表
     *
     * @return
     */
    public List<HostRRlb> getItems() {
        return items;
    }

    /**
     * set 负载均衡的解析记录的列表
     *
     * @param items
     */
    public void setItems(List<HostRRlb> items) {
        this.items = items;
    }


    /**
     * set 负载均衡的解析记录的列表中解析记录是否是相同的权重 
true: 均等负载 
false: 按权重分配负载

     *
     * @param balance
     */
    public Getalb balance(Boolean balance) {
        this.balance = balance;
        return this;
    }

    /**
     * set 主机记录
     *
     * @param record
     */
    public Getalb record(String record) {
        this.record = record;
        return this;
    }

    /**
     * set 解析的类型
     *
     * @param type
     */
    public Getalb type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set 解析线路的名称
     *
     * @param viewName
     */
    public Getalb viewName(String viewName) {
        this.viewName = viewName;
        return this;
    }

    /**
     * set 解析线路的ID
     *
     * @param viewValue
     */
    public Getalb viewValue(Integer viewValue) {
        this.viewValue = viewValue;
        return this;
    }

    /**
     * set 负载均衡的解析记录的列表
     *
     * @param items
     */
    public Getalb items(List<HostRRlb> items) {
        this.items = items;
        return this;
    }


    /**
     * add item to 负载均衡的解析记录的列表
     *
     * @param item
     */
    public void addItem(HostRRlb item) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(item);
    }

}