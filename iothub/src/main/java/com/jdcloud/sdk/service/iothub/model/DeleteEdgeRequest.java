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
 * EdgeManager
 * edge管理模块
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iothub.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 边缘计算设备删除接口
 */
public class DeleteEdgeRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 边缘计算节点编号
     * Required:true
     */
    @Required
    private String edgeId;


    /**
     * get 边缘计算节点编号
     *
     * @return
     */
    public String getEdgeId() {
        return edgeId;
    }

    /**
     * set 边缘计算节点编号
     *
     * @param edgeId
     */
    public void setEdgeId(String edgeId) {
        this.edgeId = edgeId;
    }


    /**
     * set 边缘计算节点编号
     *
     * @param edgeId
     */
    public DeleteEdgeRequest edgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }


}