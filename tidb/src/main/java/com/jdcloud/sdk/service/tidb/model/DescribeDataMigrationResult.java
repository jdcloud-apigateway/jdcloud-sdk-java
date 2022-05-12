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
 * Data-Migration
 * 数据迁移管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.tidb.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.tidb.model.MigrationTask;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询 TiDB 数据迁移任务的信息
 */
public class DescribeDataMigrationResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * migrationTasks
     */
    private List<MigrationTask> migrationTasks;


    /**
     * get migrationTasks
     *
     * @return
     */
    public List<MigrationTask> getMigrationTasks() {
        return migrationTasks;
    }

    /**
     * set migrationTasks
     *
     * @param migrationTasks
     */
    public void setMigrationTasks(List<MigrationTask> migrationTasks) {
        this.migrationTasks = migrationTasks;
    }


    /**
     * set migrationTasks
     *
     * @param migrationTasks
     */
    public DescribeDataMigrationResult migrationTasks(List<MigrationTask> migrationTasks) {
        this.migrationTasks = migrationTasks;
        return this;
    }


    /**
     * add item to migrationTasks
     *
     * @param migrationTask
     */
    public void addMigrationTask(MigrationTask migrationTask) {
        if (this.migrationTasks == null) {
            this.migrationTasks = new ArrayList<>();
        }
        this.migrationTasks.add(migrationTask);
    }

}