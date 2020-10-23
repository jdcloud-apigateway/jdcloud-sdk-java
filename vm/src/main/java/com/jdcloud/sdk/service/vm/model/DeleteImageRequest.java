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

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除一个私有镜像，只允许操作您的个人私有镜像。&lt;br&gt;
若镜像已共享给其他用户，需先取消共享才可删除。

 */
public class DeleteImageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 删除镜像是否删除关联的快照，默认为false；如果指定为true, 将会删除镜像关联的快照。
     */
    private Boolean deleteSnapshot;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 镜像ID
     * Required:true
     */
    @Required
    private String imageId;


    /**
     * get 删除镜像是否删除关联的快照，默认为false；如果指定为true, 将会删除镜像关联的快照。
     *
     * @return
     */
    public Boolean getDeleteSnapshot() {
        return deleteSnapshot;
    }

    /**
     * set 删除镜像是否删除关联的快照，默认为false；如果指定为true, 将会删除镜像关联的快照。
     *
     * @param deleteSnapshot
     */
    public void setDeleteSnapshot(Boolean deleteSnapshot) {
        this.deleteSnapshot = deleteSnapshot;
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
     * get 镜像ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    /**
     * set 删除镜像是否删除关联的快照，默认为false；如果指定为true, 将会删除镜像关联的快照。
     *
     * @param deleteSnapshot
     */
    public DeleteImageRequest deleteSnapshot(Boolean deleteSnapshot) {
        this.deleteSnapshot = deleteSnapshot;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public DeleteImageRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public DeleteImageRequest imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }


}