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
 * 镜像
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vm.model.TaskInfo;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
查询镜像任务详情。

将京东云私有镜像导出至京东云以外环境。

详细操作说明请参考帮助文档：
[导入私有镜像](https://docs.jdcloud.com/cn/virtual-machines/import-private-image)
[导出私有镜像](https://docs.jdcloud.com/cn/virtual-machines/export-private-image)

## 接口说明
- 调用该接口可查询镜像导入或导出的任务详情。

 */
public class ImageTasksResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * taskSet
     */
    private List<TaskInfo> taskSet;

    /**
     * 总数量
     */
    private Integer totalCount;


    /**
     * get taskSet
     *
     * @return
     */
    public List<TaskInfo> getTaskSet() {
        return taskSet;
    }

    /**
     * set taskSet
     *
     * @param taskSet
     */
    public void setTaskSet(List<TaskInfo> taskSet) {
        this.taskSet = taskSet;
    }

    /**
     * get 总数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set taskSet
     *
     * @param taskSet
     */
    public ImageTasksResult taskSet(List<TaskInfo> taskSet) {
        this.taskSet = taskSet;
        return this;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public ImageTasksResult totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to taskSet
     *
     * @param taskSet
     */
    public void addTaskSet(TaskInfo taskSet) {
        if (this.taskSet == null) {
            this.taskSet = new ArrayList<>();
        }
        this.taskSet.add(taskSet);
    }

}