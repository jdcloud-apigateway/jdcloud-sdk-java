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

package com.jdcloud.sdk.service.redis.model;

import java.util.List;
import java.util.ArrayList;

/**
 * 实例内部规格信息
 */
public class InstanceInternalSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例ID
     */
    private String instanceId;

    /**
     * 实例总内存（GB）
     */
    private Integer instanceMemoryGB;

    /**
     * 内部节点角色列表
     */
    private List<NodeRole> nodeRoles;


    /**
     * get 实例ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 实例总内存（GB）
     *
     * @return
     */
    public Integer getInstanceMemoryGB() {
        return instanceMemoryGB;
    }

    /**
     * set 实例总内存（GB）
     *
     * @param instanceMemoryGB
     */
    public void setInstanceMemoryGB(Integer instanceMemoryGB) {
        this.instanceMemoryGB = instanceMemoryGB;
    }

    /**
     * get 内部节点角色列表
     *
     * @return
     */
    public List<NodeRole> getNodeRoles() {
        return nodeRoles;
    }

    /**
     * set 内部节点角色列表
     *
     * @param nodeRoles
     */
    public void setNodeRoles(List<NodeRole> nodeRoles) {
        this.nodeRoles = nodeRoles;
    }


    /**
     * set 实例ID
     *
     * @param instanceId
     */
    public InstanceInternalSpec instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 实例总内存（GB）
     *
     * @param instanceMemoryGB
     */
    public InstanceInternalSpec instanceMemoryGB(Integer instanceMemoryGB) {
        this.instanceMemoryGB = instanceMemoryGB;
        return this;
    }

    /**
     * set 内部节点角色列表
     *
     * @param nodeRoles
     */
    public InstanceInternalSpec nodeRoles(List<NodeRole> nodeRoles) {
        this.nodeRoles = nodeRoles;
        return this;
    }


    /**
     * add item to 内部节点角色列表
     *
     * @param nodeRole
     */
    public void addNodeRole(NodeRole nodeRole) {
        if (this.nodeRoles == null) {
            this.nodeRoles = new ArrayList<>();
        }
        this.nodeRoles.add(nodeRole);
    }

}