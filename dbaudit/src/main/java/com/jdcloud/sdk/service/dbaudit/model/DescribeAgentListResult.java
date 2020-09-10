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
 * Agent Interface
 * Agent Interface
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbaudit.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dbaudit.model.AgentInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取数据库审计agent主机列表
 */
public class DescribeAgentListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * totalCount
     */
    private Integer totalCount;

    /**
     * list
     */
    private List<AgentInfo> list;


    /**
     * get totalCount
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set totalCount
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get list
     *
     * @return
     */
    public List<AgentInfo> getList() {
        return list;
    }

    /**
     * set list
     *
     * @param list
     */
    public void setList(List<AgentInfo> list) {
        this.list = list;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeAgentListResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set list
     *
     * @param list
     */
    public DescribeAgentListResult list(List<AgentInfo> list) {
        this.list = list;
        return this;
    }


    /**
     * add item to list
     *
     * @param list
     */
    public void addList(AgentInfo list) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(list);
    }

}