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
 * Snapshot
 * 视频截图任务相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除视频截图任务。删除任务时，会同时删除任务相关的数据，如任务执行结果等
 */
public class DeleteSnapshotTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务ID，路径参数
     * Required:true
     */
    @Required
    private String taskId;


    /**
     * get 任务ID，路径参数
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 任务ID，路径参数
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    /**
     * set 任务ID，路径参数
     *
     * @param taskId
     */
    public DeleteSnapshotTaskRequest taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


}