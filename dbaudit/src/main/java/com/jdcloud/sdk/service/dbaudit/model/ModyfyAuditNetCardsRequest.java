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
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改网卡信息
 */
public class ModyfyAuditNetCardsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 网卡信息
     * Required:true
     */
    @Required
    private List<String> netCards;

    /**
     * 地域 Id
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 数据库ID
     * Required:true
     */
    @Required
    private String databaseId;

    /**
     * agentId
     * Required:true
     */
    @Required
    private String agentId;


    /**
     * get 网卡信息
     *
     * @return
     */
    public List<String> getNetCards() {
        return netCards;
    }

    /**
     * set 网卡信息
     *
     * @param netCards
     */
    public void setNetCards(List<String> netCards) {
        this.netCards = netCards;
    }

    /**
     * get 地域 Id
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 数据库ID
     *
     * @return
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * set 数据库ID
     *
     * @param databaseId
     */
    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * get agentId
     *
     * @return
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * set agentId
     *
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }


    /**
     * set 网卡信息
     *
     * @param netCards
     */
    public ModyfyAuditNetCardsRequest netCards(List<String> netCards) {
        this.netCards = netCards;
        return this;
    }

    /**
     * set 地域 Id
     *
     * @param regionId
     */
    public ModyfyAuditNetCardsRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 数据库ID
     *
     * @param databaseId
     */
    public ModyfyAuditNetCardsRequest databaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * set agentId
     *
     * @param agentId
     */
    public ModyfyAuditNetCardsRequest agentId(String agentId) {
        this.agentId = agentId;
        return this;
    }


    /**
     * add item to 网卡信息
     *
     * @param netCard
     */
    public void addNetCard(String netCard) {
        if (this.netCards == null) {
            this.netCards = new ArrayList<>();
        }
        this.netCards.add(netCard);
    }

}