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

import com.jdcloud.sdk.service.JdcloudResponse;

/**
 * 
镜像复制。

详细操作说明请参考帮助文档：[镜像复制](https://docs.jdcloud.com/cn/virtual-machines/copy-image)

## 接口说明
- 调用该接口可以复制私有或共享镜像。
- 复制私有镜像时，只允许镜像拥有者进行复制。
- 复制共享镜像时，允许共享的用户将镜像复制为私有镜像。
- 支持同地域复制镜像。
- 只支持云盘系统盘的镜像。
- 不支持带有加密快照的镜像。

 */
public class CopyImagesResponse extends JdcloudResponse<CopyImagesResult> implements java.io.Serializable {

    private static final long serialVersionUID = 1L;




}