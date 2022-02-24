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
 * LoadBalancer
 * 负载均衡器相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.lb.model.ExportTask;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询负载均衡导出任务列表
 */
public class DescribeLoadBalancersExportTasksResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * exportTasks
     */
    private List<ExportTask> exportTasks;


    /**
     * get exportTasks
     *
     * @return
     */
    public List<ExportTask> getExportTasks() {
        return exportTasks;
    }

    /**
     * set exportTasks
     *
     * @param exportTasks
     */
    public void setExportTasks(List<ExportTask> exportTasks) {
        this.exportTasks = exportTasks;
    }


    /**
     * set exportTasks
     *
     * @param exportTasks
     */
    public DescribeLoadBalancersExportTasksResult exportTasks(List<ExportTask> exportTasks) {
        this.exportTasks = exportTasks;
        return this;
    }


    /**
     * add item to exportTasks
     *
     * @param exportTask
     */
    public void addExportTask(ExportTask exportTask) {
        if (this.exportTasks == null) {
            this.exportTasks = new ArrayList<>();
        }
        this.exportTasks.add(exportTask);
    }

}