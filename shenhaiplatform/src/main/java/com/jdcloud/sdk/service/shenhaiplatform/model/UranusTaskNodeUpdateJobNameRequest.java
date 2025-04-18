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
 * ShenHaiPlatform Admin Manage APIs
 * 流程画布目录树管理
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.shenhaiplatform.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.shenhaiplatform.model.UranusTaskNodeSaveReq;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 任务单节点-更新作业名称
 */
public class UranusTaskNodeUpdateJobNameRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 节点名称
     * Required:true
     */
    @Required
    private String taskName;

    /**
     * 子节点code List
     */
    
    private List<String> childrenCode;
    /**
     * 父节点code List
     */
    
    private List<String> parentCode;
    /**
     * 节点描述
     */
    private String taskDesc;

    /**
     * 任务类型
     * Required:true
     */
    @Required
    private Integer taskNodeId;

    /**
     * 节点CODE
     * Required:true
     */
    @Required
    private String taskCode;

    /**
     * 负责人
     * Required:true
     */
    @Required
    private String manager;

    /**
     * 节点数据 以下前端需要用到的数据
     */
    private String taskData;

    /**
     * 节点名称 以下前端需要用到的数据
     */
    private String nodeName;

    /**
     * 节点类型
     */
    private String nodeTypeName;

    /**
     * 节点图标 以下前端需要用到的数据
     */
    private String nodeIcon;

    /**
     * 工作流Code
     * Required:true
     */
    @Required
    private String flowCode;

    /**
     * 脚本文件的业务Code
     */
    private String fileCode;

    /**
     * 作业名称
     */
    private String jobName;

    /**
     * 是否工作流任务
     */
    private Integer isUranus;

    /**
     * 是否当前工作流任务
     */
    private Integer isCurrentFlow;

    /**
     * 给前端用到的
     */
    
    private List<UranusTaskNodeSaveReq> parent;
    /**
     * 是否有子任务依赖前端用到
     */
    private Integer haveChildren;

    /**
     * 协作人
     */
    private String cooperator;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 应用名称
     * Required:true
     */
    @Required
    private String appName;



    /**
     * get 节点名称
     *
     * @return
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * set 节点名称
     *
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }


    /**
    * get 子节点code List
    *
    * @return
    */
    public List<String> getChildrenCode() {
        return childrenCode;
    }

    /**
    * set 子节点code List
    *
    * @param childrenCode
    */
    public void setChildrenCode(List<String> childrenCode) {
        this.childrenCode = childrenCode;
    }


    /**
    * get 父节点code List
    *
    * @return
    */
    public List<String> getParentCode() {
        return parentCode;
    }

    /**
    * set 父节点code List
    *
    * @param parentCode
    */
    public void setParentCode(List<String> parentCode) {
        this.parentCode = parentCode;
    }


    /**
     * get 节点描述
     *
     * @return
     */
    public String getTaskDesc() {
        return taskDesc;
    }

    /**
     * set 节点描述
     *
     * @param taskDesc
     */
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }


    /**
     * get 任务类型
     *
     * @return
     */
    public Integer getTaskNodeId() {
        return taskNodeId;
    }

    /**
     * set 任务类型
     *
     * @param taskNodeId
     */
    public void setTaskNodeId(Integer taskNodeId) {
        this.taskNodeId = taskNodeId;
    }


    /**
     * get 节点CODE
     *
     * @return
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * set 节点CODE
     *
     * @param taskCode
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }


    /**
     * get 负责人
     *
     * @return
     */
    public String getManager() {
        return manager;
    }

    /**
     * set 负责人
     *
     * @param manager
     */
    public void setManager(String manager) {
        this.manager = manager;
    }


    /**
     * get 节点数据 以下前端需要用到的数据
     *
     * @return
     */
    public String getTaskData() {
        return taskData;
    }

    /**
     * set 节点数据 以下前端需要用到的数据
     *
     * @param taskData
     */
    public void setTaskData(String taskData) {
        this.taskData = taskData;
    }


    /**
     * get 节点名称 以下前端需要用到的数据
     *
     * @return
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * set 节点名称 以下前端需要用到的数据
     *
     * @param nodeName
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }


    /**
     * get 节点类型
     *
     * @return
     */
    public String getNodeTypeName() {
        return nodeTypeName;
    }

    /**
     * set 节点类型
     *
     * @param nodeTypeName
     */
    public void setNodeTypeName(String nodeTypeName) {
        this.nodeTypeName = nodeTypeName;
    }


    /**
     * get 节点图标 以下前端需要用到的数据
     *
     * @return
     */
    public String getNodeIcon() {
        return nodeIcon;
    }

    /**
     * set 节点图标 以下前端需要用到的数据
     *
     * @param nodeIcon
     */
    public void setNodeIcon(String nodeIcon) {
        this.nodeIcon = nodeIcon;
    }


    /**
     * get 工作流Code
     *
     * @return
     */
    public String getFlowCode() {
        return flowCode;
    }

    /**
     * set 工作流Code
     *
     * @param flowCode
     */
    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode;
    }


    /**
     * get 脚本文件的业务Code
     *
     * @return
     */
    public String getFileCode() {
        return fileCode;
    }

    /**
     * set 脚本文件的业务Code
     *
     * @param fileCode
     */
    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }


    /**
     * get 作业名称
     *
     * @return
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set 作业名称
     *
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }


    /**
     * get 是否工作流任务
     *
     * @return
     */
    public Integer getIsUranus() {
        return isUranus;
    }

    /**
     * set 是否工作流任务
     *
     * @param isUranus
     */
    public void setIsUranus(Integer isUranus) {
        this.isUranus = isUranus;
    }


    /**
     * get 是否当前工作流任务
     *
     * @return
     */
    public Integer getIsCurrentFlow() {
        return isCurrentFlow;
    }

    /**
     * set 是否当前工作流任务
     *
     * @param isCurrentFlow
     */
    public void setIsCurrentFlow(Integer isCurrentFlow) {
        this.isCurrentFlow = isCurrentFlow;
    }


    /**
    * get 给前端用到的
    *
    * @return
    */
    public List<UranusTaskNodeSaveReq> getParent() {
        return parent;
    }

    /**
    * set 给前端用到的
    *
    * @param parent
    */
    public void setParent(List<UranusTaskNodeSaveReq> parent) {
        this.parent = parent;
    }


    /**
     * get 是否有子任务依赖前端用到
     *
     * @return
     */
    public Integer getHaveChildren() {
        return haveChildren;
    }

    /**
     * set 是否有子任务依赖前端用到
     *
     * @param haveChildren
     */
    public void setHaveChildren(Integer haveChildren) {
        this.haveChildren = haveChildren;
    }


    /**
     * get 协作人
     *
     * @return
     */
    public String getCooperator() {
        return cooperator;
    }

    /**
     * set 协作人
     *
     * @param cooperator
     */
    public void setCooperator(String cooperator) {
        this.cooperator = cooperator;
    }


    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }


    /**
     * get 应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }



    /**
     * set 节点名称
     *
     * @param taskName
     */
    public UranusTaskNodeUpdateJobNameRequest taskName(String taskName) {
        this.taskName = taskName;
        return this;
    }


    /**
    * set 子节点code List
    *
    * @param childrenCode
    */
    public UranusTaskNodeUpdateJobNameRequest childrenCode(List<String> childrenCode) {
        this.childrenCode = childrenCode;
        return this;
    }


    /**
    * set 父节点code List
    *
    * @param parentCode
    */
    public UranusTaskNodeUpdateJobNameRequest parentCode(List<String> parentCode) {
        this.parentCode = parentCode;
        return this;
    }


    /**
     * set 节点描述
     *
     * @param taskDesc
     */
    public UranusTaskNodeUpdateJobNameRequest taskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }


    /**
     * set 任务类型
     *
     * @param taskNodeId
     */
    public UranusTaskNodeUpdateJobNameRequest taskNodeId(Integer taskNodeId) {
        this.taskNodeId = taskNodeId;
        return this;
    }


    /**
     * set 节点CODE
     *
     * @param taskCode
     */
    public UranusTaskNodeUpdateJobNameRequest taskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }


    /**
     * set 负责人
     *
     * @param manager
     */
    public UranusTaskNodeUpdateJobNameRequest manager(String manager) {
        this.manager = manager;
        return this;
    }


    /**
     * set 节点数据 以下前端需要用到的数据
     *
     * @param taskData
     */
    public UranusTaskNodeUpdateJobNameRequest taskData(String taskData) {
        this.taskData = taskData;
        return this;
    }


    /**
     * set 节点名称 以下前端需要用到的数据
     *
     * @param nodeName
     */
    public UranusTaskNodeUpdateJobNameRequest nodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }


    /**
     * set 节点类型
     *
     * @param nodeTypeName
     */
    public UranusTaskNodeUpdateJobNameRequest nodeTypeName(String nodeTypeName) {
        this.nodeTypeName = nodeTypeName;
        return this;
    }


    /**
     * set 节点图标 以下前端需要用到的数据
     *
     * @param nodeIcon
     */
    public UranusTaskNodeUpdateJobNameRequest nodeIcon(String nodeIcon) {
        this.nodeIcon = nodeIcon;
        return this;
    }


    /**
     * set 工作流Code
     *
     * @param flowCode
     */
    public UranusTaskNodeUpdateJobNameRequest flowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }


    /**
     * set 脚本文件的业务Code
     *
     * @param fileCode
     */
    public UranusTaskNodeUpdateJobNameRequest fileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }


    /**
     * set 作业名称
     *
     * @param jobName
     */
    public UranusTaskNodeUpdateJobNameRequest jobName(String jobName) {
        this.jobName = jobName;
        return this;
    }


    /**
     * set 是否工作流任务
     *
     * @param isUranus
     */
    public UranusTaskNodeUpdateJobNameRequest isUranus(Integer isUranus) {
        this.isUranus = isUranus;
        return this;
    }


    /**
     * set 是否当前工作流任务
     *
     * @param isCurrentFlow
     */
    public UranusTaskNodeUpdateJobNameRequest isCurrentFlow(Integer isCurrentFlow) {
        this.isCurrentFlow = isCurrentFlow;
        return this;
    }


    /**
    * set 给前端用到的
    *
    * @param parent
    */
    public UranusTaskNodeUpdateJobNameRequest parent(List<UranusTaskNodeSaveReq> parent) {
        this.parent = parent;
        return this;
    }


    /**
     * set 是否有子任务依赖前端用到
     *
     * @param haveChildren
     */
    public UranusTaskNodeUpdateJobNameRequest haveChildren(Integer haveChildren) {
        this.haveChildren = haveChildren;
        return this;
    }


    /**
     * set 协作人
     *
     * @param cooperator
     */
    public UranusTaskNodeUpdateJobNameRequest cooperator(String cooperator) {
        this.cooperator = cooperator;
        return this;
    }


    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UranusTaskNodeUpdateJobNameRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


    /**
     * set 应用名称
     *
     * @param appName
     */
    public UranusTaskNodeUpdateJobNameRequest appName(String appName) {
        this.appName = appName;
        return this;
    }



    /**
     * add item to 子节点code List
     *
     * @param childrenCode
     */
    public void addChildrenCode(String childrenCode) {
        if (this.childrenCode == null) {
            this.childrenCode = new ArrayList<>();
        }
        this.childrenCode.add(childrenCode);
    }

    /**
     * add item to 父节点code List
     *
     * @param parentCode
     */
    public void addParentCode(String parentCode) {
        if (this.parentCode == null) {
            this.parentCode = new ArrayList<>();
        }
        this.parentCode.add(parentCode);
    }

    /**
     * add item to 给前端用到的
     *
     * @param parent
     */
    public void addParent(UranusTaskNodeSaveReq parent) {
        if (this.parent == null) {
            this.parent = new ArrayList<>();
        }
        this.parent.add(parent);
    }
}