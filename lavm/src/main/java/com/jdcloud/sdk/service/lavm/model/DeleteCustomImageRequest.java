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
 * images
 * 轻量应用云主机镜像信息Image 模型相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.lavm.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除自定义镜像。

 */
public class DeleteCustomImageRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自定义镜像ID

     * Required:true
     */
    @Required
    private String imageId;

    /**
     * regionId

     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 自定义镜像ID

     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 自定义镜像ID

     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }


    /**
     * get regionId

     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set regionId

     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }



    /**
     * set 自定义镜像ID

     *
     * @param imageId
     */
    public DeleteCustomImageRequest imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }


    /**
     * set regionId

     *
     * @param regionId
     */
    public DeleteCustomImageRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}