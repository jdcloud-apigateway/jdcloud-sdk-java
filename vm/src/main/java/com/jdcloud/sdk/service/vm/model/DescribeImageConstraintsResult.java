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

import com.jdcloud.sdk.service.vm.model.ImageConstraint;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
查询单个镜像的实例规格限制。

详细操作说明请参考帮助文档：[镜像概述](https://docs.jdcloud.com/cn/virtual-machines/image-overview)

## 接口说明
- 该接口与批量查询镜像的实例规格限制返回的信息一致。
- 通过此接口可以查询镜像的实例规格限制信息。
- 只有官方镜像、第三方镜像有实例规格的限制，用户的私有镜像没有此限制。

 */
public class DescribeImageConstraintsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像限制信息。
     */
    private ImageConstraint imageConstraints;



    /**
     * get 镜像限制信息。
     *
     * @return
     */
    public ImageConstraint getImageConstraints() {
        return imageConstraints;
    }

    /**
     * set 镜像限制信息。
     *
     * @param imageConstraints
     */
    public void setImageConstraints(ImageConstraint imageConstraints) {
        this.imageConstraints = imageConstraints;
    }



    /**
     * set 镜像限制信息。
     *
     * @param imageConstraints
     */
    public DescribeImageConstraintsResult imageConstraints(ImageConstraint imageConstraints) {
        this.imageConstraints = imageConstraints;
        return this;
    }


}