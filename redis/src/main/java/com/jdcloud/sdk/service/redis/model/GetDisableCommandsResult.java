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
 * Redis Instance API
 * 缓存Redis实例的创建、删除、修改基本信息、设置密码、变配、实例列表、备份、配置参数等接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.redis.model.DisableCommandsInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取禁用命令列表
 */
public class GetDisableCommandsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * disableCommandLists
     */
    private List<DisableCommandsInfo> disableCommandLists;


    /**
     * get disableCommandLists
     *
     * @return
     */
    public List<DisableCommandsInfo> getDisableCommandLists() {
        return disableCommandLists;
    }

    /**
     * set disableCommandLists
     *
     * @param disableCommandLists
     */
    public void setDisableCommandLists(List<DisableCommandsInfo> disableCommandLists) {
        this.disableCommandLists = disableCommandLists;
    }


    /**
     * set disableCommandLists
     *
     * @param disableCommandLists
     */
    public GetDisableCommandsResult disableCommandLists(List<DisableCommandsInfo> disableCommandLists) {
        this.disableCommandLists = disableCommandLists;
        return this;
    }


    /**
     * add item to disableCommandLists
     *
     * @param disableCommandList
     */
    public void addDisableCommandList(DisableCommandsInfo disableCommandList) {
        if (this.disableCommandLists == null) {
            this.disableCommandLists = new ArrayList<>();
        }
        this.disableCommandLists.add(disableCommandList);
    }

}