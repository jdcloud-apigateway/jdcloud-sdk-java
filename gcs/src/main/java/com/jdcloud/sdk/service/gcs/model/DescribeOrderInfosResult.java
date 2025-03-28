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
 * GPU-Computing-Service
 * GPU算力服务应用订单信息相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.gcs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.gcs.model.OrderInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 返回订单列表不分页
 */
public class DescribeOrderInfosResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * list
     */
    
    private List<OrderInfo> list;


    /**
    * get list
    *
    * @return
    */
    public List<OrderInfo> getList() {
        return list;
    }

    /**
    * set list
    *
    * @param list
    */
    public void setList(List<OrderInfo> list) {
        this.list = list;
    }



    /**
    * set list
    *
    * @param list
    */
    public DescribeOrderInfosResult list(List<OrderInfo> list) {
        this.list = list;
        return this;
    }



    /**
     * add item to list
     *
     * @param list
     */
    public void addList(OrderInfo list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }
}