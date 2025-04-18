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

package com.jdcloud.sdk.service.shenhaiplatform.model;


/**
 * 发布变更状态
 */
public class UranusTaskNodeChangeRes  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 作业变更状态
     */
    private Integer taskChangeStatus;

    /**
     * 作业变更状态描述
     */
    private String taskChangeStatusDesc;



    /**
     * get 作业变更状态
     *
     * @return
     */
    public Integer getTaskChangeStatus() {
        return taskChangeStatus;
    }

    /**
     * set 作业变更状态
     *
     * @param taskChangeStatus
     */
    public void setTaskChangeStatus(Integer taskChangeStatus) {
        this.taskChangeStatus = taskChangeStatus;
    }


    /**
     * get 作业变更状态描述
     *
     * @return
     */
    public String getTaskChangeStatusDesc() {
        return taskChangeStatusDesc;
    }

    /**
     * set 作业变更状态描述
     *
     * @param taskChangeStatusDesc
     */
    public void setTaskChangeStatusDesc(String taskChangeStatusDesc) {
        this.taskChangeStatusDesc = taskChangeStatusDesc;
    }



    /**
     * set 作业变更状态
     *
     * @param taskChangeStatus
     */
    public UranusTaskNodeChangeRes taskChangeStatus(Integer taskChangeStatus) {
        this.taskChangeStatus = taskChangeStatus;
        return this;
    }


    /**
     * set 作业变更状态描述
     *
     * @param taskChangeStatusDesc
     */
    public UranusTaskNodeChangeRes taskChangeStatusDesc(String taskChangeStatusDesc) {
        this.taskChangeStatusDesc = taskChangeStatusDesc;
        return this;
    }


}