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

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
导入私有镜像。

详细操作说明请参考帮助文档：[导入私有镜像](https://docs.jdcloud.com/cn/virtual-machines/import-private-image)

## 接口说明
- 导入后的镜像将以 &#x60;云硬盘系统盘镜像&#x60; 格式作为私有镜像使用，同时会自动生成与导入镜像关联的快照。

 */
public class ImportImageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像id。
     */
    private String imageId;

    /**
     * 导入任务id。
     */
    private String taskId;



    /**
     * get 镜像id。
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像id。
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    /**
     * get 导入任务id。
     *
     * @return
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * set 导入任务id。
     *
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }



    /**
     * set 镜像id。
     *
     * @param imageId
     */
    public ImportImageResult imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }


    /**
     * set 导入任务id。
     *
     * @param taskId
     */
    public ImportImageResult taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }


}