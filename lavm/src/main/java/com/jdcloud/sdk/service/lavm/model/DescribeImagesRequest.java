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
 * DescribeImages 查询指定地域下一个或多个镜像信息Image 模型。

 */
public class DescribeImagesRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像ID, &#x60;[\&quot;img-m5s0****29\&quot;, \&quot;img-m5s0****30\&quot;]&#x60;, json array 字串。

     */
    private String imageIds;

    /**
     * 镜像类型。 可能取值：system, app, custom, 如果imageIds不传时，此项为必传。

     */
    private String imageType;

    /**
     * 根据镜像的操作系统发行版查询。
取值范围：&#x60;Ubuntu、CentOS、Windows Server&#x60;。

     */
    private String platform;

    /**
     * regionId

     * Required:true
     */
    @Required
    private String regionId;



    /**
     * get 镜像ID, &#x60;[\&quot;img-m5s0****29\&quot;, \&quot;img-m5s0****30\&quot;]&#x60;, json array 字串。

     *
     * @return
     */
    public String getImageIds() {
        return imageIds;
    }

    /**
     * set 镜像ID, &#x60;[\&quot;img-m5s0****29\&quot;, \&quot;img-m5s0****30\&quot;]&#x60;, json array 字串。

     *
     * @param imageIds
     */
    public void setImageIds(String imageIds) {
        this.imageIds = imageIds;
    }


    /**
     * get 镜像类型。 可能取值：system, app, custom, 如果imageIds不传时，此项为必传。

     *
     * @return
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * set 镜像类型。 可能取值：system, app, custom, 如果imageIds不传时，此项为必传。

     *
     * @param imageType
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }


    /**
     * get 根据镜像的操作系统发行版查询。
取值范围：&#x60;Ubuntu、CentOS、Windows Server&#x60;。

     *
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * set 根据镜像的操作系统发行版查询。
取值范围：&#x60;Ubuntu、CentOS、Windows Server&#x60;。

     *
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
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
     * set 镜像ID, &#x60;[\&quot;img-m5s0****29\&quot;, \&quot;img-m5s0****30\&quot;]&#x60;, json array 字串。

     *
     * @param imageIds
     */
    public DescribeImagesRequest imageIds(String imageIds) {
        this.imageIds = imageIds;
        return this;
    }


    /**
     * set 镜像类型。 可能取值：system, app, custom, 如果imageIds不传时，此项为必传。

     *
     * @param imageType
     */
    public DescribeImagesRequest imageType(String imageType) {
        this.imageType = imageType;
        return this;
    }


    /**
     * set 根据镜像的操作系统发行版查询。
取值范围：&#x60;Ubuntu、CentOS、Windows Server&#x60;。

     *
     * @param platform
     */
    public DescribeImagesRequest platform(String platform) {
        this.platform = platform;
        return this;
    }


    /**
     * set regionId

     *
     * @param regionId
     */
    public DescribeImagesRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }


}