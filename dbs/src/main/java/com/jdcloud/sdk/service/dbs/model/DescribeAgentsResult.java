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
 * 数据库备份服务
 * 数据库备份服务接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dbs.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dbs.model.Agent;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询已经注册的所有的 DBS agent
 */
public class DescribeAgentsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * totalCount
     */
    private Integer totalCount;

    /**
     * dbsAgents
     */
    private List<Agent> dbsAgents;


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
     * get dbsAgents
     *
     * @return
     */
    public List<Agent> getDbsAgents() {
        return dbsAgents;
    }

    /**
     * set dbsAgents
     *
     * @param dbsAgents
     */
    public void setDbsAgents(List<Agent> dbsAgents) {
        this.dbsAgents = dbsAgents;
    }


    /**
     * set totalCount
     *
     * @param totalCount
     */
    public DescribeAgentsResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set dbsAgents
     *
     * @param dbsAgents
     */
    public DescribeAgentsResult dbsAgents(List<Agent> dbsAgents) {
        this.dbsAgents = dbsAgents;
        return this;
    }


    /**
     * add item to dbsAgents
     *
     * @param dbsAgent
     */
    public void addDbsAgent(Agent dbsAgent) {
        if (this.dbsAgents == null) {
            this.dbsAgents = new ArrayList<>();
        }
        this.dbsAgents.add(dbsAgent);
    }

}